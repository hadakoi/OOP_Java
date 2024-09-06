public class ArrayExample1 {
  public static void main(String[] args) {
    // Declare and create an array of integers with a size of 30
    int[] grades = new int[30];
        
    // Access and modify array elements
    grades[0] = 100;            // Set the first element to 100
    grades[29] = 0;            // Set the last element to 0
    grades[1] = grades[0];    // Set the second element to the value of the first element
    grades[2] = grades[3 * 2 + 1]; // Set the third element to the value of the 7th element
        
    // Initialize all elements of the array to i + 70
    for (int i = 0; i < 30; i++) {
      grades[i] = i + 70;
    }
        
    // Declare and initialize an array with specific values
    int[] fourVals = {3, 1, 4, 1};
        
    // Print the values in the fourVals array
    System.out.println("Values in fourVals array:");
    for (int i = 0; i < fourVals.length; i++) {
      System.out.println("fourVals[" + i + "] = " + fourVals[i]);
    }
  }
}
