/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvssombis;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrian
 */
public class fPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form fPrincipal
     */
    public fPrincipal() {
        initComponents();
        //setLocationRelativeTo(null);
        bPlantas.setOpaque(false);
        bPlantas.setContentAreaFilled(false);
        bZombies.setOpaque(false);
        bZombies.setContentAreaFilled(false);
        //bZombies.setBorderPainted(false);
        URL url = getClass().getResource("/Imagenes/icon.png");
        ImageIcon icono = new ImageIcon(url);
        setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bZombies = new javax.swing.JButton();
        bPlantas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        bZombies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zombie2.png"))); // NOI18N
        bZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZombiesActionPerformed(evt);
            }
        });
        getContentPane().add(bZombies);
        bZombies.setBounds(280, 250, 52, 89);

        bPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planta1.png"))); // NOI18N
        bPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlantasActionPerformed(evt);
            }
        });
        getContentPane().add(bPlantas);
        bPlantas.setBounds(50, 250, 52, 89);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlantasActionPerformed
        fCatalogo catalogo = new fCatalogo("plantas");
        catalogo.setVisible(true);
        
    }//GEN-LAST:event_bPlantasActionPerformed

    private void bZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZombiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bZombiesActionPerformed

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
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPlantas;
    private javax.swing.JButton bZombies;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
