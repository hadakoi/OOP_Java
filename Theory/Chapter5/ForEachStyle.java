public class ForEachStyle {
  public static void main(String[] args) {
    // Initialize the array
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
    // Variable to hold the sum of the array values
    int sum = 0;
        
    // Iterate over each element in the array using a for-each loop
    for (int x : nums) {
      // Print the current value
      System.out.println("Value is: " + x);  
      // Add the current value to the sum
      sum += x;
    }
        
    // Print the total sum of the array values
    System.out.println("Summation: " + sum);
  }
}
