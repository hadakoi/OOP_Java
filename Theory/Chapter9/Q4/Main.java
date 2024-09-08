// Main class to test the Result class
public class Main {
  public static void main(String[] args) {
    Result result = new Result(); // Create an instance of Result

    // Set roll number and marks using Student class methods
    result.putNumber(101);
    result.putMarks(85);

    // Set sports grade using Sports interface method
    result.putGrade("A");

    // Display the complete result
    result.displayResult();
  }
}
