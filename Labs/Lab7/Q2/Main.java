import myPackages.p1.Maximum;

public class Main {
  public static void main(String[] args) {
    int intMax = Maximum.max(3, 7, 5);
    System.out.println("Maximum among 3, 7, 5: " + intMax);

    double doubleMax = Maximum.max(2.5, 3.7, 1.8);
    System.out.println("Maximum among 2.5, 3.7, 1.8: " + doubleMax);

    int[] array = {4, 9, 2, 6, 7};
    int arrayMax = Maximum.max(array);
    System.out.println("Maximum in the array: " + arrayMax);

    int[][] matrix = {
      {5, 2, 9},
      {8, 7, 6},
      {1, 3, 4}
    };
    int matrixMax = Maximum.max(matrix);
    System.out.println("Maximum in the matrix: " + matrixMax);
  }
}
