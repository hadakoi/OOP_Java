// Interface defining a stack of integers
interface IntStack {
  void push(int item);    // Method to store an item in the stack
  int pop();              // Method to retrieve an item from the stack
  boolean isEmpty();      // Method to check if the stack is empty
  boolean isFull();       // Method to check if the stack is full
}

// Fixed size stack class that implements the IntStack interface
class FixedStack implements IntStack {
  private int stck[];     // Array to hold stack elements
  private int tos;        // Index to represent the top of the stack

  // Constructor to initialize the stack with a fixed size
  FixedStack(int size) {
    stck = new int[size];  // Create a stack array of the given size
    tos = -1;              // Initialize the top of the stack to -1 (indicating an empty stack)
  }

  // Method to check if the stack is full
  public boolean isFull() { 
    return tos == stck.length - 1;  // Returns true if the top index equals the last index in the array
  }

  // Method to check if the stack is empty
  public boolean isEmpty() { 
    return tos == -1;  // Returns true if the top index is -1, indicating an empty stack
  }

  // Method to push an item onto the stack
  public void push(int item) {
    if (isFull()) {  // Check if the stack is full before pushing
      System.out.println("Stack is full.");  // Output message if the stack is full
    } else {
      stck[++tos] = item;  // Increment the top index and add the item to the stack
    }
    }

    // Method to pop an item from the stack
  public int pop() {
    if (isEmpty()) {  // Check if the stack is empty before popping
      System.out.println("Stack underflow.");  // Output message if the stack is empty
      return -1;  // Return -1 to indicate stack underflow
    } else {
      return stck[tos--];  // Return the top item and decrement the top index
    }
  }
}

// Main class to test FixedStack and demonstrate polymorphism
class IFTest1 {
  public static void main(String[] args) {
    // Using an interface reference (polymorphism)
    // The reference variable mystack1 is of type IntStack but holds an object of FixedStack
    IntStack mystack1 = new FixedStack(5);  // Creating a FixedStack object with size 5

    // Push some numbers onto the stack
    for (int i = 0; i < 5; i++) {
      mystack1.push(i);  // Polymorphism in action: push() of FixedStack is invoked via IntStack reference
    }

    // Pop those numbers off the stack
    System.out.println("Stack in mystack1:");
    for (int i = 0; i < 5; i++) {
      System.out.println(mystack1.pop());  // Polymorphism in action: pop() of FixedStack is invoked via IntStack reference
    }
  }
}
