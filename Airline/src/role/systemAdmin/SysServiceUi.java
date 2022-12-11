/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package role.systemAdmin;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Airport;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class SysServiceUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Airport serviceList;
    String airportname;

    public SysServiceUi(Airport serviceList) {
        initComponents();
        displayService();
        serviceCount();
        clear();

        
        this.serviceList = serviceList;

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
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirportService = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        cbService = new javax.swing.JComboBox<>();
        txtRemark = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        chb58 = new javax.swing.JCheckBox();
        chb812 = new javax.swing.JCheckBox();
        chb1216 = new javax.swing.JCheckBox();
        chb1620 = new javax.swing.JCheckBox();
        chb2024 = new javax.swing.JCheckBox();
        chb05 = new javax.swing.JCheckBox();
        btnUpdate1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airport Service");

        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("TIME");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("SERVICE NAME");

        tblAirportService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Service Id", "SERVICE NAME", "TIME", "REMARK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAirportService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAirportServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAirportService);

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

        cbService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a service>", "SHUTTLE BUS", "LUGGAGE STORAGE", "FOOD SERVICE", "CHECK-IN" }));

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("REMARK");

        chb58.setText("5:00-8:00");
        chb58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb58ActionPerformed(evt);
            }
        });

        chb812.setText("8:00-12:00");
        chb812.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb812ActionPerformed(evt);
            }
        });

        chb1216.setText("12:00-16:00");
        chb1216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb1216ActionPerformed(evt);
            }
        });

        chb1620.setText("16:00-20:00");
        chb1620.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb1620ActionPerformed(evt);
            }
        });

        chb2024.setText("20:00-24:00");
        chb2024.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb2024ActionPerformed(evt);
            }
        });

        chb05.setText("0:00-5:00");
        chb05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb05ActionPerformed(evt);
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

        btnClear.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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

        btnSave1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSave1.setForeground(new java.awt.Color(0, 0, 0));
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chb1216)
                                    .addComponent(chb05))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chb58)
                                    .addComponent(chb1620))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chb2024)
                                    .addComponent(chb812)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbService, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(420, 420, 420))
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
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(cbService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId1)
                    .addComponent(chb812)
                    .addComponent(chb05)
                    .addComponent(chb58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb1216)
                    .addComponent(chb1620)
                    .addComponent(chb2024))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId2))
                .addGap(149, 149, 149))
        );
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;

    int idservice = 0;
    int serviceId = 0;

    private void serviceCount() {
        try {
            st1 = (Statement) con.createStatement();
            rs1 = st.executeQuery("select Max(idservice) from airlinedb1.airportservice");
            rs1.next();
            idservice = rs1.getInt(1) + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void displayService() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select * from airlinedb1.airportservice");
            tblAirportService.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        cbService.setSelectedItem("<choose a service>");
        txtRemark.setText("");
        chb05.setSelected(false);
        chb58.setSelected(false);
        chb812.setSelected(false);
        chb1216.setSelected(false);
        chb1620.setSelected(false);
        chb2024.setSelected(false);
    }
    private void tblAirportServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAirportServiceMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblAirportService.getModel();
        clear();

        //Set data to text field when raw is selected
        serviceId = Integer.parseInt(tblModel.getValueAt(tblAirportService.getSelectedRow(), 0).toString());
        String tblName = tblModel.getValueAt(tblAirportService.getSelectedRow(), 1).toString();
        String tblTime = tblModel.getValueAt(tblAirportService.getSelectedRow(), 2).toString();
        String tblRemark = tblModel.getValueAt(tblAirportService.getSelectedRow(), 3).toString();

        //Set to text field
        cbService.setSelectedItem(tblName);
        txtRemark.setText(tblRemark);
        if (tblTime.contains("0:00-5:00")) {
            chb05.setSelected(true);
        }
        if (tblTime.contains("5:00-8:00")) {
            chb58.setSelected(true);
        }
        if (tblTime.contains("8:00-12:00")) {
            chb812.setSelected(true);
        }
        if (tblTime.contains("12:00-16:00")) {
            chb1216.setSelected(true);
        }
        if (tblTime.contains("16:00-20:00")) {
            chb1620.setSelected(true);
        }
        if (tblTime.contains("20:00-24:00")) {
            chb2024.setSelected(true);
        }


    }//GEN-LAST:event_tblAirportServiceMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblAirportService.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblAirportService.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void chb58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb58ActionPerformed

    private void chb812ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb812ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb812ActionPerformed

    private void chb1216ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb1216ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb1216ActionPerformed

    private void chb1620ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb1620ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb1620ActionPerformed

    private void chb2024ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb2024ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb2024ActionPerformed

    private void chb05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb05ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        //Get table Model1
        DefaultTableModel tblModel = (DefaultTableModel) tblAirportService.getModel();

        serviceId = Integer.parseInt(tblModel.getValueAt(tblAirportService.getSelectedRow(), 0).toString());
        if (serviceId != 0) {
            //If single row is selected then update

            String name = "";
            if (cbService.getSelectedItem().equals("<choose a service>")) {
                JOptionPane.showMessageDialog(null, "Please Choose a Service!");
            } else {
                name = cbService.getSelectedItem().toString();
            }

            String time = "";
            if (chb05.isSelected()) {
                time += chb05.getText() + " ";
            }
            if (chb58.isSelected()) {
                time += chb58.getText() + " ";
            }
            if (chb812.isSelected()) {
                time += chb812.getText() + " ";
            }
            if (chb1216.isSelected()) {
                time += chb1216.getText() + " ";
            }
            if (chb1620.isSelected()) {
                time += chb1620.getText() + " ";
            }
            if (chb2024.isSelected()) {
                time += chb2024.getText() + " ";
            }
            String remark = txtRemark.getText();

            try {
                //ssl error
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1?autoReconnect=true&useSSL=false", "root", "Airline3306");
                String query = "UPDATE airportservice SET name = '" + name + "'" + ",time = '" + time + "'" + ",remark = '" + remark + "'" + " WHERE idservice = " + serviceId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Service updated successfully!");
                displayService();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                if (tblAirportService.getSelectedRow() == 0) {
                    //if table is empty.
                    JOptionPane.showMessageDialog(this, "Please Select a Service.");
                } else {
                    //if multiple rows are selected.
                    JOptionPane.showMessageDialog(this, "Please Select Single Row for Update!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAirportService.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblAirportService.getModel();
        //delete row
        if (tblAirportService.getSelectedRowCount() == 1) {
            //if single row is selected then delete
            //            tblModel.removeRow(tblRoute.getSelectedRow());
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
                String query = "delete from airlinedb1.airportservice where idservice = " + serviceId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Service deleted successfully!");
                displayService();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "This Service Deleted.");
        } else {
            if (tblAirportService.getRowCount() == 0) {
                //if table is empty then display message
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            } else {
                //if table is not empty but other than one row is selected
                JOptionPane.showMessageDialog(this, "Please Select Single Row for Delete!");
            }
        }

    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:

        if (cbService.getSelectedItem().equals("<choose a service>")) {
            JOptionPane.showMessageDialog(null, "Please Set All Data!");
        } else {
            try {
                //                int patKey = 1;
                serviceCount();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");

                PreparedStatement add = (PreparedStatement) con.prepareStatement("insert into airportservice values(?,?,?,?)");
                add.setInt(1, idservice);
                String service = "";
                if (cbService.getSelectedItem().equals("<choose a service>")) {
                    JOptionPane.showMessageDialog(null, "Please Choose a Service!");
                } else {
                    service = cbService.getSelectedItem().toString();
                }
                add.setString(2, service);
                String time = "";

                if (chb05.isSelected()) {
                    time += chb05.getText() + " ";
                }
                if (chb58.isSelected()) {
                    time += chb58.getText() + " ";
                }
                if (chb812.isSelected()) {
                    time += chb812.getText() + " ";
                }
                if (chb1216.isSelected()) {
                    time += chb1216.getText() + " ";
                }
                if (chb1620.isSelected()) {
                    time += chb1620.getText() + " ";
                }
                if (chb2024.isSelected()) {
                    time += chb2024.getText() + " ";
                }
                add.setString(3, time);
                add.setString(4, txtRemark.getText());

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Service saved successfully!");
                con.close();
                displayService();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tblAirportService.getModel();
        displayService();

    }//GEN-LAST:event_btnRetrieveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbService;
    private javax.swing.JCheckBox chb05;
    private javax.swing.JCheckBox chb1216;
    private javax.swing.JCheckBox chb1620;
    private javax.swing.JCheckBox chb2024;
    private javax.swing.JCheckBox chb58;
    private javax.swing.JCheckBox chb812;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblAirportService;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblAirportService.getModel();
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