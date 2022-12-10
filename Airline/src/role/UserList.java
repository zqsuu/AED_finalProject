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
public class UserList {
    ArrayList<User> sysAdmin;

    public UserList() {
        sysAdmin = new ArrayList<User>();
    }
    


    public ArrayList<User> getSystemAdmin() {
        return sysAdmin;
    }

    public void setSystemAdmin(ArrayList<User> sysAdmin) {
        this.sysAdmin = sysAdmin;
    }
    
    
    public void addSystemAdmin(User s) {
        sysAdmin.add(s);
    }
    
    public void removeSystemAdmin(User s) {
        sysAdmin.remove(s);
    }
}
