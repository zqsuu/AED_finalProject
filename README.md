# AED_finalProject
## Description

### Airline Management System
#### ·Airline Management System is a Java swing application which integrates data coming from Aircompany, Aircraft Manufacturer, Airport, Customer. It can help both Admins and Customers manage and reserve flights in a convenient way. This system targets on connections between different organizations and different roles.

### Organization 1: Airline Company
#### Enterprise: Route, Airplane, Crew, Income, Route-Crew Arrangement
#### Role: Company Admin, Company Human Resource, Company Product Manager, Company Route Manager
##### 1.1  Route - manage information of route name, airline company, airport, flight time, terminal, baggage and price about the route;
##### 1.2  Airplane - record the airplane's capacity, fuel consumption, price, service life, type and connect the airplane to the airline company and the route;
##### 1.3  Crew - display employee's detail information of name, id, password, gender, role, flyYears, and age;
##### 1.4  Income - calculate the income of the airline company and the route;
##### 1.5  Route-Crew Arrangement - arrange different groups of crews to the route;

### Organization 2: Manufacture
#### Enterprise: Airplane
#### Role: Manufacturer
##### 2.1  Airplane - record the airplane's capacity, fuel consumption, price, service life, type and connect the airplane to the airline company and the route;

### Organization 3: Airport
#### Enterprise: Airport, Arrivals, Departures, Service, Location
#### Role: Airport Admin, Airport Route Manager, Airport Service Manager
##### 3.1  Airport - record the airport's name, password, city, address, and connect the airport service, route to the airport;
##### 3.2  Arrivals - display arrive-routes to this airport;
##### 3.3  Departures - display departure-routes from this airport;
##### 3.4  Service - show the name and time of the airport;
##### 3.5  Location - show the location of airport in Google Map;


### Organization 4: Customer
#### Enterprise: Customer, Reservation, Book, Customer Service
#### Role: Customer, Reservation Manager
##### 4.1  Customer - record the customer's id, name, password, gender, age, passport, email, and connect the flight reservation to the customer;
##### 4.2  Reservation - display reservations of the customer;
##### 4.3  Book - book the tickets, send the purchase state to airline company and wait the company to confirm;
##### 4.4  Customer Service - show the service booked by the customer;

#### Role: System Admin

## UML
![airline-uml (1)](https://user-images.githubusercontent.com/66103633/206909992-77f84e11-3795-4c77-b5b9-229a7799ded6.png)
## Sequence Diagram
![airline-sequence-diagram (1)](https://user-images.githubusercontent.com/66103633/206912688-d1c3a495-bcd1-4c56-a16a-4df0e5e2f5cd.png)
