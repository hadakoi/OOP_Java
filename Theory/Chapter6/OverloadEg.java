// Define the Overload class with overloaded methods
class Overload {
  
  // Method with no parameters
  void test() {
    System.out.println("No parameters");
  }

  // Overloaded method with one integer parameter
  void test(int a) {
    System.out.println("a: " + a);
  }

  // Overloaded method with two integer parameters
  void test(int a, int b) {
    System.out.println("a and b: " + a + " " + b);
  }

  // Overloaded method with one double parameter
  double test(double a) {
    System.out.println("double a: " + a);
    return a * a; // Returns the square of the double value
  }
}

// Main class to test the Overload class
public class OverloadEg {
  public static void main(String[] args) {
    // Create an instance of the Overload class
    Overload obj = new Overload();

    // Call the method with no parameters
    obj.test();
    
    // Call the method with one integer parameter
    obj.test(10);
    
    // Call the method with two integer parameters
    obj.test(5, 15);
    
    // Call the method with one double parameter and print the return value
    double result = obj.test(3.5);
    System.out.println("Returned value from double test: " + result);
  }
}
