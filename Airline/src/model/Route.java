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
    String depatureTerminal;
    String fallTerminal;
    String baggage;
    int firstPrice;
    int businessPrice;
    int ecoPrice;
    AirlineCompany company;
    
    public Route(){
        employeeList = new ArrayList<Employee>();
        airplane = null;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setFallAirport(Airport fallAirport) {
        this.fallAirport = fallAirport;
    }

    public void setFlytime(int flytime) {
        this.flytime = flytime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setFallTime(String fallTime) {
        this.fallTime = fallTime;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setDepatureTerminal(String depatureTerminal) {
        this.depatureTerminal = depatureTerminal;
    }

    public void setFallTerminal(String fallTerminal) {
        this.fallTerminal = fallTerminal;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public Route(String routeName, AirlineCompany company,Airport departureAirport, Airport fallAirport, Airplane airplane, int flytime, String departureTime, String fallTime, ArrayList<Employee> employeeList, 
            String depatureTerminal, String fallTerminal, String baggage, int firstPrice, int businessPrice, int ecoPrice) {
        this.routeName = routeName;
        this.company = company;
        this.departureAirport = departureAirport;
        this.fallAirport = fallAirport;
        this.airplane = airplane;
        this.flytime = flytime;
        this.departureTime = departureTime;
        this.fallTime = fallTime;
        this.employeeList = employeeList;
        this.depatureTerminal = depatureTerminal;
        this.fallTerminal = fallTerminal;
        this.baggage = baggage;
        this.firstPrice = firstPrice;
        this.businessPrice = businessPrice;
        this.ecoPrice = ecoPrice;
        
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
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

    public String getDepatureTerminal() {
        return depatureTerminal;
    }

    public String getFallTerminal() {
        return fallTerminal;
    }

    public String getBaggage() {
        return baggage;
    }

    public int getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getEcoPrice() {
        return ecoPrice;
    }

    public void setEcoPrice(int ecoPrice) {
        this.ecoPrice = ecoPrice;
    }

    public AirlineCompany getCompany() {
        return company;
    }

    public void setCompany(AirlineCompany company) {
        this.company = company;
    }
    
    
    public void updateDB(){
        
    }
    
    
    
}
