class Break {
   public static void main(String args[]) {
      boolean t = true;

      first: { // Label for the outer block
         second: { // Label for the middle block
            third: { // Label for the inner block

               System.out.println("Before the break.");

               if(t) 
                  break second; // Break out of the 'second' block
               System.out.println("This won't execute"); // This line is skipped due to the break statement

               } // end of third
               // The following line would cause an error if uncommented:
               // break third; // Error: Cannot break out of 'third' from here because we are outside of its scope.
            } // end of second
            System.out.println("This is after second block.");
        } // end of first
    } // end of main()
} // end of class
