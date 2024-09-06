class Vehicle {
  // Private fields to encapsulate the data
  // Encapsulation hides the internal state and requires controlled access
  private int passengers;  // Number of passengers the vehicle can carry
  private int fuelCap;     // Fuel capacity in gallons
  private int mpg;         // Fuel consumption in miles per gallon

  // Default constructor
  Vehicle() {
    // Initialize fields to default values
    this.passengers = 0;
    this.fuelCap = 0;
    this.mpg = 0;
  }

  // Parameterized constructor
  Vehicle(int passengers, int fuelCap, int mpg) {
    this.passengers = passengers;
    this.fuelCap = fuelCap;
    this.mpg = mpg;
  }

  // Setter methods to modify the object after creation
  void setPassengers(int passengers) {
    this.passengers = passengers;
  }

  void setFuelCap(int fuelCap) {
    this.fuelCap = fuelCap;
  }

  void setMpg(int mpg) {
    this.mpg = mpg;
  }

  // Getter methods to retrieve the values of the fields
  // Since the fields are private, getter methods are the only way to access these values
  int getPassengers() {
    return passengers;
  }

  int getFuelCap() {
    return fuelCap;
  }

  int getMpg() {
    return mpg;
  }

  // Method to display the vehicle's information
  void display() {
    System.out.println("Vehicle Details:");
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Fuel Capacity: " + getFuelCap() + " gallons");
      System.out.println("Miles per Gallon: " + getMpg());
  }
}

public class VehicleDemo4 {
  public static void main(String[] args) {
    // Using default constructor
    Vehicle van = new Vehicle();

    // Setting values after object creation using setter methods
    van.setPassengers(8);
    van.setFuelCap(16);
    van.setMpg(20);

    // Display the updated values
    van.display();

    // Accessing individual data using getter methods
    System.out.println("\nAccessing individual data using getter methods:");
    System.out.println("Number of Passengers: " + van.getPassengers());
    System.out.println("Fuel Capacity: " + van.getFuelCap() + " gallons");
    System.out.println("Miles per Gallon: " + van.getMpg());
  }
}
