/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package role.sysCompany;

import ui.AirCompany.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.AirlineCompany;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class EmployeeUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    AirlineCompany employeeList;
    String airport;

    public EmployeeUi() {
        initComponents();
        displayEmployee();
        employeeCount();
        clear();

//        populateTable();
    }

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
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblId5 = new javax.swing.JLabel();
        lblId3 = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox<>();
        lblId6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCrew = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        lblId7 = new javax.swing.JLabel();
        txtFlyYears = new javax.swing.JTextField();
        btnSave1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblId8 = new javax.swing.JLabel();
        txtRoute = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Crew");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("GENDER");

        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("NAME");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("ID");

        lblId5.setForeground(new java.awt.Color(255, 255, 255));
        lblId5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId5.setText("PASSWORD");

        lblId3.setForeground(new java.awt.Color(255, 255, 255));
        lblId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId3.setText("AGE");

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a role>", "Captain", "Pilot", "Steward/Stewardess", " " }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        lblId6.setForeground(new java.awt.Color(255, 255, 255));
        lblId6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId6.setText("ROLE");

        tblCrew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Id", "ID", "NAME", "GENDER", "AGE", "ROLE", "FLY YEARS", "PASSWORD", "ROUTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCrew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCrewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCrew);

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

        lblSearchContent.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchContent.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        lblSearchContent.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchContent.setText("Search Content:");

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbtnFemale.setText("Female");

        buttonGroup1.add(rbtnMale);
        rbtnMale.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });

        lblId7.setForeground(new java.awt.Color(255, 255, 255));
        lblId7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId7.setText("FLY YEARS");

        btnSave1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSave1.setForeground(new java.awt.Color(0, 0, 0));
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnUpdate1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnRetrieve.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnRetrieve.setForeground(new java.awt.Color(0, 0, 0));
        btnRetrieve.setText("Retrieve");
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblId8.setForeground(new java.awt.Color(255, 255, 255));
        lblId8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId8.setText("ROUTE");

        txtRoute.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave1)
                                .addGap(31, 31, 31)
                                .addComponent(btnDelete1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRetrieve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear)))
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate1)
                        .addGap(156, 156, 156)
                        .addComponent(lblSearchContent)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblId3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblId8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblId6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbtnFemale)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbtnMale)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblId5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblId7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFlyYears, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(386, 392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSearchContent)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete1)
                            .addComponent(btnUpdate1)
                            .addComponent(btnSave1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetrieve)
                            .addComponent(btnClear))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(lblId6)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFlyYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId2)
                        .addComponent(rbtnFemale)
                        .addComponent(rbtnMale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId3)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;

    int idemployee = 0;
    int employeeId = 0;

    private void employeeCount() {
        try {
            st1 = (Statement) con.createStatement();
            rs1 = st.executeQuery("select Max(idemployee) from airlinedb1.employee");
            rs1.next();
            idemployee = rs1.getInt(1) + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void displayEmployee() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select idemployee,id,name,gender,age,role,flyyears,password,route from airlinedb1.employee ");
            tblCrew.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        buttonGroup1.clearSelection();
        cbRole.setSelectedItem("<choose a role>");
        txtFlyYears.setText("");
        txtPassword.setText("");
        txtRoute.setText("");

    }
    private void tblCrewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCrewMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblCrew.getModel();

        //Set data to text field when raw is selected
        employeeId = Integer.parseInt(tblModel.getValueAt(tblCrew.getSelectedRow(), 0).toString());
        String tblId = tblModel.getValueAt(tblCrew.getSelectedRow(), 1).toString();
        String tblName = tblModel.getValueAt(tblCrew.getSelectedRow(), 2).toString();
        String tblGender = tblModel.getValueAt(tblCrew.getSelectedRow(), 3).toString();
        String tblAge = tblModel.getValueAt(tblCrew.getSelectedRow(), 4).toString();
        String tblRole = tblModel.getValueAt(tblCrew.getSelectedRow(), 5).toString();
        String tblFlyYears = tblModel.getValueAt(tblCrew.getSelectedRow(), 6).toString();
        String tblPassword = tblModel.getValueAt(tblCrew.getSelectedRow(), 7).toString();
        String tblRoute = null;
        if (tblModel.getValueAt(tblCrew.getSelectedRow(), 8) == null) {
            tblRoute = null;
        } else {
            tblRoute = tblModel.getValueAt(tblCrew.getSelectedRow(), 8).toString();
        }

        //Set to text field
        txtId.setText(tblId);
        txtName.setText(tblName);
        if (tblGender.equals("Female")) {
            rbtnFemale.setSelected(true);
            rbtnMale.setSelected(false);
        } else if (tblGender.equals("Male")) {
            rbtnMale.setSelected(true);
            rbtnFemale.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please Correct Gender Message!");
        }
        txtAge.setText(tblAge);
        cbRole.setSelectedItem(tblRole);
        txtFlyYears.setText(tblFlyYears);
        txtPassword.setText(tblPassword);
        txtRoute.setText(tblRoute);


    }//GEN-LAST:event_tblCrewMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblCrew.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblCrew.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoleActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        try {
            int age = Integer.parseInt(txtAge.getText());
            int flyYears = Integer.parseInt(txtFlyYears.getText());
        } catch (NumberFormatException exe) {
            JOptionPane.showMessageDialog(this, "Datatype of Age/FlyYears should be int!");
            return;
        }

        if ((!(rbtnFemale.isSelected() || rbtnMale.isSelected()))
                || txtId.getText().equals("")
                || txtName.getText().equals("")
                || txtAge.getText().equals("")
                || cbRole.getSelectedItem().equals("<choose a role>")
                || txtFlyYears.getText().equals("")
                || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Set All Data!");
        } else {
            try {

                employeeCount();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
                PreparedStatement add = (PreparedStatement) con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?)");
                add.setInt(1, idemployee);
                add.setString(2, txtId.getText());
                add.setString(3, txtName.getText());
                String gender = null;
                if (rbtnFemale.isSelected()) {
                    gender = "Female";
                }
                if (rbtnMale.isSelected()) {
                    gender = "Male";
                }
                add.setString(4, gender);
                add.setString(5, txtAge.getText());
                add.setString(6, cbRole.getSelectedItem().toString());
                add.setString(7, txtFlyYears.getText());
                add.setString(8, txtPassword.getText());
                String route = txtRoute.getText();
                if (route.isEmpty()) {
                    add.setString(9, null);
                } else {
                    add.setString(9, route);
                }
                add.setString(10, employeeList.getName());
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Employee saved successfully!");
                con.close();
                displayEmployee();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCrew.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblCrew.getModel();
        //delete row
        if (tblCrew.getSelectedRowCount() == 1) {
            //if single row is selected then delete
            //            tblModel.removeRow(tblRoute.getSelectedRow());
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
                String query = "delete from airlinedb1.employee where idemployee = " + employeeId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
                displayEmployee();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "This Employee Deleted.");
        } else {
            if (tblCrew.getRowCount() == 0) {
                //if table is empty then display message
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            } else {
                //if table is not empty but other than one row is selected
                JOptionPane.showMessageDialog(this, "Please Select Single Row for Delete!");
            }
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        //Get table Model1
        DefaultTableModel tblModel = (DefaultTableModel) tblCrew.getModel();
        employeeId = Integer.parseInt(tblModel.getValueAt(tblCrew.getSelectedRow(), 0).toString());
        if (employeeId != 0) {
            //If single row is selected then update

            String id = txtId.getText();
            String name = txtName.getText();
            String gender = null;
            if (rbtnFemale.isSelected()) {
                gender = "Female";
            }
            if (rbtnMale.isSelected()) {
                gender = "Male";
            }
            int age = Integer.parseInt(txtAge.getText());
            String role = cbRole.getSelectedItem().toString();
            int flyYears = Integer.parseInt(txtFlyYears.getText());
            String password = txtPassword.getText();

            try {
                //ssl error
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1?autoReconnect=true&useSSL=false", "root", "Airline3306");
                String query = "UPDATE employee SET id = '" + id + "'" + ",name = '" + name + "'" + ",gender = '" + gender + "'" + ",age = '" + age + "'" + ",role = '" + role + "'" + ",flyyears = '" + flyYears + "'" + ",password = '" + password + "'" + " WHERE idemployee = " + employeeId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Employee updated successfully!");
                displayEmployee();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                if (tblCrew.getSelectedRow() == 0) {
                    //if table is empty.
                    JOptionPane.showMessageDialog(this, "Please Select an Employee.");
                } else {
                    //if multiple rows are selected.
                    JOptionPane.showMessageDialog(this, "Please Select Single Row for Update!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tblCrew.getModel();
        displayEmployee();
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblId5;
    private javax.swing.JLabel lblId6;
    private javax.swing.JLabel lblId7;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTable tblCrew;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFlyYears;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRoute;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblCrew.getModel();
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
