import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.security.Key;

import javax.crypto.Cipher;


class Test01 {
    //加密工具
    private Cipher encryptCipher = null;

    // 解密工具
    private Cipher decryptCipher = null;

    public static void main(String[] args) {

        String USERNAME_PATTERN = "^[a-z]([._-](?![._-])|[a-z0-9]){3,18}[a-z0-9]$";
        Pattern userPattern = Pattern.compile(USERNAME_PATTERN);
        String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&%()–[{}]:;',?/*~$^+=<>]).{8,20}$";
        Pattern passPattern = Pattern.compile(PASSWORD_PATTERN);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        //String Userregex = "^[a-z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-z0-9]$";
        String name = sc.nextLine();
        Matcher userMatcher = userPattern.matcher(name);
        while (!userMatcher.matches()){
            System.out.println("请再次输入你的用户名：");
            name = sc.nextLine();
            userMatcher = userPattern.matcher(name);
        }
        System.out.println("请输入你的密码：");
        String password = sc.nextLine();
        Matcher passMatcher = passPattern.matcher(password);
        while (!passMatcher.matches()){
            System.out.println("请再次输入你的密码：");
            password = sc.nextLine();
            passMatcher = passPattern.matcher(password);
        }
        String msg = name+password;

        String key = name;
        try {
            EncrypDES des2 = new EncrypDES(key);// 自定义密钥

            System.out.println("The character before encryption：" + msg);

            System.out.println("The character after encryption：" + des2.encrypt(msg));

            System.out.println("The character after decryption：" + des2.decrypt(des2.encrypt(msg)));

        }
        catch (Exception e) {
            e.printStackTrace();
        }


        //String Passregex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&%()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    }



}
