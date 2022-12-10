/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package role;


import java.util.ArrayList;
import model.Airplane;

/**
 *
 * @author zhiqingsu
 */
public class Manufacturer {
    String name;
    String id;
    String password;
    ArrayList<Airplane> airplane;

    public Manufacturer() {
    }

    
    public Manufacturer(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.airplane = new ArrayList<Airplane>();
    }
    
    public void addAirplane(Airplane a){
        airplane.add(a);
    }
    
    public ArrayList<Airplane> getAirplane(){
        return airplane;
    }

    public String getName() {
        return name;
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

    public void setAirplane(ArrayList<Airplane> airplane) {
        this.airplane = airplane;
    }
    
    
    
}
