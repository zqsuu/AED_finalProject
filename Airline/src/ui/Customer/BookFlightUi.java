/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;




import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.AirCompanyList;
import model.AirlineCompany;
import model.Customer;
import model.FlightReservation;
import model.Route;
import java.util.ArrayList;
import model.Airplane;
//import org.apache.commons.lang.RandomStringUtils;


/**
 *
 * @author HP
 */
public class BookFlightUi extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Customer customer;
    ArrayList<AirlineCompany> companyList;
    
    AirlineCompany bookCompany;
    FlightReservation bookFlight;
    Route bookRoute;
    
    public BookFlightUi(Customer customer,AirCompanyList air) {
        initComponents();
        
        this.customer = customer;
        this.companyList = air.getAirCompany();
        
        searchVariable.addItem("Company");
        searchVariable.addItem("Departure Airport");
        searchVariable.addItem("Arrival Airport");

        
        populateTable();
        

        txtSearch.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookConfirm = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        okjbn = new javax.swing.JButton();
        canceljbn = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblDepAirport = new javax.swing.JLabel();
        lblDepTerminal = new javax.swing.JLabel();
        lblDepTime = new javax.swing.JLabel();
        lblArrAirport = new javax.swing.JLabel();
        lblArrTerminal = new javax.swing.JLabel();
        lblArrTime = new javax.swing.JLabel();
        lblClass = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservation = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearchContent = new javax.swing.JLabel();
        lblId14 = new javax.swing.JLabel();
        lblId13 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        searchVariable = new javax.swing.JComboBox<String>();
        lblId16 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        chooseClass = new javax.swing.JComboBox<String>();
        btnSearch1 = new javax.swing.JButton();

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Book Confirmation");

        jLabel12.setText("Date");

        okjbn.setText("OK");
        okjbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okjbnActionPerformed(evt);
            }
        });

        canceljbn.setText("Cancel");
        canceljbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljbnActionPerformed(evt);
            }
        });

        lblDate.setText("Date");

        jLabel14.setText("Company");

        jLabel15.setText("Departure Airport");

        jLabel16.setText("Departure Terminal");

        jLabel17.setText("Departure Time");

        jLabel18.setText("Arrival Airport");

        jLabel19.setText("Arrival Terminal");

        jLabel20.setText("Arrival Time");

        jLabel21.setText("Class");

        jLabel22.setText("Quantity");

        jLabel23.setText("Total price");

        lblCompany.setText("Date");

        lblDepAirport.setText("Date");

        lblDepTerminal.setText("Date");

        lblDepTime.setText("Date");

        lblArrAirport.setText("Date");

        lblArrTerminal.setText("Date");

        lblArrTime.setText("Date");

        lblClass.setText("Date");

        lblQuantity.setText("Date");

        lblPrice.setText("Date");

        javax.swing.GroupLayout BookConfirmLayout = new javax.swing.GroupLayout(BookConfirm.getContentPane());
        BookConfirm.getContentPane().setLayout(BookConfirmLayout);
        BookConfirmLayout.setHorizontalGroup(
            BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookConfirmLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookConfirmLayout.createSequentialGroup()
                        .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BookConfirmLayout.createSequentialGroup()
                        .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(okjbn)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)))
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canceljbn)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArrAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArrTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArrTime, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClass, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        BookConfirmLayout.setVerticalGroup(
            BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookConfirmLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblCompany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblDepAirport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblDepTerminal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblDepTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblArrAirport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblArrTerminal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblArrTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(BookConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okjbn)
                    .addComponent(canceljbn))
                .addGap(28, 28, 28))
        );

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Flight");

        tblReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ROUTE NAME", "COMPANY", "DEPARTURE AIRPORT", "DEPARTURE TIME", "ARRIVAL AIRPORT", "ARRIVAL TIME", "FIRST CLASS", "BUSINESS CLASS", "ECONOMY CLASS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        lblId14.setForeground(new java.awt.Color(255, 255, 255));
        lblId14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId14.setText("QUANTITY");

        lblId13.setForeground(new java.awt.Color(255, 255, 255));
        lblId13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId13.setText("DATE");

        btnSearch.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        searchVariable.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "<choose a company>" }));

        lblId16.setForeground(new java.awt.Color(255, 255, 255));
        lblId16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId16.setText("CLASS");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateKeyReleased(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        chooseClass.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "<choose a company>" }));

        btnSearch1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSearch1.setText("Apply");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(97, 394, Short.MAX_VALUE)
                                .addComponent(lblSearchContent)
                                .addGap(28, 28, 28)
                                .addComponent(searchVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addGap(40, 40, 40)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblId13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblId16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(chooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblId14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch1)
                .addGap(495, 495, 495))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchContent)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(searchVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId13)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId16)
                    .addComponent(chooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId14)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnSearch1)
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblReservation.getModel();
        model.setRowCount(0);
        
        for(AirlineCompany air : companyList){
            for(Route route:air.getRoute()){
                Object[] row = new Object[9];
                row[0] = route.getRouteName();
                row[1] = air.getName();
                row[2] = route.getDepartureAirport().getName();
                row[3] = route.getDepartureTime();
                row[4] = route.getFallAirport().getName();
                row[5] = route.getFallTime();
                row[6] = route.getFirstPrice();
                row[7] = route.getBusinessPrice();
                row[8] = route.getEcoPrice();
                model.addRow(row);   
            }
            
        }
    }
    
    
    
    private void tblReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationMouseClicked

        
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
        model.setRowCount(0);
        String search = txtSearch.getText();
        String variable = String.valueOf(searchVariable.getSelectedItem());
        if(search.isEmpty())
            return;
        boolean choose = false;
        for(AirlineCompany company:companyList){
            choose = false;
            for(Route route:company.getRoute()){
                choose = false;
                if(variable.equals("Company")&&company.getName().equals(search))
                    choose = true;
                else if(variable.equals("Departure Airport")&&route.getDepartureAirport().getName().equals(search))
                    choose = true;
                else if(variable.equals("Arrival Airport")&&route.getFallAirport().getName().equals(search))
                    choose = true;
                if(choose){
                    Object[] row = new Object[9];
                    row[0] = route.getRouteName();
                    row[1] = company.getName();
                    row[2] = route.getDepartureAirport().getName();
                    row[3] = route.getDepartureTime();
                    row[4] = route.getFallAirport().getName();
                    row[5] = route.getFallTime();
                    row[6] = route.getFirstPrice();
                    row[7] = route.getBusinessPrice();
                    row[8] = route.getEcoPrice();
                    model.addRow(row);     
            }
            }
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateKeyPressed

    private void txtDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateKeyReleased

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void okjbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okjbnActionPerformed
        // TODO add your handling code here:
        
        bookCompany.addOrder(bookFlight);
        customer.addReservation(bookFlight);
        bookFlight.updateDB();

        JOptionPane.showMessageDialog(this,"Book Successfully");
        BookConfirm.dispose();
    }//GEN-LAST:event_okjbnActionPerformed

    private void canceljbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceljbnActionPerformed
        // TODO add your handling code here:

        BookConfirm.dispose();
    }//GEN-LAST:event_canceljbnActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        populateTable();
        txtSearch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
        int index = tblReservation.getSelectedRow();
        if(index==-1){
            JOptionPane.showMessageDialog(this, "Please select a row");    
            return;
        }
        int quantity = Integer.parseInt(txtQuantity.getText());
        String airclass = String.valueOf(chooseClass.getSelectedItem());
        //date需要修改
        String date = txtDate.getText();
        if(quantity<=0){
            JOptionPane.showMessageDialog(this, "Please enter valid ticket quantity");    
            return;
        }
        String name = String.valueOf(model.getValueAt(index, 0));
        String company = String.valueOf(model.getValueAt(index, 1));
//        String depAirport = String.valueOf(model.getValueAt(index, 2));
//        String depTime = String.valueOf(model.getValueAt(index, 3));
//        String arrAirport = String.valueOf(model.getValueAt(index, 4));
//        String arrTime = String.valueOf(model.getValueAt(index, 5));
//        String firstPrice = String.valueOf(model.getValueAt(index, 6));
//        String busiPrice = String.valueOf(model.getValueAt(index, 7));
//        String ecoPrice = String.valueOf(model.getValueAt(index, 8));
        for(AirlineCompany air:companyList){
            if(air.getName().equals(company)){
                for(Route route:air.getRoute()){
                    if(route.getRouteName().equals(name)){
                        bookRoute = route;
                        bookCompany = air;
                        break;
                    }
                }
            }
        }
        Airplane plane = bookRoute.getAirplane();
        int price=0;
        if(airclass.equals("First")){
            if(quantity>plane.getFirstCapacity()){
                JOptionPane.showMessageDialog(this, "Ticket quantity is larger than capacity");    
                return;
            }
            price = quantity*bookRoute.getFirstPrice();
        }
        else if(airclass.equals("Business")){
            if(quantity>plane.getBusinessCapacity()){
                JOptionPane.showMessageDialog(this, "Ticket quantity is larger than capacity");    
                return;
            }
            price = quantity*bookRoute.getBusinessPrice();
        }
        else{
            if(quantity>plane.getEcoCapacity()){
                JOptionPane.showMessageDialog(this, "Ticket quantity is larger than capacity");    
                return;
            }
            price = quantity*bookRoute.getEcoPrice();
        }
        
        //Route route, String id,int price, Customer passenger, String flightClass, int count, String company, Date date
        try{
            Date flightDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);
            bookFlight = new FlightReservation(bookRoute,generateReservationId(),price,customer,airclass,quantity,bookCompany.getName(),flightDate);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Invalid date format");  
            return;
        }
        
        
        lblDate.setText(date);
        lblCompany.setText(bookFlight.getCompany());
        lblDepAirport.setText(bookRoute.getDepartureAirport().getName());
        lblDepTerminal.setText(bookRoute.getDepatureTerminal());
        lblDepTime.setText(bookRoute.getDepartureTime());
        lblArrAirport.setText(bookRoute.getFallAirport().getName());
        lblArrTerminal.setText(bookRoute.getFallTerminal());
        lblArrTime.setText(bookRoute.getFallTime());
        lblClass.setText(airclass);
        lblQuantity.setText(String.valueOf(quantity));
        lblPrice.setText(String.valueOf(price));
        BookConfirm.setVisible(true);
    }//GEN-LAST:event_btnSearch1ActionPerformed

    public String generateReservationId(){
        //String id = RandomStringUtils.randomAlphanumeric(8);
        
        //增加判断重复
        
        //return id;
        return "eef";
    }
    
    
    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(ch>'9'||ch<'0')
            evt.consume();
    }//GEN-LAST:event_txtQuantityKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BookConfirm;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton canceljbn;
    private javax.swing.JComboBox<String> chooseClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArrAirport;
    private javax.swing.JLabel lblArrTerminal;
    private javax.swing.JLabel lblArrTime;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepAirport;
    private javax.swing.JLabel lblDepTerminal;
    private javax.swing.JLabel lblDepTime;
    private javax.swing.JLabel lblId13;
    private javax.swing.JLabel lblId14;
    private javax.swing.JLabel lblId16;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSearchContent;
    private javax.swing.JButton okjbn;
    private javax.swing.JComboBox<String> searchVariable;
    private javax.swing.JTable tblReservation;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables


}