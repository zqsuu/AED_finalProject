/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package role.inCompany;

import ui.AirCompany.*;
import model.AirlineCompany;
import ui.airline.LogIn;

/**
 *
 * @author HP
 */
public class ProductManagerJF extends javax.swing.JFrame {
    AirlineCompany routeList;
    AirlineCompany airplaneList;
    AirlineCompany employeeList;
    AirlineCompany airlineCompany;
    LogIn login;
    

    /**
     * Creates new form ComJF
     */
    public ProductManagerJF() {
        initComponents();
        this.login = login;

    }
    public ProductManagerJF(LogIn login,AirlineCompany air) {
        initComponents();
        this.login = login;
        airlineCompany = air;
        //        if(routeList==null){
//            routeList = new AirlineCompany();
//        }else{
//            this.routeList=routeList;
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

        jPanel = new javax.swing.JPanel();
        sysSplit = new javax.swing.JSplitPane();
        sysMenuPanel = new javax.swing.JPanel();
        tabAirplane = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tabCrew = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tabRoute = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tabIncome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tabLogout = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tabRouteCrew = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sysEncounterPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setPreferredSize(new java.awt.Dimension(1450, 800));

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

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AIRPLANE");

        javax.swing.GroupLayout tabAirplaneLayout = new javax.swing.GroupLayout(tabAirplane);
        tabAirplane.setLayout(tabAirplaneLayout);
        tabAirplaneLayout.setHorizontalGroup(
            tabAirplaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabAirplaneLayout.setVerticalGroup(
            tabAirplaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAirplaneLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabCrew.setBackground(new java.awt.Color(255, 0, 0));
        tabCrew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCrewMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CREW");

        javax.swing.GroupLayout tabCrewLayout = new javax.swing.GroupLayout(tabCrew);
        tabCrew.setLayout(tabCrewLayout);
        tabCrewLayout.setHorizontalGroup(
            tabCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabCrewLayout.setVerticalGroup(
            tabCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCrewLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabRoute.setBackground(new java.awt.Color(255, 0, 0));
        tabRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabRouteMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ROUTE");

        javax.swing.GroupLayout tabRouteLayout = new javax.swing.GroupLayout(tabRoute);
        tabRoute.setLayout(tabRouteLayout);
        tabRouteLayout.setHorizontalGroup(
            tabRouteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabRouteLayout.setVerticalGroup(
            tabRouteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRouteLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabIncome.setBackground(new java.awt.Color(255, 0, 0));
        tabIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabIncomeMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INCOME");

        javax.swing.GroupLayout tabIncomeLayout = new javax.swing.GroupLayout(tabIncome);
        tabIncome.setLayout(tabIncomeLayout);
        tabIncomeLayout.setHorizontalGroup(
            tabIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabIncomeLayout.setVerticalGroup(
            tabIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIncomeLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabLogout.setBackground(new java.awt.Color(153, 0, 0));
        tabLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLogoutMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Log out");

        javax.swing.GroupLayout tabLogoutLayout = new javax.swing.GroupLayout(tabLogout);
        tabLogout.setLayout(tabLogoutLayout);
        tabLogoutLayout.setHorizontalGroup(
            tabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabLogoutLayout.setVerticalGroup(
            tabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLogoutLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabRouteCrew.setBackground(new java.awt.Color(255, 0, 0));
        tabRouteCrew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabRouteCrewMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Route");

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("|");

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Crew");

        javax.swing.GroupLayout tabRouteCrewLayout = new javax.swing.GroupLayout(tabRouteCrew);
        tabRouteCrew.setLayout(tabRouteCrewLayout);
        tabRouteCrewLayout.setHorizontalGroup(
            tabRouteCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabRouteCrewLayout.setVerticalGroup(
            tabRouteCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRouteCrewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(tabRouteCrew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(tabRouteCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
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
            .addGap(0, 1355, Short.MAX_VALUE)
        );
        sysEncounterPanelLayout.setVerticalGroup(
            sysEncounterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        sysSplit.setRightComponent(sysEncounterPanel);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(sysSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sysSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1459, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
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
        //        EncounterManagement encounterManagement = new EncounterManagement(enList);
        //        sysSplit.setRightComponent(encounterManagement);

    }//GEN-LAST:event_tabIncomeMouseClicked

    private void tabLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLogoutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        LogIn login = new LogIn();
        login.setVisible(true);

    }//GEN-LAST:event_tabLogoutMouseClicked

    private void tabRouteCrewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabRouteCrewMouseClicked
        tabAirplane.setVisible(true);
        tabCrew.setVisible(true);
        tabRoute.setVisible(true);
        tabRouteCrew.setVisible(true);
        tabIncome.setVisible(true);
        tabLogout.setVisible(true);
        RouteCrewUi routeCrew = new RouteCrewUi();
        sysSplit.setRightComponent(routeCrew);

    }//GEN-LAST:event_tabRouteCrewMouseClicked

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
            java.util.logging.Logger.getLogger(ProductManagerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManagerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManagerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManagerJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManagerJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel sysEncounterPanel;
    private javax.swing.JPanel sysMenuPanel;
    private javax.swing.JSplitPane sysSplit;
    private javax.swing.JPanel tabAirplane;
    private javax.swing.JPanel tabCrew;
    private javax.swing.JPanel tabIncome;
    private javax.swing.JPanel tabLogout;
    private javax.swing.JPanel tabRoute;
    private javax.swing.JPanel tabRouteCrew;
    // End of variables declaration//GEN-END:variables
}