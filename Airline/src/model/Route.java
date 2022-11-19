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
public class Route {
    String routeName;
    Airport departureAirport ;
    Airport fallAirport;
    Airplane airplane;
    int flytime; //hours
    String departureTime;
    String fallTime;
    ArrayList<Employee> employeeList;
    

    public Route(String routeName, Airport departureAirport, Airport fallAirport, Airplane airplane, int flytime, String departureTime, String fallTime, ArrayList<Employee> employeeList) {
        this.routeName = routeName;
        this.departureAirport = departureAirport;
        this.fallAirport = fallAirport;
        this.airplane = airplane;
        this.flytime = flytime;
        this.departureTime = departureTime;
        this.fallTime = fallTime;
        this.employeeList = employeeList;
    }

    public String getRouteName() {
        return routeName;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getFallAirport() {
        return fallAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public int getFlytime() {
        return flytime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getFallTime() {
        return fallTime;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    
}
