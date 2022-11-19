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
    int flyYear;
    int age;

    public Employee(String name, String id, String password, String gender, String role, int flyYear, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.role = role;
        this.flyYear = flyYear;
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

    public int getFlyYear() {
        return flyYear;
    }

    public int getAge() {
        return age;
    }
    
    
}
