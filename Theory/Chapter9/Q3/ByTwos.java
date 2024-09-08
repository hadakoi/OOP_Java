// Class implementing the Series interface for a series of numbers incremented by 2
public class ByTwos implements Series {
  private int start;   // Starting value of the series
  private int current; // Current value in the series

  // Constructor initializes the series starting from 0
  public ByTwos() {
    this.start = 0; // Set starting value to 0
    this.current = start; // Initialize current value to start
  }

  // Override getNext() from Series interface
  @Override
  public int getNext() {
    int value = current; // Store the current value
    current += 2; // Increment the current value by 2 for the next call
    return value; // Return the stored value
  }

  // Override reset() from Series interface
  @Override
  public void reset() {
    current = start; // Reset the current value to the starting value
  }

  // Override setStart() from Series interface
  @Override
  public void setStart(int start) {
    this.start = start; // Set the starting value of the series
    this.current = start; // Initialize current value to the new starting value
  }
}
