package domain.response

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Result(

    @field:SerializedName("ConversationID")
    val conversationID: String? = null,

    @field:SerializedName("ReferenceData")
    val referenceData: ReferenceData? = null,

    @field:SerializedName("OriginatorConversationID")
    val originatorConversationID: String? = null,

    @field:SerializedName("ResultDesc")
    val resultDesc: String? = null,

    @field:SerializedName("ResultType")
    val resultType: Int? = null,

    @field:SerializedName("ResultCode")
    val resultCode: Int? = null,

    @field:SerializedName("ResultParameters")
    val resultParameters: ResultParameters? = null,

    @field:SerializedName("TransactionID")
    val transactionID: String? = null
)