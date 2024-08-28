import java.util.Scanner;

public class CommaPunctuatedNumber {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a number string: ");
      String numberStr = scanner.nextLine();

      StringBuilder result = new StringBuilder();

      int length = numberStr.length();
      int count = 0;

      for (int i = 0; i < length; i++) {
         result.append(numberStr.charAt(i));
         count++;

         if ((length - count) % 3 == 0 && i != length - 1) {
            result.append(',');
         }
      }

      System.out.println("Formatted number: " + result.toString());
   }
}
