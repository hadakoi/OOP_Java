// Define the Test class with an increment method that returns a new instance
class Test {
  int a; // Field to store the value

  // Constructor to initialize 'a'
  Test(int x) {
    a = x;
  }

  // Method to increment the value by ten and return a new instance of Test
  Test incrByTen() {
    return new Test(a + 10); // Create a new instance with incremented value
  }
}

public class RetOb {
  public static void main(String[] args) {
    // Create an instance of Test with initial value 2
    Test ob1 = new Test(2);
    
    // Increment the value of ob1 by ten and assign the result to ob2
    Test ob2 = ob1.incrByTen();
    
    // Print the value of ob1 (should be 2)
    System.out.println("ob1.a: " + ob1.a);
    
    // Print the value of ob2 (should be 12, as it is ob1's value incremented by ten)
    System.out.println("ob2.a: " + ob2.a);
    
    // Increment the value of ob2 by ten and update ob2 to refer to the new instance
    ob2 = ob2.incrByTen();
    
    // Print the value of ob2 after the second increment (should be 22)
    System.out.println("ob2.a after second increase: " + ob2.a);
  }
}
