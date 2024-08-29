class ScopeDemo {
   public static void main(String a[] ) {
      int x = 2; // 'x' is declared in the main method's scope, so it is accessible throughout the entire main method.

      if(x == 2) { // Starts a new scope within the main method.
         int y = 3; // 'y' is declared inside this block, so it is only accessible within this block.
         System.out.println(x + " " + y); // Prints "2 3". Both 'x' and 'y' are accessible here.
      } // End of the if block. 'y' is destroyed here and is no longer accessible.

      y = 7; // Error: 'y' is not accessible here because it was declared inside the if block and has been destroyed.
      x = 5; // 'x' is still accessible and can be modified because it was declared in the main method's scope.
   }
}
