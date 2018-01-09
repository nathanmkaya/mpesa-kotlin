package domain.response

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class AuthenticationResponse(

    @field:SerializedName("access_token")
    val accessToken: String? = null,

    @field:SerializedName("expires_in")
    val expiresIn: String? = null
)