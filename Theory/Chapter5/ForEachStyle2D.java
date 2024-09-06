public class ForEachStyle2D {
  public static void main(String[] args) {
    int sum = 0;
    int nums[][] = new int[3][5];

    // Fill the 2D array with values using a traditional for loop
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
          nums[i][j] = (i + 1) * (j + 1); // Example value assignment
      }
    }
        
    // Use for-each loop to display and sum the values
    // Iterate over each row in the 2D array
    for (int[] row : nums) {  // row represents each 1D array (row) in nums
      // Iterate over each element in the current row
      for (int value : row) {   // value represents each element in the current row
        // Print the value of the current element
        System.out.println("Value is: " + value);
        // Add the value of the current element to the sum
        sum += value;
      }
    }
        
    // Print the total sum of all values in the 2D array
    System.out.println("Summation: " + sum);
  }
}
