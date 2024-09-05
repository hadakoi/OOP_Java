class Student {
  String name;
  int id;

  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  void displayStudentDetails() {
    System.out.println("Student Name: " + name);
    System.out.println("Student ID: " + id);
  }
}

class Sports extends Student {
  int s_grade;

  public Sports(String name, int id, int s_grade) {
    super(name, id); 
    this.s_grade = s_grade;
  }

  void displaySportsDetails() {
    System.out.println("Sports Grade: " + s_grade);
  }
}

class Exam extends Sports {
  int e_grade;

  public Exam(String name, int id, int s_grade, int e_grade) {
    super(name, id, s_grade); 
    this.e_grade = e_grade;
  }

  void displayExamDetails() {
    System.out.println("Exam Grade: " + e_grade);
  }
}

class Results extends Exam {
  String result;

  public Results(String name, int id, int s_grade, int e_grade) {
    super(name, id, s_grade, e_grade);
    calculateResult();
  }

  void calculateResult() {
    int total = s_grade + e_grade;
    if (total >= 150) {
      result = "Excellent";
    } else if (total >= 100) {
      result = "Good";
    } else {
      result = "Needs Improvement";
    }
  }

  void display() {
    displayStudentDetails();
    displaySportsDetails();
    displayExamDetails();
    System.out.println("Final Result: " + result);
  }
}

public class Q6 {
  public static void main(String[] args) {
    Results student1 = new Results("Alice", 101, 80, 85);
    student1.display();

    System.out.println("\n");

    Results student2 = new Results("Bob", 102, 60, 55);

    student2.display();
  }
}
