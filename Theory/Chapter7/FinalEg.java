/*

The `final` keyword in Java is used for:
  
1. **Final Classes**: Prevents a class from being subclassed. 
   Once a class is declared as `final`, no other class can extend it.
  
2. **Final Methods**: Prevents a method from being overridden in subclasses. 
   Once a method is declared as `final`, it cannot be changed by any subclass.
  
 3. **Final Variables**: Defines constants or read-only variables.
    Once a variable is declared as `final`, its value cannot be modified after initialization.
 
 Example:
 - `final class MyClass` cannot be extended by other classes.
 - `final int x = 3;` makes `x` a constant whose value cannot be changed.
 - `public static final double PI = 3.14159;` defines a constant value of PI.
 - `final double getPI()` method cannot be overridden by subclasses.

 */

final class MyClass {
    // Final variable, read-only
    final int x = 3; // Value of x cannot be changed once initialized
    public static final double PI = 3.14159; // Static final variable (constant), shared across all instances
    
    // Final method, cannot be overridden
    final double getPI() {
        return PI; // Returns the constant value of PI
    }
    
    // Final method to display the value of x
    final void displayValue() {
        System.out.println("Value of x: " + x); // Displays the constant value of x
    }
}

public class FinalEg {
  public static void main(String[] args) {
    // Create an instance of MyClass
    MyClass obj = new MyClass();
        
    // Display the value of x
    obj.displayValue(); // Output: Value of x: 3
        
    // Display the constant PI
    System.out.println("Value of PI: " + obj.getPI()); // Output: Value of PI: 3.14159
  }
}
