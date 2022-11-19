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
public class AirlineCompany {
    String name;
    String id;
    String password;
    ArrayList<Airplane> airplane;
    ArrayList<Employee> employee;
    ArrayList<Route> route;
    ArrayList<FlightReservation> order;

    public AirlineCompany(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.airplane = new ArrayList<Airplane>();
        this.employee = new ArrayList<Employee>();
        this.route = new ArrayList<Route>();
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

    public ArrayList<Airplane> getAirplane() {
        return airplane;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public ArrayList<Route> getRoute() {
        return route;
    }
    
    public void addRoute(Route r){
        route.add(r);
    }
    public void removeRoute(Route r){
        route.remove(r);
    }
    
    public void addAirplane(Airplane a){
        airplane.add(a);
    }
    public void removeAirplane(Airplane a){
        airplane.remove(a);
    }
    public void addEmployee(Employee e){
        employee.add(e);
    }
    public void removeEmployee(Employee e){
        employee.remove(e);
    }
    
    public int companyIncome(){
        int income = 0;
        ArrayList<Route> r= new ArrayList<Route>();
        for(FlightReservation f: order){
            income +=f.getPrice();
            boolean isCalculated = false;
            for(Route rou: r){
                if(f.getRoute() == rou){
                    isCalculated = true;
                    break;
                }
            }
            if(!isCalculated){
                income -=f.getRoute().getAirplane().getFuelConsumption()*f.getRoute().getFlytime();
                r.add(f.getRoute());
            }         
        }
        for(Airplane air:airplane){
            income -= air.getPrice();
        }
        return income;
    }
    
    public int routeIncome(Route r){
        int income = 0;
        for(FlightReservation f: order){
            if(f.getRoute() == r){
                income +=f.getPrice();         
            }      
        }
        income -=r.getAirplane().getFuelConsumption()*r.getFlytime();
        return income;
    }
}