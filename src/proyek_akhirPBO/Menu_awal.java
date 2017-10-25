package proyek_akhirPBO;

public class Menu_awal extends javax.swing.JFrame{
	public Menu_awal(){
		initComponents();
	}
	 @SuppressWarnings("unchecked")
	private void initComponents() {
		 jDesktopPane1 = new javax.swing.JDesktopPane();
	        cmbKasir = new javax.swing.JComboBox<>();
	        jButton1 = new javax.swing.JButton();

	        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
	        jDesktopPane1.setLayout(jDesktopPane1Layout);
	        jDesktopPane1Layout.setHorizontalGroup(
	            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	        );
	        jDesktopPane1Layout.setVerticalGroup(
	            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	        );

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        cmbKasir.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
	        cmbKasir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peminjaman", "Penjualan", "Input data Pegawai"}));
	        cmbKasir.setSelectedIndex(-1);
	        cmbKasir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                cmbKasirActionPerformed(evt);
	            }
	        });

	        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
	        jButton1.setText("DATA ADMIN");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(cmbKasir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap(27, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(cmbKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(33, 33, 33)
	                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        pack();
	    }
	 private void cmbKasirActionPerformed(java.awt.event.ActionEvent evt) {                                         
	       String a = (String) cmbKasir.getSelectedItem();
	       if (a == "Peminjaman"){
	           Pinjam pinjam = new Pinjam ();
	           pinjam.setVisible(true);
	            this.dispose();
	       }else if (a == "Penjualan"){
	           Penjualan jual = new Penjualan();
	           jual.setVisible(true);
	            this.dispose();
	       }else if (a == "Input data Pegawai"){
	            Input_data_pegawai IDP = new Input_data_pegawai();
	            IDP.setVisible(true);
	             this.dispose();
	        }
	    }                                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        Login LG = new Login();
	        LG.setVisible(true);
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
	            java.util.logging.Logger.getLogger(Menu_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Menu_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Menu_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Menu_awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        

	     
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Menu_awal().setVisible(true);
	            }
	        });
	    }
	    private javax.swing.JComboBox<String> cmbKasir;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JDesktopPane jDesktopPane1;
	}

