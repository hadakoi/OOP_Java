// Define an integer stack interface
interface IntStack {
  void push(int item); // Store an item on the stack
  int pop(); // Retrieve an item from the stack
  boolean isEmpty(); // Return true if the stack is empty
  boolean isFull(); // Return true if the stack is full
}

// Implement a fixed-size stack that adheres to the IntStack interface
class FixedStack implements IntStack {
  private int stck[]; // Array to store stack elements
  private int tos; // Top of stack index

  // Constructor to initialize the fixed stack with a given size
  FixedStack(int size) {
    stck = new int[size]; // Create a stack of the specified size
    tos = -1; // Set the top of the stack to -1, indicating an empty stack
  }

  // Method to check if the stack is full
  public boolean isFull() {
    return tos == stck.length - 1; // Returns true if the top index equals the last position
  }

  // Method to check if the stack is empty
  public boolean isEmpty() {
    return tos == -1; // Returns true if the top index is -1
  }

  // Push an item onto the stack, if it's not full
  public void push(int item) {
    if (isFull()) { // Check if the stack is full before pushing
      System.out.println("Stack is full.");
    } else {
      stck[++tos] = item; // Increment tos and store the item at that position
    }
  }

  // Pop an item off the stack, if it's not empty
  public int pop() {
    if (isEmpty()) { // Check if the stack is empty before popping
      System.out.println("Stack underflow."); // Display an error if stack is empty
      return -1; // Return -1 to indicate stack underflow
    } else {
      return stck[tos--]; // Return the top item and decrement tos
    }
  }
}

// Implement a dynamic-size (growable) stack that adheres to the IntStack interface
class DynStack implements IntStack {
  private int stck[]; // Array to store stack elements
  private int tos; // Top of stack index

  // Constructor to initialize the dynamic stack with a given size
  DynStack(int size) {
    stck = new int[size]; // Create a stack of the specified size
    tos = -1; // Set the top of the stack to -1, indicating an empty stack
  }

  // Method to check if the stack is full
  public boolean isFull() {
    return tos == stck.length - 1; // Returns true if the top index equals the last position
  }

  // Method to check if the stack is empty
  public boolean isEmpty() {
    return tos == -1; // Returns true if the top index is -1
  }

  // Push an item onto the stack, and dynamically grow the stack if necessary
  public void push(int item) {
    if (isFull()) { // If the stack is full, allocate a larger array
      int temp[] = new int[stck.length * 2]; // Double the size of the stack
      for (int i = 0; i < stck.length; i++) {
        temp[i] = stck[i]; // Copy old elements into the new array
      }
      stck = temp; // Replace the old stack with the new, larger stack
    }
    stck[++tos] = item; // Increment tos and store the item
  }

  // Pop an item off the stack, if it's not empty
  public int pop() {
    if (isEmpty()) { // Check if the stack is empty before popping
      System.out.println("Stack underflow."); // Display an error if stack is empty
      return -1; // Return -1 to indicate stack underflow
    } else {
      return stck[tos--]; // Return the top item and decrement tos
    }
  }
}

// Test class to demonstrate the use of polymorphism via interface references
class IFTest3 {
  public static void main(String args[]) {
    IntStack mystack; // Create an interface reference variable of type IntStack

    // Create a dynamic stack with an initial size of 5
    DynStack ds = new DynStack(5);

    // Create a fixed stack with a size of 8
    FixedStack fs = new FixedStack(8);

    // Polymorphism in action: the interface reference "mystack" refers to the dynamic stack "ds"
    mystack = ds;
        
    // Push numbers onto the dynamic stack (DynStack)
    for (int i = 0; i < 12; i++) {
      mystack.push(i); // Pushing values 0 to 11 onto DynStack (stack grows dynamically when full)
    }

    // Polymorphism in action: the interface reference "mystack" now refers to the fixed stack "fs"
    mystack = fs;
        
    // Push numbers onto the fixed stack (FixedStack)
    for (int i = 0; i < 8; i++) {
      mystack.push(i); // Pushing values 0 to 7 onto FixedStack (stack is fixed in size)
    }

    // Polymorphism: the interface reference "mystack" refers to the dynamic stack again
    mystack = ds;
        
    // Display the values in the dynamic stack
    System.out.println("Values in dynamic stack:");
    for (int i = 0; i < 12; i++) {
      System.out.println(mystack.pop()); // Popping values from DynStack (0 to 11)
    }

    // Polymorphism: the interface reference "mystack" refers to the fixed stack again
    mystack = fs;
        
    // Display the values in the fixed stack
    System.out.println("Values in fixed stack:");
    for (int i = 0; i < 8; i++) {
      System.out.println(mystack.pop()); // Popping values from FixedStack (0 to 7)
    }
  }
}
