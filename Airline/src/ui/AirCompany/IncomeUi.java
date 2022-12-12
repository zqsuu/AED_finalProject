/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AirCompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.AirlineCompany;
import model.Airplane;
import model.Route;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author HP
 */
public class IncomeUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    AirlineCompany airlineCompany;
    
    Connection con;
    Statement st;
    
    ChartFrame chartFrame;

    public IncomeUi(AirlineCompany air){
        initComponents();
        airlineCompany = air;
        
        
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();

            
            ResultSet rs = st.executeQuery("Select * from airlinedb1.airplane");
            DefaultTableModel model = (DefaultTableModel)tblIncome.getModel();
            model.setRowCount(0);
            while(rs.next()){
                if(rs.getString("airplanecompany").equals(air.getName())){
                    if(!(rs.getString("route")==null)){
                        Object[] row = new Object[5];
                        row[0] = rs.getString("route");
                        row[4] = rs.getString("type");
                        model.addRow(row);
                    }  
                }
            }
            
            for(int i=0;i<model.getRowCount();i++){
                rs = st.executeQuery("Select * from airlinedb1.airplanetype");
                while(rs.next()){
                    if(rs.getString("type").equals(String.valueOf(model.getValueAt(i, 4)))){
                        model.setValueAt(rs.getInt("fuelconsumption"), i, 2);
                        model.setValueAt(rs.getInt("price"), i, 3);
                        break;
                    }
                }
                rs = st.executeQuery("Select * from airlinedb1.flightreservation");
                int inc = 0;
                while(rs.next()){
                    if(rs.getString("route").equals(String.valueOf(model.getValueAt(i, 0)))){
                        inc = inc+rs.getInt("price"); 
                    }
                }
                model.setValueAt(inc, i, 1);

            }
            int com = 0;
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for(int i=0;i<model.getRowCount();i++){
                com+=Integer.parseInt(String.valueOf(model.getValueAt(i, 1)))-Integer.parseInt(String.valueOf(model.getValueAt(i, 2)))-Integer.parseInt(String.valueOf(model.getValueAt(i, 3)));
                dataset.addValue(Integer.parseInt(String.valueOf(model.getValueAt(i, 1))), "A", String.valueOf(model.getValueAt(i, 0)));
                
            }
            txtCompanyIncome.setText(String.valueOf(com));
            JFreeChart chart = ChartFactory.createBarChart("Route Income", "Route", "Income", dataset);
            chartFrame = new ChartFrame("Test", chart);
            chartFrame.pack();
            

            
        }catch(Exception e){
            e.printStackTrace();
 
        }  
        
        
        
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
        lblId2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncome = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        txtCompanyIncome = new javax.swing.JTextField();
        txtRouteIncome = new javax.swing.JTextField();
        lblId3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Income");

        lblId2.setForeground(new java.awt.Color(255, 255, 255));
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId2.setText("ROUTE INCOME");

        tblIncome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ROUTE", "TICKET INCOME", "FUEL CONSUMPTION", "AIRPLANE COST", "AIRPLANE TYPE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIncomeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIncome);

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

        lblId3.setForeground(new java.awt.Color(255, 255, 255));
        lblId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId3.setText("COMPANY INCOME");

        jButton1.setText("Ticket Income Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCompanyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRouteIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(lblSearchContent)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(374, 374, 374)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchContent)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId3)
                    .addComponent(txtCompanyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRouteIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId2))
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblIncomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIncomeMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblIncome.getModel();
        
        int index = tblIncome.getSelectedRow();
        
        if(index<0){
            txtRouteIncome.setText("");
            return;
        }
        
        int income = Integer.parseInt(String.valueOf(tblModel.getValueAt(index, 1)))-Integer.parseInt(String.valueOf(tblModel.getValueAt(index, 2)))-Integer.parseInt(String.valueOf(tblModel.getValueAt(index, 3)));
        txtRouteIncome.setText(String.valueOf(income));
        
    }//GEN-LAST:event_tblIncomeMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        //Get tblList first
        DefaultTableModel model = (DefaultTableModel) tblIncome.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblIncome.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
        
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        chartFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblIncome;
    private javax.swing.JTextField txtCompanyIncome;
    private javax.swing.JTextField txtRouteIncome;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

  
}
