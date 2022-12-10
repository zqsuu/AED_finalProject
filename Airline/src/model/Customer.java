/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import net.proteanit.sql.DbUtils;

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
    String email;
    ArrayList<FlightReservation> reservation;

    public Customer(String id, String password, String name, String gender, int age, String passport, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.passport = passport;
        this.email = email;
        reservation = new ArrayList<FlightReservation>();
    }

    public Customer() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public ArrayList<FlightReservation> getReservation() {
        return reservation;
    }

    public void addReservation(FlightReservation fr) {
        reservation.add(fr);
    }

    public void removeReservation(FlightReservation fr) {
        reservation.remove(fr);
    }

    public void updateDB() {

    }


    

}
