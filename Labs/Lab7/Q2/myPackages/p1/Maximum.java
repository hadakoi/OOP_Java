package myPackages.p1;

public class Maximum {
    
  public static int max(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }

  public static double max(double a, double b, double c) {
    return Math.max(Math.max(a, b), c);
  }

  public static int max(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public static int max(int[][] matrix) {
    int max = matrix[0][0];
    for (int[] row : matrix) {
      for (int element : row) {
        if (element > max) {
          max = element;
        }
      }
    }
    return max;
  }
}
