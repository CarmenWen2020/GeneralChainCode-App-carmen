import com.CarmenWen.fabricgateway.FabricGateway;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Locale;

/**
 *
 * @author carmenw
 */
public class ReferPaper extends JFrame {

    /**
     * Creates new form NewJPanel
     */


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public static void main(String[] args) {
        ReferPaper f = new ReferPaper();
        System.out.println("ReferPaper");
    }

    private JButton ButtonCancel;
    private JButton ButtonSummit;
    private JLabel TextPaperID;
    private JLabel TextName;
    private JLabel LabelTitle;
    private JTextField NameField;
    private JTextField PaperIDField;
    private String pid ="";

    //FabricGateway fabricGateway = new FabricGateway();


    @SuppressWarnings("unchecked")

    public ReferPaper() {

        this.setSize(800, 500);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(190, 190);
        this.setTitle("Refer Paper");
        this.setVisible(false);

        TextName = new JLabel();
        ButtonSummit = new JButton();
        ButtonCancel = new JButton();
        LabelTitle = new JLabel();
        NameField = new JTextField();
        TextPaperID = new JLabel();
        PaperIDField = new JTextField();

        TextName.setText("Please enter the Username you want to refer to:");

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
/*        ButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                ButtonCancelMousePressed(evt);
            }
*//*            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCancelMouseClicked(evt);
            }*//*
        });*/


        LabelTitle.setText("--- PAPER SYSTEM ---");
        Font f = new Font("Arial",Font.BOLD,20);
        LabelTitle.setFont(f);

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        TextPaperID.setText("Please enter the Paper ID:");

        PaperIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperIDFieldActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtonSummit)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonCancel)
                                .addGap(44, 44, 44))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelTitle)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TextName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TextPaperID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(NameField, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PaperIDField, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(LabelTitle)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(TextName, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextPaperID)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PaperIDField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonSummit)
                                        .addComponent(ButtonCancel))
                                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>


    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void PaperIDFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ButtonSummitActionPerformed(java.awt.event.ActionEvent evt) {
        if(NameField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Name",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if(PaperIDField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Paper ID",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if(PaperIDField.getText().toLowerCase().trim().equals("none") | PaperIDField.getText().toLowerCase().trim().equals("no") | PaperIDField.getText().toLowerCase().trim().equals("NA")){
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Paper ID",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else if(NameField.getText().trim().equals(Login.thisUsername)){
            JOptionPane.showMessageDialog(null, "Self-referred Is Not Allowed. \n Please Enter Another User.",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else{
            try {
                Contract contract = Login.fabricGateway.getContract();
                byte[] normalQueries = contract.submitTransaction("queryData", NameField.getText().trim().toLowerCase());
                String s = new String(normalQueries);
                System.out.println("s" + s);
                JSONObject jsonObject = JSONObject.parseObject(s);
                System.out.println("s1" + jsonObject);

                if (!jsonObject.get("PaperID").equals("none")){
                    JOptionPane.showMessageDialog(null, "This User Already Has A Marking Paper," +"\n"+
                                    "Please Choose Other User.",
                            "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
                    return;
                }
                else if (jsonObject.get("ReviewState").equals(false)){
                    JOptionPane.showMessageDialog(null, "This User Don't Want To Mark Paper," +"\n"+
                                    "Please Choose Other User.",
                            "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
                    return;
                }
                else{
/*                    String values = "{\"Credit\":"+ jsonObject.get("Credit") +
                            ",\"PaperID\":\"" + PaperIDField.getText().trim() + "\"" +
                            ",\"PW\":"+jsonObject.get("PW")+
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
                            ",\"vr\":"+jsonObject.get("vr")+"}";*/

                    String values = "{\"Credit\":"+jsonObject.get("Credit")+
                            ",\"PaperID\":\""+PaperIDField.getText().trim()+ "\"" +
                            ",\"PW\":\""+jsonObject.get("PW")+"\""+
                            ",\"ReviewState\":"+jsonObject.get("ReviewState")+
                            ",\"ai\":"+jsonObject.get("ai") +
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
                    System.out.println(values);

                    //System.out.println("NameField"+NameField.getText().toLowerCase()+"NameField");
                    //System.out.println("NameField"+""+"NameField");

                    contract.submitTransaction("updateData",NameField.getText().toLowerCase().toLowerCase(),values);
                }
            }
            catch (EndorseException e1){
                System.out.println("User Not exist");
                JOptionPane.showMessageDialog(null, "User Is Not Exist" + "\n" + "Please Check The Valid Name.",
                        "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
                return;
            }
            catch (Exception e2){
                System.out.println("Error Message");
                JOptionPane.showMessageDialog(null, "UnExpected Error,\n Please try again.",
                        "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Congratulation!" + "\n" + "Paper <" + PaperIDField.getText().trim() + "> referred successful.",
                "Message", JOptionPane.PLAIN_MESSAGE);

        NameField.setText("");
        PaperIDField.setText("");
    }

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
        NameField.setText("");
        PaperIDField.setText("");
        this.setVisible(false);
        System.out.println("click Cancel");
    }
/*    private void ButtonCancelMousePressed(java.awt.event.MouseEvent evt) {

        this.setVisible(false);
        System.out.println("click Cancel");
    }*/


    // Variables declaration - do not modify

    // End of variables declaration
}
