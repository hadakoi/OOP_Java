class Expn_typePromotion {
   public static void main(String[] args) {
      byte b = 42;
      char ch = 'a';
      short s = 1024;
      int i = 50000;
      long l = 399999999L; // 'l' is uppercase to differentiate it from '1'
      float f = 5.645f;
      double d = 0.1234;
        
      // Performing type promotion in expressions
      double res = (f * b) + (i / ch) + (d * s);
      // Explanation of promotion:
      // 1. (f * b) promotes 'b' to float, and the result is float.
      // 2. (i / ch) promotes 'ch' to int, and the result is int.
      // 3. (d * s) promotes 's' to double, and the result is double.
      // The final result is a sum of float, int, and double, which is promoted to double.

      System.out.println(res); // Outputs the result as a double
   }
}
