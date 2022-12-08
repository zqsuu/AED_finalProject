/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmim;


import ui.Customer.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Customer;


/**
 *
 * @author HP
 */
public class ReservationUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Customer reservationList;
    
    public ReservationUi(Customer reservationList) {
        initComponents();
        
        this.reservationList = reservationList;
        reservationCount();
        displayReservation();
        displayComList();
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
        txtName = new javax.swing.JTextField();
        txtPassport = new javax.swing.JTextField();
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservation = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        lblId7 = new javax.swing.JLabel();
        lblId8 = new javax.swing.JLabel();
        lblId10 = new javax.swing.JLabel();
        lblId6 = new javax.swing.JLabel();
        lblId11 = new javax.swing.JLabel();
        cbRoute = new javax.swing.JComboBox<>();
        cbClass = new javax.swing.JComboBox<>();
        lblId14 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        lblId12 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblId13 = new javax.swing.JLabel();
        cbCompany = new javax.swing.JComboBox<>();
        btnSave1 = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        cbSeat = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Reservation");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("PASSPORT");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("NAME");

        tblReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Reservation Id", "CUSTOMER NAME", "PASSWORD", "DATE", "STATE", "COMPANY", "ROUTE", "CLASS", "PRICE", "SEAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservation);

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

        lblId7.setForeground(new java.awt.Color(255, 255, 255));
        lblId7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId7.setText("SEAT");

        lblId8.setForeground(new java.awt.Color(255, 255, 255));
        lblId8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId8.setText("COMPANY");

        lblId10.setForeground(new java.awt.Color(255, 255, 255));
        lblId10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId10.setText("CLASS");

        lblId6.setForeground(new java.awt.Color(255, 255, 255));
        lblId6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId6.setText("ROUTE");

        lblId11.setForeground(new java.awt.Color(255, 255, 255));
        lblId11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId11.setText("CUSTOMER");

        cbRoute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a route>", " " }));

        cbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a class>", "FIRST CLASS", "BUSINESS CLASS", "ENCONOMY CLASS", " " }));

        lblId14.setForeground(new java.awt.Color(255, 255, 255));
        lblId14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId14.setText("DATE");

        lblId12.setForeground(new java.awt.Color(255, 255, 255));
        lblId12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId12.setText("PRICE");

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });

        lblId13.setForeground(new java.awt.Color(255, 255, 255));
        lblId13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId13.setText("FLIGHT");

        cbCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a company>" }));

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

        btnUpdate1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        cbSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a seat>", "A", "B", "C", "D", "E", "F", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSave1)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnDelete1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRetrieve)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnClear)))
                                .addGap(30, 30, 30)
                                .addComponent(btnUpdate1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearchContent)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblId6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblId10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblId12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblId7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblId8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblId13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblId14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 386, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId1))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId14)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId8)
                            .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId6)
                            .addComponent(cbRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId7)
                            .addComponent(cbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;

    int idreservation = 0;
    int reservationId = 0;

    private void reservationCount() {
        try {
            st1 = (Statement) con.createStatement();
            rs1 = st.executeQuery("select Max(idreservation) from airlinedb1.flightreservation");
            rs1.next();
            idreservation = rs1.getInt(1) + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void displayReservation() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select * from airlinedb1.flightreservation");
            tblReservation.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtName.setText("");
        txtPassport.setText("");
        jDateChooser.setDateFormatString("");
        cbCompany.setSelectedItem("<choose a company>");
        cbRoute.setSelectedItem("<choose a route>");
        cbClass.setSelectedItem("<choose a class>");
        txtPrice.setText("");
        cbSeat.setSelectedItem("<choose a seat>");
    }
    
    private void displayComList() {
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
    
    private void displayRouteList() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select * from airlinedb1.route Where company = " + cbCompany.getSelectedItem().toString());
            while (rs.next()) {
                cbRoute.addItem(rs.getString("routename"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void tblReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationMouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel tblModel = (DefaultTableModel)tblReservation.getModel();
            
            //Set data to text field when raw is selected
            reservationId = Integer.parseInt(tblModel.getValueAt(tblReservation.getSelectedRow(), 0).toString());
            String tblName = tblModel.getValueAt(tblReservation.getSelectedRow(), 1).toString();
            String tblPassport = tblModel.getValueAt(tblReservation.getSelectedRow(), 2).toString();
            Date tblDate = new SimpleDateFormat("yyyy-mm-dd").parse(tblModel.getValueAt(tblReservation.getSelectedRow(), 3).toString());
            String tblCompany = tblModel.getValueAt(tblReservation.getSelectedRow(), 4).toString();
            String tblRoute = tblModel.getValueAt(tblReservation.getSelectedRow(), 5).toString();
            String tblClass = tblModel.getValueAt(tblReservation.getSelectedRow(), 6).toString();
            String tblPrice = tblModel.getValueAt(tblReservation.getSelectedRow(), 7).toString();
            String tblSeat = tblModel.getValueAt(tblReservation.getSelectedRow(), 8).toString();
            
            
            
            //Set to text field
            txtName.setText(tblName);
            txtPassport.setText(tblPassport);
            jDateChooser.setDate(tblDate);
            cbCompany.setSelectedItem(tblCompany);
            cbRoute.setSelectedItem(tblRoute);
            cbClass.setSelectedItem(tblClass);
            txtPrice.setText(tblPrice);
            cbSeat.setSelectedItem(tblSeat);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationUi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tblReservationMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblReservation.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyPressed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:

        if (txtName.getText().equals("")
            || txtPassport.getText().equals("")
            || jDateChooser.getDate().equals("")
            || cbCompany.getSelectedItem().equals("<choose a company>")
            || cbRoute.getSelectedItem().equals("<choose a route>")
            || cbClass.getSelectedItem().equals("<choose a class>")
            || txtPrice.getText().equals("")
            || cbSeat.getSelectedItem().equals("<choose a seat>")) {
            JOptionPane.showMessageDialog(null, "Please Set All Data!");
        } else {
            try {
                reservationCount();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");

                PreparedStatement add = (PreparedStatement) con.prepareStatement("insert into flightreservation values(?,?,?,?,?,?,?,?,?,?)");
                add.setInt(1, idreservation);
                add.setString(2, txtName.getText());
                add.setString(3, txtPassport.getText());
                add.setString(4, jDateChooser.getDate().toString());
                add.setString(5, cbCompany.getSelectedItem().toString());
                add.setString(6, cbRoute.getSelectedItem().toString());
                add.setString(7, cbClass.getSelectedItem().toString());
                add.setString(8, txtPrice.getText());
                add.setString(9, cbSeat.getSelectedItem().toString());
                

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Reservation saved successfully!");
                con.close();
                displayReservation();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tblReservation.getModel();
        displayReservation();
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblReservation.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        //Get tblList first
        DefaultTableModel tblModel = (DefaultTableModel) tblReservation.getModel();
        //delete row
        if (tblReservation.getSelectedRowCount() == 1) {
            //if single row is selected then delete
            //            tblModel.removeRow(tblRoute.getSelectedRow());
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
                String query = "delete from airlinedb1.flightreservation where idreservation = " + reservationId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Reservation deleted successfully!");
                displayReservation();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "This Reservation Deleted.");
        } else {
            if (tblReservation.getRowCount() == 0) {
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
        DefaultTableModel tblModel = (DefaultTableModel) tblReservation.getModel();
        reservationId = Integer.parseInt(tblModel.getValueAt(tblReservation.getSelectedRow(), 1).toString());
        if (reservationId != 0) {
            //If single row is selected then update

            String name = txtName.getText();
            String passport = txtPassport.getText();
            String date = jDateChooser.getDate().toString();
            String company = cbCompany.getSelectedItem().toString();
            String route = cbRoute.getSelectedItem().toString();
            String flightClass = cbClass.getSelectedItem().toString();
            int price = Integer.parseInt(txtPrice.getText());
            String seat = cbSeat.getSelectedItem().toString();

            try {
                //ssl error
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1?autoReconnect=true&useSSL=false", "root", "Airline3306");
                String query = "UPDATE flightreservation SET passengername = '" + name + "'" + ",passport = '" + passport + "'" + ",date = '" + date + "'" + ",company = '" + company + "'" 
                        + ",route = '" + route + "'" + ",class = '" + flightClass + "'" + ",price = '" + price + "'" + ",seat = '" + seat + "'" + " WHERE idreservation = " + reservationId;
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Reservation updated successfully!");
                displayReservation();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try{
                if (tblReservation.getSelectedRow() == 0) {
                    //if table is empty.
                    JOptionPane.showMessageDialog(this, "Please Select a Reservation.");
                } else {
                    //if multiple rows are selected.
                    JOptionPane.showMessageDialog(this, "Please Select Single Row for Update!");
                }
            } catch(Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbClass;
    private javax.swing.JComboBox<String> cbCompany;
    private javax.swing.JComboBox<String> cbRoute;
    private javax.swing.JComboBox<String> cbSeat;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId10;
    private javax.swing.JLabel lblId11;
    private javax.swing.JLabel lblId12;
    private javax.swing.JLabel lblId13;
    private javax.swing.JLabel lblId14;
    private javax.swing.JLabel lblId6;
    private javax.swing.JLabel lblId7;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblReservation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassport;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
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
