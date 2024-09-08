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

// Test class to demonstrate the dynamic stack (DynStack) functionality
class IFTest2 {
  public static void main(String args[]) {
    // Create a dynamic stack of initial size 5
    DynStack mystack1 = new DynStack(5);

    // Push 12 items onto the stack, which will cause it to grow when needed
    for (int i = 0; i < 12; i++) {
      mystack1.push(i); // Pushing values from 0 to 11
    }

    // Display the items in the dynamic stack
    System.out.println("Stack in mystack1:");
    for (int i = 0; i < 12; i++) {
      System.out.println(mystack1.pop()); // Pop and print each value from the stack
    }
  }
}
