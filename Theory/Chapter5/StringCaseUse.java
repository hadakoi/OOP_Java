import java.util.Scanner;

public class TemperatureSwitch {

  public static void main(String[] args) {
  // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);
    // Prompt the user to enter the temperature level (high or low)
    System.out.println("Enter temperature level (high/low): ");
    String temp = scanner.nextLine(); // Read input from user

    // Use a switch statement to handle different cases for the temperature level
    switch (temp) {
      case "high":
        System.out.println("Switch off the heater");
        break;
      case "low":
        System.out.println("Wait");
        break;
      default:
        // Handle invalid input
        System.out.println("Invalid input. Please enter 'high' or 'low'.");
        break;
      }
  }
}
