package domain.response.stkpush.canceled

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class StkCallback(

    @field:SerializedName("MerchantRequestID")
    val merchantRequestID: String? = null,

    @field:SerializedName("CheckoutRequestID")
    val checkoutRequestID: String? = null,

    @field:SerializedName("ResultDesc")
    val resultDesc: String? = null,

    @field:SerializedName("ResultCode")
    val resultCode: Int? = null
)