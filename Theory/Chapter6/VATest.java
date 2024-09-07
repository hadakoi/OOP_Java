// Class to demonstrate the use of varargs
class VATest {

  // Method that accepts a variable number of integer arguments
  static void vaMethod(int... data) {
    // The parameter 'data' is treated as an array within the method
    // Print each integer value separated by a space
    for (int x : data) {
      System.out.print(x + " ");
    }
    // Print a new line after all values
    System.out.println();
  }

  public static void main(String[] args) {
    // Call the vaMethod with a single integer argument
    vaMethod(1); // Output: "1 "

    // Call the vaMethod with multiple integer arguments
    vaMethod(1, 2, 3); // Output: "1 2 3 "

    // Call the vaMethod with no arguments
    vaMethod(); // Output: (prints nothing, just a new line)

    // Call the vaMethod with mixed numbers
    vaMethod(10, 20, 30, 40, 50); // Output: "10 20 30 40 50 "
  }
}
