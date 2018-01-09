package domain.request


data class STKPushSimulation(val businessShortCode: String, val password: String, val timestamp: String, val transactionType: String, val amount: String, val phoneNumber: String, val partyA: String, val partyB: String, val callBackURL: String, val queueTimeOutURL: String, val accountReference: String, val transactionDesc: String)