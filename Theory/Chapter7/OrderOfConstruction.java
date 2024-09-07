// Create a superclass A.
class A {
  // Constructor for class A
  A() {
    System.out.println("Constructing A."); // Prints message when an instance of A is created
    // This constructor initializes class A and is always called first in the hierarchy
  }
}

// Create a subclass B that extends class A.
class B extends A {
  // Constructor for class B
  B() {
    System.out.println("Constructing B."); // Prints message when an instance of B is created
    // This constructor initializes class B and is called after class A is initialized
    // It automatically invokes the constructor of class A before executing its own body
  }
}

// Create another subclass C that extends class B.
class C extends B {
  // Constructor for class C
  C() {
    System.out.println("Constructing C."); // Prints message when an instance of C is created
    // This constructor initializes class C and is called after class B is initialized
    // It automatically invokes the constructor of class B, which in turn has already invoked A's constructor
  }
}

// Class to demonstrate the order of construction
class OrderOfConstruction {
  public static void main(String args[]) {
    // Create an instance of class C
    C c = new C();
    // This will trigger the construction of A, B, and C in that order
        
    // When `new C()` is executed, the following happens:
    // 1. The constructor of the superclass of C, which is B, is called.
    // 2. Before B's constructor runs, its superclass A's constructor is called.
    // 3. After A's constructor finishes, B's constructor completes.
    // 4. Finally, C's constructor runs after both A's and B's constructors have completed.
  }
}
