import java.util.Scanner;

public class Stack {

   int[] stackArray;
   int tos;

 
   Stack(int size) {
      stackArray = new int[size];
      tos = -1; 
   }

   void push(int value) {
      if (tos == stackArray.length - 1) {
         System.out.println("Stack Overflow! Cannot push " + value);
      } 
      else {
         stackArray[++tos] = value;
         System.out.println("Pushed " + value);
      }
   }

   int pop() {
      if (tos == -1) {
         System.out.println("Stack Underflow! Cannot pop.");
         return -1;
      } 
      else {
         return stackArray[tos--];
      }
   }

   void display() {
      if (tos == -1) {
         System.out.println("Stack is empty.");
      } else {
         System.out.print("Stack contents: ");
         for (int i = 0; i <= tos; i++) {
            System.out.print(stackArray[i] + " ");
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the size of the stack: ");
      int size = scanner.nextInt();

      Stack stack = new Stack(size);

      System.out.println("Enter elements to push to the stack (type -1 to stop):");
      while (true) {
         int value = scanner.nextInt();
         if (value == -1) {
            break;
         }
         stack.push(value);
      }

      stack.display();

      System.out.println("Popping elements from the stack:");
      while (true) {
         int poppedValue = stack.pop();
         if (poppedValue == -1) {
               break;
         }
         System.out.println("Popped " + poppedValue);
      }
   }
}
