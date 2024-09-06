// Vehicle class represents a vehicle with properties such as passengers, fuel capacity, and miles per gallon (mpg).
class Vehicle {
  int passengers;  // Number of passengers the vehicle can carry
  int fuelCap;     // Fuel capacity in gallons
  int mpg;         // Fuel consumption in miles per gallon
}

// VehicleDemo class contains the main method to demonstrate the Vehicle class.
class VehicleDemo {
  public static void main(String[] args) {
    // Creating an object of Vehicle class named van
    Vehicle van = new Vehicle();
        
    // Setting properties for the van object
    van.passengers = 8;
    van.fuelCap = 16;
    van.mpg = 20;
        
    // Creating another object of Vehicle class named car
    Vehicle car = new Vehicle();
        
    // Setting properties for the car object
    car.passengers = 4;
    car.fuelCap = 12;
    car.mpg = 25;

    // Displaying information about the van
    System.out.println("Van can carry " + van.passengers + " passengers.");
    System.out.println("Van has a fuel capacity of " + van.fuelCap + " gallons.");
    System.out.println("Van's fuel consumption is " + van.mpg + " miles per gallon.");

    // Displaying information about the car
    System.out.println("Car can carry " + car.passengers + " passengers.");
    System.out.println("Car has a fuel capacity of " + car.fuelCap + " gallons.");
    System.out.println("Car's fuel consumption is " + car.mpg + " miles per gallon.");
  }
}

