package etc.encrypt;

import java.security.AlgorithmParameters;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class AesEncryptCBC {

    private static int iterations = 65536  ;
    private static int keySize = 128;
    private static final String SALTKEY="ttpWinvention016";

    public static void main(String []args) throws Exception {


        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        AlgorithmParameters params = cipher.getParameters();
        //byte[] ivBytes = params.getParameterSpec(IvParameterSpec.class).getIV();
        
        char[] message = "PasswordToEncrypt".toCharArray();
        System.out.println("Message: " + String.valueOf(message));
        System.out.println("Encrypted: " + encrypt(message));
        System.out.println("Decrypted: " + decrypt(encrypt(message).toCharArray()));
    }

    public static String encrypt(char[] plaintext) throws Exception {
    	String salt = SALTKEY;
        byte[] saltBytes = salt.getBytes();
        byte[] iv = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00	};

        SecretKey secretSpec = new SecretKeySpec(salt.getBytes(), "AES");
        
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretSpec, new IvParameterSpec(iv));
        AlgorithmParameters params = cipher.getParameters();
        byte[] encryptedTextBytes = cipher.doFinal(String.valueOf(plaintext).getBytes("UTF-8"));

        //return DatatypeConverter.printBase64Binary(encryptedTextBytes);
        return Hex.encodeHexString(encryptedTextBytes);
    }
    
    public static String encryptString(String strOri) throws Exception{
    	return encrypt(strOri.toCharArray());
    }

    public static String decrypt(char[] encryptedText) throws Exception {
    	String salt =SALTKEY;
    	byte[] iv = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00	};
        byte[] encryptedTextBytes = Hex.decodeHex(encryptedText);
        SecretKey secretSpec = new SecretKeySpec(salt.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretSpec, new IvParameterSpec(iv));

        byte[] decryptedTextBytes = null;

        try {
            decryptedTextBytes = cipher.doFinal(encryptedTextBytes);
        }   catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }   catch (BadPaddingException e) {
            e.printStackTrace();
        }

        return new String(decryptedTextBytes);
    }

    public static String decryptString(String strEnc) throws Exception{
    	return decrypt(strEnc.toCharArray());
    }
}
