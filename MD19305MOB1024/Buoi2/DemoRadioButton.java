/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MD19305MOB1024.Buoi2;

import javax.swing.JOptionPane;

/**
 *
 * @author syn
 */
public class DemoRadioButton extends javax.swing.JFrame {

    /**
     * Creates new form DemoRadioButton
     */
    public DemoRadioButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rdoTiktoker = new javax.swing.JRadioButton();
        rdoActor = new javax.swing.JRadioButton();
        rdoSinger = new javax.swing.JRadioButton();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Danh sach so thich");

        buttonGroup1.add(rdoTiktoker);
        rdoTiktoker.setFont(new java.awt.Font("Herculanum", 1, 18)); // NOI18N
        rdoTiktoker.setText("Dao Le Phuong Hoa");
        rdoTiktoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTiktokerActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoActor);
        rdoActor.setFont(new java.awt.Font("Herculanum", 1, 18)); // NOI18N
        rdoActor.setText("Ninh Duong Lan Ngoc");

        buttonGroup1.add(rdoSinger);
        rdoSinger.setFont(new java.awt.Font("Herculanum", 1, 18)); // NOI18N
        rdoSinger.setText("Le Quyen");

        btnResult.setText("Hien thi ket qua");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdoActor)
                            .addComponent(rdoTiktoker, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoSinger, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResult, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rdoTiktoker)
                .addGap(18, 18, 18)
                .addComponent(rdoActor)
                .addGap(18, 18, 18)
                .addComponent(rdoSinger)
                .addGap(18, 18, 18)
                .addComponent(btnResult)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoTiktokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTiktokerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoTiktokerActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        if(rdoTiktoker.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ban thich " + rdoTiktoker.getText());
        } else if(rdoActor.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ban thich " + rdoActor.getText());
        } else if(rdoSinger.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ban thich " + rdoSinger.getText());
        }
    }//GEN-LAST:event_btnResultActionPerformed

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
            java.util.logging.Logger.getLogger(DemoRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoRadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResult;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rdoActor;
    private javax.swing.JRadioButton rdoSinger;
    private javax.swing.JRadioButton rdoTiktoker;
    // End of variables declaration//GEN-END:variables
}
