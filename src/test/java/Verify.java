/*
import com.CarmenWen.fabricgateway.FabricGateway;
import com.CarmenWen.pojo.GeneralVerify;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify extends JFrame{
    //private JFrame frame = new JFrame("Verify Account");
    private JPanel panel = new JPanel();
    private JLabel userLabel = new JLabel("Enter User:");
    private JTextField userText = new JTextField();
    private JLabel passLabel = new JLabel("Enter Password:");
    private JPasswordField passText = new JPasswordField(20); //password hidden
    private JLabel passLabel2 = new JLabel("Verify Password:");
    private JPasswordField passText2 = new JPasswordField(20);
    private JButton summitButton = new JButton("Summit");
    //private JButton registerButton = new JButton("register");
    private JButton userHint = new JButton("Hints");
    private JButton passHint = new JButton("Hints");
    String USERNAME_PATTERN = "^[a-z]([._-](?![._-])|[a-z0-9]){3,18}[a-z0-9]$";
    Pattern userPattern = Pattern.compile(USERNAME_PATTERN);
    String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&%()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    Pattern passPattern = Pattern.compile(PASSWORD_PATTERN);

    //FabricGateway fabricGateway = new FabricGateway();
    //private JFrame WindowMenu;
    //private JFrame WindowCreate;
    public String thisUsername;
    private String thisPassword;
    private JFrame CreateOwnData;

    public static void main(String[] args) {
        new Verify();
    }

    public Verify() {
        //set window location and size
        this.setTitle("Verify Account");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 设置X号后关闭
        placeComponents(panel);
        this.setVisible(true);
        this.setResizable(false);


        //WindowMenu = new MenuGUI();
        //WindowCreate = new CreateOwnData();
        //WindowMenu.setVisible(false);
    }

    public void windowOpened(java.awt.event.WindowEvent e) {
        CreateOwnData.setVisible(false);//子窗口启动时父窗口不可见
    }
    public void windowClosed(WindowEvent e) {
        Verify.this.dispose();//子窗口销毁
        CreateOwnData.setVisible(true);//父窗口变可见
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
        summitButton.setBounds(250, 130, 80, 25);
        panel.add(summitButton);
//        registerButton.setBounds(200, 130, 80, 25);
//        panel.add(registerButton);

        userRequired.setBounds(30, 100, 300, 300);
        panel.add(userRequired);

        passRequired.setBounds(30, 150, 300, 300);
        panel.add(passRequired);


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

        summitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summitButtonActionPerformed(evt);
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
    private void summitButtonActionPerformed(java.awt.event.ActionEvent evt){
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
            //loginAccount(name, password);

            System.out.println("finish login....");
            setThisUsername(name);
            thisUsername = name;
            setThisPassword(password);
            this.setVisible(false);
        }
    }
    public String getThisUsername() {
        return thisUsername;
    }
    public void setThisUsername(String name){
        this.thisUsername=name;
    }

    public String getThisPassword() {
        return thisPassword;
    }
    public void setThisPassword(String password){
        this.thisPassword=password;
    }

}
*/
