// Define the Series interface
interface Series {
  int getNext();       // Return the next number in the series
  void reset();        // Reset the series to the starting value
  void setStart(int x);// Set a new starting value for the series
}

// Class ByTwos implements Series and provides functionality for a series incremented by 2
class ByTwos implements Series {
  int start;  // The starting value of the series
  int val;    // The current value in the series

  // Constructor: Initializes start and val to 0
  ByTwos() {
    start = 0;
    val = 0;
  }

  // Implements setStart() from Series interface
  public void setStart(int x) {
    start = x;  // Set the start value
    val = x;    // Set the current value to the start value
  }

  // Implements getNext() from Series interface
  public int getNext() {
    val += 2;   // Increment the current value by 2
    return val; // Return the new value
  }

  // Implements reset() from Series interface
  public void reset() {
    val = start; // Reset the current value to the start value
  }
}

// Class ByThrees implements Series and provides functionality for a series incremented by 3
class ByThrees implements Series {
  int start;  // The starting value of the series
  int val;    // The current value in the series

  // Constructor: Initializes start and val to 0
  ByThrees() {
    start = 0;
    val = 0;
  }

  // Implements setStart() from Series interface
  public void setStart(int x) {
    start = x;  // Set the start value
    val = x;    // Set the current value to the start value
  }

  // Implements getNext() from Series interface
  public int getNext() {
    val += 3;   // Increment the current value by 3
    return val; // Return the new value
  }

  // Implements reset() from Series interface
  public void reset() {
    val = start; // Reset the current value to the start value
  }
}

// Main class for testing both ByTwos and ByThrees series
public class ByTwoThreesSeries {
    public static void main(String[] args) {
        // Create an instance of ByTwos
        ByTwos ob2 = new ByTwos();

        // Create an instance of ByThrees
        ByThrees ob3 = new ByThrees();

        // Test ByTwos series
        System.out.println("ByTwos Series: ");
        System.out.println("Starting at: " + ob2.val);  // Output the starting value
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value: " + ob2.getNext());  // Output the next 5 values in ByTwos series
        }

        // Test ByThrees series
        System.out.println("ByThrees Series: ");
        ob3.reset();  // Reset the series to the starting value
        System.out.println("Starting at: " + ob3.val);  // Output the starting value after reset
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value: " + ob3.getNext());  // Output the next 5 values in ByThrees series
        }

        // Set a new start value for ByTwos
        System.out.println("ByTwos Series: ");
        ob2.setStart(100);  // Set the starting value of ByTwos to 100
        System.out.println("Starting at: " + ob2.val);  // Output the new start value
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value: " + ob2.getNext());  // Output the next 5 values starting from 100 in ByTwos series
        }
    }
}
