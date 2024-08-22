class Inches {
   public static void main(String[] args) {
      long cubicInches;
      long inchesPerMile;

      // Compute the number of inches in a mile
      inchesPerMile = 5280L * 12; // Use 5280L to ensure the result is of type long

      // Compute the number of cubic inches in a cubic mile
      cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;

      System.out.println("There are " + cubicInches + " cubic inches in a cubic mile.");
    }
}

