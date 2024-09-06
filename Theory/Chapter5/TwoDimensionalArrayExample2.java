import java.util.Scanner;

public class TwoDimensionalArrayExample2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    // Ask for the dimensions of the 2D array
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = scanner.nextInt();
        
    // Create the 2D array with the specified dimensions
    int[][] matrix = new int[rows][columns];
        
    // Input values for each element of the 2D array
    System.out.println("Enter the values for the matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
        matrix[i][j] = scanner.nextInt();
      }
    }
        
    // Calculate the sum of all values in the 2D array
    int sum = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        sum += matrix[i][j];
      }
    }
        
    // Print the sum of all values
    System.out.println("The sum of all values in the 2D array is: " + sum);
  }
}
