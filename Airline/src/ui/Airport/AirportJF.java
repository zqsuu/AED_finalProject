/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Airport;

import java.util.ArrayList;
import model.Airport;
import model.AirportList;
import model.AirportService;
import ui.airline.LogIn;

/**
 *
 * @author HP
 */
public class AirportJF extends javax.swing.JFrame {
    
    AirportList airportList;
    Airport arrivalsList;
    Airport serviceList;
    Airport air;
    LogIn login;

    /**
     * Creates new form AirportJF
     */
    public AirportJF() {
        initComponents();
        this.login = login;
    }
    
    public AirportJF(LogIn login,Airport air) {
        initComponents();
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
        sysSplit = new javax.swing.JSplitPane();
        sysMenuPanel = new javax.swing.JPanel();
        tabLocation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabService = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabArrivals = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabLogout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tabAirport = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabDepartures = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sysEncounterPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1450, 800));

        sysSplit.setPreferredSize(new java.awt.Dimension(1450, 800));

        sysMenuPanel.setBackground(new java.awt.Color(102, 102, 102));
        sysMenuPanel.setPreferredSize(new java.awt.Dimension(300, 800));

        tabLocation.setBackground(new java.awt.Color(255, 0, 0));
        tabLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLocationMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOCATION");

        javax.swing.GroupLayout tabLocationLayout = new javax.swing.GroupLayout(tabLocation);
        tabLocation.setLayout(tabLocationLayout);
        tabLocationLayout.setHorizontalGroup(
            tabLocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabLocationLayout.setVerticalGroup(
            tabLocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLocationLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabService.setBackground(new java.awt.Color(255, 0, 0));
        tabService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabServiceMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SERVICE");

        javax.swing.GroupLayout tabServiceLayout = new javax.swing.GroupLayout(tabService);
        tabService.setLayout(tabServiceLayout);
        tabServiceLayout.setHorizontalGroup(
            tabServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabServiceLayout.setVerticalGroup(
            tabServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabServiceLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabArrivals.setBackground(new java.awt.Color(255, 0, 0));
        tabArrivals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabArrivalsMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ARRIVALS");

        javax.swing.GroupLayout tabArrivalsLayout = new javax.swing.GroupLayout(tabArrivals);
        tabArrivals.setLayout(tabArrivalsLayout);
        tabArrivalsLayout.setHorizontalGroup(
            tabArrivalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabArrivalsLayout.setVerticalGroup(
            tabArrivalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabArrivalsLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tabAirport.setBackground(new java.awt.Color(255, 0, 0));
        tabAirport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAirportMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AIRPORT");

        javax.swing.GroupLayout tabAirportLayout = new javax.swing.GroupLayout(tabAirport);
        tabAirport.setLayout(tabAirportLayout);
        tabAirportLayout.setHorizontalGroup(
            tabAirportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabAirportLayout.setVerticalGroup(
            tabAirportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAirportLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabDepartures.setBackground(new java.awt.Color(255, 0, 0));
        tabDepartures.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDeparturesMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DEPARTURES");

        javax.swing.GroupLayout tabDeparturesLayout = new javax.swing.GroupLayout(tabDepartures);
        tabDepartures.setLayout(tabDeparturesLayout);
        tabDeparturesLayout.setHorizontalGroup(
            tabDeparturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabDeparturesLayout.setVerticalGroup(
            tabDeparturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDeparturesLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout sysMenuPanelLayout = new javax.swing.GroupLayout(sysMenuPanel);
        sysMenuPanel.setLayout(sysMenuPanelLayout);
        sysMenuPanelLayout.setHorizontalGroup(
            sysMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabArrivals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabAirport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabDepartures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sysMenuPanelLayout.setVerticalGroup(
            sysMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysMenuPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(tabAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabArrivals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabDepartures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(tabService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(tabLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        sysSplit.setLeftComponent(sysMenuPanel);

        sysEncounterPanel.setBackground(new java.awt.Color(153, 153, 153));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(sysSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sysSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1450, Short.MAX_VALUE)
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

    private void tabLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLocationMouseClicked

        tabLocation.setVisible(true);
        tabService.setVisible(true);
        tabArrivals.setVisible(true);
        tabAirport.setVisible(true);
        tabLogout.setVisible(true);
        //        PatientProfile patientProfile = new PatientProfile(plist);
        //        sysSplit.setRightComponent(patientProfile);

    }//GEN-LAST:event_tabLocationMouseClicked

    private void tabServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabServiceMouseClicked

        tabLocation.setVisible(true);
        tabService.setVisible(true);
        tabArrivals.setVisible(true);
        tabAirport.setVisible(true);
        tabLogout.setVisible(true);
        ServiceUi service = new ServiceUi(serviceList);
        sysSplit.setRightComponent(service);

    }//GEN-LAST:event_tabServiceMouseClicked

    private void tabArrivalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabArrivalsMouseClicked

        tabLocation.setVisible(true);
        tabService.setVisible(true);
        tabArrivals.setVisible(true);
        tabAirport.setVisible(true);
        tabLogout.setVisible(true);
        ArrivalsUi arrivals = new ArrivalsUi(arrivalsList);
        sysSplit.setRightComponent(arrivals);

    }//GEN-LAST:event_tabArrivalsMouseClicked

    private void tabLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLogoutMouseClicked
        this.setVisible(false);
        LogIn login = new LogIn();
        login.setVisible(true);

    }//GEN-LAST:event_tabLogoutMouseClicked

    private void tabAirportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAirportMouseClicked
        tabLocation.setVisible(true);
        tabService.setVisible(true);
        tabArrivals.setVisible(true);
        tabAirport.setVisible(true);
        tabLogout.setVisible(true);
        AirportUi airport = new AirportUi(airportList);
        sysSplit.setRightComponent(airport);
    }//GEN-LAST:event_tabAirportMouseClicked

    private void tabDeparturesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDeparturesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabDeparturesMouseClicked

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
            java.util.logging.Logger.getLogger(AirportJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirportJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirportJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirportJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   
                Airport airp = new Airport("Logan","Boston","MA");
                new AirportJF(null, airp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel sysEncounterPanel;
    private javax.swing.JPanel sysMenuPanel;
    private javax.swing.JSplitPane sysSplit;
    private javax.swing.JPanel tabAirport;
    private javax.swing.JPanel tabArrivals;
    private javax.swing.JPanel tabDepartures;
    private javax.swing.JPanel tabLocation;
    private javax.swing.JPanel tabLogout;
    private javax.swing.JPanel tabService;
    // End of variables declaration//GEN-END:variables
}
