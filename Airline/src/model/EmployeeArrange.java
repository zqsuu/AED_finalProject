/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author zhiqingsu
 */
public class EmployeeArrange {
    Route route;
    Employee captain;
    ArrayList<Employee> pilot;
    ArrayList<Employee> st;
    
    public EmployeeArrange(Route route,Employee captain,ArrayList<Employee> pilot,ArrayList<Employee> st){
        this.route = route;
        this.captain = captain;
        this.pilot = pilot;
        this.st = st;
    }
    
    public void changeCaptain(Employee e){
        captain = e;      
    }
    
    public void removePilot(Employee e){
        pilot.remove(e);
    }
    public void addPilot(Employee e){
        if(pilot.size()==2)
            return;
        pilot.add(e);
    }
    public void removeSt(Employee e){
        st.remove(e);
    }
    
    public void addSt(Employee e){
        if(st.size()==6)
            return;
        else
            st.add(e);
    }
}
