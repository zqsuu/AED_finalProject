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
public class AirlineCompany {

    String name;
    String id;
    String password;
    ArrayList<Airplane> airplane;
    ArrayList<Employee> employee;
    ArrayList<Route> route;
    ArrayList<FlightReservation> order;
    ArrayList<EmployeeArrange> arrange;

    public AirlineCompany(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.airplane = new ArrayList<Airplane>();
        this.employee = new ArrayList<Employee>();
        this.route = new ArrayList<Route>();
        arrange = new ArrayList<EmployeeArrange>();
    }

    public AirlineCompany() {
        this.route = new ArrayList<Route>();
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

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public void setRoute(ArrayList<Route> route) {
        this.route = route;
    }

    public void setOrder(ArrayList<FlightReservation> order) {
        this.order = order;
    }

    public void setArrange(ArrayList<EmployeeArrange> arrange) {
        this.arrange = arrange;
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

    public void addOrder(FlightReservation fr) {
        order.add(fr);
    }

    public ArrayList<Airplane> getAirplane() {
        return airplane;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public ArrayList<Route> getRoute() {
        return route;
    }

    public void addRoute(Route r) {
        route.add(r);
    }

    public void removeRoute(Route r) {
        route.remove(r);
    }

    public void addAirplane(Airplane a) {
        airplane.add(a);
    }

    public void removeAirplane(Airplane a) {
        airplane.remove(a);
    }

    public void addEmployee(Employee e) {
        employee.add(e);
    }

    public void removeEmployee(Employee e) {
        employee.remove(e);
    }

    public int companyIncome() {
        int income = 0;
        ArrayList<Route> r = new ArrayList<Route>();
        for (FlightReservation f : order) {
            income += f.getPrice();
            boolean isCalculated = false;
            for (Route rou : r) {
                if (f.getRoute() == rou) {
                    isCalculated = true;
                    break;
                }
            }
            if (!isCalculated) {
                income -= f.getRoute().getAirplane().getFuelConsumption() * f.getRoute().getFlytime();
                r.add(f.getRoute());
            }
        }
        for (Airplane air : airplane) {
            income -= air.getPrice();
        }
        return income;
    }

    public int routeIncome(Route r) {
        int income = 0;
        for (FlightReservation f : order) {
            if (f.getRoute() == r) {
                income += f.getPrice();
            }
        }
        income -= r.getAirplane().getFuelConsumption() * r.getFlytime();
        return income;
    }

    public void addArrange(EmployeeArrange ea) {
        arrange.add(ea);
    }

    public void removeArrange(EmployeeArrange ea) {
        arrange.remove(ea);
    }

//    String query = "INSERT into featuredfilms_INFO (movieId, genres)" + "VALUES (?, ?)";
//    PreparedStatement preparedStmt = conn.prepareStatement(query);
//
//    preparedStmt.setString (
//    1, ID);
//    for (String realGenre : genre
//
//    
//        ) {
//    preparedStmt.setString(2, realGenre);
//        preparedStmt.executeUpdate();
//}
    
//        try {
//  connection con
//        .setAutoCommit(false);
//        PreparedStatement prepStmt = con.prepareStatement(
//                "insert into product(code,name,price,available) values (?,?,?,?");
//        Iterator<Product> it = li.iterator();
//        while (it.hasNext()) {
//            Product p = it.next();
//            prepStmt.setString(1, p.getCode());
//            prepStmt.setString(2, p.getCode());
//            prepStmt.setInt(3, p.getPrice());
//            prepStmt.setBoolean(4, p.isAvailable());
//            prepStmt.addBatch();
//
//        }
//        int[] numUpdates = prepStmt.executeBatch();
//        for (int i = 0; i < numUpdates.length; i++) {
//            if (numUpdates[i] == -2) {
//                System.out.println("Execution " + i
//                        + ": unknown number of rows updated");
//            } else {
//                System.out.println("Execution " + i
//                        + "successful: " + numUpdates[i] + " rows updated");
//            }
//        }
//        con.commit();
//    }
//    catch(BatchUpdateException b

//
//) {
//  // process BatchUpdateException
//} 
    
    
    
    
}
