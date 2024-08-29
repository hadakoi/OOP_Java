class BreakLoop1 {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) { // Outer loop runs 3 times
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) { // Inner loop
                if (j == 10) 
                   break; // Breaks the inner loop when j == 10
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after the inner loop
        }
        System.out.println("Loops complete."); // Final message after all loops
    }
}

