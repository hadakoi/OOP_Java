// Class representing a student with roll number and marks
public class Student {
  private int rollNo;  // Roll number of the student
  private int marks;   // Marks obtained by the student

  // Method to set the roll number
  public void putNumber(int rollNo) {
    this.rollNo = rollNo; // Assign the given roll number
  }

  // Method to get the roll number
  public int getNumber() {
    return rollNo; // Return the roll number
  }

  // Method to set the marks
  public void putMarks(int marks) {
    this.marks = marks; // Assign the given marks
  }

  // Method to get the marks
  public int getMarks() {
    return marks; // Return the marks
  }
}
