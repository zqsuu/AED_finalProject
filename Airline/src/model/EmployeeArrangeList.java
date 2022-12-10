/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmployeeArrangeList {
    
    ArrayList<EmployeeArrange> employeeArrangeList;

    public EmployeeArrangeList() {
    }

    public EmployeeArrangeList(ArrayList<EmployeeArrange> employeeArrangeList) {
        this.employeeArrangeList = employeeArrangeList;
    }

    public ArrayList<EmployeeArrange> getEmployeeArrangeList() {
        return employeeArrangeList;
    }

    public void setEmployeeArrangeList(ArrayList<EmployeeArrange> employeeArrangeList) {
        this.employeeArrangeList = employeeArrangeList;
    }
    public void addArrange(EmployeeArrange a) {
        employeeArrangeList.add(a);
    }

    public void removeArrange(EmployeeArrange ea) {
        employeeArrangeList.remove(ea);
    }
    
    
}
