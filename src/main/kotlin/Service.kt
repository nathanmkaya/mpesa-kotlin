import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Service {

    companion object {


        var API_BASE_URL = "https://api.github.com/"

        var httpClient = OkHttpClient.Builder()

        var builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            )

        var retrofit = builder
            .client(
                httpClient.build()
            )
            .build()

        //var client = retrofit.create(Api::class.java)

        fun <S : Any> createService(serviceClass: Class<S>): S {
            return retrofit.create(serviceClass)
        }

        fun <S> createService(serviceClass: Class<S>, clientId: String?, clientSecret: String?): S {
            if (clientId.isNullOrBlank() && clientSecret.isNullOrBlank()) {
                val authToken = Credentials.basic(clientId, clientSecret)
                return createService(serviceClass, authToken)
            }

            return createService(serviceClass, null, null)
        }

        fun <S> createService(serviceClass: Class<S>, authToken: String?): S {
            if (authToken.isNullOrBlank()) {
                val interceptor = AuthenticationInterceptor(authToken!!)

                if (!httpClient.interceptors().contains(interceptor)) {
                    httpClient.addInterceptor(interceptor)

                    builder.client(httpClient.build())
                    retrofit = builder.build()
                }
            }

            return retrofit.create(serviceClass)
        }
    }
}

class AuthenticationInterceptor(authToken: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain?): Response {
        return chain!!.proceed(chain.request())
    }

}
