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
    Route route;
    int price;
    Customer passenger;
    String flightClass;
    String seat;
    String company;
    Date date;

    public FlightReservation(Route route, int price, Customer passenger, String flightClass, String seat, String company, Date date) {
        this.route = route;
        this.price = price;
        this.passenger = passenger;
        this.flightClass = flightClass;
        this.seat = seat;
        this.company = company;
        this.date = date;
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

    public String getSeat() {
        return seat;
    }

    public String getCompany() {
        return company;
    }

    public Date getDate() {
        return date;
    }

    
    
    
    
}
