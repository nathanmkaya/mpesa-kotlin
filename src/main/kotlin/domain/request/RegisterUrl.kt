package domain.request


data class RegisterUrl(val shortCode: String, val responseType: String, val confirmationURL: String, val validationURL: String)