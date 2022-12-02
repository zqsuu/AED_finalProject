/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AirportList {
    
    ArrayList<Airport> airportList ;

    public AirportList(ArrayList<Airport> airportList) {
        this.airportList = airportList;
    }

    public ArrayList<Airport> getAirportList() {
        return airportList;
    }

    public void setAirportList(ArrayList<Airport> airportList) {
        this.airportList = airportList;
    }
    
    public void addAirport(Airport a) {
        airportList.add(a);
    }
    
    public void removeAirport(Airport a) {
        airportList.remove(a);
    }
}
