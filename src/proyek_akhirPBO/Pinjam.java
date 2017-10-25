package proyek_akhirPBO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pinjam extends javax.swing.JFrame  {
	 int total;
	    int HD = 5000;
	    int SD = 4000;
	    int Blueray = 5500;
	    String filename = "D:\\DataPinjam.txt";
	    public Pinjam() {
	        initComponents();
	    }
	    @SuppressWarnings("unchecked")
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        jMenuItem1 = new javax.swing.JMenuItem();
	        jMenu3 = new javax.swing.JMenu();
	        jMenuItem2 = new javax.swing.JMenuItem();
	        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
	        jMenuItem3 = new javax.swing.JMenuItem();
	        jPopupMenu1 = new javax.swing.JPopupMenu();
	        jPopupMenu2 = new javax.swing.JPopupMenu();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        txtID = new javax.swing.JTextField();
	        jLabel3 = new javax.swing.JLabel();
	        txtNama = new javax.swing.JTextField();
	        jLabel4 = new javax.swing.JLabel();
	        txtNo = new javax.swing.JTextField();
	        jLabel5 = new javax.swing.JLabel();
	        txtAlamat = new javax.swing.JTextField();
	        jLabel6 = new javax.swing.JLabel();
	        txtTanggalPinjam = new javax.swing.JTextField();
	        jLabel7 = new javax.swing.JLabel();
	        txtKembali = new javax.swing.JTextField();
	        jLabel8 = new javax.swing.JLabel();
	        txtLama = new javax.swing.JTextField();
	        jLabel9 = new javax.swing.JLabel();
	        txtJudul = new javax.swing.JTextField();
	        jLabel10 = new javax.swing.JLabel();
	        cmbStatus = new javax.swing.JComboBox<>();
	        txtTotal = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jLabel11 = new javax.swing.JLabel();
	        radioHd = new javax.swing.JRadioButton();
	        radioSD = new javax.swing.JRadioButton();
	        radioBlue = new javax.swing.JRadioButton();
	        jLabel12 = new javax.swing.JLabel();
	        txtbayar = new javax.swing.JTextField();
	        jButton4 = new javax.swing.JButton();
	        txthasil = new javax.swing.JTextField();
	        jButton5 = new javax.swing.JButton();
	        jMenuBar1 = new javax.swing.JMenuBar();
	        jMenu1 = new javax.swing.JMenu();
	        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
	        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
	        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
	        jMenu2 = new javax.swing.JMenu();
	        jMenuItem4 = new javax.swing.JMenuItem();

	        jMenuItem1.setText("jMenuItem1");

	        jMenu3.setText("jMenu3");

	        jMenuItem2.setText("jMenuItem2");

	        jCheckBoxMenuItem1.setSelected(true);
	        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

	        jMenuItem3.setText("jMenuItem3");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
	        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel1.setText("PEMINJAMAN CD");

	        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel2.setText("ID Peminjam");

	        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel3.setText("Nama Peminjam");

	        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel4.setText("NO HP");

	        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel5.setText("Alamat Peminjam");

	        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel6.setText("Tanggal Peminjaman");

	        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel7.setText("Tanggal Pengembalian");

	        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel8.setText("Lama Peminjaman");

	        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel9.setText("Judul Film");

	        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel10.setText("Status");

	        cmbStatus.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sudah Bayar", "Belum Bayar" }));
	        cmbStatus.setSelectedIndex(-1);

	        txtTotal.setEditable(false);

	        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jButton1.setText("TOTAL BAYAR");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        jButton2.setText("TAMBAH");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jButton3.setText("KELUAR");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jLabel11.setText("Kualitas Gambar");

	        buttonGroup1.add(radioHd);
	        radioHd.setText("HD");

	        buttonGroup1.add(radioSD);
	        radioSD.setText("SD");

	        buttonGroup1.add(radioBlue);
	        radioBlue.setText("BlueRay");

	        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel12.setText("BAYAR");

	        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jButton4.setText("KEMBALI");
	        jButton4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton4ActionPerformed(evt);
	            }
	        });

	        txthasil.setEditable(false);

	        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
	        jButton5.setText("REFRESH");
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        jMenu1.setText("Pegawai");

	        jCheckBoxMenuItem2.setSelected(true);
	        jCheckBoxMenuItem2.setText("Penjualan");
	        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jCheckBoxMenuItem2ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jCheckBoxMenuItem2);

	        jCheckBoxMenuItem3.setSelected(true);
	        jCheckBoxMenuItem3.setText("Input Data Pegawai");
	        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jCheckBoxMenuItem3ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jCheckBoxMenuItem3);

	        jCheckBoxMenuItem4.setSelected(true);
	        jCheckBoxMenuItem4.setText("Peminjaman");
	        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jCheckBoxMenuItem4ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jCheckBoxMenuItem4);

	        jMenuBar1.add(jMenu1);

	        jMenu2.setText("Admin");

	        jMenuItem4.setText("Data Admin");
	        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem4ActionPerformed(evt);
	            }
	        });
	        jMenu2.add(jMenuItem4);

	        jMenuBar1.add(jMenu2);

	        setJMenuBar(jMenuBar1);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                .addComponent(jLabel2)
	                                .addGap(59, 59, 59))
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel4))
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(33, 33, 33)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(32, 32, 32)
	                                .addComponent(txtNo)))
	                        .addGap(0, 13, Short.MAX_VALUE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(20, 20, 20)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel5)
	                                    .addComponent(jLabel6)
	                                    .addComponent(jLabel7)
	                                    .addComponent(jLabel8)
	                                    .addComponent(jLabel9)
	                                    .addComponent(jLabel11)))
	                            .addGroup(layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jButton1))
	                            .addGroup(layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jButton4))
	                            .addGroup(layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(7, 7, 7)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(txtKembali)
	                            .addComponent(txtAlamat)
	                            .addComponent(txtTanggalPinjam)
	                            .addComponent(txtLama)
	                            .addComponent(txtJudul)
	                            .addComponent(txtbayar, javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(txthasil, javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(txtTotal)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addComponent(radioHd)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                        .addComponent(radioSD)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                        .addComponent(radioBlue)))
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jButton5)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jButton3)))))
	                .addGap(129, 129, 129))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(177, 177, 177)
	                .addComponent(jLabel1)
	                .addGap(0, 0, Short.MAX_VALUE))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(24, 24, 24)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jButton2)
	                    .addComponent(jLabel10))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jLabel1)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel5)
	                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel6)
	                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jLabel7)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel11)
	                    .addComponent(radioHd)
	                    .addComponent(radioSD)
	                    .addComponent(radioBlue))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(6, 6, 6)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel12))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jButton4)
	                    .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel10)
	                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(29, 29, 29)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(53, 53, 53))
	        );

	        pack();
	    }
	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        dispose();
	    }                                        

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        String a = txtID.getText();
	        String b = txtNama.getText();
	        String c = txtNo.getText();
	        String d = txtAlamat.getText();
	        String e = txtTanggalPinjam.getText();
	        String f = txtKembali.getText();
	        String h = txtLama.getText();
	        String g = txtJudul.getText();
	        String i = (String) cmbStatus.getSelectedItem();
	         if (radioHd.isSelected()){
	             String j = radioHd.getText();
	               FileWriter fa;
	            try {
	                fa = new FileWriter (filename, true);
	                 BufferedWriter bw = new BufferedWriter (fa);
	                  bw.append(""+a+" || "+b+" || "+c+" || "+d+" || "+e+" || "+f+" || "
	                          +h+" hari || "+g+" || "+i+" || "+j+" || "+total);
	                  bw.newLine();
	                 
	                  bw.close();
	            } catch (IOException ex) {
	                Logger.getLogger(Pinjam.class.getName()).log(Level.SEVERE, null, ex);
	            }
	         }else if (radioSD.isSelected()){
	            try {
	                String j = radioSD.getText();
	                FileWriter fa;
	                fa = new FileWriter (filename, true);
	                BufferedWriter bw = new BufferedWriter (fa);
	                bw.append(""+a+" || "+b+" || "+c+" || "+d+" || "+e+" || "+f+" || "
	                        +h+" hari || "+g+" || "+i+" || "+j+" || "+total);
	                bw.newLine();
	                
	                bw.close();
	            } catch (IOException ex) {
	                Logger.getLogger(Pinjam.class.getName()).log(Level.SEVERE, null, ex);
	            }
	         }else {
	             String j = radioBlue.getText();
	                FileWriter fa;
	            try {
	                fa = new FileWriter (filename, true);
	                BufferedWriter bw = new BufferedWriter (fa);
	                bw.append(""+a+" || "+b+" || "+c+" || "+d+" || "+e+" || "+f+" || "
	                        +h+" hari || "+g+" || "+i+" || "+j+" || "+total);
	                bw.newLine();
	                
	                bw.close();
	            } catch (IOException ex) {
	                Logger.getLogger(Pinjam.class.getName()).log(Level.SEVERE, null, ex);
	            }
	                
	         }
	        JOptionPane.showMessageDialog(rootPane, "Data Berhasil ditambahkan!");
	    }                                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        int lama = Integer.parseInt (txtLama.getText());
	        if (radioHd.isSelected()){
	            total = HD*lama;
	            txtTotal.setText("Rp. "+total);
	        }
	        else if (radioSD.isSelected()){
	            total = SD*lama;
	            txtTotal.setText("Rp. "+total);
	        }else {
	            total = Blueray*lama;
	            txtTotal.setText("Rp. "+total);
	        }
	    }                                        

	    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	       Penjualan jual = new Penjualan ();
	       jual.setVisible(true);
	        this.dispose();
	    }                                                  

	    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	        Pinjam pinjam = new Pinjam ();
	           pinjam.setVisible(true);
	            this.dispose();
	    }                                                  

	    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	        Input_data_pegawai IDP = new Input_data_pegawai();
	            IDP.setVisible(true);
	             this.dispose();
	    }                                                  

	    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        Login Lg = new Login ();
	        Lg.setVisible (true);
	        this.dispose();
	    }                                          

	    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	         int bayar = Integer.parseInt(txtbayar.getText());
	        int hasil;
	        if (radioHd.isSelected()){
	            hasil = bayar - total;
	            txthasil.setText("Rp. "+hasil);
	        }else if (radioSD.isSelected()){
	            hasil = bayar - total;
	            txthasil.setText("Rp. "+hasil);
	        }else if (radioBlue.isSelected()){
	            hasil = bayar - total;
	            txthasil.setText("Rp. "+hasil);
	        }
	    }                                        

	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	     txtID.setText("");
	     txtNama.setText("");
	     txtNo.setText("");
	     txtAlamat.setText("");
	     txtTanggalPinjam.setText("");
	     txtKembali.setText("");
	     txtLama.setText("");
	     txtJudul.setText("");
	     txtTotal.setText("");
	     txtbayar.setText("");
	     txthasil.setText("");
	     radioHd.setSelected(false);
	     radioSD.setSelected(false);
	     radioBlue.setSelected(false);
	     buttonGroup1.setSelected(buttonGroup1.getSelection(), false);
	    }       
	    public static void main(String args[]) {
	        
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        

	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Pinjam().setVisible(true);
	            }
	        });
	    }
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JComboBox<String> cmbStatus;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JMenu jMenu1;
	    private javax.swing.JMenu jMenu2;
	    private javax.swing.JMenu jMenu3;
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenuItem jMenuItem1;
	    private javax.swing.JMenuItem jMenuItem2;
	    private javax.swing.JMenuItem jMenuItem3;
	    private javax.swing.JMenuItem jMenuItem4;
	    private javax.swing.JPopupMenu jPopupMenu1;
	    private javax.swing.JPopupMenu jPopupMenu2;
	    private javax.swing.JRadioButton radioBlue;
	    private javax.swing.JRadioButton radioHd;
	    private javax.swing.JRadioButton radioSD;
	    private javax.swing.JTextField txtAlamat;
	    private javax.swing.JTextField txtID;
	    private javax.swing.JTextField txtJudul;
	    private javax.swing.JTextField txtKembali;
	    private javax.swing.JTextField txtLama;
	    private javax.swing.JTextField txtNama;
	    private javax.swing.JTextField txtNo;
	    private javax.swing.JTextField txtTanggalPinjam;
	    private javax.swing.JTextField txtTotal;
	    private javax.swing.JTextField txtbayar;
	    private javax.swing.JTextField txthasil;
}
