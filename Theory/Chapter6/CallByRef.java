// This class demonstrates call-by-reference with object types.
class Test {
  int a, b; // Fields of the class

  // Constructor to initialize the fields
  Test(int i, int j) {
    a = i;
    b = j;
  }

  // Method to modify the fields of the passed object
  void meth(Test obj) {
    obj.a *= 2; // This modifies the 'a' field of the object referenced by 'obj'
    obj.b /= 2; // This modifies the 'b' field of the object referenced by 'obj'
  }
}

public class CallByRef {
  public static void main(String[] args) {
    Test ob = new Test(15, 20); // Create an instance of the Test class with initial values
    
    // Print initial values of the fields 'a' and 'b' of the object 'ob'
    System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
    
    // Call the method 'meth' with the object 'ob'
    ob.meth(ob);
    
    // Print values of 'a' and 'b' of the object 'ob' after method call
    // These values are modified because 'obj' refers to the same object as 'ob'
    System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
  }
}
