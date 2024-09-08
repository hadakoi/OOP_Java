package myPackages.p1;

public class Maximum {

  // Method to find the maximum of three integers
  public static int max(int a, int b, int c) {
    // Compare a and b, then compare the result with c
    if (a > b) {
      return (a > c) ? a : c; // If a is greater than b, return a if a is greater than c, else return c
    } else {
      return (b > c) ? b : c; // If b is greater than or equal to a, return b if b is greater than c, else return c
    }
  }

  // Method to find the maximum of three doubles
  public static double max(double a, double b, double c) {
    // Compare a and b, then compare the result with c
    if (a > b) {
      return (a > c) ? a : c; // If a is greater than b, return a if a is greater than c, else return c
    } else {
      return (b > c) ? b : c; // If b is greater than or equal to a, return b if b is greater than c, else return c
    }
  }

  // Method to find the maximum value in an array of integers
  public static int max(int[] array) {
    int max = array[0]; // Assume the first element is the maximum initially
    for (int i = 1; i < array.length; i++) { // Iterate through the rest of the array
      if (array[i] > max) { // If the current element is greater than max
        max = array[i]; // Update max to the current element
      }
    }
    return max; // Return the maximum value found
  }

  // Method to find the maximum value in a 2D array of integers
  public static int max(int[][] matrix) {
    int max = matrix[0][0]; // Assume the first element is the maximum initially
    for (int[] row : matrix) { // Iterate through each row of the matrix
      for (int element : row) { // Iterate through each element in the current row
        if (element > max) { // If the current element is greater than max
          max = element; // Update max to the current element
        }
      }
    }
    return max; // Return the maximum value found
  }
}
