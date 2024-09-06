import java.util.Scanner;

class Vehicle {
  int passengers;  // Number of passengers the vehicle can carry
  int fuelCap;     // Fuel capacity in gallons
  int mpg;         // Fuel consumption in miles per gallon

  // Default constructor
  Vehicle() {
    // Initialize fields to default values
    this.passengers = 0;
    this.fuelCap = 0;
    this.mpg = 0;
  }

  // Parameterized constructor to initialize vehicle attributes
  Vehicle(int passengers, int fuelCap, int mpg) {
    this.passengers = passengers;
    this.fuelCap = fuelCap;
    this.mpg = mpg;
  }

  // Method to read input from the user
  void read() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of passengers: ");
    this.passengers = scanner.nextInt();

    System.out.print("Enter fuel capacity (in gallons): ");
    this.fuelCap = scanner.nextInt();

    System.out.print("Enter miles per gallon (mpg): ");
    this.mpg = scanner.nextInt();
  }

  void display() {
    System.out.println("Vehicle Details:");
    System.out.println("Passengers: " + passengers);
    System.out.println("Fuel Capacity: " + fuelCap + " gallons");
    System.out.println("Miles per Gallon: " + mpg);
  }
}

public class Main {
  public static void main(String[] args) {
    // Creating an object using the default constructor
    Vehicle van = new Vehicle();

    // Calling the read method to initialize the object using user input
    van.read();

    // Displaying the vehicle details
    van.display();
  }
}
