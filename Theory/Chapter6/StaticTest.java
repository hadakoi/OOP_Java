// This class demonstrates the use of static variables and a static block
class StaticDemo {
  // Static variable: Shared among all instances of the class
  static int staticCount = 0;
  
  // Instance variable: Unique to each instance of the class
  int instanceCount;
  
  // Static block: Executes once when the class is first loaded
  static {
    System.out.println("Static block executed.");
    // Initialize static variables or perform one-time setup
    staticCount = 10; // Example initialization
  }
  
  // Constructor
  StaticDemo() {
    instanceCount = 1; // Initialize instance variable
    // Increment the static variable to show shared state
    staticCount++;
  }
  
  // Method to display values of the variables
  void displayCounts() {
    System.out.println("Static count: " + staticCount);
    System.out.println("Instance count: " + instanceCount);
  }
  
  // Static method: Can be called without creating an instance of the class
  static void staticMethod() {
    System.out.println("Static method called.");
    // Static method can access static variables directly
    System.out.println("Static count from static method: " + staticCount);
    // Cannot access instance variables or methods directly here
  }
}

public class StaticTest {
  public static void main(String[] args) {
    // Call the static method directly from the class
    StaticDemo.staticMethod();
    
    // Create instances of StaticDemo
    StaticDemo obj1 = new StaticDemo();
    StaticDemo obj2 = new StaticDemo();
    
    // Display counts for both objects
    obj1.displayCounts(); // Should show the same static count value
    obj2.displayCounts(); // Should show the same static count value
    
    // Show how static variables are shared across instances
    System.out.println("Static count after creating instances: " + StaticDemo.staticCount);
  }
}
