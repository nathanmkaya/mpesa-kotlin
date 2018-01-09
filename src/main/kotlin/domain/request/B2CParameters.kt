package domain.request

data class B2CParameters(val initiatorName: String, val securityCredential: String, val commandID: String, val amount: String, val partyA: String, val partyB: String, val remarks: String, val queueTimeOutURL: String, val resultURL: String, val occassion: String)