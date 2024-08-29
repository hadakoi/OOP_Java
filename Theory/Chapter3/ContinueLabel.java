class ContinueLabel {
   public static void main(String args[]) {
      outer: 
      for (int i = 0; i < 10; i++) {  // Label 'outer' is applied to this for loop
         for (int j = 0; j < 10; j++) {
            if (j > i) {  // If 'j' becomes greater than 'i', the inner loop stops
               System.out.println();  // Move to the next line
               continue outer;  // Skip to the next iteration of the outer loop
            }
            System.out.print(" " + (i * j));  // Print the product of 'i' and 'j'
         }
      }
      System.out.println();  // Print a newline at the end of the program
   }
}
