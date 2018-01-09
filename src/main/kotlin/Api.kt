import domain.request.*
import domain.response.AuthenticationResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {

    @GET("/oauth/v1/generate")
    fun authenticate(): Observable<AuthenticationResponse>

    // B2C API POST https://sandbox.safaricom.co.ke/mpesa/b2c/v1/paymentrequest
    @POST("/mpesa/b2c/v1/paymentrequest")
    fun B2CRequest(b2CParameters: B2CParameters)

    // B2B POST https://sandbox.safaricom.co.ke/mpesa/b2b/v1/paymentrequest
    @POST("/mpesa/b2b/v1/paymentrequest")
    fun b2bRequest(b2BParameters: B2BParameters)

    // C2B
    // POST https://sandbox.safaricom.co.ke/mpesa/c2b/v1/registerurl
    @POST("/mpesa/c2b/v1/registerurl")
    fun registerUrl(registerUrl: RegisterUrl)

    // C2B Simulate Transaction
    // POST https://sandbox.safaricom.co.ke/mpesa/c2b/v1/simulate
    @POST("/mpesa/c2b/v1/simulate")
    fun c2bSimulate(c2BParameters: C2BParameters)

    // Account Balance
    // POST https://sandbox.safaricom.co.ke/mpesa/accountbalance/v1/query
    @POST("/mpesa/accountbalance/v1/query")
    fun balanceInquiry(balance: Balance)

    // Reversal
    // POST https://sandbox.safaricom.co.ke/mpesa/reversal/v1/request
    @POST("/mpesa/reversal/v1/request")
    fun reversal(reversal: Reversal)

    // Lipa na M-Pesa Online Payment
    // POST https://sandbox.safaricom.co.ke/mpesa/stkpush/v1/processrequest
    @POST("/mpesa/stkpush/v1/processrequest")
    fun stkpush(stkPushSimulation: STKPushSimulation)

    // Lipa na M-Pesa Online Query Request
    // POST https://sandbox.safaricom.co.ke/mpesa/stkpushquery/v1/query
    @POST("/mpesa/stkpushquery/v1/query")
    fun stkpushquery(stkPushTransactionStatus: STKPushTransactionStatus)

    // Transaction Status
    // POST https://sandbox.safaricom.co.ke/mpesa/transactionstatus/v1/query
    @POST("/mpesa/transactionstatus/v1/query")
    fun transactionStatus()

}