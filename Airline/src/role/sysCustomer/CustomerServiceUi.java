/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package role.sysCustomer;

import ui.customer.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Airport;
import model.AirportList;
import model.AirportService;
import model.Customer;


/**
 *
 * @author HP
 */
public class CustomerServiceUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    

    String customer;
    
    Connection con;
    Statement st;
    
    public CustomerServiceUi(){
        
        initComponents();
        
        
        
        
        cbAirport.removeAllItems();
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            st = (Statement) con.createStatement();
            
            populateTable();
            
            ResultSet rs = st.executeQuery("Select * from airlinedb1.airport");
            while(rs.next()){
                cbAirport.addItem(rs.getString("name"));
            }
            
            String content;
            String[] time;
            
            
            
            
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerService = new javax.swing.JTable();
        lblSearchContent = new javax.swing.JLabel();
        cbAirport = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Service");

        tblCustomerService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "AIRPORT", "SHUTTLE BUS", "LUGGAGE STORAGE", "FOOD SERVICE", "CHECK-IN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomerService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomerService);

        lblSearchContent.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        lblSearchContent.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchContent.setText("Airport");

        cbAirport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAirportItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(531, 531, 531)
                .addComponent(lblSearchContent)
                .addGap(18, 18, 18)
                .addComponent(cbAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchContent)
                    .addComponent(cbAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(373, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCustomerServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerServiceMouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_tblCustomerServiceMouseClicked

    private void cbAirportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAirportItemStateChanged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cbAirportItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbAirport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JTable tblCustomerService;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel)tblCustomerService.getModel();
        model.setRowCount(0);
        
        try{
            ResultSet rs = st.executeQuery("Select * from airlinedb1.customerservice");
            while(rs.next()){
                
                    Object[] row = new Object[5];
                    row[0] = rs.getString("airport");
                    row[1] = rs.getString("bus");
                    row[2] = rs.getString("luggage");
                    row[3] = rs.getString("food");
                    row[4] = rs.getString("check");
                    model.addRow(row);   
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
 
        }      
        
    }
}
