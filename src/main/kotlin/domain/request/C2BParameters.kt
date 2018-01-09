package domain.request


data class C2BParameters(val shortCode: String, val commandID: String, val amount: String, val MSISDN: String, val billRefNumber: String)