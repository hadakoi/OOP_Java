// Handle error gracefully and continue
class ExcDemo3 {
  public static void main(String[] args) {
    // Define two arrays: one for numerators and one for denominators
    int numer[] = {4, 8, 16, 32, 64, 128};  // Numerators
    int denom[] = {2, 0, 4, 4, 0, 8};      // Denominators

    // Loop through both arrays using the same index
    for (int i = 0; i < numer.length; i++) {
      try {
        // Try dividing the elements of numer[] by denom[]
        // Print the result of the division
        System.out.println(numer[i] + " / " + denom[i] + " is " + (numer[i] / denom[i]));
      } 
      // Catch block to handle division by zero errors
      catch (ArithmeticException exc) {
        // Output a message when attempting to divide by zero
        System.out.println("Can't divide by Zero!");
      }
    }
        
    // After the loop finishes, the program continues executing normally
    System.out.println("Program completed.");
  }
}
