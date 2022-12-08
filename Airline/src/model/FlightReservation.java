/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author zhiqingsu
 */
public class FlightReservation {
    int price;
    int count;
    String id;
    String flightClass;
    String state; // purchased/cancelled
    String company;
    Route route;
    Customer passenger;   
    Date date;

    public FlightReservation(Route route, String id,int price, Customer passenger, String flightClass, int count, String company, Date date) {
        this.id = id;
        this.route = route;
        this.price = price;
        this.count = count;
        this.passenger = passenger;
        this.flightClass = flightClass;
        this.company = company;
        this.date = date;
        state = "purchased";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    
    
    public Route getRoute() {
        return route;
    }

    public int getPrice() {
        return price;
    }

    public Customer getPassenger() {
        return passenger;
    }

    public String getFlightClass() {
        return flightClass;
    }



    public String getCompany() {
        return company;
    }

    public Date getDate() {
        return date;
    }

    
    public void updateDB(){
        
    }
    
    
}
