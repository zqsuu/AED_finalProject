/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;




/**
 *
 * @author HP
 */
public class Customer extends javax.swing.JPanel {

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
//    public AirlineCompany(PatientDirectory plist,DoctorDirectory dlist,HospitalDirectory hptList,EncounterHistory enList,VitalSignsList vsList) {
//        initComponents();
//        if(plist==null){
//            plist = new PatientDirectory();
//        }else{
//            this.plist=plist;
//        }
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
//    }
    
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
        tabPatient = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabDoctor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabHospital = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabLogout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sysEncounterPanel = new javax.swing.JPanel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setPreferredSize(new java.awt.Dimension(1450, 800));

        sysSplit.setPreferredSize(new java.awt.Dimension(1450, 800));

        sysMenuPanel.setBackground(new java.awt.Color(102, 102, 102));
        sysMenuPanel.setPreferredSize(new java.awt.Dimension(300, 800));

        tabPatient.setBackground(new java.awt.Color(255, 0, 0));
        tabPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPatientMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TICKET");

        javax.swing.GroupLayout tabPatientLayout = new javax.swing.GroupLayout(tabPatient);
        tabPatient.setLayout(tabPatientLayout);
        tabPatientLayout.setHorizontalGroup(
            tabPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabPatientLayout.setVerticalGroup(
            tabPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPatientLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabDoctor.setBackground(new java.awt.Color(255, 0, 0));
        tabDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDoctorMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SERVICE");

        javax.swing.GroupLayout tabDoctorLayout = new javax.swing.GroupLayout(tabDoctor);
        tabDoctor.setLayout(tabDoctorLayout);
        tabDoctorLayout.setHorizontalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabDoctorLayout.setVerticalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDoctorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabHospital.setBackground(new java.awt.Color(255, 0, 0));
        tabHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHospitalMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUSTOMER");

        javax.swing.GroupLayout tabHospitalLayout = new javax.swing.GroupLayout(tabHospital);
        tabHospital.setLayout(tabHospitalLayout);
        tabHospitalLayout.setHorizontalGroup(
            tabHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabHospitalLayout.setVerticalGroup(
            tabHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabHospitalLayout.createSequentialGroup()
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
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout sysMenuPanelLayout = new javax.swing.GroupLayout(sysMenuPanel);
        sysMenuPanel.setLayout(sysMenuPanelLayout);
        sysMenuPanelLayout.setHorizontalGroup(
            sysMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sysMenuPanelLayout.setVerticalGroup(
            sysMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysMenuPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(tabHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
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

    private void tabPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPatientMouseClicked
        
        tabPatient.setVisible(true);
        tabDoctor.setVisible(true);
        tabHospital.setVisible(true);
//        tabEncounter.setVisible(true);
        tabLogout.setVisible(true);
//        PatientProfile patientProfile = new PatientProfile(plist);
//        sysSplit.setRightComponent(patientProfile);
        
    }//GEN-LAST:event_tabPatientMouseClicked

    private void tabDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDoctorMouseClicked
        
        tabPatient.setVisible(true);
        tabDoctor.setVisible(true);
        tabHospital.setVisible(true);
//        tabEncounter.setVisible(true);
        tabLogout.setVisible(true);
//        DoctorProfile doctorProfile = new DoctorProfile(dlist);
//        sysSplit.setRightComponent(doctorProfile);
        
        
    }//GEN-LAST:event_tabDoctorMouseClicked

    private void tabHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHospitalMouseClicked
        
        tabPatient.setVisible(true);
        tabDoctor.setVisible(true);
        tabHospital.setVisible(true);
//        tabEncounter.setVisible(true);
        tabLogout.setVisible(true);
//        HospitalManagement hospitalManagement = new HospitalManagement(hptList);
//        sysSplit.setRightComponent(hospitalManagement);
        
        
        
    }//GEN-LAST:event_tabHospitalMouseClicked

    private void tabLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLogoutMouseClicked
        // TODO add your handling code here:
        tabPatient.setVisible(true);
        tabDoctor.setVisible(true);
        tabHospital.setVisible(true);
//        tabEncounter.setVisible(true);
        tabLogout.setVisible(true);
        sysSplit.setVisible(false);
        
        
    }//GEN-LAST:event_tabLogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel sysEncounterPanel;
    private javax.swing.JPanel sysMenuPanel;
    private javax.swing.JSplitPane sysSplit;
    private javax.swing.JPanel tabDoctor;
    private javax.swing.JPanel tabHospital;
    private javax.swing.JPanel tabLogout;
    private javax.swing.JPanel tabPatient;
    // End of variables declaration//GEN-END:variables
}
