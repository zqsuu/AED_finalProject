/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zhiqingsu
 */
public class CustomerService {
    String airport;
    String customer;
    String bus;
    String luggage;
    String food;
    String check;
    
    public CustomerService(String airport,String customer){
        this.airport = airport;
        this.customer = customer;
    }
    public CustomerService(String airport,String custoemr,String bus,String luggage,String food,String check){
        this.airport =  airport;
        this.customer = customer;
        this.bus = bus;
        this.check = check;
        this.food = food;
        this.luggage = luggage;
    }
    
    

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getLuggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    
    
}
