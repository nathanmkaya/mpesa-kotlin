package utils

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64
import java.io.File
import java.io.FileInputStream
import java.security.NoSuchAlgorithmException
import java.security.cert.CertificateFactory
import java.security.cert.X509Certificate
import javax.crypto.Cipher


class SecurityCredentials {
    companion object {
        fun encryptInitiatorPassword(securityCertificate: String, password: String): String {
            var encryptedPassword = ""

            try {
                // Security.addProvider(org.bouncycastle.jce.provider.BouncyCastleProvider())
                val input = password.toByteArray()
                val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "BC")
                val fin = FileInputStream(File(securityCertificate))
                val cf = CertificateFactory.getInstance("X.509")
                val certificate = cf.generateCertificate(fin) as X509Certificate
                val pk = certificate.publicKey
                cipher.init(Cipher.ENCRYPT_MODE, pk)
                val cipherText = cipher.doFinal(input)
                // Convert the resulting encrypted byte array into a string using base64 encoding
                encryptedPassword = Base64.encode(cipherText)

            } catch (ex: NoSuchAlgorithmException) {

            }

            return encryptedPassword
        }
    }
}