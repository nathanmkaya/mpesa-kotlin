package domain.request


data class Balance(val initiator: String, val commandID: String, val securityCredential: String, val partyA: String, val identifierType: String, val remarks: String, val queueTimeOutURL: String, val resultURL: String)