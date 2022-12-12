/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
    
    public EmployeeArrange(){
        pilot = new ArrayList<Employee>();
        st = new ArrayList<Employee>();
    }
    
    public EmployeeArrange(Route route,Employee captain,ArrayList<Employee> pilot,ArrayList<Employee> st){
        this.route = route;
        this.captain = captain;
        this.pilot = pilot;
        this.st = st;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Employee getCaptain() {
        return captain;
    }

    public void setCaptain(Employee captain) {
        this.captain = captain;
    }

    public ArrayList<Employee> getPilot() {
        return pilot;
    }

    public void setPilot(ArrayList<Employee> pilot) {
        this.pilot = pilot;
    }

    public ArrayList<Employee> getSt() {
        return st;
    }

    public void setSt(ArrayList<Employee> st) {
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
        if(st.size()==3)
            return;
        else
            st.add(e);
    }
    
    public void updateDB(){
        try{
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            String query = "ON DUPLICATE KEY UPDATE routecrew SET company = '" + route.company.getName() + "' ,routename = '" + route.routeName + "' ,captain = '" + captain.name + "' ,pilot1 = '" + pilot.get(0).name + "' ,pilot2 = '" + pilot.get(1).name + "' ,st1 = '" + st.get(0).name + "' ,st2 = '" + st.get(1).name + "' ,st2 = '" + st.get(2).name  +"' WHERE routename = " + route.routeName;
            Statement add = (Statement) con.createStatement();
            add.executeUpdate(query);
            
            query = "ON DUPLICATE KEY UPDATE employee SET route = '" + route.routeName + "' WHERE id = " + captain.id;
            add.executeUpdate(query);
            query = "ON DUPLICATE KEY UPDATE employee SET route = '" + route.routeName + "' WHERE id = " + pilot.get(0).id;
            add.executeUpdate(query);
            query = "ON DUPLICATE KEY UPDATE employee SET route = '" + route.routeName + "' WHERE id = " + pilot.get(1).id;
            add.executeUpdate(query);
            for(int i=0;i<3;i++){
                query = "ON DUPLICATE KEY UPDATE employee SET route = '" + route.routeName + "' WHERE id = " + st.get(i).id;
                add.executeUpdate(query);
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
