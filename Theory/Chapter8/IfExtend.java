// Interface A with two method declarations
interface A {
  // Method to be implemented by any class that implements this interface
  void meth1();
  void meth2();
}

// Interface B extends interface A
// This means that B inherits all methods from A
// and adds its own method meth3()
interface B extends A {
  // Additional method to be implemented by any class that implements this interface
  void meth3();
}

// Class MyClass implements interface B
// Therefore, MyClass must provide implementations for all methods from both A and B
class MyClass implements B {
  // Implementing method from interface A
  @Override
  public void meth1() {
    System.out.println("Implement meth1()."); // Print statement for meth1
  }

  // Implementing method from interface A
  @Override
  public void meth2() {
    System.out.println("Implement meth2()."); // Print statement for meth2
  }

  // Implementing method from interface B
  @Override
  public void meth3() {
    System.out.println("Implement meth3()."); // Print statement for meth3
  }
}

// Main class to test interface inheritance
class IFExtend {
  public static void main(String[] args) {
    // Create an instance of MyClass
    MyClass ob = new MyClass();
        
    // Call methods from interface A and B
    ob.meth1();  // Calls the implementation of meth1() in MyClass
    ob.meth2();  // Calls the implementation of meth2() in MyClass
    ob.meth3();  // Calls the implementation of meth3() in MyClass
  }
}
