/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.AirlineCompany;

/**
 *
 * @author zhiqingsu
 */
public class Airplane {
    String manufacturer;
    int firstCapacity;
    int businessCapacity;
    int ecoCapacity;
    int fuelConsumption;
    int price;
    int serviceLife;
    String type;
    Route route;
    AirlineCompany airplaneCompany;


    public Airplane(String manufacturer,int firstCapacity, int businessCapacity, int ecoCapacity, int fuelConsumption, int price, int serviceLife, String type, AirlineCompany airplaneCompany) {
        this.manufacturer = manufacturer;
        this.firstCapacity = firstCapacity;
        this.businessCapacity = businessCapacity;
        this.ecoCapacity = ecoCapacity;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.serviceLife = serviceLife;
        this.type = type;
        this.route = null;
        this.airplaneCompany = airplaneCompany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(int serviceLife) {
        this.serviceLife = serviceLife;
    }

    
    
    public int getFirstCapacity() {
        return firstCapacity;
    }

    public void setFirstCapacity(int firstCapacity) {
        this.firstCapacity = firstCapacity;
    }

    public int getBusinessCapacity() {
        return businessCapacity;
    }

    public void setBusinessCapacity(int businessCapacity) {
        this.businessCapacity = businessCapacity;
    }

    public int getEcoCapacity() {
        return ecoCapacity;
    }

    public void setEcoCapacity(int ecoCapacity) {
        this.ecoCapacity = ecoCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public AirlineCompany getAirplaneCompany() {
        return airplaneCompany;
    }

    public void setAirplaneCompany(AirlineCompany airplaneCompany) {
        this.airplaneCompany = airplaneCompany;
    }
    
    
            
            
}

