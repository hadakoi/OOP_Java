// Define the Overload class with overloaded constructors
class Overload {
  int data; // Field to store the result of the constructor operations

  // Constructor that takes one integer parameter
  Overload(int x) {
    data = x; // Set 'data' to the value of 'x'
  }

  // Constructor that takes two integer parameters
  Overload(int x, int y) {
    data = x + y; // Set 'data' to the sum of 'x' and 'y'
  }

  // Method to display the value of 'data'
  void displayData() {
    System.out.println("data: " + data);
  }
}

// Main class to test the Overload class
public class OverloadConstructor {
  public static void main(String[] args) {
    // Create an instance of Overload using the constructor with one parameter
    Overload obj1 = new Overload(10);
    // Display the result
    obj1.displayData(); // Should print: data: 10

    // Create an instance of Overload using the constructor with two parameters
    Overload obj2 = new Overload(5, 15);
    // Display the result
    obj2.displayData(); // Should print: data: 20
  }
}
