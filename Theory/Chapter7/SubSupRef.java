// A superclass X with an integer field and a constructor.
class X {
  int a;

  // Constructor for class X
  X(int i) {
    a = i; // Initialize the field a with the value of i
  }
}

// A subclass Y that extends X and adds an additional field.
class Y extends X {
  int b;

  // Constructor for class Y
  Y(int i, int j) {
    super(j); // Call the constructor of superclass X, initializing a with j
    b = i;    // Initialize the field b with the value of i
  }
}

// Class to demonstrate superclass references referring to subclass objects.
class SupSubRef {
  public static void main(String args[]) {
    X x = new X(10); // Create an instance of X with a = 10
    X x2;            // Declare a reference of type X
    Y y = new Y(5, 6); // Create an instance of Y with a = 6 (from super) and b = 5

    x2 = x; // OK, x2 is assigned an instance of X (both x and x2 are of type X)
    System.out.println("x2.a: " + x2.a); // Output the value of a in x2 (which is 10)

    x2 = y; // OK, because Y is a subclass of X; a Y object can be referenced by an X reference
    System.out.println("x2.a: " + x2.a); // Output the value of a in x2 (which is 6 from Y)

    x2.a = 19; // OK, modifying the field a in x2 (which affects the instance of Y because x2 references y)
    // At this point, y.a is also 19

    // x2.b = 27; // Error! x2 is of type X, which does not have a field b.
    // Even though x2 currently references an instance of Y, the reference type (X) limits access to members of X only.
  }
}
