/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zhiqingsu
 */
public class Employee {
    String name;
    String id;
    String password;
    String gender;
    String role;
    String route;
    int flyYears;
    int age;
    
    public Employee(){
        
    }

    public Employee(String name, String id, String password, String gender, String role, int flyYears, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.role = role;
        this.flyYears = flyYears;
        this.age = age;
        route = "";
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setFlyYears(int flyYears) {
        this.flyYears = flyYears;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }

    public int getFlyYears() {
        return flyYears;
    }

    public int getAge() {
        return age;
    }
    
    
}
