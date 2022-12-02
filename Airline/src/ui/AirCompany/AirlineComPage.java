/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AirCompany;

import model.AirlineCompany;




/**
 *
 * @author HP
 */
public class AirlineComPage extends javax.swing.JPanel {

    AirlineCompany routeList;
    AirlineCompany airplaneList;
    AirlineCompany employeeList;
//    PatientDirectory plist;
//    DoctorDirectory dlist;
//    HospitalDirectory hptList;
//    EncounterHistory enList;
//    VitalSignsList vsList;
    /**
     * Creates new form SystemAdmin
     * @param plist
     * @param dlist
     * @param hptList
     * @param enList
     * @param vsList
     */
    public AirlineComPage(AirlineCompany routeList) {
        initComponents();
        if(routeList==null){
            routeList = new AirlineCompany();
        }else{
            this.routeList=routeList;
        }
//        if(enList==null){
//            enList = new EncounterHistory();
//        }else{
//            this.enList=enList;
//        }
//        if(dlist==null){
//            dlist = new DoctorDirectory();
//        }else{
//            this.dlist=dlist;
//        }
//        if(hptList==null){
//            hptList = new HospitalDirectory();
//        }else{
//            this.hptList=hptList;
//        }
//        if(vsList==null){
//            vsList = new VitalSignsList();
//        }else{
//            this.vsList=vsList;
//        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        sysSplit = new javax.swing.JSplitPane();
        sysMenuPanel = new javax.swing.JPanel();
        tabAirplane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabCrew = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabRoute = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabIncome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabLogout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sysEncounterPanel = new javax.swing.JPanel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setPreferredSize(new java.awt.Dimension(1450, 800));

        sysSplit.setPreferredSize(new java.awt.Dimension(1450, 800));

        sysMenuPanel.setBackground(new java.awt.Color(102, 102, 102));
        sysMenuPanel.setPreferredSize(new java.awt.Dimension(300, 800));

        tabAirplane.setBackground(new java.awt.Color(255, 0, 0));
        tabAirplane.setForeground(new java.awt.Color(51, 51, 51));
        tabAirplane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAirplaneMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AIRPLANE");

        javax.swing.GroupLayout tabAirplaneLayout = new javax.swing.GroupLayout(tabAirplane);
        tabAirplane.setLayout(tabAirplaneLayout);
        tabAirplaneLayout.setHorizontalGroup(
            tabAirplaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabAirplaneLayout.setVerticalGroup(
            tabAirplaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAirplaneLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabCrew.setBackground(new java.awt.Color(255, 0, 0));
        tabCrew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCrewMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CREW");

        javax.swing.GroupLayout tabCrewLayout = new javax.swing.GroupLayout(tabCrew);
        tabCrew.setLayout(tabCrewLayout);
        tabCrewLayout.setHorizontalGroup(
            tabCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabCrewLayout.setVerticalGroup(
            tabCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCrewLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabRoute.setBackground(new java.awt.Color(255, 0, 0));
        tabRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabRouteMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ROUTE");

        javax.swing.GroupLayout tabRouteLayout = new javax.swing.GroupLayout(tabRoute);
        tabRoute.setLayout(tabRouteLayout);
        tabRouteLayout.setHorizontalGroup(
            tabRouteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabRouteLayout.setVerticalGroup(
            tabRouteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRouteLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabIncome.setBackground(new java.awt.Color(255, 0, 0));
        tabIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabIncomeMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INCOME");

        javax.swing.GroupLayout tabIncomeLayout = new javax.swing.GroupLayout(tabIncome);
        tabIncome.setLayout(tabIncomeLayout);
        tabIncomeLayout.setHorizontalGroup(
            tabIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabIncomeLayout.setVerticalGroup(
            tabIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIncomeLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabLogout.setBackground(new java.awt.Color(153, 0, 0));
        tabLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLogoutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log out");

        javax.swing.GroupLayout tabLogoutLayout = new javax.swing.GroupLayout(tabLogout);
        tabLogout.setLayout(tabLogoutLayout);
        tabLogoutLayout.setHorizontalGroup(
            tabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabLogoutLayout.setVerticalGroup(
            tabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLogoutLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout sysMenuPanelLayout = new javax.swing.GroupLayout(sysMenuPanel);
        sysMenuPanel.setLayout(sysMenuPanelLayout);
        sysMenuPanelLayout.setHorizontalGroup(
            sysMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAirplane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabCrew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sysMenuPanelLayout.setVerticalGroup(
            sysMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysMenuPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(tabRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabAirplane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(tabLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        sysSplit.setLeftComponent(sysMenuPanel);

        sysEncounterPanel.setBackground(new java.awt.Color(153, 153, 153));
        sysEncounterPanel.setForeground(new java.awt.Color(102, 102, 102));
        sysEncounterPanel.setPreferredSize(new java.awt.Dimension(1150, 800));

        javax.swing.GroupLayout sysEncounterPanelLayout = new javax.swing.GroupLayout(sysEncounterPanel);
        sysEncounterPanel.setLayout(sysEncounterPanelLayout);
        sysEncounterPanelLayout.setHorizontalGroup(
            sysEncounterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1326, Short.MAX_VALUE)
        );
        sysEncounterPanelLayout.setVerticalGroup(
            sysEncounterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        sysSplit.setRightComponent(sysEncounterPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(sysSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sysSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabAirplaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAirplaneMouseClicked
        
        tabAirplane.setVisible(true);
        tabCrew.setVisible(true);
        tabRoute.setVisible(true);
        tabIncome.setVisible(true);
        tabLogout.setVisible(true);
        AirplaneUi airplane = new AirplaneUi(airplaneList);
        sysSplit.setRightComponent(airplane);
        
    }//GEN-LAST:event_tabAirplaneMouseClicked

    private void tabCrewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCrewMouseClicked
        
        tabAirplane.setVisible(true);
        tabCrew.setVisible(true);
        tabRoute.setVisible(true);
        tabIncome.setVisible(true);
        tabLogout.setVisible(true);
        EmployeeUi employee = new EmployeeUi(employeeList);
        sysSplit.setRightComponent(employee);
        
        
    }//GEN-LAST:event_tabCrewMouseClicked

    private void tabRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabRouteMouseClicked
        
        tabAirplane.setVisible(true);
        tabCrew.setVisible(true);
        tabRoute.setVisible(true);
        tabIncome.setVisible(true);
        tabLogout.setVisible(true);
        RouteUi route = new RouteUi(routeList);
        sysSplit.setRightComponent(route);
        
        
        
    }//GEN-LAST:event_tabRouteMouseClicked

    private void tabIncomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabIncomeMouseClicked
        
        tabAirplane.setVisible(true);
        tabCrew.setVisible(true);
        tabRoute.setVisible(true);
        tabIncome.setVisible(true);
        tabLogout.setVisible(true);
//        IncomeUi income = new IncomeUi(incomeList);
//        sysSplit.setRightComponent(income);
        
    }//GEN-LAST:event_tabIncomeMouseClicked

    private void tabLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLogoutMouseClicked
        // TODO add your handling code here:
        tabAirplane.setVisible(true);
        tabCrew.setVisible(true);
        tabRoute.setVisible(true);
        tabIncome.setVisible(true);
        tabLogout.setVisible(true);
        sysSplit.setVisible(false);
        
        
    }//GEN-LAST:event_tabLogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel sysEncounterPanel;
    private javax.swing.JPanel sysMenuPanel;
    private javax.swing.JSplitPane sysSplit;
    private javax.swing.JPanel tabAirplane;
    private javax.swing.JPanel tabCrew;
    private javax.swing.JPanel tabIncome;
    private javax.swing.JPanel tabLogout;
    private javax.swing.JPanel tabRoute;
    // End of variables declaration//GEN-END:variables
}
