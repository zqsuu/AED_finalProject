/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zhiqingsu
 */
public class FlightReservation {
    int price;
    String id;
    String flightClass;
    String state; // purchased/canceled/refund/confirmed
    String company;
    String seat;
    String route;
    String customer;
    String passport;
    Date date;
    
    

    public FlightReservation(String route, String pass,String id,int price, String passenger, String flightClass, String seat, String company, Date date) {
        this.id = id;
        this.route = route;
        this.price = price;
        this.seat = seat;
        this.customer = passenger;
        this.flightClass = flightClass;
        this.passport = pass;
        this.company = company;
        this.date = date;
        state = "purchased";
    }

    public int getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public String getState() {
        return state;
    }

    public String getCompany() {
        return company;
    }

    public String getSeat() {
        return seat;
    }

    public String getRoute() {
        return route;
    }

    public String getCustomer() {
        return customer;
    }

    public String getPassport() {
        return passport;
    }

    public Date getDate() {
        return date;
    }

    
    
    public void updateDB(){
        try{
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
            //String query = "UPDATE airlinedb1.flightreservation SET passengername = '" + customer + "' ,passport = '" + passport +"' ,idreservation = '" + id +"' ,state = '" + state + "' ,date = '" + date + "' ,company = '" + company + "' ,route = '" + route + "' ,class = '" + flightClass + "' ,price = '" + price + "' ,seat = '" + seat +"' ,reservationid = '" + id +"' WHERE reservationid = '" + id+"'";
            Statement add = (Statement) con.createStatement();
            ResultSet rs = add.executeQuery("SELECT * FROM airlinedb1.flightreservation");
            int i = 0;
            while(rs.next())
                i++;
            i++;
            
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sf.format(date);
            String query = "insert into airlinedb1.flightreservation (idreservation,passengername, passport, reservationid, state,date,company,route,class,seat,price) values(" +i+",'"+customer+"','"+passport+"','"+id+"','"+state+"','"+format+"','"+company+"','"+route+"','"+ flightClass +"','"+seat+"','"+price+ "')";
            
            add.executeUpdate(query);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
