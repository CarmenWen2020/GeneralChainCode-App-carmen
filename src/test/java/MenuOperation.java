import java.awt.*;
import javax.swing.*;


/**
 *
 * @author carmenw
 */
public class MenuOperation{

    /**
     * Creates new form NewJPanel
     */
    public static void main(String[] args) {
        ResponseTable2 Tables = new ResponseTable2();
        Tables.setVisible(true);
        CreatedSeccuess mcs = new CreatedSeccuess();
        mcs.setVisible(true);
        UpdatedSeccuess mus = new UpdatedSeccuess();
        mus.setVisible(true);
        ResponseTable2 mrt = new ResponseTable2();
        mrt.setVisible(true);
    }


}
class ResponseTable2 extends JFrame {

    // Variables declaration - do not modify
    private javax.swing.JButton ButtonClose;
    public javax.swing.JTable CustomTable;
    //private javax.swing.JScrollBar ScrollBar;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel TextTitle;
    // End of variables declaration

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public ResponseTable2() {

        this.setSize(800, 500);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(200, 200);
        this.setTitle("Response Table");
        this.setVisible(false);

        TextTitle = new javax.swing.JLabel();
        ButtonClose = new javax.swing.JButton();
        CustomTable = new javax.swing.JTable();
        //ScrollBar = new javax.swing.JScrollBar();
        ScrollPane = new javax.swing.JScrollPane(CustomTable);
        CustomTable = new javax.swing.JTable();

        TextTitle.setText("--- Related Information for Users ---");
        Font f = new Font("Arial",Font.BOLD,16);
        TextTitle.setFont(f);

        ButtonClose.setText("Close");
        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        CustomTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Carmen Wen",  new Integer(1),  new Boolean(true), "none"}
                },
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


        //CustomTable.setPreferredScrollableViewportSize(new Dimension(500, 70));
        ScrollPane.setViewportView(CustomTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonClose)
                                .addGap(54, 54, 54))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(292, 292, 292)
                                                .addComponent(TextTitle)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(72, Short.MAX_VALUE)
                                .addComponent(TextTitle)
                                .addGap(18, 18, 18)
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ButtonClose)
                                .addGap(26, 26, 26))
        );
    }// </editor-fold>


    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }



}
class CreatedSeccuess extends javax.swing.JFrame {


    // Variables declaration - do not modify
    private javax.swing.JButton ButtonClose;
    private javax.swing.JLabel SuccesCreated;
    // End of variables declaration
    public CreatedSeccuess() {

        this.setSize(300, 150);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(400, 400);
        this.setVisible(false);

        ButtonClose = new javax.swing.JButton();
        SuccesCreated = new javax.swing.JLabel();

        ButtonClose.setText("Close");

        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        SuccesCreated.setText("Successful Created !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(90, Short.MAX_VALUE)
                                .addComponent(SuccesCreated)
                                .addGap(90, 90, 90))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(ButtonClose)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addComponent(SuccesCreated)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(ButtonClose)
                                .addGap(30, 30, 30))
        );
    }// </editor-fold>


    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author carmenw
 */

class UpdatedSeccuess extends javax.swing.JFrame {

    private javax.swing.JButton ButtonClose;
    private javax.swing.JLabel SuccesUpdated;

    public UpdatedSeccuess() {

        this.setSize(300, 150);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(400, 400);
        this.setVisible(false);

        ButtonClose = new javax.swing.JButton();
        SuccesUpdated = new javax.swing.JLabel();

        ButtonClose.setText("Close");

        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        SuccesUpdated.setText("successful Update !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(91, Short.MAX_VALUE)
                                .addComponent(SuccesUpdated)
                                .addGap(92, 92, 92))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(ButtonClose)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addComponent(SuccesUpdated)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(ButtonClose)
                                .addGap(30, 30, 30))
        );
    }// </editor-fold>


    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author carmenw
 */
class UserExist extends javax.swing.JFrame {


    // Variables declaration - do not modify
    private javax.swing.JButton ButtonClose;
    private javax.swing.JLabel SuccesUpdated;
    // End of variables declaration

    public UserExist() {

        this.setSize(300, 150);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(400, 400);
        this.setVisible(false);

        ButtonClose = new javax.swing.JButton();
        SuccesUpdated = new javax.swing.JLabel();

        ButtonClose.setText("Close");

        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        SuccesUpdated.setText("User Already Exist !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(93, Short.MAX_VALUE)
                                .addComponent(SuccesUpdated)
                                .addGap(92, 92, 92))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(ButtonClose)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addComponent(SuccesUpdated)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(ButtonClose)
                                .addGap(30, 30, 30))
        );
    }// </editor-fold>


    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ButtonCloseMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }

}




