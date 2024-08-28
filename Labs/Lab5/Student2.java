import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student2 {

   int registrationNumber;
   String fullName;
   GregorianCalendar dateOfJoining;
   short semester;
   float gpa;
   float cgpa;

   Student2(int registrationNumber, String fullName, GregorianCalendar dateOfJoining, short semester, float gpa, float cgpa) {
      this.registrationNumber = registrationNumber;
      this.fullName = fullName;
      this.dateOfJoining = dateOfJoining;
      this.semester = semester;
      this.gpa = gpa;
      this.cgpa = cgpa;
   }

   void display() {
      System.out.println("Registration Number: " + registrationNumber);
      System.out.println("Full Name: " + fullName);
      System.out.println("Date of Joining: " + dateOfJoining.getTime());
      System.out.println("Semester: " + semester);
      System.out.println("GPA: " + gpa);
      System.out.println("CGPA: " + cgpa);
    }

   static void sortBySemesterAndCGPA(Student2[] students) {
      for (int i = 0; i < students.length - 1; i++) {
         for (int j = i + 1; j < students.length; j++) {
            if (students[i].semester > students[j].semester || (students[i].semester == students[j].semester && students[i].cgpa < students[j].cgpa)) {
               Student2 temp = students[i];
               students[i] = students[j];
               students[j] = temp;
            }
         }
      }
   }

   static void sortByName(Student2[] students) {
      for (int i = 0; i < students.length - 1; i++) {
         for (int j = i + 1; j < students.length; j++) {
            if (students[i].fullName.compareTo(students[j].fullName) > 0) {
               Student2 temp = students[i];
               students[i] = students[j];
               students[j] = temp;
            }
         }
      }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student2[] students = new Student2[5];

      for (int i = 0; i < students.length; i++) {
         System.out.println("Enter details for student " + (i + 1) + ":");

         System.out.print("Year of Joining: ");
         int year = scanner.nextInt();
         System.out.print("Student Number: ");
         int studentNumber = scanner.nextInt();
         int registrationNumber = Integer.parseInt(year + "" + studentNumber);

         scanner.nextLine();

         System.out.print("Full Name: ");
         String fullName = scanner.nextLine();

         System.out.print("Month of Joining (1-12): ");
         int month = scanner.nextInt();
         System.out.print("Day of Joining: ");
         int day = scanner.nextInt();
         GregorianCalendar dateOfJoining = new GregorianCalendar(year, month - 1, day);

         System.out.print("Semester: ");
         short semester = scanner.nextShort();
         System.out.print("GPA: ");
         float gpa = scanner.nextFloat();
         System.out.print("CGPA: ");
         float cgpa = scanner.nextFloat();

         students[i] = new Student2(registrationNumber, fullName, dateOfJoining, semester, gpa, cgpa);

         scanner.nextLine();
      }

      System.out.println("\nUnsorted Student Records:");
      for (Student2 student : students) {
         student.display();
         System.out.println();
      }

      sortBySemesterAndCGPA(students);
      System.out.println("\nStudent Records Sorted by Semester and CGPA:");
      for (Student2 student : students) {
         student.display();
         System.out.println();
      }

      sortByName(students);
      System.out.println("\nStudent Records Sorted by Name:");
      for (Student2 student : students) {
         student.display();
         System.out.println();
      }
   }
}
