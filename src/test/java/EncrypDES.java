import java.security.Key;
import javax.crypto.Cipher;

/**
 *
 * @author carmen wen
 */


public class EncrypDES {

    //加密
    private Cipher encryptCipher = null;
    // 解密
    private Cipher decryptCipher = null;

    /**
     * 指定密钥构造方法
     * @param strKey The privated key used for EncrypDES
     * @throws Exception
     */

    public EncrypDES(String strKey) throws Exception {
        Key key = getKey(strKey.getBytes());
        encryptCipher = Cipher.getInstance("DES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, key);
        decryptCipher = Cipher.getInstance("DES");
        decryptCipher.init(Cipher.DECRYPT_MODE, key);
    }

    /**
     * converted byte array to Hexadecimal values, eg: byte[]{8,18} to 0813 and public static byte[]
     *
     * hexStr2ByteArr(String strIn) 互为可逆的转换过程
     *
     * @param arrB -> byte array which need to be converted
     * @return converted string
     * @throws Exception
     */
    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        // 每个byte用2个字符才能表示，字符串的长度是数组长度的2倍
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            // 把负数转换为正数
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            // 小于0F的数需要在前面补0
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }


    /**
     * converted Hexadecimal values to byte array, with public static String byteArr2HexStr(byte[] arrB)
     *
     * byteArr2HexStr(String strIn) 互为可逆的转换过程
     *
     * @param strIn -> string which need to be converted
     * @return converted bute array
     * @throws Exception
     */
    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;
        // 两个字符表示一个字节，字节数组长度是字符串长度除以2
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }

    /**
     *
     * Encrypted byte array 加密字节数组
     * @param arrB -> The byte array which need to be encrypted 需加密的字节数组
     * @return An encrypted bytes array 加密后的字节数组
     */
    public byte[] encrypt(byte[] arrB) throws Exception {
        return encryptCipher.doFinal(arrB);
    }

    /**
     * Encrypted string 加密字符串
     * @param strIn -> The string which need to be encrypted 需加密的字符串
     * @return An encrypted string 加密后的字符串
     */
    public String encrypt(String strIn) throws Exception {
        return byteArr2HexStr(encrypt(strIn.getBytes()));
    }

    /**
     * decrypted byte array 解密字节数组
     * @param arrB -> The byte array which need to be decrypted 需解密的字节数组
     * @return A decrypted bytes array 解密后的字节数组
     */
    public byte[] decrypt(byte[] arrB) throws Exception {
        return decryptCipher.doFinal(arrB);
    }

    /**
     * decrypted string 解密字符串
     * @param strIn -> The string which need to be decrypted 需解密的字符串
     * @return An decrypted string 加密后的字符串 解密后的字符串
     */
    public String decrypt(String strIn) throws Exception {
        return new String(decrypt(hexStr2ByteArr(strIn)));
    }

    /**
     * 从指定字符串生成密钥，密钥所需的字节数组长度为8位 不足8位时后面补0，超出8位只取前8位
     * @param arrBTmp 构成该字符串的字节数组
     * @return 生成的密钥
     */
    private Key getKey(byte[] arrBTmp) throws Exception {
        // 创建一个空的8位字节数组（默认值为0）
        byte[] arrB = new byte[8];
        // 将原始字节数组转换为8位
        for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
            arrB[i] = arrBTmp[i];
        }
        // 生成密钥
        Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");
        return key;
    }

    public static void main(String[] args) {
        try {
            //String msg1 = "1";

            //EncrypDES des1 = new EncrypDES();// 使用默认密钥
/*
            System.out.println("加密前的字符：" + msg1);

            System.out.println("加密后的字符：" + des1.encrypt(msg1));

            System.out.println("解密后的字符：" + des1.decrypt(des1.encrypt(msg1)));*/


            System.out.println("--------Breaking-------");

            String msg2 = "user00Carmen25#";

            String key =  "user00";

            EncrypDES des2 = new EncrypDES(key);// 自定义密钥

            System.out.println("The character before encryption：" + msg2);

            System.out.println("The character after encryption：" + des2.encrypt(msg2));

            System.out.println("The character after decryption：" + des2.decrypt("f46afb7b6f848556eda2f408ba0759c7"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}