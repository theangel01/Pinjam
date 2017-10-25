package proyek_akhirPBO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Data_admin extends javax.swing.JFrame{
	  String filename = "D:\\DataPinjam.txt";
	    String file = "D:\\Data Penjualan.txt";
	    String apalah = "D:\\DataPegawai.txt";
	    Vector columns;
	    Vector data;
	    public Data_admin() {
	        initComponents();
	        try {
	            showTable();
	            showTable2();
	            showTable3();
	        } catch (IOException ex) {
	            Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	        
	    
	    @SuppressWarnings("unchecked")
	                           
	    private void initComponents() {

	        jTabbedPane1 = new javax.swing.JTabbedPane();
	        jPanel1 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jPanel2 = new javax.swing.JPanel();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jTable2 = new javax.swing.JTable();
	        btnDelJual = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jButton5 = new javax.swing.JButton();
	        jPanel3 = new javax.swing.JPanel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        jTable3 = new javax.swing.JTable();
	        btnDelPegawai = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        jButton6 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Data Pminjaman"
	            }
	        ) {
	            boolean[] canEdit = new boolean [] {
	                false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(jTable1);

	        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jButton1.setText("DELETE");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
	        jButton2.setText("NEXT");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(100, 100, 100)
	                .addComponent(jButton1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(140, 140, 140))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
	                .addContainerGap(40, Short.MAX_VALUE))
	        );

	        jTabbedPane1.addTab("Data Peminjaman", jPanel1);

	        jTable2.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Data Penjualan"
	            }
	        ) {
	            boolean[] canEdit = new boolean [] {
	                false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane2.setViewportView(jTable2);
	        if (jTable2.getColumnModel().getColumnCount() > 0) {
	            jTable2.getColumnModel().getColumn(0).setResizable(false);
	        }

	        btnDelJual.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
	        btnDelJual.setText("DELETE");
	        btnDelJual.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnDelJualActionPerformed(evt);
	            }
	        });

	        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
	        jButton3.setText("NEXT");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
	        jButton5.setText("BACK");
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(32, 32, 32)
	                .addComponent(jButton5)
	                .addGap(216, 216, 216)
	                .addComponent(btnDelJual)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
	                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(43, 43, 43))
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addComponent(jScrollPane2)
	                .addContainerGap())
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnDelJual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
	                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(41, 41, 41))
	        );

	        jTabbedPane1.addTab("Data Penjualan", jPanel2);

	        jTable3.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Data Pegawai"
	            }
	        ) {
	            boolean[] canEdit = new boolean [] {
	                false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane3.setViewportView(jTable3);
	        if (jTable3.getColumnModel().getColumnCount() > 0) {
	            jTable3.getColumnModel().getColumn(0).setResizable(false);
	        }

	        btnDelPegawai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
	        btnDelPegawai.setText("DELETE");
	        btnDelPegawai.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnDelPegawaiActionPerformed(evt);
	            }
	        });

	        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
	        jButton4.setText("BACK");
	        jButton4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton4ActionPerformed(evt);
	            }
	        });

	        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
	        jButton6.setText("KELUAR");
	        jButton6.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton6ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addGap(31, 31, 31)
	                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(197, 197, 197)
	                .addComponent(btnDelPegawai)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jButton6)
	                .addGap(70, 70, 70))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addGap(13, 13, 13)
	                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(btnDelPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))))
	                .addContainerGap())
	        );

	        jTabbedPane1.addTab("Data Pegawai", jPanel3);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        int row = jTable1.getSelectedRow();
	        String line = null;
	        String lineToRemove = null;
	        DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel() ;
	        String selected = tbl.getValueAt(row, 0).toString();
	        if (row>=0){
	            tbl.removeRow(row);
	            JOptionPane.showMessageDialog(rootPane, "Delete!");
	        }

	        try {
	            BufferedReader br = new BufferedReader(new FileReader(filename));
	            PrintWriter pw = new PrintWriter(new FileWriter(filename));
	            while ((line = br.readLine())!=null){

	                if (!line.trim().equals(lineToRemove)) {

	                    pw.println(line);
	                    pw.flush();
	                }
	            }
	        } catch (IOException ex) {
	            Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }                                        

	    private void btnDelJualActionPerformed(java.awt.event.ActionEvent evt) {                                           
	          int row = jTable2.getSelectedRow();
	        String line = null;
	        String lineToRemove = null;
	        DefaultTableModel tbl = (DefaultTableModel)jTable2.getModel() ;
	        String selected = tbl.getValueAt(row, 0).toString();
	           if (row>=0){
	            tbl.removeRow(row);
	            JOptionPane.showMessageDialog(rootPane, "Delete!");
	        }
	              try {
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            PrintWriter pw = new PrintWriter(new FileWriter(file));
	            while ((line = br.readLine())!=null){

	                if (!line.trim().equals(lineToRemove)) {

	                    pw.println(line);
	                    pw.flush();
	                }
	            }
	        } catch (IOException ex) {
	            Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }                                          

	    private void btnDelPegawaiActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        int row = jTable3.getSelectedRow();
	        String line = null;
	        String lineToRemove = null;
	        DefaultTableModel tbl = (DefaultTableModel)jTable3.getModel() ;
	        String selected = tbl.getValueAt(row, 0).toString();
	           if (row>=0){
	            tbl.removeRow(row);
	            JOptionPane.showMessageDialog(rootPane, "Delete!");
	        }
	              try {
	            BufferedReader br = new BufferedReader(new FileReader(apalah));
	            PrintWriter pw = new PrintWriter(new FileWriter(apalah));
	            while ((line = br.readLine())!=null){

	                if (!line.trim().equals(lineToRemove)) {

	                    pw.println(line);
	                    pw.flush();
	                }
	            }
	        } catch (IOException ex) {
	            Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }                                             

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        jTabbedPane1.setSelectedIndex(1);
	    }                                        

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        jTabbedPane1.setSelectedIndex(2);
	    }                                        
	    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        jTabbedPane1.setSelectedIndex(1);
	    }                                        
	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	      jTabbedPane1.setSelectedIndex(0);
	    }                                        

	    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        dispose();
	    }                                        
	void showTable() throws IOException {                                  
	  
	    try {
	        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
	        FileReader fr = new FileReader (filename);
	        BufferedReader br = new BufferedReader (fr);
	        String currentLine;
	        int i=0;
	        StringTokenizer st1 = new StringTokenizer(filename, ", ", true);
	        
	        while ((currentLine = br.readLine())!= null){
	           
	            Object [] row = {currentLine};
	            model.addRow (row);
	            i++;
	        }
	    } catch (FileNotFoundException ex) {
	        Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
	    }
	} 
	void showTable2() throws IOException {
	      try {
	        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
	        FileReader fr = new FileReader (file);
	        BufferedReader br = new BufferedReader (fr);
	        String currentLine;
	        int i=0;
	        StringTokenizer st1 = new StringTokenizer(file, ", ", true);
	        
	        while ((currentLine = br.readLine())!= null){
	           
	            Object [] row = {currentLine};
	            model.addRow (row);
	            i++;
	        }
	    } catch (FileNotFoundException ex) {
	        Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
	void showTable3() throws IOException {
	      try {
	        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
	        FileReader fr = new FileReader (apalah);
	        BufferedReader br = new BufferedReader (fr);
	        String currentLine;
	        int i=0;
	        StringTokenizer st1 = new StringTokenizer(apalah, ", ", true);
	        
	        while ((currentLine = br.readLine())!= null){
	           
	            Object [] row = {currentLine};
	            model.addRow (row);
	            i++;
	        }
	    } catch (FileNotFoundException ex) {
	        Logger.getLogger(Data_admin.class.getName()).log(Level.SEVERE, null, ex);
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
	            java.util.logging.Logger.getLogger(Data_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Data_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Data_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Data_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	       

	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Data_admin().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton btnDelJual;
	    private javax.swing.JButton btnDelPegawai;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JButton jButton6;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JScrollPane jScrollPane3;
	    private javax.swing.JTabbedPane jTabbedPane1;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JTable jTable2;
	    private javax.swing.JTable jTable3;
	                   
	}

