
import Koneksi.Koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fauzan
 */
public class AplikasiDosen extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiDosen
     */
    public AplikasiDosen() {
        initComponents();
        TampilData();
    }
    
    
    void Hapus() {
        tfNim.setText("");
        tfNama.setText("");
        tfMatkul.setText("");
    }
    private void Bersih() {
        tfNim.setText("");
        tfNama.setText("");
        tfMatkul.setText("");
    }
    
    void Cari (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nim");
        tbl.addColumn("Nama");
        tbl.addColumn("Mata_Kuliah");
        
        try {
            String sql = "SELECT * FROM dosen WHERE Nim like '%" + tfCari.getText() + "%'";
            Connection conn = (Connection) Koneksi.databaseDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("Nim"),
                    rs.getString("Nama"),
                    rs.getString("Mata_Kuliah"),
                });
                tbApkDosen.setModel(tbl);
            }
            
        } catch (Exception e) {
        }
    }
    
    private void TampilData() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nim");
        tbl.addColumn("Nama");
        tbl.addColumn("Mata_Kuliah");

        try {
            Statement st = (Statement) Koneksi.databaseDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM dosen");

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("Nim"),
                    rs.getString("Nama"),
                    rs.getString("Mata_Kuliah"),});
                tbApkDosen.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNim = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfMatkul = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbApkDosen = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(523, 555));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 86, 50, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MATA KULIAH");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 110, 17);
        getContentPane().add(tfNim);
        tfNim.setBounds(30, 110, 120, 22);
        getContentPane().add(tfNama);
        tfNama.setBounds(30, 160, 120, 22);
        getContentPane().add(tfMatkul);
        tfMatkul.setBounds(30, 210, 120, 30);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan);
        btnSimpan.setBounds(290, 170, 80, 25);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(380, 210, 80, 25);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(160, 260, 55, 25);

        tbApkDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbApkDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbApkDosenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbApkDosen);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 452, 170);

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(389, 470, 90, 25);
        getContentPane().add(tfCari);
        tfCari.setBounds(30, 260, 120, 22);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Tambah Data Dosen");
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 10, 260, 40);

        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });
        getContentPane().add(btnTampil);
        btnTampil.setBounds(290, 210, 80, 25);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(380, 170, 80, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg Pbo.jpg"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(523, 593));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new Menu().show();
            this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO dosen VALUES ('" + tfNim.getText() 
                    + "','" + tfNama.getText()
                    + "','" + tfMatkul.getText()  + "')";
            java.sql.Connection conn = (Connection) Koneksi.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Tambah Data Dosen Berhasil!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM dosen WHERE Nim = '" + tfNim.getText() + "'";
            Connection con = (Connection) Koneksi.databaseDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        TampilData();
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        Cari();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM dosen WHERE Nim = '" + tfNim.getText() + "' ";
            Connection con = (Connection) Koneksi.databaseDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Proses HAPUS Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        TampilData();
        Bersih();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tbApkDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbApkDosenMouseClicked
        // TODO add your handling code here:
        int baris = tbApkDosen.rowAtPoint(evt.getPoint());
        String nim = tbApkDosen.getValueAt(baris, 0).toString();
        tfNim.setText(nim);
        String nama = tbApkDosen.getValueAt(baris, 1).toString();
        tfNama.setText(nama);
        String Mata_Kuliah = tbApkDosen.getValueAt(baris, 2).toString();
        tfMatkul.setText(Mata_Kuliah);
    }//GEN-LAST:event_tbApkDosenMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE dosen SET Nim='" + tfNim.getText()
                    + "', Nama ='" + tfNama.getText()
                    + "', Jurusan ='" + tfMatkul.getText()
                    + "'WHERE Nim='" + tfNim.getText()+ "'";
            java.sql.Connection conn = (Connection) Koneksi.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil DI edit");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampil;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbApkDosen;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfMatkul;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNim;
    // End of variables declaration//GEN-END:variables
}
