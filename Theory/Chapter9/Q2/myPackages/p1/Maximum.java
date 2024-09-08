package myPackages.p1;

public class Maximum {

  // Method to find the maximum of three integers
  public static int max(int a, int b, int c) {
    // Compare a and b, then compare the result with c to find the maximum
    if (a > b) {
      // If a is greater than b, return a if a is greater than c; otherwise, return c
      return (a > c) ? a : c;
    } else {
      // If b is greater than or equal to a, return b if b is greater than c; otherwise, return c
      return (b > c) ? b : c;
    }
  }

  // Method to find the maximum of three doubles
  public static double max(double a, double b, double c) {
    // Compare a and b, then compare the result with c to find the maximum
    if (a > b) {
      // If a is greater than b, return a if a is greater than c; otherwise, return c
      return (a > c) ? a : c;
    } else {
      // If b is greater than or equal to a, return b if b is greater than c; otherwise, return c
      return (b > c) ? b : c;
    }
  }

  // Method to find the maximum value in an array of integers
  public static int max(int[] array) {
    int max = array[0]; // Initialize max to the first element of the array
    for (int i = 1; i < array.length; i++) { // Iterate through the rest of the array
      if (array[i] > max) { // Update max if the current element is greater than the current max
        max = array[i];
      }
    }
    return max; // Return the maximum value found in the array
  }

  // Method to find the maximum value in a 2D array of integers
  public static int max(int[][] matrix) {
    int max = matrix[0][0]; // Initialize max to the first element of the matrix
    for (int[] row : matrix) { // Iterate through each row of the matrix
      for (int element : row) { // Iterate through each element in the current row
        if (element > max) { // Update max if the current element is greater than the current max
          max = element;
        }
      }
    }
    return max; // Return the maximum value found in the 2D matrix
  }
}
