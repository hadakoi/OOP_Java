public class StringOperations {

  public static void main(String[] args) {
    // Define a string
    String s1 = "abcde";
        
    // Print the length of the string
    System.out.println("Length of the string: " + s1.length()); // prints "5"
        
    // Print the character at index 2
    System.out.println("Character at index 2: " + s1.charAt(2)); // prints "c"
        
    // Compare the string with another string and check the result
    if(s1.compareTo("xyz") < 0)
      System.out.println("Yes"); // prints "Yes" because "abcde" is lexicographically smaller than "xyz"
        
    // Find and print the index of substring "bc"
    System.out.println("Index of 'bc': " + s1.indexOf("bc")); // prints "1"
        
    // Find and print the index of character 'f' (which doesn't exist in the string)
    System.out.println("Index of 'f': " + s1.indexOf("f")); // prints "-1"
        
    // Find and print the index of substring "ef" (which doesn't exist in the string)
    System.out.println("Index of 'ef': " + s1.indexOf("ef")); // prints "-1"
  }
}
