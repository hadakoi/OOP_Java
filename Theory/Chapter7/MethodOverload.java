// Class with overloaded methods
class Calculator {
  // Method to add two integers
  int add(int a, int b) {
    return a + b;
  }

  // Overloaded method to add three integers
  int add(int a, int b, int c) {
    return a + b + c;
  }

  // Overloaded method to add two double values
  double add(double a, double b) {
    return a + b;
  }
}

public class TestOverloading {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    // Calling overloaded methods
    System.out.println("Sum of 5 and 10: " + calc.add(5, 10));           // Outputs: 15
    System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15)); // Outputs: 30
    System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));  // Outputs: 16.0
  }
}
