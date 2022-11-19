/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AirCompany;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author HP
 */
public class Route extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
//    DoctorDirectory dlist;
//    
//    public People(DoctorDirectory dlist) {
//        initComponents();
//        
//        this.dlist = dlist;
//        
//        populateTable();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtDepature = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoute = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        txtFlyTime = new javax.swing.JTextField();
        txtAirType = new javax.swing.JTextField();
        lblId8 = new javax.swing.JLabel();
        lblId17 = new javax.swing.JLabel();
        txtDepTime = new javax.swing.JTextField();
        lblId18 = new javax.swing.JLabel();
        txtFallTime = new javax.swing.JTextField();
        lblId19 = new javax.swing.JLabel();
        txtRN = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airline Route");

        btnDelete.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtDepature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepatureKeyPressed(evt);
            }
        });

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("FLY TIME");

        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("DESTINATION");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("DEPARTURE");

        tblRoute.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ROUTE NAME", "DEPARTURE", "DEPARTURE TIME", "DESTINATION", "FALL TIME", "FLY TIME", "AIPLANE TYPE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRouteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoute);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearchContent.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        lblSearchContent.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchContent.setText("Search Content:");

        lblId8.setForeground(new java.awt.Color(255, 255, 255));
        lblId8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId8.setText("AIRPLANE TYPE");

        lblId17.setForeground(new java.awt.Color(255, 255, 255));
        lblId17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId17.setText("DEPARTURE TIME");

        txtDepTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepTimeKeyPressed(evt);
            }
        });

        lblId18.setForeground(new java.awt.Color(255, 255, 255));
        lblId18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId18.setText("FALL TIME");

        lblId19.setForeground(new java.awt.Color(255, 255, 255));
        lblId19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId19.setText("ROUTE NAME");

        txtRN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRNKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(31, 31, 31)
                        .addComponent(btnDelete)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFlyTime, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblId8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAirType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblId19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtRN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDepature, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(lblId18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFallTime, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblId17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(156, 156, 156)
                                .addComponent(lblSearchContent)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(lblSearchContent)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId19))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtDepTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId1)
                    .addComponent(txtFallTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId2)
                    .addComponent(txtFlyTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAirType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId8))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRoute.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        
        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblRoute.getModel();
        //delete row
        if(tblRoute.getSelectedRowCount()==1){
            //if single row is selected then delete
            tblModel.removeRow(tblRoute.getSelectedRow());
            JOptionPane.showMessageDialog(this,"This Doctor Deleted.");
        }else{
            if(tblRoute.getRowCount()==0){
                //if table is empty then display message
                JOptionPane.showMessageDialog(this, "Table is Empty!");  
            }else{
                //if table is not empty but other than one row is selected
                JOptionPane.showMessageDialog(this, "Please Select Single Row for Delete!");
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //Get table Model1
        DefaultTableModel tblModel = (DefaultTableModel)tblRoute.getModel();
//        if(tblDoctor.getSelectedRowCount() == 1){
//            //If single row is selected then update
//            
//            int id = Integer.parseInt(txtId.getText());
//            String name = txtName.getText();
//            //Gender
//            String gender = txtGender.getText();
//            int age = Integer.parseInt(txtAge.getText());
//            long phoneNumber = Long.parseLong(txtPhone.getText());
//            String password = txtPassword.getText();
//            String field = txtField.getText();
//            String standard = txtStandard.getText();
//            double fee = Double.parseDouble(txtFee.getText());
//            
//            
//            //Set updated value on table row
//            tblModel.setValueAt(id, tblDoctor.getSelectedRow(), 0);
//            tblModel.setValueAt(name, tblDoctor.getSelectedRow(), 1);
//            tblModel.setValueAt(gender, tblDoctor.getSelectedRow(), 2);
//            tblModel.setValueAt(age, tblDoctor.getSelectedRow(), 3);
//            tblModel.setValueAt(phoneNumber, tblDoctor.getSelectedRow(), 4);
//            tblModel.setValueAt(password, tblDoctor.getSelectedRow(), 5);
//            tblModel.setValueAt(field, tblDoctor.getSelectedRow(), 6);
//            tblModel.setValueAt(standard, tblDoctor.getSelectedRow(), 7);
//            tblModel.setValueAt(fee, tblDoctor.getSelectedRow(), 8);
//            
//            
//            
//            //Update data display
//            JOptionPane.showMessageDialog(this,"Update Successfully!");
//            
//        }else{
//            if(tblDoctor.getSelectedRowCount() == 0){
//                //if table is empty.
//                JOptionPane.showMessageDialog(this,"Please Select an Doctor.");
//            }else{
//                //if multiple rows are selected.
//                JOptionPane.showMessageDialog(this,"Please Select Single Row for Update!");
//            }
//        }
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
//        try{
//            int id = Integer.parseInt(txtId.getText());
//            int age = Integer.parseInt(txtAge.getText());
//        }catch (NumberFormatException exe)
//        {           
//            JOptionPane.showMessageDialog(this, "Datatype of Id/Age should be int!");
//            return;
//        }
//        try{
//            long phoneNumber = Long.parseLong(txtPhone.getText());
//        }catch (NumberFormatException exe)
//        {           
//            JOptionPane.showMessageDialog(this, "Datatype of Phone/SSA Number should be long!");
//            return;
//        }
//        try{
//            double fee = Double.parseDouble(txtFee.getText());
//        }catch (NumberFormatException exe)
//        {           
//            JOptionPane.showMessageDialog(this, "Datatype of Fee should be double!");
//            return;
//        }
        
//        if(txtId.getText().equals("")||
//                txtName.getText().equals("")||
//                txtGender.getText().equals("")||
//                txtAge.getText().equals("")||
//                txtPhone.getText().equals("")||
//                txtPassword.getText().equals("")||
//                txtField.getText().equals("")||
//                txtStandard.getText().equals("")||
//                txtFee.getText().equals("")){
//            JOptionPane.showMessageDialog(null, "Please Set All Data!");
//        }else{
//            JOptionPane.showMessageDialog(null, "Successfully Stored!");
//        }

//        int id = Integer.parseInt(txtId.getText());
//        String name = txtName.getText();
//        String gender = txtGender.getText();
//        int age = Integer.parseInt(txtAge.getText());
//        long phoneNumber = Long.parseLong(txtPhone.getText());
//        String password = txtPassword.getText();
//        String field = txtField.getText();
//        String standard = txtStandard.getText();
//        double fee = Double.parseDouble(txtFee.getText());
//
//        person.doctor.Doctor dc = dlist.addDoctor();
//
//        dc.setId(id);
//        dc.setName(name);
//        dc.setGender(gender);
//        dc.setAge(age);
//        dc.setPhoneNumber(phoneNumber);
//        dc.setPassword(password);
//        dc.setField(field);
//        dc.setStandard(standard);
//        dc.setFee(fee);
//        dc.setRole("DOCTOR");
        

        JOptionPane.showMessageDialog(this, "New Doctor Profile added");
        
        

//        txtId.setText("");
//        txtName.setText("");
//        //buttonGroup1.setClear();
//        txtGender.setText("");
//        txtAge.setText("");
//        txtPhone.setText("");
//        txtPassword.setText("");
//        txtField.setText("");
//        txtStandard.setText("");
//        txtFee.setText("");
        
        populateTable();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRouteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblRoute.getModel();
        
        //Set data to text field when raw is selected
        String tblId = tblModel.getValueAt(tblRoute.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(tblRoute.getSelectedRow(), 1).toString();
        String tblGender = tblModel.getValueAt(tblRoute.getSelectedRow(), 2).toString();
        String tblAge = tblModel.getValueAt(tblRoute.getSelectedRow(), 3).toString();
        String tblPhone = tblModel.getValueAt(tblRoute.getSelectedRow(), 4).toString();
        String tblPassword = tblModel.getValueAt(tblRoute.getSelectedRow(), 5).toString();
        String tblField = tblModel.getValueAt(tblRoute.getSelectedRow(), 6).toString();
        String tblStandard = tblModel.getValueAt(tblRoute.getSelectedRow(), 7).toString();
        String tblFee = tblModel.getValueAt(tblRoute.getSelectedRow(), 8).toString();
        
        
        
        //Set to text field
//        txtId.setText(tblId);
//        txtName.setText(tblName);
//        txtGender.setText(tblGender);
//        txtAge.setText(tblAge);
//        txtPhone.setText(tblPhone);
//        txtPassword.setText(tblPassword);
//        txtField.setText(tblField);
//        txtStandard.setText(tblStandard);
//        txtFee.setText(tblFee);
        
    }//GEN-LAST:event_tblRouteMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblRoute.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblRoute.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtDepatureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepatureKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepatureKeyPressed

    private void txtDepTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepTimeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepTimeKeyPressed

    private void txtRNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRNKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId17;
    private javax.swing.JLabel lblId18;
    private javax.swing.JLabel lblId19;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblRoute;
    private javax.swing.JTextField txtAirType;
    private javax.swing.JTextField txtDepTime;
    private javax.swing.JTextField txtDepature;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFallTime;
    private javax.swing.JTextField txtFlyTime;
    private javax.swing.JTextField txtRN;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblRoute.getModel();
        model.setRowCount(0);
        
//        for (Doctor dc : dlist.getDlist()){
//            Object[] row = new Object[9];
//            row[0] = dc.getId();
//            row[1] = dc.getName();
//            row[2] = dc.getGender();
//            row[3] = dc.getAge();
//            row[4] = dc.getPhoneNumber();
//            row[5] = dc.getPassword();
//            row[6] = dc.getField();
//            row[7] = dc.getStandard();
//            row[8] = dc.getFee();
//            
//            model.addRow(row);
//        }
        
    }
}
