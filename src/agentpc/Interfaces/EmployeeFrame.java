package agentpc.Interfaces;

import agentpc.BusinessLogic.AccTableModel;
import agentpc.BusinessLogic.AccountantDetails;
import agentpc.BusinessLogic.RepDetails;
import agentpc.BusinessLogic.RepTableModel;
import agentpc.DBOperations.DBOperations;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class EmployeeFrame extends javax.swing.JFrame {
    
    ArrayList<RepDetails> stList;
    ArrayList<AccountantDetails> acList;
    DBOperations dbo=new DBOperations();
    //Accountant_DBOperations dbo2=new Accountant_DBOperations();
    
    public EmployeeFrame() {
        initComponents();
        loadRep();
        loadAccountant();
    }
    
    void loadRep(){
        stList=dbo.getRep();
        RepTableModel stDetails=new RepTableModel(stList);
        tblRep.setModel(stDetails);
    }
    void loadAccountant(){
        acList=dbo.getAccountant();
        AccTableModel stDetails=new AccTableModel(acList);
        tblAccountant.setModel(stDetails);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnViewStudent = new javax.swing.JButton();
        btnUpdateStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        btnAddStudent3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRep = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccountant = new javax.swing.JTable();
        btnViewAccountant = new javax.swing.JButton();
        btnUpdateAccountant = new javax.swing.JButton();
        btnAddAccountant = new javax.swing.JButton();
        btnDeleteAccountant = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Employee");

        btnViewStudent.setText("View Rep");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        btnUpdateStudent.setText("Update Rep");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        btnDeleteStudent.setText("Delete Rep");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        btnAddStudent3.setText("Add Rep");
        btnAddStudent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudent3ActionPerformed(evt);
            }
        });

        tblRep.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblRep);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddStudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("REP", jPanel2);

        tblAccountant.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAccountant);

        btnViewAccountant.setText("View Accountant");
        btnViewAccountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccountantActionPerformed(evt);
            }
        });

        btnUpdateAccountant.setText("Update Accountant");
        btnUpdateAccountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAccountantActionPerformed(evt);
            }
        });

        btnAddAccountant.setText("Add Accountant");
        btnAddAccountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountantActionPerformed(evt);
            }
        });

        btnDeleteAccountant.setText("Delete Accountant");
        btnDeleteAccountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnViewAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdateAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnDeleteAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ACCOUNTANT", jPanel3);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudent3ActionPerformed
        Rep_NewRep newstd=new Rep_NewRep();
        newstd.setVisible(true);
        newstd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        newstd.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadRep();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                 
            }
        });
        
    }//GEN-LAST:event_btnAddStudent3ActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        UpdateRep updteRep=new UpdateRep();
        updteRep.setVisible(true);
        updteRep.setFields(stList.get(tblRep.getSelectedRow()));
        
        updteRep.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadRep();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                 
            }
        });
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        DeleteRep delStd=new DeleteRep();
        delStd.setVisible(true);
        delStd.setFields(stList.get(tblRep.getSelectedRow()));
        
        delStd.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadRep();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                 
            }
        });
        
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        ViewRep viewStd=new ViewRep();
        viewStd.setVisible(true);
        viewStd.setFields(stList.get(tblRep.getSelectedRow()));
        viewStd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnViewAccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccountantActionPerformed
        ViewAccountant viewStd=new ViewAccountant();
        viewStd.setVisible(true);
        viewStd.setFields(acList.get(tblAccountant.getSelectedRow()));
        viewStd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnViewAccountantActionPerformed

    private void btnUpdateAccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAccountantActionPerformed
        UpdateAccountant updteAcc=new UpdateAccountant();
        updteAcc.setVisible(true);
        updteAcc.setFields(acList.get(tblAccountant.getSelectedRow()));
        
        updteAcc.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadAccountant();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                 
            }
        });
    }//GEN-LAST:event_btnUpdateAccountantActionPerformed

    private void btnAddAccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountantActionPerformed
        Accountant_New newstd=new Accountant_New();
        newstd.setVisible(true);
        newstd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        newstd.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadAccountant();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                 
            }
        });
    }//GEN-LAST:event_btnAddAccountantActionPerformed

    private void btnDeleteAccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountantActionPerformed
        DeleteAccountant delStd=new DeleteAccountant();
        delStd.setVisible(true);
        delStd.setFields(acList.get(tblAccountant.getSelectedRow()));
        
        delStd.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadAccountant();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                 
            }
        });
    }//GEN-LAST:event_btnDeleteAccountantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AgentSelectionWindow asw=new AgentSelectionWindow();
        asw.pack();
        asw.setLocationRelativeTo(null);
        asw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccountant;
    private javax.swing.JButton btnAddStudent3;
    private javax.swing.JButton btnDeleteAccountant;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnUpdateAccountant;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JButton btnViewAccountant;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAccountant;
    private javax.swing.JTable tblRep;
    // End of variables declaration//GEN-END:variables
}
