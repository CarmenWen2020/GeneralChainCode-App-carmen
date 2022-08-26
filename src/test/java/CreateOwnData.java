import com.CarmenWen.fabricgateway.FabricGateway;
//import com.CarmenWen.pojo.QueryResult;
import com.CarmenWen.pojo.GeneralVerify;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
//import com.CarmenWen.util.FabricUtil;

import org.hyperledger.fabric.client.EndorseException;
//import org.hyperledger.fabric.client.Status;
//import org.hyperledger.fabric.client.SubmittedTransaction;
import org.junit.Test;
//import io.grpc.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carmenw
 */

public class CreateOwnData extends JFrame {
    public static void main(String[] args) {
        CreateOwnData f = new CreateOwnData();
        System.out.println("exit");

    }

    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSummit;
    private javax.swing.JCheckBox CheckBoxAI;
    private javax.swing.JCheckBox CheckBoxArch;
    private javax.swing.JCheckBox CheckBoxDM;
    private javax.swing.JCheckBox CheckBoxEdu;
    private javax.swing.JCheckBox CheckBoxInter;
    private javax.swing.JCheckBox CheckBoxNet;
    private javax.swing.JCheckBox CheckBoxPar;
    private javax.swing.JCheckBox CheckBoxSecu;
    private javax.swing.JCheckBox CheckBoxSsy;
    private javax.swing.JCheckBox CheckBoxTheo;
    private javax.swing.JCheckBox CheckBoxVR;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PassField;

    private javax.swing.JLabel TextInterest;
    private javax.swing.JLabel TextName;
    private javax.swing.JLabel TextPass;
    private javax.swing.JLabel TextYesNo;
    private javax.swing.JLabel jLabelTitle;

    private ButtonGroup SingleChoice;
    private JRadioButton RadioButtonNo;
    private JRadioButton RadioButtonYes;

    private JFrame WindowMenu;;
    //public String thisUsername;
    //public String thisPassword;
    private String USERNAME_PATTERN = "^[a-z]([._-](?![._-])|[a-z0-9]){3,18}[a-z0-9]$";
    private Pattern userPattern = Pattern.compile(USERNAME_PATTERN);
    private String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&%()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private Pattern passPattern = Pattern.compile(PASSWORD_PATTERN);

/*    private QueryResult a;

    private Integer credit = 1;
    private String paperid = "none";
    private Boolean reviewstate;
    private Boolean ai;
    private Boolean arch;
    private Boolean dm;
    private Boolean edu;
    private Boolean inter;
    private Boolean net;
    private Boolean par;
    private Boolean secu;
    private Boolean ssy;
    private Boolean theo;
    private Boolean vr;*/

    //FabricGateway fabricGateway = new FabricGateway();


//    public creat() {
//        initComponents();
//    }
    public CreateOwnData()  {
        //this.setVisible(false);
        this.setSize(800, 500);
        this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(150, 150);
        this.setTitle("Set up Information");
        this.setVisible(false);
        this.setResizable(false);
        WindowMenu = new MenuGUI();
        //verify.setVisible(false);
        //NameField.setSize(10,10);
        //TextName.setText("Please enter your name:");

        jLabelTitle = new JLabel("--- PAPER SYSTEM ---");
        TextInterest = new JLabel("Please choose Interested Area: ");

        //TextName = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        //TextPass = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();

        TextInterest = new javax.swing.JLabel();
        CheckBoxAI = new javax.swing.JCheckBox();
        CheckBoxArch = new javax.swing.JCheckBox();
        CheckBoxDM = new javax.swing.JCheckBox();
        CheckBoxEdu = new javax.swing.JCheckBox();
        CheckBoxInter = new javax.swing.JCheckBox();
        CheckBoxNet = new javax.swing.JCheckBox();
        CheckBoxPar = new javax.swing.JCheckBox();
        CheckBoxSecu = new javax.swing.JCheckBox();
        CheckBoxSsy = new javax.swing.JCheckBox();
        CheckBoxTheo = new javax.swing.JCheckBox();
        CheckBoxVR = new javax.swing.JCheckBox();

        TextYesNo = new javax.swing.JLabel();
        SingleChoice = new ButtonGroup();
        RadioButtonYes = new JRadioButton();
        RadioButtonNo = new JRadioButton();
        ButtonSummit = new JButton();
        ButtonCancel = new JButton();

        SingleChoice.add(RadioButtonYes);
        SingleChoice.add(RadioButtonNo);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TextInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(CheckBoxVR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CheckBoxPar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CheckBoxInter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CheckBoxDM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CheckBoxAI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CheckBoxSsy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(60, 60, 60)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(CheckBoxTheo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(CheckBoxEdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(CheckBoxSecu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(CheckBoxArch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(CheckBoxNet))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelTitle)
                                                        .addGap(239, 239, 239)))
                                        .addComponent(TextYesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(RadioButtonYes)
                                                .addGap(52, 52, 52)
                                                .addComponent(RadioButtonNo))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(430, 430, 430)
                                                .addComponent(ButtonSummit)
                                                .addGap(45, 45, 45)
                                                .addComponent(ButtonCancel)))
                                .addGap(0, 92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabelTitle)
                                .addGap(30, 30, 30)
                                .addComponent(TextInterest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CheckBoxArch)
                                        .addComponent(CheckBoxAI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CheckBoxEdu)
                                        .addComponent(CheckBoxDM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CheckBoxInter)
                                        .addComponent(CheckBoxNet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CheckBoxPar)
                                        .addComponent(CheckBoxSecu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CheckBoxSsy)
                                        .addComponent(CheckBoxTheo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxVR)
                                .addGap(18, 18, 18)
                                .addComponent(TextYesNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RadioButtonYes)
                                        .addComponent(RadioButtonNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonSummit)
                                        .addComponent(ButtonCancel))
                                .addGap(58, 58, 58))
        );


        //NameField.setSize(10,10);




        //TextName.setText("Please enter your name:");


        Font f = new Font("Arial",Font.BOLD,20);
        jLabelTitle.setFont(f);
        jLabelTitle.setText("--- PAPER SYSTEM ---");
        //TextName.setText("Please enter your Username:");
        //NameField.setText("");
/*
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
*//*        NameField.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    NameField.setText("");
                }
            }
        });*//*
        TextPass.setText("Please enter your password:");
        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });*/


        TextInterest.setText("Please choose Interested Area: ");

        CheckBoxAI.setText("Artificial Intelligence");
        CheckBoxAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAIActionPerformed(evt);
            }
        });

        CheckBoxArch.setText("Architecture");
        CheckBoxArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxArchActionPerformed(evt);
            }
        });

        CheckBoxDM.setText("Data Mining");
        CheckBoxDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxDMActionPerformed(evt);
            }
        });

        CheckBoxEdu.setText("Educational Technology");
        CheckBoxEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEduActionPerformed(evt);
            }
        });

        CheckBoxInter.setText("Human Computer Interaction");
        CheckBoxInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxInterActionPerformed(evt);
            }
        });

        CheckBoxNet.setText("Computer Networks & Wireless Communication");
        CheckBoxNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxNetActionPerformed(evt);
            }
        });

        CheckBoxPar.setText("Parallel Distributed System");
        CheckBoxPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxParActionPerformed(evt);
            }
        });

        CheckBoxSecu.setText("Computer Security & Cryptography");
        CheckBoxSecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSecuActionPerformed(evt);
            }
        });

        CheckBoxSsy.setText("Software Systems");
        CheckBoxSsy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSsyActionPerformed(evt);
            }
        });

        CheckBoxTheo.setText("Theoretical Computer Science");
        CheckBoxTheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxTheoActionPerformed(evt);
            }
        });

        CheckBoxVR.setText("Computer Vision & Graphic");
        CheckBoxVR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxVRActionPerformed(evt);
            }
        });

        TextYesNo.setText("Do you want to review papers?");

        RadioButtonYes.setText("Yes");
        RadioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonYesActionPerformed(evt);
            }
        });

        RadioButtonNo.setText("No");
        RadioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonNoActionPerformed(evt);
            }
        });

        ButtonSummit.setText("Summit");
        ButtonSummit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSummitActionPerformed(evt);
            }
        });
/*
        ButtonSummit.addMouseListener(new java.awt.event.MouseAdapter() {
*/
/*            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCancelMouseClicked(evt);
            }*//*


            public void mousePressed(MouseEvent evt) {
                ButtonSummitMousePressed(evt) ;
            }
        });
*/


        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });
        /*        ButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
         *//*            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCancelMouseClicked(evt);
            }*//*

            public void mousePressed(MouseEvent evt) {
                ButtonCancelMousePressed(evt);
            }
        });*/
        /*ButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCancelMouseClicked(evt);
            }
        });*/


        System.out.println("11111");
    }// </editor-fold>


    /*   private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {
           System.out.println( NameField.getText());
       }
       private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {}
   */
    private void CheckBoxAIActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxDMActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxArchActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxEduActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxInterActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxNetActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxParActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxSecuActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxSsyActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxTheoActionPerformed(java.awt.event.ActionEvent evt) {}

    private void CheckBoxVRActionPerformed(java.awt.event.ActionEvent evt) {}

    private void RadioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {}

    private void RadioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {}

    private void ButtonSummitActionPerformed(java.awt.event.ActionEvent evt) {
/*        String name = NameField.getText().trim();
        Matcher userMatcher = userPattern.matcher(name);
        String password = String.valueOf(PassField.getPassword());
        Matcher passMatcher = passPattern.matcher(password);*/
        /*if(NameField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Name",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if (password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is empty, \n " +
                            "please enter the password",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        else if (!userMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Username is invalid, \n " +
                            "Please enter username in the correct format.",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            NameField.setText("");
            return;
        }
        else if(!passMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Password is invalid, \n " +
                            "Please enter password in the correct format.",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            PassField.setText("");
            return;
        }*/
        if(!(CheckBoxAI.isSelected() | CheckBoxArch.isSelected() | CheckBoxDM.isSelected() | CheckBoxEdu.isSelected() |
                CheckBoxInter.isSelected() | CheckBoxNet.isSelected() | CheckBoxPar.isSelected() | CheckBoxSecu.isSelected() |
                CheckBoxSsy.isSelected() | CheckBoxSsy.isSelected() | CheckBoxTheo.isSelected() | CheckBoxVR.isSelected() )){
            JOptionPane.showMessageDialog(null, "Please Selected Interested Area",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if(!(RadioButtonYes.isSelected() | RadioButtonNo.isSelected())){
            JOptionPane.showMessageDialog(null, "Please Decided Review State",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else{
            JOptionPane.showMessageDialog(null, "Please wait, Loading now... \n" +
                            "Press OK to continue",
                    "Loading", JOptionPane.PLAIN_MESSAGE);
            verifyAccount(Login.thisUsername, Login.thisPassword);
            /*System.out.println(verify.thisUsername);
            System.out.println(verify.getThisUsername());
            System.out.println(verify.getThisPassword());*/
        }
    }
    private void verifyAccount(String username, String password){
        System.out.println("create thisUsername---->"+username);
        System.out.println("create thisPassword---->"+password);
        //String values = "";
        String values = "{\"Credit\":1,\"PaperID\":\"none\"," +
                "\"PW\":\""+password+"\""+
                ",\"ReviewState\":"+RadioButtonYes.isSelected()+
                ",\"ai\":"+CheckBoxAI.isSelected() +
                ",\"arch\":"+CheckBoxArch.isSelected()+
                ",\"dm\":"+CheckBoxDM.isSelected()+
                ",\"edu\":"+CheckBoxEdu.isSelected()+
                ",\"inter\":"+CheckBoxInter.isSelected()+
                ",\"net\":"+CheckBoxNet.isSelected()+
                ",\"par\":"+CheckBoxPar.isSelected()+
                ",\"secu\":"+CheckBoxSecu.isSelected()+
                ",\"ssy\":"+CheckBoxSsy.isSelected()+
                ",\"theo\":"+CheckBoxTheo.isSelected()+
                ",\"vr\":"+CheckBoxVR.isSelected()+"}";
        try{

            Contract contract = Login.fabricGateway.getContract();
            contract.submitTransaction("updateData",username, values);
            JOptionPane.showMessageDialog(null, "Created Successful!",
                    "Congratulation", JOptionPane.PLAIN_MESSAGE);
            CheckBoxAI.setSelected(false);
            CheckBoxArch.setSelected(false);
            CheckBoxDM.setSelected(false);
            CheckBoxEdu.setSelected(false);
            CheckBoxInter.setSelected(false);
            CheckBoxNet.setSelected(false);
            CheckBoxPar.setSelected(false);
            CheckBoxSecu.setSelected(false);
            CheckBoxSsy.setSelected(false);
            CheckBoxTheo.setSelected(false);
            CheckBoxVR.setSelected(false);
            SingleChoice.clearSelection();

            this.setVisible(false);

            WindowMenu.setVisible(true);
        }
        catch(EndorseException e){
            System.out.println("User doesn't not exist");
            JOptionPane.showMessageDialog(null, "User does not Exist"+"\n"+"Please try again",
                    "User Error", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        catch (Exception e){
            System.out.println("Error Message");
            JOptionPane.showMessageDialog(null, "UnExpected Error"+"\n"+"Please try again",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
    }
/*
    private void verifyAccount(String username, String password){
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
            if (!des.decrypt(values).equals(msg)){
                JOptionPane.showMessageDialog(null, "The password does not match"+"\n"+"Please check the username and password \n" +
                                "And enter again.",
                        "Error information", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
                return;
            }
            else{
                JOptionPane.showMessageDialog(null, "Please wait, Loading now... \n" +
                                "Press OK to continue",
                        "Loading", JOptionPane.PLAIN_MESSAGE);
                values = "{\"Credit\":1,\"Finish\":false,\"PaperID\":\"none\"," +
                        "\"PW\":\""+values+"\""+
                        ",\"ReviewState\":"+RadioButtonYes.isSelected()+
                        ",\"ai\":"+CheckBoxAI.isSelected() +
                        ",\"arch\":"+CheckBoxArch.isSelected()+
                        ",\"dm\":"+CheckBoxDM.isSelected()+
                        ",\"edu\":"+CheckBoxEdu.isSelected()+
                        ",\"inter\":"+CheckBoxInter.isSelected()+
                        ",\"net\":"+CheckBoxNet.isSelected()+
                        ",\"par\":"+CheckBoxPar.isSelected()+
                        ",\"secu\":"+CheckBoxSecu.isSelected()+
                        ",\"ssy\":"+CheckBoxSsy.isSelected()+
                        ",\"theo\":"+CheckBoxTheo.isSelected()+
                        ",\"vr\":"+CheckBoxVR.isSelected()+"}";
                contract.submitTransaction("updateData",username, values);
                JOptionPane.showMessageDialog(null, "Created Successful!",
                        "Congratulation", JOptionPane.PLAIN_MESSAGE);
                //setThisUsername(username);
                NameField.setText("");
                PassField.setText("");
                CheckBoxAI.setSelected(false);
                CheckBoxArch.setSelected(false);
                CheckBoxDM.setSelected(false);
                CheckBoxEdu.setSelected(false);
                CheckBoxInter.setSelected(false);
                CheckBoxNet.setSelected(false);
                CheckBoxPar.setSelected(false);
                CheckBoxSecu.setSelected(false);
                CheckBoxSsy.setSelected(false);
                CheckBoxTheo.setSelected(false);
                CheckBoxVR.setSelected(false);
                SingleChoice.clearSelection();

                this.setVisible(false);

                WindowMenu.setVisible(true);
            }
        }
        catch(EndorseException e){
            System.out.println("User doesn't not exist");
            JOptionPane.showMessageDialog(null, "User does not Exist"+"\n"+"Please enter the correct Username",
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
*/


    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // reset all option
        //NameField.setText("");
        CheckBoxAI.setSelected(false);
        CheckBoxArch.setSelected(false);
        CheckBoxDM.setSelected(false);
        CheckBoxEdu.setSelected(false);
        CheckBoxInter.setSelected(false);
        CheckBoxNet.setSelected(false);
        CheckBoxPar.setSelected(false);
        CheckBoxSecu.setSelected(false);
        CheckBoxSsy.setSelected(false);
        CheckBoxTheo.setSelected(false);
        CheckBoxVR.setSelected(false);
        SingleChoice.clearSelection();
        ButtonCancel.setEnabled(true);
        this.setVisible(false);
        System.out.println("click Cancel");
    }


/*    public String getThisUsername() {
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
    }*/
/*
    private void ButtonCancelMousePressed(java.awt.event.MouseEvent evt) {
    }
*/
}
