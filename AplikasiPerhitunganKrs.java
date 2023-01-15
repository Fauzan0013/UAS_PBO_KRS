
import Koneksi.Koneksi;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fauzan
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;
import java.io.File;
import java.util.Optional;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class AplikasiPerhitunganKrs extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPerhitunganKrs
     */
    public Statement st;
    public ResultSet rs;
//    Connection cn = Koneksi.Koneksi.databaseDB();

    public AplikasiPerhitunganKrs() {
        initComponents();
        TampilData();
        //KoneksiDatabase();
    }
    
    void Cari (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nim");
        tbl.addColumn("Nama");
        tbl.addColumn("Jurusan");
        tbl.addColumn("Ipk");
        tbl.addColumn("Total Sks");
        tbl.addColumn("Praktikum");
        tbl.addColumn("Teori");
        tbl.addColumn("Total Bayar");
        tbl.addColumn("Bayar");
        tbl.addColumn("Kembali");
        
        try {
            String sql = "SELECT * FROM perhitungankrs WHERE Nim like '%" + tfCari.getText() + "%'";
            Connection conn = (Connection) Koneksi.databaseDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("Nim"),
                    rs.getString("Nama"),
                    rs.getString("Jurusan"),
                    rs.getString("Ipk"),
                    rs.getString("Total_Sks"),
                    rs.getString("Praktikum"),
                    rs.getString("Teori"),
                    rs.getString("Total_Bayar"),
                    rs.getString("Bayar"),
                    rs.getString("Kembali"),
                });
                TabelHasil.setModel(tbl);
            }
            
        } catch (Exception e) {
        }
    }
    
    
    
    void Hapus() {
        tfNim.setText("");
        tfNama.setText("");
        tfIpk.setText("");
        tfSks.setText("");
        tfSksPraktikum.setText("");
        tfSksTeori.setText("");
        tfTotal.setText("");
        tfBayar.setText("");
        tfKembali.setText("");
    }

    private void Bersih() {
        tfNim.setText("");
        tfNama.setText("");
        tfIpk.setText("");
        tfSks.setText("");
        tfSksPraktikum.setText("");
        tfSksTeori.setText("");
        tfTotal.setText("");
        tfBayar.setText("");
        tfKembali.setText("");
    }

    private void TampilData() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nim");
        tbl.addColumn("Nama");
        tbl.addColumn("Jurusan");
        tbl.addColumn("Ipk");
        tbl.addColumn("Total Sks");
        tbl.addColumn("Praktikum");
        tbl.addColumn("Teori");
        tbl.addColumn("Total Bayar");
        tbl.addColumn("Bayar");
        tbl.addColumn("Kembali");

        try {
            Statement st = (Statement) Koneksi.databaseDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM perhitungankrs");

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("Nim"),
                    rs.getString("Nama"),
                    rs.getString("Jurusan"),
                    rs.getString("Ipk"),
                    rs.getString("Total_Sks"),
                    rs.getString("Praktikum"),
                    rs.getString("Teori"),
                    rs.getString("Total_Bayar"),
                    rs.getString("Bayar"),
                    rs.getString("Kembali"),});
                TabelHasil.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNim = new javax.swing.JTextField();
        cbbJurusan = new javax.swing.JComboBox<>();
        tfIpk = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfSks = new javax.swing.JTextField();
        tfSksTeori = new javax.swing.JTextField();
        tfSksPraktikum = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        tfBayar = new javax.swing.JTextField();
        tfKembali = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelHasil = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        tfCari = new javax.swing.JTextField();
        btnTampil = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(7046, 4001));
        setMinimumSize(new java.awt.Dimension(930, 733));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IPK");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 260, 30, 17);

        tfNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNimActionPerformed(evt);
            }
        });
        getContentPane().add(tfNim);
        tfNim.setBounds(20, 130, 190, 22);

        cbbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Prodi--", "S1 Informatika", "S1 Management", "S1 Akuntansi" }));
        cbbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbJurusanActionPerformed(evt);
            }
        });
        getContentPane().add(cbbJurusan);
        cbbJurusan.setBounds(20, 230, 190, 22);

        tfIpk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIpkActionPerformed(evt);
            }
        });
        getContentPane().add(tfIpk);
        tfIpk.setBounds(20, 280, 50, 22);
        getContentPane().add(tfNama);
        tfNama.setBounds(20, 180, 190, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total SKS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 310, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Praktikum");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 360, 70, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teori");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 410, 50, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Bayar");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 110, 100, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bayar");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 160, 80, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kembali");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 210, 80, 17);

        tfSks.setEditable(false);
        tfSks.setEnabled(false);
        tfSks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSksActionPerformed(evt);
            }
        });
        getContentPane().add(tfSks);
        tfSks.setBounds(20, 330, 50, 22);

        tfSksTeori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSksTeoriActionPerformed(evt);
            }
        });
        getContentPane().add(tfSksTeori);
        tfSksTeori.setBounds(20, 430, 50, 22);

        tfSksPraktikum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSksPraktikumActionPerformed(evt);
            }
        });
        getContentPane().add(tfSksPraktikum);
        tfSksPraktikum.setBounds(20, 380, 50, 22);

        tfTotal.setEditable(false);
        tfTotal.setEnabled(false);
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });
        getContentPane().add(tfTotal);
        tfTotal.setBounds(260, 130, 270, 22);

        tfBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBayarActionPerformed(evt);
            }
        });
        getContentPane().add(tfBayar);
        tfBayar.setBounds(260, 180, 270, 22);

        tfKembali.setEditable(false);
        tfKembali.setEnabled(false);
        tfKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(tfKembali);
        tfKembali.setBounds(260, 230, 270, 22);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Prodi S1\nS1 Informatika 180/sks \nS1 Management  185/sks\nS1 Akuntansi   190/sks");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 130, 320, 124);

        btnSimpan.setBackground(new java.awt.Color(153, 153, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan);
        btnSimpan.setBounds(260, 270, 75, 26);

        btnEdit.setBackground(new java.awt.Color(153, 153, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(360, 270, 71, 25);

        btnHapus.setBackground(new java.awt.Color(153, 153, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(360, 320, 71, 25);

        jButton1.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jButton1.setText("PERHITUNGAN KRS");
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 20, 380, 50);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TabelHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nim", "Nama", "Jurusan", "Ipk", "Total Sks", "Praktikum", "Teori", "Total Bayar", "Bayar", "Kembali"
            }
        ));
        TabelHasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelHasilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelHasil);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 482, 890, 197);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cari Data");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 430, 90, 17);
        getContentPane().add(tfCari);
        tfCari.setBounds(130, 450, 128, 30);

        btnTampil.setBackground(new java.awt.Color(153, 153, 255));
        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });
        getContentPane().add(btnTampil);
        btnTampil.setBounds(260, 320, 75, 25);

        btnCetak.setBackground(new java.awt.Color(153, 153, 255));
        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        getContentPane().add(btnCetak);
        btnCetak.setBounds(450, 270, 80, 25);

        btnCari.setBackground(new java.awt.Color(255, 51, 51));
        btnCari.setText("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(270, 450, 60, 30);

        btnKembali.setBackground(new java.awt.Color(153, 153, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(790, 435, 100, 30);

        btnClear1.setBackground(new java.awt.Color(153, 153, 255));
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear1);
        btnClear1.setBounds(450, 320, 80, 25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(450, 30, 450, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg Pbo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int sks;
    String Temp;
    double ipk;
    private void tfIpkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIpkActionPerformed
        // TODO add your handling code here:
        ipk = Double.parseDouble(tfIpk.getText());
        if (ipk <= 4 && ipk >= 3.5) {
            sks = 24;
        } else if (ipk <= 3.4 && ipk >= 3) {
            sks = 23;
        } else if (ipk <= 2.9 && ipk >= 2.5) {
            sks = 22;
        }
        Temp = String.valueOf(sks);
        tfSks.setText(Temp);
    }//GEN-LAST:event_tfIpkActionPerformed

    private void tfSksPraktikumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSksPraktikumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSksPraktikumActionPerformed

    private void tfSksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSksActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed
    int bayar, kembali;
    String tempKembali;
    private void tfBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBayarActionPerformed
        // TODO add your handling code here:
        bayar = Integer.parseInt(tfBayar.getText());
        kembali = bayar - totalBayar;
        tempKembali = String.valueOf(kembali);
        tfKembali.setText(tempKembali);
    }//GEN-LAST:event_tfBayarActionPerformed

    private void tfKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKembaliActionPerformed

    private void cbbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbJurusanActionPerformed
    int sksPraktik, sksTeori, totalSks, hargaSks, totalBayar;
    String tempTotal;
    private void tfSksTeoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSksTeoriActionPerformed
        // TODO add your handling code here:
        try {
            sksPraktik = Integer.parseInt(tfSksPraktikum.getText());
            sksTeori = Integer.parseInt(tfSksTeori.getText());
            totalSks = sksPraktik + sksTeori;
            cekSKS(totalSks);
        } catch (sksOver e) {
            JOptionPane.showMessageDialog(this, "Inputan Melebihi BATAS");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input Dengan Angka Yang Benar");
        }
        if (cbbJurusan.getSelectedIndex() == 0) {

        } else if (cbbJurusan.getSelectedIndex() == 1) {
            hargaSks = 180000;
        } else if (cbbJurusan.getSelectedIndex() == 2) {
            hargaSks = 185000;
        } else if (cbbJurusan.getSelectedIndex() == 3) {
            hargaSks = 190000;
        }
        totalBayar = totalSks * hargaSks;
        tempTotal = String.valueOf(totalBayar);
        tfTotal.setText(tempTotal);
    }//GEN-LAST:event_tfSksTeoriActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE perhitungankrs SET Nim='" + tfNim.getText()
                    + "', Nama ='" + tfNama.getText()
                    + "', Jurusan ='" + cbbJurusan.getSelectedItem()
                    + "', Ipk ='" + tfIpk.getText()
                    + "', Total_Sks ='" + tfSks.getText()
                    + "', Praktikum ='" + tfSksPraktikum.getText()
                    + "', Teori ='" + tfSksTeori.getText()
                    + "', Total_Bayar ='" + tfTotal.getText()
                    + "', Bayar ='" + tfBayar.getText()
                    + "', Kembali ='" + tfKembali.getText()
                    + "'WHERE Nim='" + tfNim.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil DI edit");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO perhitungankrs VALUES ('" + tfNim.getText() 
                    + "','" + tfNama.getText()
                    + "','" + cbbJurusan.getSelectedItem()
                    + "','" + tfIpk.getText() 
                    + "','" + tfSks.getText() 
                    + "','" + tfSksPraktikum.getText() 
                    + "','" + tfSksTeori.getText() 
                    + "','" + tfTotal.getText() 
                    + "','" + tfBayar.getText() 
                    + "','" + tfKembali.getText() + "')";
            java.sql.Connection conn = (Connection) Koneksi.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Tambah Data Mahasiswa Berhasil!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void TabelHasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelHasilMouseClicked
        // TODO add your handling code here:
        int baris = TabelHasil.rowAtPoint(evt.getPoint());
        String nim = TabelHasil.getValueAt(baris, 0).toString();
        tfNim.setText(nim);
        String nama = TabelHasil.getValueAt(baris, 1).toString();
        tfNama.setText(nama);
        String jurusan = TabelHasil.getValueAt(baris, 2).toString();
        cbbJurusan.setSelectedItem(jurusan);
        String Ipk = TabelHasil.getValueAt(baris, 3).toString();
        tfIpk.setText(Ipk);
        String totalsks = TabelHasil.getValueAt(baris, 4).toString();
        tfSks.setText(totalsks);
        String praktikum = TabelHasil.getValueAt(baris, 5).toString();
        tfSksPraktikum.setText(praktikum);
        String teori = TabelHasil.getValueAt(baris, 6).toString();
        tfSksTeori.setText(teori);
        String totalbayar = TabelHasil.getValueAt(baris, 7).toString();
        tfTotal.setText(totalbayar);
        String Bayar = TabelHasil.getValueAt(baris, 8).toString();
        tfBayar.setText(Bayar);
        String Kembali = TabelHasil.getValueAt(baris, 9).toString();
        tfKembali.setText(Kembali);
    }//GEN-LAST:event_TabelHasilMouseClicked

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM perhitungankrs WHERE Nim = '" + tfNim.getText() + "'";
            Connection con = (Connection) Koneksi.databaseDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        TampilData();
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM perhitungankrs WHERE Nim = '" + tfNim.getText() + "' ";
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

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        java.io.File namafile=new java.io.File("src/Cetakperhitungankrs.jasper");
        try{
            net.sf.jasperreports.engine.JasperReport jasper;
            jasper=(net.sf.jasperreports.engine.JasperReport)
            net.sf.jasperreports.engine.util.JRLoader.loadObject(namafile.getPath());
            net.sf.jasperreports.engine.JasperPrint jp;
            jp=net.sf.jasperreports.engine.JasperFillManager.fillReport(jasper, null, Koneksi.databaseDB());
            net.sf.jasperreports.view.JasperViewer.viewReport(jp, false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        Cari();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:
        Cari();
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new Menu().show();
            this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tfNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNimActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_btnClear1ActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPerhitunganKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPerhitunganKrs().setVisible(true);
            }
        });
    }

    public void cekSKS(int total) throws sksOver {
        if (total > 24) {
            throw new sksOver();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelHasil;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampil;
    private javax.swing.JComboBox<String> cbbJurusan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfIpk;
    private javax.swing.JTextField tfKembali;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNim;
    private javax.swing.JTextField tfSks;
    private javax.swing.JTextField tfSksPraktikum;
    private javax.swing.JTextField tfSksTeori;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

    private static class txtNim {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public txtNim() {
        }
    }

    private static class rs {

        private static boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public rs() {
        }
    }
}
