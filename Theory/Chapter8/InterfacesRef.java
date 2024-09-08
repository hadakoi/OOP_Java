// This code demonstrates the use of interfaces in Java.
// An interface defines a contract for classes to follow without specifying the implementation.
// Any class that implements the interface must provide concrete implementations for its methods.
// This code shows how to create and use an interface reference to work with multiple classes
// that implement the same interface, showcasing polymorphism and flexibility.

interface Series {
  int getNext(); // Returns the next number in the series
  void reset();  // Resets the series to the starting value
  void setStart(int x); // Sets the starting value of the series
}

// The ByTwos class implements the Series interface.
// This class generates a series of numbers that increment by 2.
class ByTwos implements Series {
  int start; // Starting value of the series
  int val;   // Current value in the series

  ByTwos() {
    start = 0;  // Initialize start to 0
    val = 0;    // Initialize current value to 0
  }

  // Set the starting value of the series
  public void setStart(int x) {
    start = x;
    val = x;
  }

  // Returns the next value in the series, which increments by 2
  public int getNext() {
    val += 2;
    return val;
  }

  // Resets the series to the start value
  public void reset() {
    val = start;
  }
}

// The ByThrees class implements the Series interface.
// This class generates a series of numbers that increment by 3.
class ByThrees implements Series {
  int start; // Starting value of the series
  int val;   // Current value in the series

  ByThrees() {
      start = 0;  // Initialize start to 0
      val = 0;    // Initialize current value to 0
    }

  // Set the starting value of the series
  public void setStart(int x) {
    start = x;
    val = x;
  }

  // Returns the next value in the series, which increments by 3
  public int getNext() {
    val += 3;
    return val;
  }

  // Resets the series to the start value
  public void reset() {
    val = start;
  }
}

public class InterfaceRef {
  public static void main(String[] args) {
    ByTwos ob2 = new ByTwos();  // Create an instance of ByTwos
    ByThrees ob3 = new ByThrees();  // Create an instance of ByThrees
    Series iRef;  // Declare an interface reference of type Series

    System.out.println("Series.....");
        
    // Loop to demonstrate polymorphism with interface references
    for (int i = 0; i < 5; i++) {
      iRef = ob2;  // iRef now refers to the ByTwos object (ob2)
      System.out.println("ByTwos Next value: " + iRef.getNext());  // Call getNext() using ByTwos implementation

      iRef = ob3;  // iRef now refers to the ByThrees object (ob3)
      System.out.println("ByThrees Next value: " + iRef.getNext());  // Call getNext() using ByThrees implementation
    }
  }
}
