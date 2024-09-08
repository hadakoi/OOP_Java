import myPackages.p1.Maximum;

public class Main {
  public static void main(String[] args) {
    // Find the maximum among three integers
    int intMax = Maximum.max(3, 7, 5);
    System.out.println("Maximum among 3, 7, 5: " + intMax);
    // Output: Maximum among 3, 7, 5: 7

    // Find the maximum among three doubles
    double doubleMax = Maximum.max(2.5, 3.7, 1.8);
    System.out.println("Maximum among 2.5, 3.7, 1.8: " + doubleMax);
    // Output: Maximum among 2.5, 3.7, 1.8: 3.7

    // Find the maximum value in an integer array
    int[] array = {4, 9, 2, 6, 7};
    int arrayMax = Maximum.max(array);
    System.out.println("Maximum in the array: " + arrayMax);
    // Output: Maximum in the array: 9

    // Find the maximum value in a 2D integer matrix
    int[][] matrix = {
      {5, 2, 9},
      {8, 7, 6},
      {1, 3, 4}
    };
    int matrixMax = Maximum.max(matrix);
    System.out.println("Maximum in the matrix: " + matrixMax);
    // Output: Maximum in the matrix: 9
  }
}

