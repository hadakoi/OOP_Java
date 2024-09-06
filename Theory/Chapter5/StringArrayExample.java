public class StringArrayExample {
  public static void main(String[] args) {
    // Initialize the string array
    String strs[] = { "This", "is", "a", "test." };

    // Print the original array
    System.out.println("Original array: ");
    for (String s : strs) {
      System.out.print(s + " ");
    }

    System.out.println("\n"); // Print a newline for better readability

    // Modify specific elements in the array
    strs[1] = "was";         // Change "is" to "was"
    strs[3] = "test, too!";  // Change "test." to "test, too!"

    // Print the modified array
    System.out.println("Modified array: ");
    for (String s : strs) {
      System.out.print(s + " ");
    }
  }
}
