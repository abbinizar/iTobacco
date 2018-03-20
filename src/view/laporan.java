/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbbiNizar
 */
public class laporan extends javax.swing.JFrame {

    /**
     * Creates new form laporan
     */
    public laporan() {
        initComponents();
    }

    public void klikKembali(ActionListener e) {
        btnKembali.addActionListener(e);
    }

    public void klikUpdate(ActionListener e) {
        btnUpdate.addActionListener(e);
    }

    public void klikDelete(ActionListener e) {
        btnDelete.addActionListener(e);
    }

    public void klikCreate(ActionListener e) {
        btnCreate.addActionListener(e);
    }

    public void setTableData(DefaultTableModel model) {
        laporanTable.setModel(model);
    }

    public String getData(int baris, int kolom) {
        return (String) this.laporanTable.getValueAt(baris, kolom);
//        return laporanTable.getValueAt(laporanTable.getSelectedRow(), 0).toString();
    }

    public String GetData() {
        return laporanTable.getValueAt(laporanTable.getSelectedRow(), 0).toString();
    }

    public JTable tabel() {
        return this.laporanTable;
    }

    public int getRow() {
        System.out.println(laporanTable.getSelectedRow());
        return this.laporanTable.getSelectedRow();
    }

    public int getColumn() {
        return this.laporanTable.getColumnCount();
    }

    public void mouseClickedModal(MouseListener e) {
        this.laporanTable.addMouseListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        laporanTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Kualitas", "Nama", "Jumlah", "Jenis", "Ukuran", "Kadar", "Aroma", "Warna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(laporanTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 220));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 110, -1));

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 100, -1));

        btnCreate.setText("Create");
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 100, -1));

        btnKembali.setBackground(new Color (0,0,0,0));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Undo_32px.png"))); // NOI18N
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 40, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Laporan Tembakau");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 672, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable laporanTable;
    // End of variables declaration//GEN-END:variables
}
