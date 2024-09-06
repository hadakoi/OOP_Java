import java.util.Scanner;

public class InitialsToEmail {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your full name: ");
    String fullName = scanner.nextLine();

    // Split the full name into individual words based on spaces
    // The split(" ") method splits the full name into separate parts using a space as the delimiter.
    // For example, if the user enters "Aryan Kudva", it will split into {"Aryan", "Kudva"}.
    String[] nameParts = fullName.split(" ");

    // Initialize a variable to store the initials
    String initials = "";

    // Loop through each part of the name to extract the first letter of each word
    // 'part' will contain each word of the full name, e.g., first "Aryan", then "Kudva".
    for (String part : nameParts) {
      if (!part.isEmpty()) {  // Check if the part is not an empty string (in case of extra spaces)
      // Extract the first character of each word using charAt(0) and concatenate it to initials
      initials += part.charAt(0);  // Adds the first character of each name part to 'initials'
      }
    }

    // Convert the initials to uppercase to ensure proper formatting (e.g., "AK" instead of "ak")
    initials = initials.toUpperCase();

    // Create an email address using the initials by appending "@example.com"
    String email = initials + "@example.com";

    // Print the initials and the generated email address
    System.out.println("Your initials are: " + initials);
    System.out.println("Your email is: " + email);
  }
}
