import com.CarmenWen.fabricgateway.FabricGateway;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author carmenw
 */
public class MenuGUI extends JFrame {

    public static void main(String[] args){
        MenuGUI menu = new MenuGUI();
    }

    // Variables declaration - do not modify
    private JButton ButtonExit;
    private JButton ButtonFinish;
    private JButton ButtonQuery;
    private JButton ButtonRefer;
    private JButton ButtonUpdate;
    private JButton ButtonCheck;
    //private JButton ButtonCreate;
    private JButton ButtonReport;
    private JLabel LabelMenu;
    private JLabel MenuMessage;
    private JLabel WelcomeMessage;
    //private JFrame WindowCreate;
    //private JFrame WindowCheck;
    private JFrame WindowUpdate;
    private JFrame WindowQuery;
    private JFrame WindowRefer;
    private JFrame WindowFinish;
    private JFrame WindowReport;

    //FabricGateway fabricGateway = new FabricGateway();



    public MenuGUI() {

        this.setSize(450, 500);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(450, 500));
        this.setLocation(0, 100);
        this.setTitle("PAPER SYSTEM Via BlockChain");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        //this.repaint();

        WindowUpdate = new UpdateOwnData();
        //WindowCreate = new CreateOwnData();
        //WindowCheck = new CheckOwnData();
        WindowQuery = new QueryCategory();
        WindowRefer = new ReferPaper();
        WindowFinish  = new FinishPaper();
        WindowReport = new QueryReport();

        WelcomeMessage = new JLabel();
        LabelMenu = new JLabel();
        MenuMessage = new JLabel();
        //ButtonCreate = new JButton();
        ButtonCheck = new JButton();
        ButtonUpdate = new JButton();
        ButtonQuery = new JButton();
        ButtonRefer = new JButton();
        ButtonFinish = new JButton();
        ButtonExit = new JButton();
        ButtonReport = new JButton();

        //WindowCreate.addWindowListener(new WindowListener() {


        WelcomeMessage.setText("Welcome to use THE PAPER SYSTEM");
        Font f = new Font("Arial",Font.ITALIC,16);
        WelcomeMessage.setFont(f);

        LabelMenu.setText("--- MENU ---");
        Font h = new Font("Arial",Font.BOLD,20);
        LabelMenu.setFont(h);

        MenuMessage.setText("Please Choose Your Option From The Following Menu");

        MenuMessage.setText("Please Choose Your Option From The Following Menu");

/*        ButtonCreate.setText("Initialize Your Information");
        ButtonCreate.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent evt) {
                ButtonCreateMouseMoved(evt);
            }
        });

        ButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateActionPerformed(evt);
            }
        });*/
        /*        ButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCreateMousePressed(evt);
            }
        });*/

        ButtonCheck.setText("Check Information");
        ButtonCheck.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonCheckMouseMoved(evt);
            }
        });
        ButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCheckActionPerformed(evt);
            }
        });
        /*        ButtonCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCheckMousePressed(evt);
            }
        });*/


        ButtonUpdate.setText("Update Profile");
        ButtonUpdate.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonUpdateMouseMoved(evt);
            }
        });
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });
/*        ButtonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonUpdateMousePressed(evt);
            }
        });*/



        ButtonQuery.setText("Search Marker");
        ButtonQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQueryActionPerformed(evt);
            }
        });
        ButtonQuery.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonQueryMouseMoved(evt);
            }
        });


/*        ButtonQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonQueryMousePressed(evt);
            }
        });*/


        ButtonRefer.setText("Assign Papers to Marker");
        ButtonRefer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonReferMouseMoved(evt);
            }
        });
        ButtonRefer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReferActionPerformed(evt);
            }
        });
/*        ButtonRefer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonReferMousePressed(evt);
            }
        });*/

        ButtonReport.setText("Query Report By PaperID");
        ButtonReport.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonReportMouseMoved(evt);
            }
        });
        ButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReportActionPerformed(evt);
            }
        });


        ButtonFinish.setText("Complete Report");
        ButtonFinish.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonFinishMouseMoved(evt);
            }
        });
        ButtonFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinishActionPerformed(evt);
            }
        });


        ButtonExit.setText("Exit");
/*        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonExitMousePressed(evt);
            }
        });*/

        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtonExit)
                                .addGap(44, 44, 44))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(ButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ButtonCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ButtonQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ButtonRefer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ButtonReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(76, 76, 76))
                                        .addComponent(MenuMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(37, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelMenu)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(WelcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(LabelMenu)
                                .addGap(18, 18, 18)
                                .addComponent(WelcomeMessage)
                                .addGap(29, 29, 29)
                                .addComponent(MenuMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonRefer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(ButtonExit)
                                .addGap(26, 26, 26))
        );
    }// </editor-fold>



//===================== Start the Buttons Action ===========================


    // Action for Create Button
/*    private void ButtonCreateMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonCreate.setToolTipText("This Option will allow you " +
                "to initialize your Information.");
    }*/
/*    private void ButtonCreateMousePressed(java.awt.event.MouseEvent evt) {
        //ButtonCreate.setEnabled(false);
        //WindowCreate.setVisible(true);
        System.out.println("click Create");

    }*/
/*    private void ButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {
        // set Enabled false the action only take once
        ButtonCreate.setEnabled(false);
        //WindowCreate.setVisible(true);
        System.out.println("press Enable");

    }*/

    // Action for Check Button
    private void ButtonCheckMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonCheck.setToolTipText("This Option will allow you " +
                "to check your credit and PaperID " +
                "if any paper has refer to you.");
    }
    private void ButtonCheckMousePressed(java.awt.event.MouseEvent evt) {
        //ButtonCheck.setEnabled(true);
        System.out.println("click Check");

        //CheckOwnData WindowCheck = new CheckOwnData();
    }
    private void ButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {
        //ButtonCheck.setEnabled(false);
        //System.out.println("click 11");
        //WindowCheck.setVisible(true);
        try {
            JOptionPane.showMessageDialog(null, "Please wait, Loading now... \n" +
                            "Press OK to continue",
                    "Loading", JOptionPane.PLAIN_MESSAGE);

            Contract contract = Login.fabricGateway.getContract();
            //String str = "{\"selector\":{\"ai\":\"true\",\"ReviewState\":\"true\"}, \"use_index\":[]}";// 富查询字符串
            byte[] normalQueries = contract.submitTransaction("queryData", Login.thisUsername);
            String s = new String(normalQueries);
            System.out.println("s" + s);

            String YourMessage = "";
            JSONObject jsonObject = JSONObject.parseObject(s);
            System.out.println("s1" + jsonObject);
            System.out.println("s2" + jsonObject.get("Credit"));
            System.out.println(jsonObject.size());
            if (jsonObject.size()==1){
                JOptionPane.showMessageDialog(null, "Your Information is Empty,\n" +
                                "Please Go to <Menu>-Update Information first",
                        "Empty Result", JOptionPane.ERROR_MESSAGE, UIManager.getIcon("OptionPane.errorIcon"));
                return;
            }
            else{
                YourMessage += "Account: " + Login.thisUsername + "\n"
                        + "=======================" + "\n"
                        + "Credit: " + jsonObject.get("Credit") + "\n"
                        + "Paper ID: " + jsonObject.get("PaperID") + "\n"
                        + "Review State: " + jsonObject.get("ReviewState") + "\n" + "\n"
                        + "Your Selected Category are: " + "\n";

                String[] keys = new String[]{"ai", "arch", "dm", "edu", "inter", "net", "par", "secu", "ssy", "theo", "vr"};
                String[] cat = new String[]{"Artificial Intelligence", "Architecture", "Data Mining", "Educational Technology",
                        "Human Computer Interaction", "Computer Networks & Wireless Communication", "Parallel Distributed System",
                        "Computer Security & Cryptography", "Software Systems", "Theoretical Computer Science", "Computer Vision & Graphic"};
                for (int i = 0; i < 11; i++) {
                    if ((Boolean) jsonObject.get(keys[i])) {
                        YourMessage += cat[i] + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, YourMessage,
                        "Query Result", JOptionPane.PLAIN_MESSAGE);
            }
        }
        catch(EndorseException e){
            JOptionPane.showMessageDialog(null, "Lost Connection,"+"\n"+"Please try again",
                    "Warning", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        catch (Exception e){
            System.out.println("Error Message");
            JOptionPane.showMessageDialog(null, "UnExpected Error\n" +
                            "Please Try Again.",
                    "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
            return;
        }
    }

    // Action for Update Button
    private void ButtonUpdateMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonUpdate.setToolTipText("This Option will allow you to update your information if you have any changes");
        //System.out.println("update");
    }
/*    private void ButtonUpdateMousePressed(java.awt.event.MouseEvent evt) {
        //ButtonUpdate.setEnabled(true);
        System.out.println("click 11");
        WindowUpdate.setVisible(true);
    }*/
    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        //WindowUpdate.setEnabled(false);
        System.out.println("click update");
        WindowUpdate.setVisible(true);

    }

    // Action for Query Button
    private void ButtonQueryMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonQuery.setToolTipText("This Option will allow you to Query your own Information \n"
                + "such as credit and PaperID if referred to you");
    }
/*    private void ButtonQueryMousePressed(java.awt.event.MouseEvent evt) {
        ButtonQuery.setEnabled(true);
        System.out.println("click Query");
    }*/
    private void ButtonQueryActionPerformed(java.awt.event.ActionEvent evt){
        //ButtonQuery.setEnabled(true);
        System.out.println("click Query");
        WindowQuery.setVisible(true);
    }

    // Action for Refer Button
    private void ButtonReferMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonRefer.setToolTipText("This Option will allow you refer the paper to others");
    }
    private void ButtonReferActionPerformed(java.awt.event.ActionEvent evt) {
        //ButtonRefer.setEnabled(true);
        System.out.println("click Refer");
        WindowRefer.setVisible(true);

    }


    // Action for Report Button
    private void ButtonReportMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonReport.setToolTipText("This Option will allow you query the paper report after marking");
    }
    private void ButtonReportActionPerformed(java.awt.event.ActionEvent evt) {
        //ButtonRefer.setEnabled(true);
        System.out.println("click Report");
        //WindowRefer.setVisible(true);
        WindowReport.setVisible(true);


    }


    private void ButtonFinishMouseMoved(java.awt.event.MouseEvent evt) {
        ButtonFinish.setToolTipText("This Option will allow you to tell everyone you have finish your marking.");
    }
    private void ButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {
        //ButtonFinish.setEnabled(true);
        System.out.println("click finish");
        WindowFinish.setVisible(true);
    }

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
        System.out.println("click EXit");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
/*    private void ButtonExitMousePressed(java.awt.event.MouseEvent evt) {
        //ButtonFinish.setEnabled(true);
        System.exit(0);
        System.out.println("click EXit");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }*/
    /*    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        ButtonCheck.setEnabled(false);
        System.out.println("click 11");
    }*/
}
