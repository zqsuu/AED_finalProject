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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public ArrayList<FlightReservation> getReservation() {
        return reservation;
    }

    
    public void addReservation(FlightReservation fr){
        reservation.add(fr);
    }
    
    public void removeReservation(FlightReservation fr){
        reservation.remove(fr);
    }
    
}
