// Interface containing mathematical constants
interface MathConstants {
  // Constants are implicitly public, static, and final
  double PI = 3.14159;   // The value of Pi
  double E = 2.71828;    // The value of Euler's number
}

// Interface defining some integer constants
interface Iconst {
  int MIN = 0;                  // Minimum value constant
  int MAX = 10;                 // Maximum value constant
  String ERRORMSG = "Boundary Error";  // Error message for boundary conditions
}

// Class implementing the Iconst interface
public class IfConstants implements Iconst {
  public static void main(String[] args) {
    // Create an array of integers with size defined by the MAX constant
    int[] nums = new int[MAX];

    // Loop from MIN to MAX (inclusive)
    for (int i = MIN; i <= MAX; i++) {
      // Check if the index is out of bounds
      if (i >= MAX) {
        // Print an error message if the index exceeds MAX
        System.out.println(ERRORMSG);
      } else {
        // Assign value to the array and print it if within bounds
        nums[i] = i;
        System.out.print(nums[i] + " ");
      }
    }
  }
}
