package agentpc.Interfaces;

public class AgentSelectionWindow extends javax.swing.JFrame {

    public AgentSelectionWindow() {
        initComponents();
        //txtLogAs.setText(LoginFrame.loggedAs);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnAddItemToStore = new javax.swing.JButton();
        btnSalesReportGen = new javax.swing.JButton();
        btnCreateNewRoute = new javax.swing.JButton();
        btnCreateNewCompany = new javax.swing.JButton();
        btnIssueItems1 = new javax.swing.JButton();
        btnComplainReportGen = new javax.swing.JButton();
        btnMakeNewItem = new javax.swing.JButton();
        btnOnDemandItems1 = new javax.swing.JButton();
        btnVeiwRemainStock = new javax.swing.JButton();
        btnRep = new javax.swing.JButton();
        btnGetDetails = new javax.swing.JButton();
        txtLogAs = new javax.swing.JTextField();
        btnPlaceAnOrder1 = new javax.swing.JButton();
        btnVeiwRemainStock1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agent Selection Window");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("You are logged in as :");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAddItemToStore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddItemToStore.setText("Add item to the store");
        btnAddItemToStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemToStoreActionPerformed(evt);
            }
        });

        btnSalesReportGen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalesReportGen.setText("Sales Report genaration");

        btnCreateNewRoute.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateNewRoute.setText("Create a new route");

        btnCreateNewCompany.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateNewCompany.setText("Company");
        btnCreateNewCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewCompanyActionPerformed(evt);
            }
        });

        btnIssueItems1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIssueItems1.setText("Issue Items");
        btnIssueItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueItems1ActionPerformed(evt);
            }
        });

        btnComplainReportGen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComplainReportGen.setText("Complain Report genaration");

        btnMakeNewItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMakeNewItem.setText("Item");
        btnMakeNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeNewItemActionPerformed(evt);
            }
        });

        btnOnDemandItems1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOnDemandItems1.setText("On demand items");

        btnVeiwRemainStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVeiwRemainStock.setText("View remain stock");

        btnRep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRep.setText("My Employees");
        btnRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepActionPerformed(evt);
            }
        });

        btnGetDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGetDetails.setText("Get Details");

        txtLogAs.setEditable(false);
        txtLogAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogAsActionPerformed(evt);
            }
        });

        btnPlaceAnOrder1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlaceAnOrder1.setText("Place an order");

        btnVeiwRemainStock1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVeiwRemainStock1.setText("User Account Setting");
        btnVeiwRemainStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiwRemainStock1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnIssueItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddItemToStore, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOnDemandItems1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreateNewRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalesReportGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMakeNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVeiwRemainStock, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreateNewCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComplainReportGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPlaceAnOrder1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(btnRep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVeiwRemainStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLogAs, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItemToStore, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateNewRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalesReportGen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIssueItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateNewCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplainReportGen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOnDemandItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMakeNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVeiwRemainStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceAnOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVeiwRemainStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

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

    private void btnRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepActionPerformed
        EmployeeFrame emp=new EmployeeFrame();
        emp.pack();
        emp.setLocationRelativeTo(null);
        emp.setVisible(true);
        this.dispose();
        /*Rep rep=new Rep();
        rep.pack();
        rep.setLocationRelativeTo(null);
        this.dispose();
        rep.setVisible(true);*/
        
    }//GEN-LAST:event_btnRepActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame lf=new LoginFrame();
        lf.pack();
        lf.setLocationRelativeTo(null);
        this.dispose();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtLogAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogAsActionPerformed
        
    }//GEN-LAST:event_txtLogAsActionPerformed

    private void btnVeiwRemainStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiwRemainStock1ActionPerformed
        // TODO add your handling code here:
        AgentAccountSetting aaset= new AgentAccountSetting();
        aaset.pack();
        aaset.setLocationRelativeTo(null);
        this.dispose();
        aaset.setVisible(true);
    }//GEN-LAST:event_btnVeiwRemainStock1ActionPerformed

    private void btnMakeNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeNewItemActionPerformed
        // TODO add your handling code here:
        ItemTable it=new ItemTable();
        it.pack();
        it.setLocationRelativeTo(null);
        it.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMakeNewItemActionPerformed

    private void btnCreateNewCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewCompanyActionPerformed
        // TODO add your handling code here:
        CompanyFrame cf=new CompanyFrame();
        cf.pack();
        cf.setLocationRelativeTo(null);
        cf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreateNewCompanyActionPerformed

    private void btnAddItemToStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemToStoreActionPerformed
        AddToStore ats=new AddToStore();
        ats.pack();
        ats.setLocationRelativeTo(null);
        ats.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddItemToStoreActionPerformed

    private void btnIssueItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueItems1ActionPerformed
        IssueItem iitm = new IssueItem();
        iitm.pack();
        iitm.setLocationRelativeTo(null);
        iitm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIssueItems1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgentSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentSelectionWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItemToStore;
    private javax.swing.JButton btnComplainReportGen;
    private javax.swing.JButton btnCreateNewCompany;
    private javax.swing.JButton btnCreateNewRoute;
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JButton btnIssueItems1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakeNewItem;
    private javax.swing.JButton btnOnDemandItems1;
    private javax.swing.JButton btnPlaceAnOrder1;
    private javax.swing.JButton btnRep;
    private javax.swing.JButton btnSalesReportGen;
    private javax.swing.JButton btnVeiwRemainStock;
    private javax.swing.JButton btnVeiwRemainStock1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogAs;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the txtLogAs
     */
    public javax.swing.JTextField getTxtLogAs() {
        return txtLogAs;
    }

    /**
     * @param txtLogAs the txtLogAs to set
     */
    public void setTxtLogAs(String txtLogAs) {
        this.txtLogAs.setText(txtLogAs);
    }
}
