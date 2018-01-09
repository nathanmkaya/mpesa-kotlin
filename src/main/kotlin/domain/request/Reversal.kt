package domain.request


data class Reversal(val initiator: String, val securityCredential: String, val commandID: String, val transactionID: String, val amount: String, val receiverParty: String, val recieverIdentifierType: String, val resultURL: String, val queueTimeOutURL: String, val remarks: String, val ocassion: String)