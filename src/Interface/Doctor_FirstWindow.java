/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import pojosKidney.Patient;

/**
 *
 * @author carmen
 */
public class Doctor_FirstWindow extends javax.swing.JFrame {

    public static Patient patient;
    /**
     * Creates new form FirstWindow
     */
    public Doctor_FirstWindow() {
        initComponents();
        patient = new Patient();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        for (int i = 0; i < 10; i++) { //size de la lista
            model.addElement(" ");
        }
        this.ListPatient.setModel(model);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panelP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        back_but = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListPatient = new javax.swing.JList<>();
        search_but = new javax.swing.JButton();
        go_but = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 102, 0));

        panelP.setBackground(new java.awt.Color(208, 226, 217));

        jLabel1.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        jLabel1.setText("Patient Name:");

        inputName.setBackground(new java.awt.Color(208, 226, 217));
        inputName.setFont(new java.awt.Font("STKaiti", 0, 13)); // NOI18N
        inputName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        back_but.setBackground(new java.awt.Color(0, 102, 0));
        back_but.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        back_but.setText("<-");
        back_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 102, 255), null, null));
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        ListPatient.setFont(new java.awt.Font("STKaiti", 0, 12)); // NOI18N
        ListPatient.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListPatient);

        search_but.setBackground(new java.awt.Color(0, 102, 0));
        search_but.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        search_but.setText("Search");
        search_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 102, 255), null, null));
        search_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_butActionPerformed(evt);
            }
        });

        go_but.setBackground(new java.awt.Color(0, 102, 0));
        go_but.setFont(new java.awt.Font("STKaiti", 1, 14)); // NOI18N
        go_but.setText("GO!");
        go_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 102, 255), null, null));
        go_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(search_but)
                        .addGap(18, 18, 18))))
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(go_but, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_but, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_but, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(17, 17, 17))
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

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
       FirstWindow rd = new FirstWindow();
        this.setVisible(false);
        rd.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_back_butActionPerformed

    private void search_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_butActionPerformed
          DefaultListModel<String> model2 = new DefaultListModel<>();
        JList<String> list = new JList<>(model2);
        String busqueda = this.inputName.getText();
       
//coger los nombres de la base de datos 
     String ListNames = "";
//ConnectionWithServer.receiveSomething(FirstWindow.socket, FirstWindow.bufferedReader);
        String[] Names = new String[100];
        int position = 0;
        String nameTaken = "";
        //sacamos los nombres de un array de todo jsutos // si los podemos coger con un array genial proque esto nos lo quitamos
        for (int i = 0; i < ListNames.length(); i++) {
            char a = ListNames.charAt(i);
            while (a != ';') {
                nameTaken = nameTaken + a;
                i++;
                a = ListNames.charAt(i);
            }
            Names[position] = nameTaken;
            nameTaken = "";
            position++;
        }
        for (int i = 0; i < Names.length; i++) {
            if (!Names[i].equals("null")) {
                System.out.println("El nombes es: " + Names[i]);
                model2.addElement(Names[i]);
            }
        }
        this.ListPatient.setModel(model2);   // TODO add your handling code here:
    }//GEN-LAST:event_search_butActionPerformed

    private void go_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_butActionPerformed
        String busqueda = this.ListPatient.getSelectedValue();
        // coger paciente por nombre o por id a lo mejor si lo enseñamos 
        
        //si cogido--> pasamos a un menu para ver que quiere hacer
        
      /*  if (received) {
            PatientInformation rd = new PatientInformation();
            this.setVisible(false);
            rd.setVisible(true);
        } // TODO add your handling code here:*/
    }//GEN-LAST:event_go_butActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_FirstWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListPatient;
    private javax.swing.JButton back_but;
    private javax.swing.JButton go_but;
    private javax.swing.JTextField inputName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelP;
    private javax.swing.JButton search_but;
    // End of variables declaration//GEN-END:variables
}