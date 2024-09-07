// This class demonstrates call-by-value with primitive types.
class Test {
  // Method to modify the parameters
  void meth(int i, int j) {
    i *= 2; // This operation affects only the local copy of 'i'
    j /= 2; // This operation affects only the local copy of 'j'
  }
}

public class CallByValue {
  public static void main(String[] args) {
    Test ob = new Test(); // Create an instance of the Test class
    int a = 15, b = 20; // Initialize primitive variables 'a' and 'b'
    
    // Print initial values of 'a' and 'b'
    System.out.println("a and b before call: " + a + " " + b);
    
    // Call the method 'meth' with 'a' and 'b' as arguments
    ob.meth(a, b);
    
    // Print values of 'a' and 'b' after method call
    // These values remain unchanged because 'i' and 'j' are copies of 'a' and 'b'
    System.out.println("a and b after call: " + a + " " + b);
  }
}
