public interface Series {
  int getNext(); // return next number in series
  void reset();  // restart the series
  void setStart(int x); // set starting value
}

public class ByTwos implements Series {
  private int start;   // The starting value of the series
  private int val;     // The current value in the series

  // Constructor
  public ByTwos() {
    start = 0; // Default start value is 0
    val = 0;
  }

  // Implementing getNext() from the Series interface
  public int getNext() {
    val += 2; // Increment by 2
    return val; // Return the new value
  }

  // Implementing reset() from the Series interface
  public void reset() {
    val = start; // Reset the series to the starting value
  }

  // Implementing setStart() from the Series interface
  public void setStart(int x) {
    start = x; // Set the starting value
    val = x;   // Initialize current value
  }
}

public class SeriesDemo {
  public static void main(String[] args) {
    ByTwos series = new ByTwos(); // Create an instance of ByTwos

    // Set the start value to 10
    series.setStart(10);

    // Get the next 5 numbers in the series
    for (int i = 0; i < 5; i++) {
      System.out.println("Next number: " + series.getNext());
    }

    // Reset the series
    series.reset();
    System.out.println("Series reset.");

    // Get the next number after reset
    System.out.println("Next number after reset: " + series.getNext());
  }
}
