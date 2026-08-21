import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import javax.crypto.Cipher;

public class VulnerableCrypto {
    public static void main(String[] args) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("SHA-256");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-256");
        Cipher des = Cipher.getInstance("AES/ECB/NoPadding");
        Cipher aesEcb = Cipher.getInstance("AES/ECB/NoPadding");
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(3072);
        System.out.println(md5 + " " + sha1 + " " + des + " " + aesEcb + " " + rsa);
    }
}
