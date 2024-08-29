class BreakLoop2 {
   public static void main(String args[]) {
      outer: 
      // Labeling the outer loop as 'outer'
      // You place the label (e.g., outer:) directly before the loop or block of code that you want to manipulate with a break or continue statement. 
      // This label can then be used to control the flow of your program by breaking out of or continuing the labeled loop or block from 
      //anywhere within its nested structure.
      for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
               if (j == 10) 
                  break outer; // Break out of the entire outer loop when j == 10
               System.out.print(j + " ");
            }
         System.out.println("This will not print"); // This line will be skipped after break
      }
      System.out.println("Loops complete."); // Final message after exiting the loops
   }
}
