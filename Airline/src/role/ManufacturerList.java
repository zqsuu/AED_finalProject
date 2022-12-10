/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package role;

import java.util.ArrayList;

/**
 *
 * @author zhiqingsu
 */
public class ManufacturerList {
    ArrayList<Manufacturer> manufacturer;
    
    public ManufacturerList() {
        manufacturer = new ArrayList<Manufacturer>();
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturer;
    }

    public void setManufacturerList(ArrayList<Manufacturer> manufacturerList) {
        this.manufacturer = manufacturerList;
    }
    
    
    public void addManufacturer(Manufacturer m) {
        manufacturer.add(m);
    }
    
    public void removeManufacturer(Manufacturer m) {
        manufacturer.remove(m);
    }
}
