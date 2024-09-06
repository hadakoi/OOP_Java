class Vehicle {
  int passengers;  // Number of passengers the vehicle can carry
  int fuelCap;     // Fuel capacity in gallons
  int mpg;         // Fuel consumption in miles per gallon

  // Parameterized constructor to initialize vehicle attributes using 'this'
  Vehicle(int passengers, int fuelCap, int mpg) {
    this.passengers = passengers;  // 'this.passengers' refers to the instance variable
    this.fuelCap = fuelCap;        // 'this.fuelCap' refers to the instance variable
    this.mpg = mpg;                // 'this.mpg' refers to the instance variable
  }

  // Method to display the details of the vehicle
  void display() {
    System.out.println("Vehicle Details:");
    System.out.println("Passengers: " + passengers);
    System.out.println("Fuel Capacity: " + fuelCap + " gallons");
    System.out.println("Miles per Gallon: " + mpg);
  }
}

public class VehicleDemo2 {
  public static void main(String[] args) {
    // Creating an object using a parameterized constructor must be declared here cannot be done on a seperate line.
    Vehicle van = new Vehicle(8, 16, 20);

    // Calling the display method to show the details of the vehicle
    van.display();
  }
}

