/*
This program demonstrates the difference between public and private access modifiers.
*/

class PrivateUnderstand {
  // Default access: this field is accessible only within the same package.
  int a; 

  // Public access: this field is accessible from any other class.
  public int b; 

  // Private access: this field is only accessible within this class.
  private int c; 

  // Method to set the value of the private field 'c'.
  // The 'setc' method provides controlled access to the private field 'c'.
  // Without this method, other classes cannot modify 'c' directly within the main function.
  void setc(int i) { 
    c = i;
  }

  // Method to get the value of the private field 'c'.
  // The 'getc' method provides controlled access to the private field 'c'.
  // Without this method, other classes cannot retrieve 'c' directly.
  int getc() { 
    return c;
  }
}

public class PrivateUnderstanding {
  public static void main(String[] args) {
    // Create an instance of the PrivateUnderstand class
    PrivateUnderstand obj = new PrivateUnderstand();

    // Access and modify the default access field 'a'
    obj.a = 10; // Accessible within the same package
    System.out.println("Default access field a: " + obj.a);

    // Access and modify the public field 'b'
    obj.b = 20; // Accessible from any class
    System.out.println("Public access field b: " + obj.b);

    // Access and modify the private field 'c' using setter method
    obj.setc(30); // Modify 'c' using the setc method
    // Retrieve and print the private field 'c' using getter method
    System.out.println("Private access field c (via getter): " + obj.getc());
  }
}

