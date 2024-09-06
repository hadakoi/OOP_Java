public class TwoDimensionalArrayExample1 {

  public static void main(String[] args) {
    // Create and initialize a 2-dimensional array
    int[][] matrix = {
      {3, 5, 7},
      {2, 8, 6},
      {4, 1, 9}
    };

    // Variable to keep track of the largest number
    int largest = matrix[0][0];
        
    // Loop through the 2D array to find the largest number
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
      // Compare each element with the current largest number
        if (matrix[i][j] > largest) {
          largest = matrix[i][j];
        }
      }
    }
        
    // Print the largest number
    System.out.println("The largest number in the 2D array is: " + largest);
  }
}
