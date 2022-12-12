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
public class Airport {

    String name;
    String password;
    String city;
    String address;
    ArrayList<AirportService> airportService;
    ArrayList<Route> route;
    ArrayList<Route> routeRequest;

    public Airport() {
        route = new ArrayList<Route>();
        routeRequest = new ArrayList<Route>();
    }

    
    public Airport(String name, String city, String address) {
        this.name = name;
        this.password = password;
        this.city = city;
        this.address = address;
        this.airportService = airportService;
        this.route = new ArrayList<Route>();
        this.routeRequest = new ArrayList<Route>();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AirportService> getAirportService() {
        return airportService;
    }

    public void setAirportService(ArrayList<AirportService> airportService) {
        this.airportService = airportService;
    }

    public void addRoute(Route r) {
        route.add(r);
    }

    public void addRouteRequest(Route r) {
        routeRequest.add(r);
    }

    public void removeRoute(Route r) {
        route.remove(r);
    }

    public void removeRouteRequest(Route r) {
        routeRequest.remove(r);
    }

    public ArrayList<Route> getRoute() {
        return route;
    }

    public ArrayList<Route> getRouteRequest() {
        return routeRequest;
    }

}
