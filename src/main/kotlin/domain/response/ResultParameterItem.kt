package domain.response

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class ResultParameterItem(

    @field:SerializedName("Value")
    val value: String? = null,

    @field:SerializedName("Key")
    val key: String? = null
)