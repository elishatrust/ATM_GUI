/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_gui;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Component;
import java.awt.print.PrinterException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class JWithdraw extends javax.swing.JFrame {

    /**
     * Creates new form JWithdraw
     */
    public JWithdraw() {
        initComponents();
    }

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar cal = Calendar.getInstance();
            
    private double balance = 100000.0;
    private double amount = 0;


	public double getBalance()
	{
		return balance;
	}

	public double calcWithdraw(double amount) 
	{
		balance = (balance - amount);
		return balance;
	}

        public void getWithdrawal(){
            int choice = Integer.parseInt(jTextField1.getText());
        
            if(balance>=10000.0)
            {    
                switch(choice){
                    case 1:
                        amount = 5000;
                        balance = balance - amount;
                        int a = JOptionPane.showConfirmDialog(null,"\nTsh "+amount+" withdrawn now!\n\n",
                           "Message",JOptionPane.YES_NO_OPTION);
                        if(a==JOptionPane.YES_OPTION)
                        {
                            jTextArea1.setText("--------------------------------------------------\n"
                                    + "             BANK STATEMENT\n"
                                    + "--------------------------------------------------\n\n"
                                    + "Withdrawn process successfully\n\n"
                                    + "Withdrawn balance: Tsh "+Double.toString(amount)+"\n"
                                    + "Available balance: Tsh "+Double.toString(balance)+"\n"
                                    + "Total balance: Tsh "+Double.toString(getBalance())+"\n\n"
                                    + "Please collect your cash now\n"
                                    + "--------------------------------------------------\n"
                                    + dateFormat.format(cal.getTime())+"\n");
                            jTextField1.setText("");
                        }else if(a==JOptionPane.NO_OPTION)
                        {
                            jTextField1.setText("");
                            setVisible(true);
                        }
                        break;

                    case 2:
                        amount = 10000;
                        balance = balance - amount;
                        int b = JOptionPane.showConfirmDialog(null,"\nTsh "+amount+" withdrawn now!\n\n",
                           "Message",JOptionPane.YES_NO_OPTION);
                        if(b==JOptionPane.YES_OPTION)
                        {
                            jTextArea1.setText("--------------------------------------------------\n"
                                    + "             BANK STATEMENT\n"
                                    + "--------------------------------------------------\n\n"
                                    + "Withdrawn process successfully\n\n"
                                    + "Withdrawn balance: Tsh "+Double.toString(amount)+"\n"
                                    + "Available balance: Tsh "+Double.toString(balance)+"\n"
                                    + "Total balance: Tsh "+Double.toString(getBalance())+"\n\n"
                                    + "Please collect your cash now\n"
                                    + "--------------------------------------------------\n"
                                    + dateFormat.format(cal.getTime())+"\n");
                            jTextField1.setText("");
                        }else if(b==JOptionPane.NO_OPTION)
                        {
                            jTextField1.setText("");
                            setVisible(true);
                        }
                        break;

                    case 3:
                        amount = 30000;
                        balance = balance - amount;
                        int c = JOptionPane.showConfirmDialog(null,"\nTsh "+amount+" withdrawn now!\n\n",
                           "Message",JOptionPane.YES_NO_OPTION);
                        if(c==JOptionPane.YES_OPTION)
                        {
                            jTextArea1.setText("--------------------------------------------------\n"
                                    + "             BANK STATEMENT\n"
                                    + "--------------------------------------------------\n\n"
                                    + "Withdrawn process successfully\n\n"
                                    + "Withdrawn balance: Tsh "+Double.toString(amount)+"\n"
                                    + "Available balance: Tsh "+Double.toString(balance)+"\n"
                                    + "Total balance: Tsh "+Double.toString(getBalance())+"\n\n"
                                    + "Please collect your cash now\n"
                                    + "--------------------------------------------------\n"
                                    + dateFormat.format(cal.getTime())+"\n");
                            jTextField1.setText("");
                        }else if(c==JOptionPane.NO_OPTION)
                        {
                            jTextField1.setText("");
                            setVisible(true);
                        }
                        break;

                    case 4:
                        amount = 50000;
                        balance = balance - amount;
                        int d = JOptionPane.showConfirmDialog(null,"\nTsh "+amount+" withdrawn now!\n\n",
                           "Message",JOptionPane.YES_NO_OPTION);
                        if(d==JOptionPane.YES_OPTION)
                        {
                            jTextArea1.setText("--------------------------------------------------\n"
                                    + "             BANK STATEMENT\n"
                                    + "--------------------------------------------------\n\n"
                                    + "Withdrawn process successfully\n\n"
                                    + "Withdrawn balance: Tsh "+Double.toString(amount)+"\n"
                                    + "Available balance: Tsh "+Double.toString(balance)+"\n"
                                    + "Total balance: Tsh "+Double.toString(getBalance())+"\n\n"
                                    + "Please collect your cash now\n"
                                    + "--------------------------------------------------\n"
                                    + dateFormat.format(cal.getTime())+"\n");
                            jTextField1.setText("");
                        }else if(d==JOptionPane.NO_OPTION)
                        {
                            jTextField1.setText("");
                            setVisible(true);
                        }
                        break;

                    case 5:
                        amount = 50000;
                        balance = balance - amount;
                        int e = JOptionPane.showConfirmDialog(null,"\nTsh "+amount+" withdrawn now!\n\n",
                           "Message",JOptionPane.YES_NO_OPTION);
                        if(e==JOptionPane.YES_OPTION)
                        {
                            jTextArea1.setText("--------------------------------------------------\n"
                                    + "             BANK STATEMENT\n"
                                    + "--------------------------------------------------\n\n"
                                    + "Withdrawn process successfully\n\n"
                                    + "Withdrawn balance: Tsh "+Double.toString(amount)+"\n"
                                    + "Available balance: Tsh "+Double.toString(balance)+"\n"
                                    + "Total balance: Tsh "+Double.toString(getBalance())+"\n\n"
                                    + "Please collect your cash now\n"
                                    + "--------------------------------------------------\n"
                                    + dateFormat.format(cal.getTime())+"\n");
                            jTextField1.setText("");
                        }else if(e==JOptionPane.NO_OPTION)
                        {
                            jTextField1.setText("");
                            setVisible(true);
                        }
                        break; 

                    default:
                        JOptionPane.showMessageDialog(null,"\nPlease enter a correct choice\n\n",
                           "Message",JOptionPane.INFORMATION_MESSAGE);
                        jTextField1.setText("");
                        jTextArea1.setText("");
                        setVisible(true);

                }

            }else{
                JOptionPane.showMessageDialog(null,"\nInsuffiency balance, transaction fail\n\n",
                    "Message",JOptionPane.INFORMATION_MESSAGE);
                jTextField1.setText("");
                jTextArea1.setText("");
                setVisible(true);

         }    
            
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonPrint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automatic Teller Machine");
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WITHDRAWAL CASH");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("5.  100,000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("4.  50,000");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("3.  30,000");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("2.  10,000");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("1.  5,000");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Enter a choice");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEnter.setText("Enter");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEnter, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrint.setText("Print Slipt");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ATM  SYSTEM");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        
        Component frame = null;
        
        int a = JOptionPane.showConfirmDialog(frame,"Do you want to EXIT?",
                "Message",JOptionPane.YES_NO_OPTION);
        JMenu jmenu = new JMenu();
                
        if(a==JOptionPane.YES_OPTION)
        {
            jmenu.setVisible(true);
            setVisible(false);
        }
        else if(a==JOptionPane.NO_OPTION)
        {
            setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        // TODO add your handling code here:
        getWithdrawal();
               
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.requestFocus(true);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        // TODO add your handling code here:
        try {
            boolean print = jTextArea1.print();
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!..");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JWithdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
