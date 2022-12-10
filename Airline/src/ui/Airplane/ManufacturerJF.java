/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Airplane;

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
import model.Airplane;
import role.Manufacturer;
import net.proteanit.sql.DbUtils;
import ui.airline.LogIn;

/**
 *
 * @author HP
 */
public class ManufacturerJF extends javax.swing.JFrame {

    /**
     * Creates new form ManufacturerJF
     */
    AirlineCompany airplaneList;
    Airplane airplane;
    LogIn login;
    
    public ManufacturerJF() {
        initComponents();
        this.login = login;
        
    }
    
    public ManufacturerJF(LogIn login,Manufacturer manu,AirlineCompany airline,String type) {
        initComponents();
        this.login = login;
        this.airplaneList = airplaneList;
        this.airplane = airplane;
        airplaneCount();
        displayAirplane();
        displayCompanyList();
        clear();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();
        txtBusiness = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirplane = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        txtEco = new javax.swing.JTextField();
        txtRoute = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        lblId7 = new javax.swing.JLabel();
        lblId8 = new javax.swing.JLabel();
        lblId9 = new javax.swing.JLabel();
        txtFuel = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtLife = new javax.swing.JTextField();
        lblId10 = new javax.swing.JLabel();
        lblId11 = new javax.swing.JLabel();
        lblId12 = new javax.swing.JLabel();
        lblId3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cbCompany = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airplane");

        txtFirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirstKeyPressed(evt);
            }
        });

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("ECONOMY CLASS");

        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("BUSINESS CLASS");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("FIRST CLASS");

        tblAirplane.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airplane Id", "TYPE", "COMPANY", "ROUTE", "FUEL CONSUMPTION", "PRICE", "SERVICE LIFE", "FIRST CLASS", "BUSINESS CLASS", "ECONOMY CLASS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
        lblSearchContent.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchContent.setText("Search Content:");

        txtType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeKeyPressed(evt);
            }
        });

        lblId7.setForeground(new java.awt.Color(255, 255, 255));
        lblId7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId7.setText("COMPANY");

        lblId8.setForeground(new java.awt.Color(255, 255, 255));
        lblId8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId8.setText("TYPE");

        lblId9.setForeground(new java.awt.Color(255, 255, 255));
        lblId9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId9.setText("ROUTE");

        txtFuel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFuelKeyPressed(evt);
            }
        });

        lblId10.setForeground(new java.awt.Color(255, 255, 255));
        lblId10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId10.setText("SERVICE LIFE");

        lblId11.setForeground(new java.awt.Color(255, 255, 255));
        lblId11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId11.setText("PRICE");

        lblId12.setForeground(new java.awt.Color(255, 255, 255));
        lblId12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId12.setText("FUEL CONSUMPTION");

        lblId3.setForeground(new java.awt.Color(255, 255, 255));
        lblId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId3.setText("PASSENGER CAPACITY");

        btnSave.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        btnDelete.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a company>" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnDelete))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRetrieve)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnClear)))
                                .addGap(30, 30, 30)
                                .addComponent(btnUpdate)
                                .addGap(156, 156, 156)
                                .addComponent(lblSearchContent)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblId10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblId11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblId12))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLife, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblId7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtType, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtRoute, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(cbCompany, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblId1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblId3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblId2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSearchContent)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetrieve)
                            .addComponent(btnClear))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId2)
                            .addComponent(txtEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId7)
                            .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;

    int idairplane = 0;
    int airplaneId = 0;

    private void airplaneCount() {
        try {
            st1 = (Statement) con.createStatement();
            rs1 = st.executeQuery("select Max(idairplane) from airlinedb1.airplane");
            rs1.next();
            idairplane = rs1.getInt(1) + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void displayAirplane() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select * from airlinedb1.airplane");
            tblAirplane.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayCompanyList() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select * from airlinedb1.airlinecompany");
            while (rs.next()) {

                cbCompany.addItem(rs.getString("name"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtType.setText("");
        cbCompany.setSelectedItem("<choose a company>");
        txtRoute.setText("");
        txtFuel.setText("");
        txtPrice.setText("");
        txtLife.setText("");
        txtFirst.setText("");
        txtBusiness.setText("");
        txtEco.setText("");
    }
    
    
    private void txtFirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstKeyPressed

    private void tblAirplaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAirplaneMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblAirplane.getModel();

        //Set data to text field when raw is selected
        try {
            airplaneId = Integer.parseInt(tblModel.getValueAt(tblAirplane.getSelectedRow(), 0).toString());
            String tblType = tblModel.getValueAt(tblAirplane.getSelectedRow(), 1).toString();
            String tblCompany = tblModel.getValueAt(tblAirplane.getSelectedRow(), 2).toString();
            String tblRoute = tblModel.getValueAt(tblAirplane.getSelectedRow(), 3).toString();
            String tblFuel = tblModel.getValueAt(tblAirplane.getSelectedRow(), 4).toString();
            String tblPrice = tblModel.getValueAt(tblAirplane.getSelectedRow(), 5).toString();
            String tblLife = tblModel.getValueAt(tblAirplane.getSelectedRow(), 6).toString();
            String tblFirst = tblModel.getValueAt(tblAirplane.getSelectedRow(), 7).toString();
            String tblBusiness = tblModel.getValueAt(tblAirplane.getSelectedRow(), 8).toString();
            String tblEco = tblModel.getValueAt(tblAirplane.getSelectedRow(), 9).toString();

            txtType.setText(tblType);
            cbCompany.setSelectedItem(tblCompany);
            txtRoute.setText(tblRoute);
            txtFuel.setText(tblFuel);
            txtPrice.setText(tblPrice);
            txtLife.setText(tblLife);
            txtFirst.setText(tblFirst);
            txtBusiness.setText(tblBusiness);
            txtEco.setText(tblEco);

        } catch (Exception e) {
            e.printStackTrace();
        }

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
        clear();
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeKeyPressed

    private void txtFuelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        try {
            int fuel = Integer.parseInt(txtFuel.getText());
            int price = Integer.parseInt(txtPrice.getText());
            int life = Integer.parseInt(txtLife.getText());
            int first = Integer.parseInt(txtFirst.getText());
            int business = Integer.parseInt(txtBusiness.getText());
            int eco = Integer.parseInt(txtEco.getText());

        } catch (NumberFormatException exe) {
            JOptionPane.showMessageDialog(this, "Datatype of FuelConsumption/Price/Life/FirstClass/BusinessClass/EcoClass should be int!");
            return;
        }

        if (txtType.getText().equals("")
            || txtRoute.getText().equals("")
            || txtFuel.getText().equals("")
            || txtPrice.getText().equals("")
            || txtLife.getText().equals("")
            || txtFirst.getText().equals("")
            || txtBusiness.getText().equals("")
            || txtEco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Set All Data!");
        } else {
            try {
                airplaneCount();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
                PreparedStatement add = (PreparedStatement) con.prepareStatement("insert into airplane values(?,?,?,?,?,?,?,?,?,?)");

                add.setInt(1, idairplane);
                add.setString(2, txtType.getText());
                add.setString(3, cbCompany.getSelectedItem().toString());
                add.setString(4, txtRoute.getText());
                add.setString(5, txtFuel.getText());
                add.setString(6, txtPrice.getText());
                add.setString(7, txtLife.getText());
                add.setString(8, txtFirst.getText());
                add.setString(9, txtBusiness.getText());
                add.setString(10, txtEco.getText());

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Airplane solved successfully!");
                con.close();
                displayAirplane();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tblAirplane.getModel();
        displayAirplane();
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAirplane.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblAirplane.getModel();
        //delete row
        if (tblAirplane.getSelectedRowCount() == 1) {
            //if single row is selected then delete
            //            tblModel.removeRow(tblRoute.getSelectedRow());
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
                String query = "delete from airlinedb1.airplane where idairplane = " + airplaneId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Airplane deleted successfully!");
                displayAirplane();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "This Airplane Deleted.");
        } else {
            if (tblAirplane.getRowCount() == 0) {
                //if table is empty then display message
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            } else {
                //if table is not empty but other than one row is selected
                JOptionPane.showMessageDialog(this, "Please Select Single Row for Delete!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //Get table Model1
        DefaultTableModel tblModel = (DefaultTableModel) tblAirplane.getModel();
        airplaneId = Integer.parseInt(tblModel.getValueAt(tblAirplane.getSelectedRow(), 0).toString());
        if (airplaneId != 0) {
            //If single row is selected then update

            String type = txtType.getText();
            String company = cbCompany.getSelectedItem().toString();
            String route = txtRoute.getText();
            int fuel = Integer.parseInt(txtFuel.getText());
            int price = Integer.parseInt(txtPrice.getText());
            int life = Integer.parseInt(txtLife.getText());
            int first = Integer.parseInt(txtFirst.getText());
            int business = Integer.parseInt(txtBusiness.getText());
            int eco = Integer.parseInt(txtEco.getText());

            try {
                //ssl error
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1?autoReconnect=true&useSSL=false", "root", "Airline3306");
                String query = "UPDATE airplane SET type = '" + type + "'" + ",airplanecompany = '" + company + "'" + ",route = '" + route + "'" + ",fuelconsumption = '" + fuel + "'" + ",price = '" + price + "'" + ",servicelife = '" + life + "'" + ",firstclass = '" + first + "'" + ",businessclass = '" + business + "'" + ",economyclass = '" + eco + "'" + " WHERE idairplane = " + airplaneId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Airplane updated successfully!");
                displayAirplane();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                if (tblAirplane.getSelectedRow() == 0) {
                    //if table is empty.
                    JOptionPane.showMessageDialog(this, "Please Select an Airplane.");
                } else {
                    //if multiple rows are selected.
                    JOptionPane.showMessageDialog(this, "Please Select Single Row for Update!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ManufacturerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManufacturerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManufacturerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManufacturerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManufacturerJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId10;
    private javax.swing.JLabel lblId11;
    private javax.swing.JLabel lblId12;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblId7;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblId9;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblAirplane;
    private javax.swing.JTextField txtBusiness;
    private javax.swing.JTextField txtEco;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JTextField txtLife;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoute;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
