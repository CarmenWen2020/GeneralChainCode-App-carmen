import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
//import java.util.ResourceBundle;

import java.awt.*;
import java.util.*;


/**
 * @author carmen wen
 */

public class InitialData  extends JFrame{
    private JPanel dialogPane;
    private JPanel buttonBar;
    private JLabel label1;
    private JTextField textField2;
    private JButton okButton2;
    private JLabel label2;
    private JCheckBox checkBoxAI;
    private JCheckBox checkBoxArch;
    private JCheckBox checkBoxDM;
    private JCheckBox checkBoxEdu;
    private JCheckBox checkBoxInter;
    private JCheckBox checkBoxNet;
    private JCheckBox checkBoxPar;
    private JCheckBox checkBoxVR;
    private JCheckBox checkBoxSsy;
    private JCheckBox checkBoxSecu;
    private JCheckBox checkBox11;
    private JLabel label3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel Title;

    public InitialData() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - carmen wen
        //ResourceBundle bundle = ResourceBundle.getBundle("com.CarmenWen.form");
        dialogPane = new JPanel();
        buttonBar = new JPanel();
        label1 = new JLabel();
        textField2 = new JTextField();
        okButton2 = new JButton();
        label2 = new JLabel();
        checkBoxAI = new JCheckBox();
        checkBoxArch = new JCheckBox();
        checkBoxDM = new JCheckBox();
        checkBoxEdu = new JCheckBox();
        checkBoxInter = new JCheckBox();
        checkBoxNet = new JCheckBox();
        checkBoxPar = new JCheckBox();
        checkBoxVR = new JCheckBox();
        checkBoxSsy = new JCheckBox();
        checkBoxSecu = new JCheckBox();
        checkBox11 = new JCheckBox();
        label3 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        okButton = new JButton();
        cancelButton = new JButton();
        Title = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
                    swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border
                    . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog"
                    , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder
                    () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
                                                                                                                                                              . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException
                ( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 0};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

                //---- label1 ----
                //label1.setText(bundle.getString("Create2.label1.text"));
                buttonBar.add(label1, new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                buttonBar.add(textField2, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- okButton2 ----
                //okButton2.setText(bundle.getString("Create2.okButton2.text"));
                buttonBar.add(okButton2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- label2 ----
                //label2.setText(bundle.getString("Create2.label2.text"));
                buttonBar.add(label2, new GridBagConstraints(0, 4, 3, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxAI ----
                //checkBoxAI.setText(bundle.getString("Create2.checkBoxAI.text"));
                checkBoxAI.setHorizontalAlignment(SwingConstants.LEFT);
                buttonBar.add(checkBoxAI, new GridBagConstraints(0, 5, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxArch ----
                //checkBoxArch.setText(bundle.getString("Create2.checkBoxArch.text"));
                buttonBar.add(checkBoxArch, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxDM ----
                //checkBoxDM.setText(bundle.getString("Create2.checkBoxDM.text"));
                buttonBar.add(checkBoxDM, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxEdu ----
                //checkBoxEdu.setText(bundle.getString("Create2.checkBoxEdu.text"));
                buttonBar.add(checkBoxEdu, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxInter ----
                //checkBoxInter.setText(bundle.getString("Create2.checkBoxInter.text"));
                buttonBar.add(checkBoxInter, new GridBagConstraints(0, 7, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxNet ----
                //checkBoxNet.setText(bundle.getString("Create2.checkBoxNet.text"));
                buttonBar.add(checkBoxNet, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxPar ----
                //checkBoxPar.setText(bundle.getString("Create2.checkBoxPar.text"));
                buttonBar.add(checkBoxPar, new GridBagConstraints(0, 8, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxVR ----
                //checkBoxVR.setText(bundle.getString("Create2.checkBoxVR.text"));
                buttonBar.add(checkBoxVR, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxSsy ----
                //checkBoxSsy.setText(bundle.getString("Create2.checkBoxSsy.text"));
                buttonBar.add(checkBoxSsy, new GridBagConstraints(0, 9, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBoxSecu ----
                //checkBoxSecu.setText(bundle.getString("Create2.checkBoxSecu.text"));
                buttonBar.add(checkBoxSecu, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- checkBox11 ----
                //checkBox11.setText(bundle.getString("Create2.checkBox11.text"));
                buttonBar.add(checkBox11, new GridBagConstraints(0, 10, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- label3 ----
                //label3.setText(bundle.getString("Create2.label3.text"));
                buttonBar.add(label3, new GridBagConstraints(0, 13, 3, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton1 ----
                //radioButton1.setText(bundle.getString("Create2.radioButton1.text"));
                buttonBar.add(radioButton1, new GridBagConstraints(0, 14, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton2 ----
                //radioButton2.setText(bundle.getString("Create2.radioButton2.text"));
                buttonBar.add(radioButton2, new GridBagConstraints(1, 14, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- okButton ----
                //okButton.setText(bundle.getString("Create2.okButton.text"));
                buttonBar.add(okButton, new GridBagConstraints(2, 16, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- cancelButton ----
                //cancelButton.setText(bundle.getString("Create2.cancelButton.text"));
                buttonBar.add(cancelButton, new GridBagConstraints(3, 16, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 5, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //---- Title ----
            //Title.setText(bundle.getString("Create2.Title.text"));
            dialogPane.add(Title, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public static void main(String[] args){
        new InitialData().setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - carmen wen

    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
