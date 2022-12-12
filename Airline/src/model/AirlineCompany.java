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
public class AirlineCompany {

    String name;
    String id;
    String password;
    ArrayList<Airplane> airplane;
    ArrayList<Employee> employee;
    ArrayList<Route> route;
    ArrayList<FlightReservation> order;
    ArrayList<EmployeeArrange> arrange;

    public AirlineCompany(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.airplane = new ArrayList<Airplane>();
        this.employee = new ArrayList<Employee>();
        this.route = new ArrayList<Route>();
        this.order = new ArrayList<FlightReservation>();
        arrange = new ArrayList<EmployeeArrange>();
    }

    public AirlineCompany() {
        this.airplane = new ArrayList<Airplane>();
        this.employee = new ArrayList<Employee>();
        this.route = new ArrayList<Route>();
        this.order = new ArrayList<FlightReservation>();
        arrange = new ArrayList<EmployeeArrange>();
    }

    public ArrayList<FlightReservation> getOrder() {
        return order;
    }

    public ArrayList<EmployeeArrange> getArrange() {
        return arrange;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAirplane(ArrayList<Airplane> airplane) {
        this.airplane = airplane;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public void setRoute(ArrayList<Route> route) {
        this.route = route;
    }

    public void setOrder(ArrayList<FlightReservation> order) {
        this.order = order;
    }

    public void setArrange(ArrayList<EmployeeArrange> arrange) {
        this.arrange = arrange;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void addOrder(FlightReservation fr) {
        order.add(fr);
    }

    public ArrayList<Airplane> getAirplane() {
        return airplane;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public ArrayList<Route> getRoute() {
        return route;
    }

    public void addRoute(Route r) {
        route.add(r);
    }

    public void removeRoute(Route r) {
        route.remove(r);
    }

    public void addAirplane(Airplane a) {
        airplane.add(a);
    }

    public void removeAirplane(Airplane a) {
        airplane.remove(a);
    }

    public void addEmployee(Employee e) {
        employee.add(e);
    }

    public void removeEmployee(Employee e) {
        employee.remove(e);
    }

   

    public void addArrange(EmployeeArrange ea) {
        arrange.add(ea);
    }

    public void removeArrange(EmployeeArrange ea) {
        arrange.remove(ea);
    }
 
    public void updateDB(){
        try{
            
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            Statement add = (Statement) con.createStatement();    
            String query = "UPDATE airlinecompany SET name = '" + name +"' ,password='"+password+ "'";
            add.executeUpdate(query);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
