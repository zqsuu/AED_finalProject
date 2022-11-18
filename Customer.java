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
public class Customer {
    String id;
    String password;
    String name;
    String gender;
    int age;
    String passport;
    ArrayList<FlightReservation> reservation;
    
    public Customer(String id,String password,String name,String gender,int age,String passport){
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.passport = passport;
        reservation = new ArrayList<FlightReservation>();
    }
    
    
}
