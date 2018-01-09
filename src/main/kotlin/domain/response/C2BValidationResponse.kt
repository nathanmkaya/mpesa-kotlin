package domain.response

data class C2BValidationResponse(
    val transactionType: String? = null,
    val billRefNumber: String? = null,
    val mSISDN: String? = null,
    val firstName: String? = null,
    val middleName: String? = null,
    val businessShortCode: String? = null,
    val orgAccountBalance: String? = null,
    val transAmount: String? = null,
    val thirdPartyTransID: String? = null,
    val invoiceNumber: String? = null,
    val lastName: String? = null,
    val transID: String? = null,
    val transTime: String? = null
)
