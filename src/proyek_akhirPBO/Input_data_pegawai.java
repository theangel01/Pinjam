package proyek_akhirPBO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Input_data_pegawai extends javax.swing.JFrame{
	 String filename = "D:\\DataPegawai.txt";
	    public Input_data_pegawai() {
	        initComponents();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        buttonGroup2 = new javax.swing.ButtonGroup();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        txtId = new javax.swing.JTextField();
	        jLabel3 = new javax.swing.JLabel();
	        txtNama = new javax.swing.JTextField();
	        jLabel4 = new javax.swing.JLabel();
	        txtTanggal = new javax.swing.JTextField();
	        Umur = new javax.swing.JLabel();
	        txtUmur = new javax.swing.JTextField();
	        jLabel5 = new javax.swing.JLabel();
	        cmbPendidkan = new javax.swing.JComboBox<>();
	        jLabel6 = new javax.swing.JLabel();
	        txtAlamt = new javax.swing.JTextField();
	        jLabel7 = new javax.swing.JLabel();
	        txtHP = new javax.swing.JTextField();
	        jLabel8 = new javax.swing.JLabel();
	        jRadioButton1 = new javax.swing.JRadioButton();
	        jRadioButton2 = new javax.swing.JRadioButton();
	        jLabel9 = new javax.swing.JLabel();
	        cmbJK = new javax.swing.JComboBox<>();
	        jButton1 = new javax.swing.JButton();
	        KELUAR = new javax.swing.JButton();
	        jMenuBar1 = new javax.swing.JMenuBar();
	        jMenu1 = new javax.swing.JMenu();
	        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
	        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
	        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
	        jMenu2 = new javax.swing.JMenu();
	        jMenuItem1 = new javax.swing.JMenuItem();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
	        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel1.setText("SELAMAT DATANG PEGAWAI BARU");

	        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel2.setText("ID");

	        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel3.setText("Nama");

	        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel4.setText("Tanggal Lahir");

	        Umur.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        Umur.setText("Umur");

	        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel5.setText("Pendidikan Akhir");

	        cmbPendidkan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        cmbPendidkan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Sekolah", "SD", "SMP", "SMA" }));
	        cmbPendidkan.setSelectedIndex(-1);

	        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel6.setText("Alamat");

	        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel7.setText("No HP");

	        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel8.setText("Status");

	        buttonGroup1.add(jRadioButton1);
	        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jRadioButton1.setText("MENIKAH");

	        buttonGroup1.add(jRadioButton2);
	        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jRadioButton2.setText("BELUM MENIKAH");

	        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel9.setText("Jenis Kelamin");

	        cmbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
	        cmbJK.setSelectedIndex(-1);

	        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jButton1.setText("TAMBAHKAN");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        KELUAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        KELUAR.setText("KELUAR");
	        KELUAR.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                KELUARActionPerformed(evt);
	            }
	        });

	        jMenu1.setText("Pegawai");

	        jCheckBoxMenuItem1.setSelected(true);
	        jCheckBoxMenuItem1.setText("Penjualan");
	        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jCheckBoxMenuItem1ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jCheckBoxMenuItem1);

	        jCheckBoxMenuItem2.setSelected(true);
	        jCheckBoxMenuItem2.setText("Input Data Pegawai");
	        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jCheckBoxMenuItem2ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jCheckBoxMenuItem2);

	        jCheckBoxMenuItem3.setSelected(true);
	        jCheckBoxMenuItem3.setText("Peminjaman");
	        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jCheckBoxMenuItem3ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jCheckBoxMenuItem3);

	        jMenuBar1.add(jMenu1);

	        jMenu2.setText("Admin");

	        jMenuItem1.setText("Data Admin");
	        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem1ActionPerformed(evt);
	            }
	        });
	        
	        jMenu2.add(jMenuItem1);

	        jMenuBar1.add(jMenu2);

	        setJMenuBar(jMenuBar1);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(60, 60, 60)
	                        .addComponent(jLabel1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(118, 118, 118)
	                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel3)
	                        .addGap(118, 118, 118)
	                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel4)
	                        .addGap(54, 54, 54)
	                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(Umur)
	                        .addGap(119, 119, 119)
	                        .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel5)
	                        .addGap(26, 26, 26)
	                        .addComponent(cmbPendidkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel6)
	                        .addGap(107, 107, 107)
	                        .addComponent(txtAlamt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel7)
	                        .addGap(111, 111, 111)
	                        .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel8)
	                        .addGap(116, 116, 116)
	                        .addComponent(jRadioButton1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(188, 188, 188)
	                        .addComponent(jRadioButton2))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addComponent(jLabel9)
	                        .addGap(54, 54, 54)
	                        .addComponent(cmbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(73, 73, 73)
	                        .addComponent(jButton1)
	                        .addGap(119, 119, 119)
	                        .addComponent(KELUAR)))
	                .addGap(102, 102, 102))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(10, 10, 10)
	                .addComponent(jLabel1)
	                .addGap(12, 12, 12)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(7, 7, 7)
	                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(6, 6, 6)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(3, 3, 3)
	                        .addComponent(jLabel3))
	                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(14, 14, 14)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(1, 1, 1)
	                        .addComponent(jLabel4))
	                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(6, 6, 6)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(Umur)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(3, 3, 3)
	                        .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(6, 6, 6)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jLabel5)
	                        .addGap(6, 6, 6)
	                        .addComponent(jLabel6))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(1, 1, 1)
	                        .addComponent(cmbPendidkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtAlamt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(6, 6, 6)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel7)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(3, 3, 3)
	                        .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(2, 2, 2)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(4, 4, 4)
	                        .addComponent(jLabel8))
	                    .addComponent(jRadioButton1))
	                .addComponent(jRadioButton2)
	                .addGap(2, 2, 2)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel9)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(3, 3, 3)
	                        .addComponent(cmbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(KELUAR))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        String a = txtId.getText();
	        String b = txtNama.getText();
	        String c = txtTanggal.getText();
	        String d = txtUmur.getText();
	        String e = (String) cmbPendidkan.getSelectedItem();
	        String f = txtAlamt.getText();
	        String g = txtHP.getText();
	        String h = (String) cmbJK.getSelectedItem();
	        if (jRadioButton1.isSelected()){
	               String i = jRadioButton1.getText();
	              try {
	            FileWriter fa = new FileWriter (filename, true);
	            BufferedWriter bw = new BufferedWriter (fa);
	            bw.append(a+" || "+b+" || "+c+" || "+d+" || "+e+" || "+f+" || "+g+" || "+h+" || "+i);
	            bw.newLine();
	            bw.close();
	        } catch (IOException ex) {
	            Logger.getLogger(Input_data_pegawai.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        }else if (jRadioButton2.isSelected()){
	            String i = jRadioButton2.getText();
	              try {
	            FileWriter fa = new FileWriter (filename, true);
	            BufferedWriter bw = new BufferedWriter (fa);
	           bw.append(a+" || "+b+" || "+c+" || "+d+" || "+e+" || "+f+" || "+g+" || "+h+" || "+i);
	            bw.newLine();
	            bw.close();
	        } catch (IOException ex) {
	            Logger.getLogger(Input_data_pegawai.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        }
	           
	       JOptionPane.showMessageDialog(rootPane, "Data Berhasil ditambahkan!");
	    }                                        

	    private void KELUARActionPerformed(java.awt.event.ActionEvent evt) {                                       
	        dispose();
	    }                                      

	    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	       Penjualan jual = new Penjualan ();
	       jual.setVisible(true);
	       this.dispose();
	    }                                                  

	    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	        Input_data_pegawai IDP = new Input_data_pegawai();
	            IDP.setVisible(true);
	             this.dispose();
	    }                                                  

	    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	        Pinjam pinjam = new Pinjam ();
	           pinjam.setVisible(true);
	            this.dispose();
	    }      
	    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt){
	    	Login DA = new Login();
	    	DA.setVisible (true);
	    	this.dispose();
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
	            java.util.logging.Logger.getLogger(Input_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Input_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Input_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Input_data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	      
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Input_data_pegawai().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton KELUAR;
	    private javax.swing.JLabel Umur;
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.ButtonGroup buttonGroup2;
	    private javax.swing.JComboBox<String> cmbJK;
	    private javax.swing.JComboBox<String> cmbPendidkan;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
	    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
	    private javax.swing.JLabel jLabel1;
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
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenuItem jMenuItem1;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JTextField txtAlamt;
	    private javax.swing.JTextField txtHP;
	    private javax.swing.JTextField txtId;
	    private javax.swing.JTextField txtNama;
	    private javax.swing.JTextField txtTanggal;
	    private javax.swing.JTextField txtUmur;
	                      
	}

