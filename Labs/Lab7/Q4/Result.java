public class Result extends Student implements Sports {
  private String grade;

  @Override
  public void putGrade(String grade) {
    this.grade = grade;
  }

  public void displayResult() {
    System.out.println("Roll Number: " + getNumber());
    System.out.println("Marks: " + getMarks());
    System.out.println("Sports Grade: " + grade);
  }
}
