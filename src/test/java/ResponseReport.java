import javax.swing.*;
import java.awt.*;

/**
 *
 * @author carmenw
 */
public class ResponseReport extends javax.swing.JFrame {

    public static void main(String[] args) {
        ResponseReport f = new ResponseReport();
        System.out.println("exit");
    }

    private JButton ButtonClose;
    public JTextArea ReportField;
    public JLabel TextMarkby;
    public JLabel TextPaperID;
    private JLabel TextTitle;
    private JScrollPane jScrollPane1;

    /**
     * Creates new form ResponseReport
     */
    public ResponseReport() {

        this.setSize(800, 450);
        this.setResizable(false);
        //this.setMinimumSize(new Dimension(800, 500));
        this.setLocation(700, 200);
        this.setTitle("Response Report");
        this.setVisible(false);

        TextTitle = new JLabel();
        TextPaperID = new JLabel();
        TextMarkby = new JLabel();
        jScrollPane1 = new JScrollPane();
        ReportField = new JTextArea();
        ButtonClose = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Font f = new Font("Arial",Font.BOLD,16);
        TextTitle.setText("--- Paper Report ---");
        TextTitle.setFont(f);


        TextPaperID.setText("Paper ID:");

        TextMarkby.setText("Marked By:");

        ReportField.setColumns(20);
        ReportField.setRows(5);
        ReportField.setLineWrap(true);        //激活自动换行功能
        ReportField.setWrapStyleWord(true);
        ReportField.setEditable(false);

        jScrollPane1.setViewportView(ReportField);

        ButtonClose.setText("Close");
        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TextMarkby, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextPaperID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonClose))
                                .addContainerGap(66, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(326, 326, 326))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(TextTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextPaperID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextMarkby)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonClose)
                                .addGap(20, 20, 20))
        );
        pack();
    }
    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
}
