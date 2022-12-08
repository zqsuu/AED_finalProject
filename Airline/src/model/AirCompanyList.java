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
public class AirCompanyList {
    ArrayList<AirlineCompany> aircompany;
    
    public AirCompanyList(){
        aircompany = new ArrayList<AirlineCompany>();
    }
    
    public void addAirCompany(AirlineCompany a){
        aircompany.add(a);
    }
    
    public void removeAirCompany(AirlineCompany a){
        aircompany.remove(a);
    }
    
    public ArrayList<AirlineCompany> getAirCompany(){
        return aircompany;
    }
}
