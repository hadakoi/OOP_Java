class ExcDemo4 {
  public static void main(String[] args) {
    // Array of numerators with more elements than denominators
    int numer[] = {4, 8, 16, 32, 64, 128, 256, 512}; // Numerator array
    int denom[] = {2, 0, 4, 4, 0, 8};                // Denominator array (shorter)

    // Loop through the length of the numer array
    for (int i = 0; i < numer.length; i++) {
      try {
        // Attempt to divide numer[i] by denom[i]
        // This will generate an ArrayIndexOutOfBoundsException when denom is shorter
        System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
      }
      // Catch block to handle division by zero
      catch (ArithmeticException exc) {
        // If an ArithmeticException occurs (like dividing by zero), this message is printed
        System.out.println("Can't divide by Zero!");
      }
      // Catch block to handle accessing elements out of bounds in denom array
      catch (ArrayIndexOutOfBoundsException exc) {
        // If an ArrayIndexOutOfBoundsException occurs, this message is printed
        System.out.println("No matching element found.");
      }
    }

    // After the loop, the program continues normally
    System.out.println("Program continues after exception handling.");
  }
}
