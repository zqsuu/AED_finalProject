/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package role.systemAdmin;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import ui.AirCompany.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Airport;
import model.Route;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class SysArrivalsUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Airport arrivalsList;
    String airportname;

    public SysArrivalsUi(Airport arrivalsList) {
        initComponents();
        this.arrivalsList = arrivalsList;
        displayArrivals();
//        arrivalsCount();
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
        txtOrigin = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArrivals = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        lblId18 = new javax.swing.JLabel();
        txtFallTime = new javax.swing.JTextField();
        lblId19 = new javax.swing.JLabel();
        txtRN = new javax.swing.JTextField();
        btnRetrieve = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        cbTerminal = new javax.swing.JComboBox<>();
        cbBaggage = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Arrivals");

        txtOrigin.setEditable(false);
        txtOrigin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOriginKeyPressed(evt);
            }
        });

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("BAGGAGE");

        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId1.setText("FALL TERMINAL");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("ORIGIN");

        tblArrivals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Arrivals Id", "ROUTE NAME", "ORINGIN", "FALL TIME", "FALL TERMINAL", "BAGGAGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblArrivals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArrivalsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArrivals);

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

        lblId18.setForeground(new java.awt.Color(255, 255, 255));
        lblId18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId18.setText("FALL TIME");

        txtFallTime.setEditable(false);

        lblId19.setForeground(new java.awt.Color(255, 255, 255));
        lblId19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId19.setText("ROUTE NAME");

        txtRN.setEditable(false);
        txtRN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRNKeyPressed(evt);
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

        btnUpdate1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        cbTerminal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a terminal>", "T1", "T2", "T3" }));

        cbBaggage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<choose a baggage>", "A1", "A2", "B1", "B2", "C1", "C2", "D1", "D2", "E1", "E2" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRetrieve)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnClear))
                                    .addComponent(btnUpdate1))
                                .addGap(258, 258, 258)
                                .addComponent(lblSearchContent)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 386, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbTerminal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbBaggage, 0, 185, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFallTime, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                        .addComponent(btnUpdate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetrieve)
                            .addComponent(btnClear))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFallTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId18))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId1)
                    .addComponent(cbTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId2)
                    .addComponent(cbBaggage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;

    int idarrivals = 0;
    int arrivalsId = 0;

//    private void arrivalsCount() {
//        try {
//            st1 = (Statement) con.createStatement();
//            rs1 = st.executeQuery("select Max(idarrivals) from airlinedb1.route");
//            rs1.next();
//            idarrivals = rs1.getInt(1) + 1;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    private void displayArrivals() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("Select idkey,routename,departureairport,falltime,fallterminal,baggage from airlinedb1.route");
            tblArrivals.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtRN.setText("");
        txtOrigin.setText("");
        txtFallTime.setText("");
        cbTerminal.setSelectedItem("<choose a terminal>");
        cbBaggage.setSelectedItem("<choose a baggage>");
    }
    private void tblArrivalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArrivalsMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblArrivals.getModel();

        //Set data to text field when raw is selected
        arrivalsId = Integer.parseInt(tblModel.getValueAt(tblArrivals.getSelectedRow(), 0).toString());
        String tblRN = tblModel.getValueAt(tblArrivals.getSelectedRow(), 1).toString();
        String tblOrigin = tblModel.getValueAt(tblArrivals.getSelectedRow(), 2).toString();
        String tblFallTime = tblModel.getValueAt(tblArrivals.getSelectedRow(), 3).toString();
        String tblFallTerminal = tblModel.getValueAt(tblArrivals.getSelectedRow(), 4).toString();
        String tblBaggage = tblModel.getValueAt(tblArrivals.getSelectedRow(), 5).toString();

        //Set to text field
        txtRN.setText(tblRN);
        txtOrigin.setText(tblOrigin);
        txtFallTime.setText(tblFallTime);
        cbTerminal.setSelectedItem(tblFallTerminal);
        cbBaggage.setSelectedItem(tblBaggage);

    }//GEN-LAST:event_tblArrivalsMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblArrivals.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblArrivals.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtOriginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOriginKeyPressed

    private void txtRNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRNKeyPressed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tblArrivals.getModel();
        displayArrivals();
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        //Get table Model1
        DefaultTableModel tblModel = (DefaultTableModel) tblArrivals.getModel();
        arrivalsId = Integer.parseInt(tblModel.getValueAt(tblArrivals.getSelectedRow(), 0).toString());
        if (arrivalsId != 0) {
            //If single row is selected then update

            String routeName = txtRN.getText();
            String fallTerminal = cbTerminal.getSelectedItem().toString();
            String baggage = cbBaggage.getSelectedItem().toString();

            try {
                //ssl error
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1?autoReconnect=true&useSSL=false", "root", "Airline3306");
                String query = "UPDATE route SET fallterminal = '" + fallTerminal + "'" + ",baggage = '" + baggage + "'" + " WHERE routename = '" + routeName+"'";
                Statement add = (Statement) con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Arrival updated successfully!");
                displayArrivals();
                clear();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                if (tblArrivals.getSelectedRow() == 0) {
                    //if table is empty.
                    JOptionPane.showMessageDialog(this, "Please Select an Airport.");
                } else {
                    //if multiple rows are selected.
                    JOptionPane.showMessageDialog(this, "Please Select Single Row for Update!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbBaggage;
    private javax.swing.JComboBox<String> cbTerminal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId18;
    private javax.swing.JLabel lblId19;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblArrivals;
    private javax.swing.JTextField txtFallTime;
    private javax.swing.JTextField txtOrigin;
    private javax.swing.JTextField txtRN;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblArrivals.getModel();
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