package proyek_akhirPBO;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame{
	 public Login() {
	        initComponents();
	    }

	    
	    @SuppressWarnings("unchecked")
	                     
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        txtUser = new javax.swing.JTextField();
	        jLabel3 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        txtPass = new javax.swing.JPasswordField();
	        cekPass = new javax.swing.JCheckBox();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
	        jLabel1.setText("LOGIN");

	        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
	        jLabel2.setText("USERNAME");

	        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
	        jLabel3.setText("PASSWORD");

	        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
	        jButton1.setText("LOGIN");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        cekPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        cekPass.setText("Tampilakan Password");
	        cekPass.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                cekPassActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(145, 145, 145)
	                .addComponent(jLabel1)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(94, 94, 94)
	                        .addComponent(jButton1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(23, 23, 23)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3))
	                        .addGap(39, 39, 39)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(cekPass)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                .addComponent(txtUser)
	                                .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))))
	                .addGap(0, 11, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addComponent(jLabel1)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(txtUser))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(txtPass))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(cekPass)
	                .addGap(13, 13, 13)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(18, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        String a = txtUser.getText();
	        String b = txtPass.getText();
	        if ((a.equals("Admin"))&&(b.equals("1234567890"))){
	            JOptionPane.showMessageDialog(rootPane, "Berhasil Masuk!!");
	            Data_admin DP = new Data_admin();
	            DP.setVisible(true);
	            this.dispose();
	        }else if ((a.equals("admin"))&&(b.equals("1234567890"))){
	           JOptionPane.showMessageDialog(rootPane, "Berhasil Masuk!!");
	            Data_admin DP = new Data_admin();
	            DP.setVisible(true);
	            this.dispose();
	        }else{
	            JOptionPane.showMessageDialog(rootPane, "Username dan Password Salah!!");
	        }
	        
	    }                                        

	    private void cekPassActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        if (cekPass.isSelected()==true){
	            txtPass.setEchoChar((char)0);
	        }else if (cekPass.isSelected()==false) {
	            txtPass.setEchoChar('*');
	        }
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
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	       
	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Login().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JCheckBox cekPass;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JPasswordField txtPass;
	    private javax.swing.JTextField txtUser;
	    // End of variables declaration                   
	}

