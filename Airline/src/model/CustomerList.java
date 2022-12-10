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

/**
 *
 * @author HP
 */
public class CustomerList {

    ArrayList<Customer> customerList;

    public CustomerList() {
        customerList = new ArrayList<Customer>();
    }

    public CustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    public void removeCustomer(Customer c) {
        customerList.remove(c);
    }

//    public ArrayList<Customer> getAllCustomer() throws ClassNotFoundException {
//        ArrayList<Customer> customerList = new ArrayList<>();
//        Connection con = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        try {
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb1", "root", "Airline3306");
//            st = (Statement) con.createStatement();
//            rs = st.executeQuery("Select * from airlinedb1.customer");
//
//            while (rs.next()) {
//
//                Customer customer = new Customer();
//                customer.setId(rs.getString("id"));
//                customer.setPassword(rs.getString("password"));
//                customer.setName(rs.getString("name"));
//                customer.setGender(rs.getString("gender"));
//                customer.setAge(rs.getInt("age"));
//                customer.setPassport(rs.getString("passport"));
//                customer.setEmail(rs.getString("email"));
//                customerList.add(customer);
//                System.out.println(customer.getId() + " - " + customer.getName());
//            }
//            rs.close();
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return customerList;
//    }
}
