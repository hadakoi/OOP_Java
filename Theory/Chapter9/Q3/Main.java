// Main class to test the ByTwos class and Series interface
public class Main {
  public static void main(String[] args) {
    Series series = new ByTwos(); // Create an instance of ByTwos via Series interface

    series.setStart(10); // Set the starting value of the series to 10

    System.out.println("Series starting at 10:");
    // Print the first 5 values in the series starting from 10
    for (int i = 0; i < 5; i++) {
      System.out.println(series.getNext()); // Get and print the next value in the series
    }

    series.reset(); // Reset the series to the starting value

    System.out.println("Series after reset:");
    // Print the first 5 values in the series after resetting
    for (int i = 0; i < 5; i++) {
      System.out.println(series.getNext()); // Get and print the next value in the series
    }
  }
}

