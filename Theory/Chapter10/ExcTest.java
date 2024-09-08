class ExcTest {
  // Method that generates an exception
  static void genException() {
    // Declare and initialize an array of size 4
    int nums[] = new int[4];

    // Print statement before generating the exception
    System.out.println("Before exception is generated.");

    // Generate an index out-of-bounds exception
    nums[7] = 10;  // Exception will occur here (invalid index)

    // This line will not execute because of the exception
    System.out.println("This won't be displayed.");
  }

  public static void main(String[] args) {
    try {
      // Call the method that generates the exception
      ExcTest.genException();
    } 
    // Catch block to handle the ArrayIndexOutOfBoundsException
    catch (ArrayIndexOutOfBoundsException exc) {
      // Output an error message when an out-of-bounds index is accessed
      System.out.println("Index out-of-bounds exception caught in main!");
    }

    // This line will run after the exception is handled
    System.out.println("After catch statement in main.");
  }
}
