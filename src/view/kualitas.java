/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbbiNizar
 */
public class kualitas extends javax.swing.JFrame {

    /**
     * Creates new form kualitas
     */
    public kualitas() {
        initComponents();
    }

    public void klikKembali(ActionListener e) {
        btnKembali.addActionListener(e);
    }

    public void klikCancel(ActionListener e) {
        btnCancel.addActionListener(e);
    }

    public void klikSubmit(ActionListener e) {
        btnSubmit.addActionListener(e);
    }

    public String getID() {
        return txtID.getText();
    }

    public String getNama() {
        return txtNama.getText();
    }

    public String getJumlah() {
        return txtJumlah.getText();
    }

    public String getJenis() {
        return txtJenis.getText();
    }

    public String getUkuran() {
        return txtUkuran.getText();
    }

    public String getKadar() {
        return txtKadar.getText();
    }

    public String getAroma() {
        return txtAroma.getText();
    }

    public String getWarna() {
        return txtWarna.getText();
    }

    public String[] GetData() {
        String[] data = new String[3];
        data[1] = txtNama.getText();
        data[2] = txtJumlah.getText();
        data[3] = txtJenis.getText();
        data[4] = txtKadar.getText();
        data[5] = txtAroma.getText();
        data[2] = txtWarna.getText();
        return data;
    }

    public String getJudul() {
        return this.judul.getText();
    }

    public void setJudul(String isi) {
        this.judul.setText(isi);
    }

    public void setTxtAroma(String txtAroma) {
        this.txtAroma.setText(txtAroma);
    }

    public void setTxtJenis(String txtJenis) {
        this.txtJenis.setText(txtJenis);
    }

    public void setTxtJumlah(String txtJumlah) {
        this.txtJumlah.setText(txtJumlah);
    }

    public void setTxtKadar(String txtKadar) {
        this.txtKadar.setText(txtKadar);
    }

    public void setTxtNama(String txtNama) {
        this.txtNama.setText(txtNama);
    }

    public void setTxtUkuran(String txtUkuran) {
        this.txtUkuran.setText(txtUkuran);
    }

    public void setTxtWarna(String txtWarna) {
        this.txtWarna.setText(txtWarna);
    }

    public void setTxtID(String id) {
        this.txtID.setText(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        txtJenis = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtUkuran = new javax.swing.JTextField();
        txtAroma = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtWarna = new javax.swing.JTextField();
        txtKadar = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("Input Kualitas");
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 210, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Aroma");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Harga");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 200, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kadar air");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ukuran Tembakau");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jenis tembakau");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jumlah tembakau");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Petani");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));

        txtID.setText("1");
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        txtJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisActionPerformed(evt);
            }
        });
        getContentPane().add(txtJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 230, 30));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 230, 30));

        txtUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUkuranActionPerformed(evt);
            }
        });
        getContentPane().add(txtUkuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 230, 30));

        txtAroma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAromaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAroma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 230, 30));

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 230, 30));

        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });
        getContentPane().add(txtWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 230, 30));

        txtKadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKadarActionPerformed(evt);
            }
        });
        getContentPane().add(txtKadar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 230, 30));

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 370, 100, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 100, -1));

        btnKembali.setBackground(new Color (0,0,0,0));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Undo_32px.png"))); // NOI18N
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 673, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUkuranActionPerformed

    private void txtAromaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAromaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAromaActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void txtKadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKadarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKadarActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(kualitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kualitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kualitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kualitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kualitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel judul;
    private javax.swing.JTextField txtAroma;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKadar;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtUkuran;
    private javax.swing.JTextField txtWarna;
    // End of variables declaration//GEN-END:variables

}
