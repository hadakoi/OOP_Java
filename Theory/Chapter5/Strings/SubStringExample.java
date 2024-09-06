public class SubstringExample {
  public static void main(String[] args) {
    // Define a string to extract a substring from
    String str = "hai hello";

    // Extract the substring starting at index 4 and ending at index 8 (9-1)
    String result = str.substring(4, 9);

    // Print the extracted substring
    System.out.println(result); // prints "hello"
  }
}
