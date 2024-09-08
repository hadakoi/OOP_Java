// Interface A with a nested interface
interface A {
  // Nested interface within interface A
  // This nested interface is implicitly public
  public interface NestedIF {
    // Method declaration in nested interface
    boolean isNotNegative(int x);
  }
    
  // Method declaration in the outer interface A
  void doSomething();
}

// Class B implements the nested interface NestedIF from interface A
class B implements A.NestedIF {
  // Providing implementation for the isNotNegative method
  @Override
  public boolean isNotNegative(int x) {
    // Returns true if x is not negative, otherwise returns false
    return x < 0 ? false : true;
  }
}

// Main class to demonstrate the usage of nested interface
public class NestedIF {
  public static void main(String[] args) {
    // Creating an instance of B which implements the nested interface NestedIF
    A.NestedIF nif = new B();
        
    // Using the isNotNegative method from the nested interface
    if (nif.isNotNegative(10)) {
      System.out.println("10 is not negative"); // This will be displayed
    }
        
    if (nif.isNotNegative(-12)) {
      System.out.println("This won't be displayed"); // This won't be displayed
    }
  }
}
