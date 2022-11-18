/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AirCompany;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author HP
 */
public class Income extends javax.swing.JPanel {

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
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirplane = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        txtAge2 = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtId1 = new javax.swing.JTextField();
        lblId7 = new javax.swing.JLabel();
        lblId8 = new javax.swing.JLabel();
        lblId9 = new javax.swing.JLabel();
        lblId10 = new javax.swing.JLabel();
        txtAge3 = new javax.swing.JTextField();
        lblId11 = new javax.swing.JLabel();
        txtAge4 = new javax.swing.JTextField();
        lblId12 = new javax.swing.JLabel();
        txtAge5 = new javax.swing.JTextField();
        lblId13 = new javax.swing.JLabel();
        lblId14 = new javax.swing.JLabel();
        lblId15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Income");

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

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("TOTAL INCOME");

        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("HUMAN COST");

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("FLIGHT COST");

        tblAirplane.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COMPANY", "TYPE", "SEATS", "FUEL CONSUMPTION", "PRICE", "SERVICE LIFE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAirplane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAirplaneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAirplane);

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
        lblSearchContent.setText("Search Content:");

        txtId1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtId1KeyPressed(evt);
            }
        });

        lblId7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId7.setText("TICKET PRICE");

        lblId8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId8.setText("QUANTITY");

        lblId9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId9.setText("TICKET PRICE");

        lblId10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId10.setText("QUANTITY");

        lblId11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId11.setText("QUANTITY");

        lblId12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId12.setText("TICKET PRICE");

        lblId13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId13.setText("FIRST CLASS");

        lblId14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId14.setText("ECONOMY CLASS");

        lblId15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId15.setText("BUSINESS CLASS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(31, 31, 31)
                                .addComponent(btnDelete)
                                .addGap(30, 30, 30)
                                .addComponent(btnUpdate)
                                .addGap(156, 156, 156)
                                .addComponent(lblSearchContent)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblId11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblId14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblId10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lblId9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblId15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(191, 191, 191))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblId8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblId7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblId13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255))))
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
                .addGap(37, 37, 37)
                .addComponent(lblId13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId2)
                            .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId8))
                        .addGap(18, 18, 18)
                        .addComponent(lblId15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblId14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAirplane.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        
        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblAirplane.getModel();
        //delete row
        if(tblAirplane.getSelectedRowCount()==1){
            //if single row is selected then delete
            tblModel.removeRow(tblAirplane.getSelectedRow());
            JOptionPane.showMessageDialog(this,"This Doctor Deleted.");
        }else{
            if(tblAirplane.getRowCount()==0){
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
        DefaultTableModel tblModel = (DefaultTableModel)tblAirplane.getModel();
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

    private void tblAirplaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAirplaneMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblAirplane.getModel();
        
        //Set data to text field when raw is selected
        String tblId = tblModel.getValueAt(tblAirplane.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(tblAirplane.getSelectedRow(), 1).toString();
        String tblGender = tblModel.getValueAt(tblAirplane.getSelectedRow(), 2).toString();
        String tblAge = tblModel.getValueAt(tblAirplane.getSelectedRow(), 3).toString();
        String tblPhone = tblModel.getValueAt(tblAirplane.getSelectedRow(), 4).toString();
        String tblPassword = tblModel.getValueAt(tblAirplane.getSelectedRow(), 5).toString();
        String tblField = tblModel.getValueAt(tblAirplane.getSelectedRow(), 6).toString();
        String tblStandard = tblModel.getValueAt(tblAirplane.getSelectedRow(), 7).toString();
        String tblFee = tblModel.getValueAt(tblAirplane.getSelectedRow(), 8).toString();
        
        
        
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
        
    }//GEN-LAST:event_tblAirplaneMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblAirplane.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblAirplane.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtId1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtId1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId1KeyPressed


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
    private javax.swing.JLabel lblId10;
    private javax.swing.JLabel lblId11;
    private javax.swing.JLabel lblId12;
    private javax.swing.JLabel lblId13;
    private javax.swing.JLabel lblId14;
    private javax.swing.JLabel lblId15;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId7;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblId9;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblAirplane;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtAge2;
    private javax.swing.JTextField txtAge3;
    private javax.swing.JTextField txtAge4;
    private javax.swing.JTextField txtAge5;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblAirplane.getModel();
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
