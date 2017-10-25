package proyek_akhirPBO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Penjualan extends javax.swing.JFrame{
	 String filename = "D:\\Data Penjualan.txt";
	 int total1, total2, VCD = 7000, DVD = 11000, total, kembali;
	 public Penjualan() {
	        initComponents();
	    }
	    @SuppressWarnings("unchecked")
	                         
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        cekVCD = new javax.swing.JCheckBox();
	        cekDVD = new javax.swing.JCheckBox();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jTextField1 = new javax.swing.JTextField();
	        jTextField2 = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        txtTotbar = new javax.swing.JTextField();
	        jLabel5 = new javax.swing.JLabel();
	        txtBayar = new javax.swing.JTextField();
	        jButton2 = new javax.swing.JButton();
	        txtKembali = new javax.swing.JTextField();
	        jButton3 = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        jLabel6 = new javax.swing.JLabel();
	        txtJum1 = new javax.swing.JTextField();
	        txtJum2 = new javax.swing.JTextField();
	        jMenuBar1 = new javax.swing.JMenuBar();
	        jMenu1 = new javax.swing.JMenu();
	        jMenuItem1 = new javax.swing.JMenuItem();
	        jMenuItem3 = new javax.swing.JMenuItem();
	        jMenuItem2 = new javax.swing.JMenuItem();
	        jMenu2 = new javax.swing.JMenu();
	        jMenuItem4 = new javax.swing.JMenuItem();

	        jLabel1.setText("jLabel1");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel2.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
	        jLabel2.setText("PENJUALAN CD");

	        cekVCD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        cekVCD.setText("VCD");

	        cekDVD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        cekDVD.setText("DVD");

	        jLabel3.setFont(new java.awt.Font("Sakkal Majalla", 1, 18)); // NOI18N
	        jLabel3.setText("Jenis CD");

	        jLabel4.setFont(new java.awt.Font("Sakkal Majalla", 1, 18)); // NOI18N
	        jLabel4.setText("Harga ");

	        jTextField1.setEditable(false);
	        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jTextField1.setText("Rp. 11000");

	        jTextField2.setEditable(false);
	        jTextField2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jTextField2.setText("Rp. 7000");

	        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jButton1.setText("Total Bayar");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        txtTotbar.setEditable(false);

	        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jLabel5.setText("Bayar");

	        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jButton2.setText("Kembalian");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        txtKembali.setEditable(false);

	        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jButton3.setText("KELUAR");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
	        jButton4.setText("REFRESH");
	        jButton4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton4ActionPerformed(evt);
	            }
	        });

	        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
	        jLabel6.setText("Jumlah Pembelian");

	        jMenu1.setText("Pegawai");

	        jMenuItem1.setText("Input Data Pegawai");
	        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem1ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jMenuItem1);

	        jMenuItem3.setText("Peminjaman");
	        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem3ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jMenuItem3);

	        jMenuItem2.setText("Penjualan");
	        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem2ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jMenuItem2);

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
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(11, 11, 11)
	                                .addComponent(jLabel3))
	                            .addGroup(layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jLabel4)))
	                        .addGap(85, 103, Short.MAX_VALUE)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(cekDVD)
	                                .addGap(86, 86, 86)
	                                .addComponent(cekVCD))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(txtJum2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(130, 130, 130)
	                        .addComponent(jLabel2))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jButton1)
	                                    .addComponent(jLabel5)
	                                    .addComponent(jButton2)))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(33, 33, 33)
	                                .addComponent(jButton4))
	                            .addComponent(jLabel6))
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                .addComponent(txtTotbar)
	                                .addComponent(txtBayar)
	                                .addComponent(txtKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                .addComponent(jButton3)
	                                .addGap(33, 33, 33))
	                            .addComponent(txtJum1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(66, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(20, 20, 20)
	                .addComponent(jLabel2)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(cekVCD)
	                    .addComponent(cekDVD)
	                    .addComponent(jLabel3))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(28, 28, 28)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtJum1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtJum2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtTotbar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel5))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(37, 37, 37)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
	                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addGap(71, 71, 71))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	       Login lg = new Login();
	       lg.setVisible(true);
	       this.dispose();
	    }                                          

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        String d =cekDVD.getText();
	        String e =cekVCD.getText();
	        if ((cekDVD.isSelected()==true)&&(cekVCD.isSelected()==true)){
	           int a = Integer.parseInt(txtJum1.getText());
	           int b = Integer.parseInt(txtJum2.getText());
	           total1 = b*VCD;
	           total2=a*DVD;
	           total = total1+total2;
	           txtTotbar.setText("Rp. "+total);
	           
	            FileWriter fa;
	            try {
	                fa = new FileWriter (filename, true);
	                BufferedWriter bw = new BufferedWriter (fa);
	                bw.append (d+" || "+a+" || "+e+" || "+b+" ||");
	                bw.newLine();
	                bw.close();
	            } catch (IOException ex) {
	                Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
	            }
	           
	       }else if ((cekVCD.isSelected()==true)&&(cekDVD.isSelected()==false)){
	            int b = Integer.parseInt(txtJum2.getText());
	            total1 = b*VCD;
	            txtTotbar.setText("Rp. "+total1);
	            FileWriter fa;
	            try {
	                fa = new FileWriter (filename, true);
	                BufferedWriter bw = new BufferedWriter (fa);
	                bw.append (d+" || "+(0)+" || "+e+" || "+b+" ||");
	                bw.newLine();
	                bw.close();
	            } catch (IOException ex) {
	                Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
	            }
	       }else if ((cekDVD.isSelected()==true)&&(cekVCD.isSelected()==false)){
	            int a = Integer.parseInt(txtJum1.getText());
	             total2=a*DVD;
	              txtTotbar.setText("Rp. "+total2);
	                FileWriter fa;
	            try {
	                fa = new FileWriter (filename, true);
	                BufferedWriter bw = new BufferedWriter (fa);
	                bw.append (d+" || "+a+" || "+e+" || "+(0)+" ||");
	                bw.newLine();
	                bw.close();
	            } catch (IOException ex) {
	                Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
	            }
	       }
	    }                                        
	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        int c = Integer.parseInt(txtBayar.getText()); 
	        if ((cekDVD.isSelected()==true)&&(cekVCD.isSelected()==true)){
	           kembali = c - total;
	           txtKembali.setText("Rp. "+kembali);
	           if (c<total){
	               JOptionPane.showMessageDialog(rootPane, "Masih Kurang Bro!!");
	           }
	         }else if ((cekVCD.isSelected()==true)&&(cekDVD.isSelected()==false)){
	             kembali = c-total1;
	              txtKembali.setText("Rp. "+kembali);
	           if (c<total1){
	               JOptionPane.showMessageDialog(rootPane, "Masih Kurang Bro!!");
	           }
	         }else if ((cekDVD.isSelected()==true)&&(cekVCD.isSelected()==false)){
	              kembali = c-total2;
	              txtKembali.setText("Rp. "+kembali);
	           if (c<total2){
	               JOptionPane.showMessageDialog(rootPane, "Masih Kurang Bro!!");
	           }
	         }
	    }                                        

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        dispose();
	    }                                        
	    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        txtJum1.setText("");
	        txtJum2.setText("");
	        txtTotbar.setText("");
	        txtBayar.setText("");
	        txtKembali.setText("");
	        cekVCD.setSelected(false);
	        cekDVD.setSelected(false);
	    }                                        

	    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        Input_data_pegawai IDP = new Input_data_pegawai();
	        IDP.setVisible(true);
	        this.dispose();
	    }                                          
	    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        Pinjam P = new Pinjam();
	        P.setVisible(true);
	        this.dispose();
	    }                                          
	    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        Penjualan jual = new Penjualan();
	        jual.setVisible(true);
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
	            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	      

	      
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Penjualan().setVisible(true);
	            }
	        });
	    }

	               
	    private javax.swing.JCheckBox cekDVD;
	    private javax.swing.JCheckBox cekVCD;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JMenu jMenu1;
	    private javax.swing.JMenu jMenu2;
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenuItem jMenuItem1;
	    private javax.swing.JMenuItem jMenuItem2;
	    private javax.swing.JMenuItem jMenuItem3;
	    private javax.swing.JMenuItem jMenuItem4;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JTextField jTextField2;
	    private javax.swing.JTextField txtBayar;
	    private javax.swing.JTextField txtJum1;
	    private javax.swing.JTextField txtJum2;
	    private javax.swing.JTextField txtKembali;
	    private javax.swing.JTextField txtTotbar;
	                     
	    }

