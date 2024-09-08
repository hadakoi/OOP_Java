class ExcDemo {
  public static void main(String[] args) {
    // Declare and initialize an array of size 4
    int nums[] = new int[4];
    try {
      // This will run before the exception is generated
      System.out.println("Before exception is generated.");
            
      // Generate an index out-of-bounds exception by trying to access an invalid index
      nums[7] = 10;  // Attempting to assign a value to the 8th element (which doesn't exist)
            
      // This line will not be executed due to the exception
      System.out.println("This won't be displayed.");
    } 

    // Catch block to handle the ArrayIndexOutOfBoundsException
    catch (ArrayIndexOutOfBoundsException exc) {
      // Output an error message when an out-of-bounds index is accessed
      System.out.println("Index out-of-bounds!");
    }

    // This line will run after the catch block executes
    System.out.println("After catch statement.");
  }
}
