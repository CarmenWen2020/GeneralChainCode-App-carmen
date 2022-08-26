import com.CarmenWen.fabricgateway.FabricGateway;
import com.CarmenWen.pojo.QueryResult;
import com.CarmenWen.pojo.QueryResultList;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 *
 * @author carmenw
 */
public class QueryCategory extends JFrame {

    public static void main(String[] args) {
        QueryCategory f = new QueryCategory();
        System.out.println("exit");
    }
    private JButton ButtonCancel;
    private JButton ButtonSummit;
    private JCheckBox CheckBoxSecu;
    private JCheckBox CheckBoxAI;
    private JCheckBox CheckBoxArch;
    private JCheckBox CheckBoxDM;
    private JCheckBox CheckBoxEdu;
    private JCheckBox CheckBoxInter;
    private JCheckBox CheckBoxNet;
    private JCheckBox CheckBoxPar;
    private JCheckBox CheckBoxSsy;
    private JCheckBox CheckBoxTheo;
    private JCheckBox CheckBoxVR;
    private JLabel TextMessage;
    private JLabel LabelTitle;

    //FabricGateway fabricGateway = new FabricGateway();
    ResponseTable xx = new ResponseTable();

    @SuppressWarnings("unchecked")
    public QueryCategory() {

        this.setSize(800, 500);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(180, 180);
        this.setTitle("Query Information");
        this.setVisible(false);
        this.setResizable(false);

        TextMessage = new JLabel();
        CheckBoxAI = new JCheckBox();
        CheckBoxArch = new JCheckBox();
        CheckBoxDM = new JCheckBox();
        CheckBoxEdu = new JCheckBox();
        CheckBoxInter = new JCheckBox();
        CheckBoxNet = new JCheckBox();
        CheckBoxPar = new JCheckBox();
        CheckBoxSecu = new JCheckBox();
        CheckBoxSsy = new JCheckBox();
        CheckBoxTheo = new JCheckBox();
        CheckBoxVR = new JCheckBox();
        ButtonSummit = new JButton();
        ButtonCancel = new JButton();
        LabelTitle = new JLabel();


        TextMessage.setText("Please choose the category for the related paper: ");

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
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(TextMessage)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(CheckBoxPar)
                                                        .addComponent(CheckBoxSsy)
                                                        .addComponent(CheckBoxVR)
                                                        .addComponent(CheckBoxInter)
                                                        .addComponent(CheckBoxAI)
                                                        .addComponent(CheckBoxDM))
                                                .addGap(107, 107, 107)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(CheckBoxArch)
                                                        .addComponent(CheckBoxEdu)
                                                        .addComponent(CheckBoxSecu)
                                                        .addComponent(CheckBoxTheo)
                                                        .addComponent(CheckBoxNet))))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(LabelTitle)
                                .addGap(18, 18, 18)
                                .addComponent(TextMessage)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(CheckBoxAI)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxDM)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxInter, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxPar)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxSsy)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxVR))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(CheckBoxArch)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxEdu)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxNet)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxSecu)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CheckBoxTheo)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonSummit)
                                        .addComponent(ButtonCancel))
                                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>


    private void CheckBoxAIActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxDMActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxArchActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxEduActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxInterActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxNetActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxParActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxSecuActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxSsyActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxTheoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxVRActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ButtonSummitActionPerformed(java.awt.event.ActionEvent evt) {

        Object[][] tb = new Object[30][4];
        if(!(CheckBoxAI.isSelected() | CheckBoxArch.isSelected() | CheckBoxDM.isSelected() | CheckBoxEdu.isSelected() |
                CheckBoxInter.isSelected() | CheckBoxNet.isSelected() | CheckBoxPar.isSelected() | CheckBoxSecu.isSelected() |
                CheckBoxSsy.isSelected() |  CheckBoxTheo.isSelected() | CheckBoxVR.isSelected() )){
            JOptionPane.showMessageDialog(null, "Please Choose At Least One Category.",
                    "Warning", JOptionPane.WARNING_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
            return;
        }
        else{
            //Contract contract = fabricGateway.getContract();

            String str = "{\"selector\":{";
            if (CheckBoxAI.isSelected()){
                str +="\"ai\":" + CheckBoxAI.isSelected() +",";
            }
            if (CheckBoxArch.isSelected()){
                str +="\"arch\":" + CheckBoxArch.isSelected() +",";
            }
            if (CheckBoxDM.isSelected()){
                str +="\"dm\":" + CheckBoxDM.isSelected() +",";
            }
            if (CheckBoxEdu.isSelected()){
                str +="\"edu\":" + CheckBoxEdu.isSelected() +",";
            }
            if (CheckBoxInter.isSelected()){
                str +="\"inter\":" + CheckBoxInter.isSelected() +",";
            }
            if (CheckBoxNet.isSelected()){
                str +="\"net\":" + CheckBoxNet.isSelected() +",";
            }
            if (CheckBoxPar.isSelected()){
                str +="\"par\":" + CheckBoxPar.isSelected() +",";
            }
            if (CheckBoxSecu.isSelected()){
                str +="\"secu\":" + CheckBoxSecu.isSelected() +",";
            }
            if (CheckBoxSsy.isSelected()){
                str +="\"ssy\":" + CheckBoxSsy.isSelected() +",";
            }
            if (CheckBoxTheo.isSelected()){
                str +="\"theo\":" + CheckBoxTheo.isSelected() +",";
            }
            if (CheckBoxVR.isSelected()){
                str +="\"vr\":" + CheckBoxVR.isSelected() +",";
            }
            str += "\"ReviewState\":"+true+",\"PaperID\":\"none\"}, \"use_index\":[]}";

            System.out.println("str "+str);


            try{
                JOptionPane.showMessageDialog(null, "Please Wait," +"\n"+"Loading Now..." +
                                "\n" + "Press OK to Continuous",
                        "Loading", JOptionPane.PLAIN_MESSAGE);
                String str1 = "{\"selector\":{\"ai\":true,\"ReviewState\":true}, \"use_index\":[]}";
                Contract contract = Login.fabricGateway.getContract();
                byte[] richQueries = contract.submitTransaction("richQuery", str);
                String s = new String(richQueries);

                System.out.println("s"+s);

                JSONObject jsonObject = JSONObject.parseObject(s);
                System.out.println("s1"+jsonObject);
                QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
                System.out.println("s2"+resultList);
                List<QueryResult> resultValueList = resultList.getResultList();
                System.out.println("s3"+resultValueList ==null);
                System.out.println("s"+resultValueList.isEmpty());

                for(int i=0; i< resultValueList.size(); i++){
                    QueryResult a = resultValueList.get(i);
                    System.out.println("s4"+a);

                    String key = a.getKey();
                    System.out.println("s5"+key);
                    String json = a.getJson();
                    System.out.println("s6"+json);
                    JSONObject jsonObject2 = JSONObject.parseObject(json);
                    //GeneralPaperSystemClasses data = JSON.toJavaObject(jsonObject2, GeneralPaperSystemClasses.class);

                    tb[i][0] = key;
                    System.out.println("str1 "+tb[i][0]);
                    tb[i][1] = jsonObject2.get("Credit");
                    //jsonObject2.get("Credit");
                    System.out.println("str2 "+tb[i][1]);
                    tb[i][2] = jsonObject2.get("ReviewState");
                    tb[i][3] = jsonObject2.get("PaperID");
                    System.out.println("str3 "+tb[i][3]);

                }
                System.out.println("str4"+tb);



                /*for (QueryResult a : resultValueList) {
                    System.out.println("for loop printing:"); //循环打印
                    String key = a.getKey();
                    //System.out.println(key);
                    String json = a.getJson();
                    //System.out.println(json);

                    JSONObject jsonObject2 = JSONObject.parseObject(json);
                    GeneralPaperSystemClasses data = JSON.toJavaObject(jsonObject2, GeneralPaperSystemClasses.class);

                    System.out.println(key+" : Review State -> "+data.getReviewState());
                }*/
            }
            catch(EndorseException e){
                System.out.println("Try Other Category");
                JOptionPane.showMessageDialog(null, "No Such A Users,"+"\n"+"Please Try Other Category",
                        "Warning", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.warningIcon"));
                return;
            }
            catch (Exception e){
                System.out.println("Error Message");
                JOptionPane.showMessageDialog(null, "UnExpected Error,"+"\n"+"Please Try Again.",
                        "Error Message", JOptionPane.ERROR_MESSAGE,UIManager.getIcon("OptionPane.errorIcon"));
                return;
            }
            /*byte[] richQueries = contract.submitTransaction("richQuery", str);
            String s = new String(richQueries);
            System.out.println("s"+s);

            JSONObject jsonObject = JSONObject.parseObject(s);
            QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
            List<QueryResult> resultValueList = resultList.getResultList();

            for (QueryResult a : resultValueList) {
                System.out.println("for loop printing:"); //循环打印
                String key = a.getKey();
                //System.out.println(key);
                String json = a.getJson();
                //System.out.println(json);

                JSONObject jsonObject2 = JSONObject.parseObject(json);
                GeneralPaperSystemClasses data = JSON.toJavaObject(jsonObject2, GeneralPaperSystemClasses.class);

                System.out.println(key+" : Review State -> "+data.getReviewState());
            }
            Object ct = new Object[][]{
                    {}
            };*/

        }

        xx.CustomTable.setModel(new javax.swing.table.DefaultTableModel(tb,
                new String [] {
                        "Name", "Credit", "Review State", "Paper ID"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        xx.setVisible(true);
        if(!xx.isShowing()){
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
        }
    }

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
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
        ButtonCancel.setEnabled(true);
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
