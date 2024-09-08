// Interface defining the contract for a series of numbers
public interface Series {
  // Method to get the next value in the series
  int getNext();
  
  // Method to reset the series to its starting value
  void reset();
  
  // Method to set the starting value of the series
  void setStart(int start);
}
