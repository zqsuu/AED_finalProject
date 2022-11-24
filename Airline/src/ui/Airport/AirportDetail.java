/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Airport;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author HP
 */
public class AirportDetail extends javax.swing.JPanel {

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
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirportDetail = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        txtSearch1 = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        txtSearch2 = new javax.swing.JTextField();
        txtSearch3 = new javax.swing.JTextField();
        lblId3 = new javax.swing.JLabel();
        lblId4 = new javax.swing.JLabel();
        txtSearch4 = new javax.swing.JTextField();
        lblId5 = new javax.swing.JLabel();
        txtSearch5 = new javax.swing.JTextField();
        lblId6 = new javax.swing.JLabel();
        txtSearch6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airport Detail");

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

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("AIRPORT NAME");

        tblAirportDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "AIRPORT NAME", "CITY", "ADDRESS", "ROUTE", "SERVICE", "ROUTE REQUEST"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAirportDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAirportDetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAirportDetail);

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

        txtSearch1.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtSearch1.setMargin(new java.awt.Insets(0, 0, 2, 0));
        txtSearch1.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        txtSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch1ActionPerformed(evt);
            }
        });
        txtSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch1KeyReleased(evt);
            }
        });

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("CITY");

        txtSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch2ActionPerformed(evt);
            }
        });
        txtSearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch2KeyReleased(evt);
            }
        });

        txtSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch3ActionPerformed(evt);
            }
        });
        txtSearch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch3KeyReleased(evt);
            }
        });

        lblId3.setForeground(new java.awt.Color(255, 255, 255));
        lblId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId3.setText("ADDRESS");

        lblId4.setForeground(new java.awt.Color(255, 255, 255));
        lblId4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId4.setText("ROUTE");

        txtSearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch4ActionPerformed(evt);
            }
        });
        txtSearch4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch4KeyReleased(evt);
            }
        });

        lblId5.setForeground(new java.awt.Color(255, 255, 255));
        lblId5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId5.setText("SERVICE");

        txtSearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch5ActionPerformed(evt);
            }
        });
        txtSearch5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch5KeyReleased(evt);
            }
        });

        lblId6.setForeground(new java.awt.Color(255, 255, 255));
        lblId6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId6.setText("ROUTE REQUEST");

        txtSearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch6ActionPerformed(evt);
            }
        });
        txtSearch6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch6KeyReleased(evt);
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
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblId6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId3)))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAirportDetail.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        
        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblAirportDetail.getModel();
        //delete row
        if(tblAirportDetail.getSelectedRowCount()==1){
            //if single row is selected then delete
            tblModel.removeRow(tblAirportDetail.getSelectedRow());
            JOptionPane.showMessageDialog(this,"This Doctor Deleted.");
        }else{
            if(tblAirportDetail.getRowCount()==0){
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
        DefaultTableModel tblModel = (DefaultTableModel)tblAirportDetail.getModel();
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

    private void tblAirportDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAirportDetailMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblAirportDetail.getModel();
        
        //Set data to text field when raw is selected
        String tblId = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 1).toString();
        String tblGender = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 2).toString();
        String tblAge = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 3).toString();
        String tblPhone = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 4).toString();
        String tblPassword = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 5).toString();
        String tblField = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 6).toString();
        String tblStandard = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 7).toString();
        String tblFee = tblModel.getValueAt(tblAirportDetail.getSelectedRow(), 8).toString();
        
        
        
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
        
    }//GEN-LAST:event_tblAirportDetailMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblAirportDetail.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblAirportDetail.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1ActionPerformed

    private void txtSearch1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1KeyPressed

    private void txtSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1KeyReleased

    private void txtSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch2ActionPerformed

    private void txtSearch2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch2KeyPressed

    private void txtSearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch2KeyReleased

    private void txtSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch3ActionPerformed

    private void txtSearch3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch3KeyPressed

    private void txtSearch3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch3KeyReleased

    private void txtSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch4ActionPerformed

    private void txtSearch4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch4KeyPressed

    private void txtSearch4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch4KeyReleased

    private void txtSearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch5ActionPerformed

    private void txtSearch5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch5KeyPressed

    private void txtSearch5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch5KeyReleased

    private void txtSearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch6ActionPerformed

    private void txtSearch6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch6KeyPressed

    private void txtSearch6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch6KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblId4;
    private javax.swing.JLabel lblId5;
    private javax.swing.JLabel lblId6;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblAirportDetail;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txtSearch2;
    private javax.swing.JTextField txtSearch3;
    private javax.swing.JTextField txtSearch4;
    private javax.swing.JTextField txtSearch5;
    private javax.swing.JTextField txtSearch6;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblAirportDetail.getModel();
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
