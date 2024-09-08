// Class extending Student and implementing Sports
public class Result extends Student implements Sports {
  private String grade; // Sports grade of the student

  // Override method from Sports interface to set the sports grade
  @Override
  public void putGrade(String grade) {
    this.grade = grade; // Assign the given sports grade
  }

  // Method to display the student's result
  public void displayResult() {
    // Print the roll number from the Student class
    System.out.println("Roll Number: " + getNumber());
    
    // Print the marks from the Student class
    System.out.println("Marks: " + getMarks());
    
    // Print the sports grade
    System.out.println("Sports Grade: " + grade);
  }
}
