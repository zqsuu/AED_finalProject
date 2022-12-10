/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package role;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class SystemAdminList {
    ArrayList<SystemAdmin> sysAdmin;

    public SystemAdminList() {
        sysAdmin = new ArrayList<SystemAdmin>();
    }
    


    public ArrayList<SystemAdmin> getSystemAdmin() {
        return sysAdmin;
    }

    public void setSystemAdmin(ArrayList<SystemAdmin> sysAdmin) {
        this.sysAdmin = sysAdmin;
    }
    
    
    public void addSystemAdmin(SystemAdmin s) {
        sysAdmin.add(s);
    }
    
    public void removeSystemAdmin(SystemAdmin s) {
        sysAdmin.remove(s);
    }
}
