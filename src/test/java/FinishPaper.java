import com.CarmenWen.fabricgateway.FabricGateway;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 *
 * @author carmenw
 */
public class FinishPaper extends javax.swing.JFrame {

    public static void main(String[] args) {
        FinishPaper f = new FinishPaper();
        System.out.println("exit");
    }

    private javax.swing.JRadioButton ButtonNo;
    private javax.swing.JRadioButton ButtonYes;
    //private javax.swing.JTextField NameField;
    private javax.swing.JTextField PaperIDField;
    private javax.swing.JLabel TextFinish;
    private javax.swing.JLabel TextPaperID;
    private javax.swing.JLabel TextYourName;
    private ButtonGroup SingleChoice;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSummit;
    private javax.swing.JLabel LabelTitle;

    private javax.swing.JLabel TextReport;
    private javax.swing.JTextArea ReportArea;

    private javax.swing.JScrollPane jScrollPane1;
    //public String paperID;

    //public String username;

    //FabricGateway fabricGateway = new FabricGateway();

    public FinishPaper() {

        this.setSize(800, 500);
        this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(200, 200);
        this.setTitle("Finish Paper");
        this.setResizable(false);
        this.setVisible(false);

        TextYourName = new javax.swing.JLabel();
        ButtonSummit = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        LabelTitle = new javax.swing.JLabel();
        //NameField = new javax.swing.JTextField();
        TextPaperID = new javax.swing.JLabel();
        PaperIDField = new javax.swing.JTextField();
        TextFinish = new javax.swing.JLabel();
        SingleChoice = new ButtonGroup();
        ButtonYes = new javax.swing.JRadioButton();
        ButtonNo = new javax.swing.JRadioButton();

        TextReport = new javax.swing.JLabel();
        ReportArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();


        SingleChoice.add(ButtonYes);
        SingleChoice.add(ButtonNo);

        TextYourName.setText("Please enter your name:");

        ButtonSummit.setText("Summit");
        ButtonSummit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSummitActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });
/*
        ButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                ButtonCancelMousePressed(evt);
            }
        });
*/

        LabelTitle.setText("--- PAPER SYSTEM ---");
        Font f = new Font("Arial",Font.BOLD,20);
        LabelTitle.setFont(f);

/*        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });*/

        TextPaperID.setText("Please enter the Paper ID:");

        PaperIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperIDFieldActionPerformed(evt);
            }
        });

        TextFinish.setText("Have you finished your marking?");
        ButtonYes.setText("Yes");

        ButtonNo.setText("No");
        ButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNoActionPerformed(evt);
            }
        });

        TextReport.setText("Please post your report here:");
        ReportArea.setColumns(20);
        ReportArea.setRows(5);
        ReportArea.setLineWrap(true);        //激活自动换行功能
        ReportArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ReportArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(ButtonSummit)
                                                .addGap(28, 28, 28)
                                                .addComponent(ButtonCancel))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(PaperIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(TextPaperID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(2, 2, 2))
                                                                        .addComponent(TextFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(ButtonYes)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(ButtonNo)
                                                                                .addGap(62, 62, 62)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(TextReport))))
                                .addGap(64, 64, 64))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 290, Short.MAX_VALUE)
                                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(LabelTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(TextPaperID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PaperIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFinish)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonYes)
                                        .addComponent(ButtonNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextReport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonSummit)
                                        .addComponent(ButtonCancel))
                                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>




    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void PaperIDFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ButtonNoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ButtonSummitActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("   testing   ".trim());

/*        if(NameField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Name",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }*/
        if (PaperIDField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Paper ID",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if (ButtonNo.isSelected()){
            JOptionPane.showMessageDialog(null, "Please Finish Your Marking First," +"\n"+
                            "Then Come Back For Updated Your States","Message",JOptionPane.PLAIN_MESSAGE);
            return;
        }
        else if(!(ButtonYes.isSelected() | ButtonNo.isSelected())){
            JOptionPane.showMessageDialog(null, "Please Choose Finishing State",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if (ReportArea.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please filled up your report\n for this marking paper",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else{
            System.out.println("information");
            //username = NameField.getText().trim().toLowerCase();
            try {
                Contract contract = Login.fabricGateway.getContract();
                //String str = "{\"selector\":{\"ai\":\"true\",\"ReviewState\":\"true\"}, \"use_index\":[]}";// 富查询字符串
                byte[] normalQueries = contract.submitTransaction("queryData", Login.thisUsername);
                String s = new String(normalQueries);
                System.out.println("s" + s);
                JSONObject jsonObject = JSONObject.parseObject(s);
                System.out.println("s1" + jsonObject);
                System.out.println("s2" + jsonObject.get("PaperID"));
                System.out.println("s3" + PaperIDField.getText().trim());
                if (PaperIDField.getText().trim().equals("none")){
                    JOptionPane.showMessageDialog(null, "You Don't Have A Marking Paper,"+"\n"+"Please Come Back Later.",
                            "Warning", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
                    this.setVisible(false);
                    return;
                }

                else if(!PaperIDField.getText().trim().equals(jsonObject.get("PaperID"))){
                    JOptionPane.showMessageDialog(null, "Paper ID is INVALID," +"\n"+
                                    "Please Check Your Paper ID.",
                            "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
                    return;
                }
                else{
                    String values = "{\"Credit\":"+((int) jsonObject.get("Credit")+1)+
                            ",\"PaperID\":\"none\"" +
                            ",\"PW\":\""+jsonObject.get("PW")+"\""+
                            ",\"ReviewState\":"+jsonObject.get("ReviewState")+
                            ",\"ai\":"+jsonObject.get("ai")+
                            ",\"arch\":"+jsonObject.get("arch")+
                            ",\"dm\":"+jsonObject.get("dm")+
                            ",\"edu\":"+jsonObject.get("edu")+
                            ",\"inter\":"+jsonObject.get("inter")+
                            ",\"net\":"+jsonObject.get("net")+
                            ",\"par\":"+jsonObject.get("par")+
                            ",\"secu\":"+jsonObject.get("secu")+
                            ",\"ssy\":"+jsonObject.get("ssy")+
                            ",\"theo\":"+jsonObject.get("theo")+
                            ",\"vr\":"+jsonObject.get("vr")+"}";

                    contract.submitTransaction("updateData",Login.thisUsername,values);
                }
            }
            catch (EndorseException e1){
                System.out.println("Information Invalid");
                JOptionPane.showMessageDialog(null, "Lost Connection," + "\n" + "Please try again.",
                        "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
                return;
            }
            catch (Exception e2){
                System.out.println("Error Message");
                JOptionPane.showMessageDialog(null, "UnExpected Error, \n Please try again.",
                        "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
                return;
            }
        }
        try{
            JOptionPane.showMessageDialog(null, "Please wait, Loading now... \n" +
                            "Press OK to continue",
                    "Loading", JOptionPane.PLAIN_MESSAGE);
            Contract contract = Login.fabricGateway.getContract();
            String values = "{\"MarkedBy\":\"" + Login.thisUsername + "\"," +
                    "\"report\":\""+ ReportArea.getText().trim() +"\"}";
            System.out.println(values);
            //values = "{\"MarkedBy\":\"user00\",\"report\":\"This is a description for the report paper000.\nThis is a description for the report paper000.\nThis is a description for the report paper000.\nThis is a description for the report paper000.\nThis is a description for the report paper000.\"}";

            contract.submitTransaction("createData",PaperIDField.getText().trim(),values);
/*            JOptionPane.showMessageDialog(null, "Register Successful!",
                    "Congratulation", JOptionPane.PLAIN_MESSAGE);*/
            //setThisUsername(username);
            //v.setThisPassword(password);
            //paperID = PaperIDField.getText().trim();
            JOptionPane.showMessageDialog(null, "Paper Information Created Successful, \n" +
                            "Press OK to continue",
                    "Loading", JOptionPane.PLAIN_MESSAGE);

        }
        catch(EndorseException e){
            System.out.println("PaperID already exist");
            JOptionPane.showMessageDialog(null, "PaperID Already Exist"+"\n"+"Please check the correct ID.",
                    "Wrong ID", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Message");
            JOptionPane.showMessageDialog(null, "UnExpected Error\n Please Try Again",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }

        JOptionPane.showMessageDialog(null, "Well Done!" +"\n" +
                        " You Have Finish Your Marking."+"\n" +
                        "Please Go To <Menu> Option " +"\n" +
                        "If ANY information change.",
                "Message", JOptionPane.PLAIN_MESSAGE);

        //NameField.setText("");
        PaperIDField.setText("");
        TextReport.setText("");
        SingleChoice.clearSelection();
        this.setVisible(false);
    }

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
        //NameField.setText("");
        PaperIDField.setText("");
        SingleChoice.clearSelection();
        this.setVisible(false);
        System.out.println("click Cancel");
    }

    /*private void ButtonCancelMousePressed(java.awt.event.MouseEvent evt) {

    }*/


    // Variables declaration - do not modify

    // End of variables declaration
}
