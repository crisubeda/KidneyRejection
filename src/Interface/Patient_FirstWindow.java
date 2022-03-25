/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import static Interface.Doctor_FirstWindow.patient;
import Utilities.Utilities;
import db.interfaces.DBManager;
import db.interfaces.PatientManager;
import db.sql.SQLManager;
import db.sql.SQLPatientManager;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import pojosKidney.Patient;
import pojosKidney.PatientSimple;

/**
 *
 * @author carmen
 */
public class Patient_FirstWindow extends javax.swing.JFrame {

    public static PatientSimple p;
    public static Patient p2;
    public static PatientManager patientManager;
    public static DBManager dbManager;

    /**
     * Creates new form FirstWindow
     */
    public Patient_FirstWindow() {
        initComponents();
        p = new PatientSimple();
        this.errorText.setVisible(false);
        this.errorText1.setVisible(false);
        //dbManager = new SQLManager();
        //dbManager.connect();

        //patientManager = dbManager.getPatientManager();
        // patientManager.sendParameters();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputText = new javax.swing.JTextField();
        panel1 = new javax.swing.JPanel();
        panelP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        reg_but = new javax.swing.JButton();
        go_but = new javax.swing.JButton();
        back_but = new javax.swing.JButton();
        errorText = new javax.swing.JLabel();
        errorText1 = new javax.swing.JLabel();
        intputPa = new javax.swing.JPasswordField();

        inputText.setBackground(new java.awt.Color(208, 226, 217));
        inputText.setFont(new java.awt.Font("STKaiti", 0, 13)); // NOI18N
        inputText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));
        inputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 0, 102));

        panelP.setBackground(new java.awt.Color(252, 238, 238));

        jLabel1.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        jLabel1.setText("Password:");

        jLabel2.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel2.setText("Sign in:");

        inputName.setBackground(new java.awt.Color(252, 238, 238));
        inputName.setFont(new java.awt.Font("STKaiti", 0, 13)); // NOI18N
        inputName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 5));
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        jLabel3.setText("Patient Name:");

        reg_but.setBackground(new java.awt.Color(102, 0, 102));
        reg_but.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        reg_but.setText("REGISTER");
        reg_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), null, null));
        reg_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_butActionPerformed(evt);
            }
        });

        go_but.setBackground(new java.awt.Color(102, 0, 102));
        go_but.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        go_but.setText("GO!");
        go_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), null, null));
        go_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_butActionPerformed(evt);
            }
        });

        back_but.setBackground(new java.awt.Color(102, 0, 102));
        back_but.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        back_but.setText("<-");
        back_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), null, null));
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        errorText.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        errorText.setForeground(new java.awt.Color(102, 0, 102));
        errorText.setText("Incorrect email/password!!");

        errorText1.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        errorText1.setForeground(new java.awt.Color(102, 0, 102));
        errorText1.setText("Incorrect email/password!!");

        intputPa.setBackground(new java.awt.Color(252, 238, 238));
        intputPa.setFont(new java.awt.Font("STKaiti", 0, 13)); // NOI18N
        intputPa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 5));

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intputPa)
                        .addGap(25, 25, 25))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(reg_but, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(go_but, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addComponent(errorText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addComponent(errorText1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorText1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intputPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorText, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_but, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_but, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void reg_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_butActionPerformed
        Patient_Register rd = new Patient_Register();
        this.setVisible(false);
        rd.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_reg_butActionPerformed

    private void go_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_butActionPerformed

        int id = 0;
        boolean isEmail = Utilities.checkEmail(this.inputName.getText());
        if (!isEmail) {
            this.errorText1.setVisible(true);
        } else {
            this.errorText1.setVisible(false);
            MessageDigest md;
            try {
                md = MessageDigest.getInstance("MD5");
                byte[] by = new byte[this.intputPa.getPassword().length];
                for (int i = 0; i < this.intputPa.getPassword().length; i++) {
                    by[i] = (byte) this.intputPa.getPassword()[i];
                }
                md.update(by);
                byte[] hash = md.digest();

                /*Patient_FirstWindow.p = new PatientSimple();
                Patient_FirstWindow.p.setEmail(this.inputName.getText());
                Patient_FirstWindow.p.setPas(hash);*/
                id = Patient_FirstWindow.patientManager.checkPassword(this.inputName.getText(), hash);
                if(id==0){
                    this.errorText.setVisible(true);
                }else{
                    this.errorText.setVisible(false);
                    Menu rd = new Menu();
                    rd.setID(id);
                    this.setVisible(false);
                    rd.setVisible(true);
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Patient_FirstWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_go_butActionPerformed

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        FirstWindow rd = new FirstWindow();
        this.setVisible(false);
        rd.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_back_butActionPerformed

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
            java.util.logging.Logger.getLogger(Patient_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_FirstWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_but;
    private javax.swing.JLabel errorText;
    private javax.swing.JLabel errorText1;
    private javax.swing.JButton go_but;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputText;
    private javax.swing.JPasswordField intputPa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelP;
    private javax.swing.JButton reg_but;
    // End of variables declaration//GEN-END:variables
}
