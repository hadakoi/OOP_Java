// Base class
class Vehicle {
  // Method to be overridden
  void startEngine() {
    System.out.println("Vehicle engine starts.");
  }
}

// Subclass Car that overrides the startEngine method
class Car extends Vehicle {
  @Override
  void startEngine() {
    System.out.println("Car engine starts with a roar.");
  }
}

// Subclass Motorcycle that overrides the startEngine method
class Motorcycle extends Vehicle {
  @Override
  void startEngine() {
    System.out.println("Motorcycle engine starts with a vroom.");
  }
}

public class Override1 {
  public static void main(String[] args) {
    Vehicle myVehicle = new Car();

    myVehicle.startEngine(); // Outputs: Car engine starts with a roar.

    // Reference of Vehicle pointing to Motorcycle
    myVehicle = new Motorcycle();
    myVehicle.startEngine(); // Outputs: Motorcycle engine starts with a vroom.
  }
}
