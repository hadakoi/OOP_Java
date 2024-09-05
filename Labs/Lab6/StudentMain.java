import java.util.Scanner;

class STUDENT {
  String sname;
  int[] marks_array;
  int total;
  double avg;

  STUDENT() {
    sname = "Unknown";
    marks_array = new int[0];
    total = 0;
    avg = 0.0;
  }

  STUDENT(String name, int[] marks) {
    sname = name;
    marks_array = marks;
    compute(); 
  }

  void assign(String name, int[] marks) {
    sname = name;
    marks_array = marks;
    compute();
  }

  void compute() {
    total = 0;
    for (int mark : marks_array) {
      total += mark;
    }
    avg = (marks_array.length > 0) ? (double) total / marks_array.length : 0.0;
  }

  void display() {
    System.out.println("Student Name: " + sname);
    System.out.print("Marks: ");
    for (int mark : marks_array) {
      System.out.print(mark + " ");
    }
    System.out.println("\nTotal Marks: " + total);
    System.out.println("Average Marks: " + avg);
  }
}

class ScienceStudent extends STUDENT {
  private int practicalMarks;

  ScienceStudent() {
    super();
    practicalMarks = 0;
  }

  ScienceStudent(String name, int[] marks, int practicalMarks) {
    super(name, marks); 
    this.practicalMarks = practicalMarks;
    compute();
  }

  @Override
  void compute() {
    super.compute(); 
    total += practicalMarks;
    avg = (marks_array.length > 0) ? (double) total / (marks_array.length + 1) : 0.0;
  }

  void displayPracticalMarks() {
    System.out.println("Practical Marks: " + practicalMarks);
  }

  @Override
  void display() {
    super.display();
    displayPracticalMarks();
  }
}

class ArtsStudent extends STUDENT {
  private String electiveSubject;

  ArtsStudent() {
    super();
    electiveSubject = "None";
  }

  ArtsStudent(String name, int[] marks, String electiveSubject) {
    super(name, marks);
    this.electiveSubject = electiveSubject;
  }

  void displayElectiveSubject() {
    System.out.println("Elective Subject: " + electiveSubject);
  }

  @Override
  void display() {
    super.display();
    displayElectiveSubject();
  }
}

public class StudentMain {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      STUDENT student1 = new STUDENT("Alice", new int[] {85, 90, 80});
      System.out.println("Details of General Student:");
      student1.display();

      ScienceStudent scienceStudent = new ScienceStudent("Bob", new int[] {88, 76, 91}, 85);
      System.out.println("\nDetails of Science Student:");
      scienceStudent.display();

      ArtsStudent artsStudent = new ArtsStudent("Charlie", new int[] {70, 65, 72}, "History");
      System.out.println("\nDetails of Arts Student:");
      artsStudent.display();

      STUDENT dynamicStudent = new ScienceStudent("David", new int[] {82, 89, 77}, 90);
      System.out.println("\nDetails of Science Student (via Polymorphism):");
      dynamicStudent.display();
    }
}