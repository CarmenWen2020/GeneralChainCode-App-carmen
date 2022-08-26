import com.CarmenWen.fabricgateway.FabricGateway;
import com.CarmenWen.pojo.GeneralVerify;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carmen wen
 */


public class Login extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel userLabel = new JLabel("Enter User:");
    private JTextField userText = new JTextField();
    private JLabel passLabel = new JLabel("Enter Password:");
    private JPasswordField passText = new JPasswordField(20); //password hidden
    private JLabel passLabel2 = new JLabel("Verify Password:");
    private JPasswordField passText2 = new JPasswordField(20);
    private JButton loginButton = new JButton("login");
    private JButton registerButton = new JButton("register");
    private JButton userHint = new JButton("Hints");
    private JButton passHint = new JButton("Hints");
    private String USERNAME_PATTERN = "^[a-z]([._-](?![._-])|[a-z0-9]){3,18}[a-z0-9]$";
    private Pattern userPattern = Pattern.compile(USERNAME_PATTERN);
    private String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&%()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private Pattern passPattern = Pattern.compile(PASSWORD_PATTERN);

    public static FabricGateway fabricGateway = new FabricGateway();

    private JFrame WindowMenu;
    private JFrame WindowCreate;

    public static String thisUsername;
    public static String thisPassword;



    public Login() {
        //set window location and size
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 设置X号后关闭
        placeComponents(panel);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Welcome to PAPER SYSTEM");
        WindowMenu = new MenuGUI();
        WindowCreate = new CreateOwnData();


        //WindowMenu.setVisible(false);
    }

    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        // create UserJLabel
        userLabel.setBounds(30, 30, 150, 25);
        panel.add(userLabel);
        // create text area for user enter
        userText.setBounds(150, 30, 165, 25);
        panel.add(userText);
        userHint.setBounds(320, 30, 60, 25);
        panel.add(userHint);


        // create PassJLabel
        passLabel.setBounds(30, 60, 150, 25);
        panel.add(passLabel);
        // password enter -> hidden
        passText.setBounds(150, 60, 165, 25);
        panel.add(passText);
        passHint.setBounds(320, 60, 60, 25);
        panel.add(passHint);

        // create PassJLabel
        passLabel2.setBounds(30, 90, 150, 25);
        panel.add(passLabel2);
        // password enter -> hidden
        passText2.setBounds(150, 90, 165, 25);
        panel.add(passText2);

        // create login botton
        loginButton.setBounds(50, 130, 80, 25);
        panel.add(loginButton);
        registerButton.setBounds(200, 130, 80, 25);
        panel.add(registerButton);

/*        userRequired.setBounds(30, 100, 300, 300);
        panel.add(userRequired);

        passRequired.setBounds(30, 150, 300, 300);
        panel.add(passRequired);*/

        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        userText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                userTextMouseMoved(evt);
            }
        });

        userHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userHintActionPerformed(evt);
            }
        });
        userHint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                userHintMouseMoved(evt);
            }
        });

        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });
        passText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                passTextMouseMoved(evt);
            }
        });

        passHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passHintActionPerformed(evt);
            }
        });
        passHint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                passHintMouseMoved(evt);
            }
        });

        passText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passText2ActionPerformed(evt);
            }
        });
        passText2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                passText2MouseMoved(evt);
            }
        });

        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
    }

    // username text area action
    private void userTextMouseMoved(java.awt.event.MouseEvent evt) {
        userText.setToolTipText("Please enter the Username");
    }
    private void userTextActionPerformed(java.awt.event.ActionEvent evt){
        //System.out.println(userText.getText());
    }

    // username hints action
    private void userHintMouseMoved(java.awt.event.MouseEvent evt) {
        userText.setToolTipText("The instruction for username requirement");
    }
    private void userHintActionPerformed(java.awt.event.ActionEvent evt){
        //System.out.println(userText.getText());
        JOptionPane.showMessageDialog(null, "<html> Username Requirement:" +
                        "<ul>" +
                        "<li>Username must start with lowercase character</li>" +
                        "<li>Username consists of lowercase a-z and number 0-9</li>" +
                        "<li>Username allowed the dot ( . ), underscore ( _ ), and hyphen ( - )</li>" +
                        "<li>The dot ( . ), underscore ( _ ), or hyphen (-) not accept consecutive or in the last position <br> e.g., carmen..wen, carmen--wen etc.</li>" +
                        "<li>The dot ( . ), underscore ( _ ), or hyphen (-) not accept in the last position <br> e.g., carmenwen- etc.</li>" +
                        "<li>The number of characters must be between 5 to 20</li>" +
                        "</ul>",
                "Username Hints", JOptionPane.PLAIN_MESSAGE);
    }

    // password text window
    private void passTextMouseMoved(java.awt.event.MouseEvent evt) {
        passText.setToolTipText("Please enter the password");
    }
    private void passTextActionPerformed(java.awt.event.ActionEvent evt){
        //System.out.println(passText.getPassword());
    }


    // password hint
    private void passHintMouseMoved(java.awt.event.MouseEvent evt) {
        passText.setToolTipText("The instruction for password requirement");
    }
    private void passHintActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(null, "<html> Password Requirement:" +
                        "<ul>" +
                        "<li>at least one digit</li>" +
                        "<li>at least one uppercase character A-Z</li>" +
                        "<li>at least one lowercase character a-z</li>" +
                        "<li>at least one special character <br> eg. !@#&%()–{}:;',?/*~$^+=&lt&gt </li>" +
                        "<li>a length of at least 8 characters and a maximum of 20 characters</li>" +
                        "</ul>",
                "Password Hints", JOptionPane.PLAIN_MESSAGE);
    }

    private void passText2MouseMoved(java.awt.event.MouseEvent evt) {
        passText2.setToolTipText("Please enter your password again");
    }
    private void passText2ActionPerformed(java.awt.event.ActionEvent evt){
        //System.out.println(passText2.getPassword());
    }
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt){
        System.out.println(userText.getText());
        String name = userText.getText();
        Matcher userMatcher = userPattern.matcher(name);
        String password = String.valueOf(passText.getPassword());
        Matcher passMatcher = passPattern.matcher(password);
        String password2 = String.valueOf(passText2.getPassword());

        if (name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is empty, \n " +
                            "please enter the username",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is empty, \n " +
                            "please enter the password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (password2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Verified password is empty, \n " +
                            "please enter the verified password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (!userMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Username is incorrect, \n " +
                            "please read the hints carefully, \n" +
                            "then enter the correct username",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if(!passMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Password is incorrect, \n " +
                            "please read the hints for password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            passText.setText("");
            passText2.setText("");
            return;
        }
        else if(!password2.equals(password)){
            System.out.println("password2 ->"+String.valueOf(passText.getPassword()));
            System.out.println("password ->"+String.valueOf(passText2.getPassword()));
            JOptionPane.showMessageDialog(null, "Verified password is not match, \n " +
                            "please check the passwords and enter again",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            passText2.setText("");
            return;
        }
        else{
            JOptionPane.showMessageDialog(null, "Please wait, Loading now... \n" +
                            "Press OK to continue",
                    "Loading", JOptionPane.PLAIN_MESSAGE);
            System.out.println("name------->"+name+"password------->"+password);
            loginAccount(name, password);
            System.out.println("finish login....");
            //thisUsername = name;
            //v.setThisUsername(name);
            //v.setThisPassword(password);
        }
    }

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // reset all option
        System.out.println(userText.getText());
        System.out.println(passText.getPassword());
        //this.setVisible(false);
        System.out.println("click registerButton");
        //String regex = "^[a-z0-9A-Z]+$";
        //  return str.matches(regex);
        String name = userText.getText();
        Matcher userMatcher = userPattern.matcher(name);
        String password = String.valueOf(passText.getPassword());
        Matcher passMatcher = passPattern.matcher(password);
        String password2 = String.valueOf(passText2.getPassword());

        if (name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is empty, \n " +
                            "please enter the username",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is empty, \n " +
                            "please enter the password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (password2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Verified password is empty, \n " +
                            "please enter the verified password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (!userMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Username is incorrect, \n " +
                            "please read the hints, \n" +
                            "then enter the correct username",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if(!passMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Password is incorrect, \n " +
                            "please read the hints for password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            passText.setText("");
            passText2.setText("");
            return;
        }
        else if(!password2.equals(password)){
            JOptionPane.showMessageDialog(null, "Verified password is not match, \n " +
                            "please check the passwords and enter again",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            passText2.setText("");
            return;
        }
        else{
            JOptionPane.showMessageDialog(null, "Please wait, Loading now... \n" +
                            "Press OK to continue",
                    "Loading", JOptionPane.PLAIN_MESSAGE);
            registerAccount(name, password);
        }
    }

    private void loginAccount(String username, String password){
        String values = "";
        String msg = username+password;
        System.out.println("msg--->"+msg);
        String key = password;
        System.out.println("key--->"+key);
        try{
            EncrypDES des = new EncrypDES(key);// 自定义密钥
            Contract contract = fabricGateway.getContract();

            byte[] normalQueries = contract.submitTransaction("queryData", username);
            String s = new String(normalQueries);
            JSONObject jsonObject = JSONObject.parseObject(s);
            System.out.println("s1" + jsonObject);
            values = jsonObject.get("PW").toString();
            System.out.println("values--->"+values);
            System.out.println("des----->"+des.decrypt(values));
            System.out.println("paper id ------> is none???"+jsonObject.get("PaperID").equals("none"));

            if (!des.decrypt(values).equals(msg)){
                JOptionPane.showMessageDialog(null, "The password does not match"+"\n"+"Please check the username and password \n" +
                                "And enter again.",
                        "Error information", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
                return;
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Successful!",
                        "Well Come Back", JOptionPane.PLAIN_MESSAGE);
                //this.setThisUsername(username);
                thisUsername = username;
                thisPassword = values;
                System.out.println("login thisUsername---->"+thisUsername);
                System.out.println("login thisPassword---->"+thisPassword);
                this.setVisible(false);
                WindowMenu.setVisible(true);
                if (!jsonObject.get("PaperID").equals("none")){
                    JOptionPane.showMessageDialog(null, "You Have A New Paper Assigned"+"\n"+
                                    "Paper ID: "+jsonObject.get("PaperID")+ "\n"+
                                    "Please Check Your Information.",
                            "New Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.informationIcon"));
                }
                userText.setText("");
                passText.setText("");
                passText2.setText("");
            }
        }
        catch(EndorseException e){
            System.out.println("User doesn't not exist");
            JOptionPane.showMessageDialog(null, "User does not Exist"+"\n"+"Please enter the valid Username",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        catch (Exception e){
            System.out.println("Error Message");
            JOptionPane.showMessageDialog(null, "UnExpected Error",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }

    }

    private void registerAccount(String username, String password){
        String values = ""; //""{\"PW\":"+password+"}";
        String msg = username+password;
        String key = password;
        try{
            EncrypDES des = new EncrypDES(key);// 自定义密钥

            System.out.println("The character before encryption：" + msg);
            System.out.println("The character after encryption：" + des.encrypt(msg));
            System.out.println("The character after decryption：" + des.decrypt(des.encrypt(msg)));

            values = "{\"PW\":\"" + des.encrypt(msg) + "\"}";
            System.out.println(values);

            Contract contract = fabricGateway.getContract();
            contract.submitTransaction("createData",username,values);
            JOptionPane.showMessageDialog(null, "Register Successful!",
                    "Congratulation", JOptionPane.PLAIN_MESSAGE);
            //setThisUsername(username);
            thisUsername = username;
            System.out.println("register thisUsername---->"+thisUsername);
            thisPassword = des.encrypt(msg);
            System.out.println("register thisPassword---->"+thisPassword);
            this.setVisible(false);
            WindowCreate.setVisible(true);
            //setThisUsername(username);
            //System.out.println(getThisUsername());
            //v.setThisPassword(password);

            userText.setText("");
            passText.setText("");
            passText2.setText("");
        }
        catch(EndorseException e){
            System.out.println("User already exist");
            JOptionPane.showMessageDialog(null, "User Already Exist"+"\n"+"Please Try Another Name",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Message");
            JOptionPane.showMessageDialog(null, "UnExpected Error",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
    }

/*    public String getThisUsername() {
        return thisUsername;
    }
    public void setThisUsername(String name){
        this.thisUsername=name;
    }*/


    public static void main(String[] args) {
        new Login();
    }
}

