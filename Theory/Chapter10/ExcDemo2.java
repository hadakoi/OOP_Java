class ExcDemo2 {
  public static void main(String[] args) {
    try {
      // Call the method genException() from the ExcTest class
      // This will generate an ArrayIndexOutOfBoundsException
      ExcTest.genException();
    } 
    // Catch block to handle the ArrayIndexOutOfBoundsException
    catch (ArrayIndexOutOfBoundsException exc) {
      // Exception is caught here, so the flow of the program continues after handling it
      System.out.println("Index out-of-bounds!");  // Message indicating the exception was caught
    }

    // This line is executed after the exception has been caught and handled
    System.out.println("After catch statement.");
  }
}
