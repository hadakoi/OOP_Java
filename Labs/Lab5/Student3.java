import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student3 {

   int registrationNumber;
   String fullName;
   GregorianCalendar dateOfJoining;
   short semester;
   float gpa;
   float cgpa;

   Student3(int registrationNumber, String fullName, GregorianCalendar dateOfJoining, short semester, float gpa, float cgpa) {
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

   static void sortBySemesterAndCGPA(Student3[] students) {
      for (int i = 0; i < students.length - 1; i++) {
         for (int j = i + 1; j < students.length; j++) {
            if (students[i].semester > students[j].semester ||
               (students[i].semester == students[j].semester && students[i].cgpa < students[j].cgpa)) {
               Student3 temp = students[i];
               students[i] = students[j];
               students[j] = temp;
            }
         }
      }
   }

   static void sortByName(Student3[] students) {
      for (int i = 0; i < students.length - 1; i++) {
         for (int j = i + 1; j < students.length; j++) {
            if (students[i].fullName.compareTo(students[j].fullName) > 0) {
               Student3 temp = students[i];
               students[i] = students[j];
               students[j] = temp;
            }
         }
      }
   }

   static void listByStartingCharacter(Student3[] students, char startingChar) {
      System.out.println("\nStudents whose names start with '" + startingChar + "':");
      for (Student3 student : students) {
         if (student.fullName.charAt(0) == startingChar) {
            student.display();
            System.out.println();
         }
      }
   }

   static void listBySubstring(Student3[] students, String substring) {
      System.out.println("\nStudents whose names contain the substring '" + substring + "':");
      for (Student3 student : students) {
         if (student.fullName.contains(substring)) {
            student.display();
            System.out.println();
         }
      }
   }

   void convertToInitials() {
        String[] nameParts = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (int i = 0; i < nameParts.length - 1; i++) {
            initials.append(Character.toUpperCase(nameParts[i].charAt(0))).append(". ");
        }
        initials.append(nameParts[nameParts.length - 1]);
        fullName = initials.toString();
   }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Student3[] students = new Student3[5];

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

         students[i] = new Student3(registrationNumber, fullName, dateOfJoining, semester, gpa, cgpa);

         scanner.nextLine();
      }

      System.out.println("\nUnsorted Student Records:");
      for (Student3 student : students) {
         student.display();
         System.out.println();
      }

      sortBySemesterAndCGPA(students);
      System.out.println("\nStudent Records Sorted by Semester and CGPA:");
      for (Student3 student : students) {
         student.display();
         System.out.println();
      }

      sortByName(students);
      System.out.println("\nStudent Records Sorted by Name:");
      for (Student3 student : students) {
         student.display();
         System.out.println();
      }

      System.out.print("\nEnter the starting character to list students: ");
      char startingChar = scanner.next().charAt(0);
      listByStartingCharacter(students, startingChar);

      scanner.nextLine();
      System.out.print("\nEnter the substring to search in student names: ");
      String substring = scanner.nextLine();
      listBySubstring(students, substring);

      System.out.println("\nConverting full names to initials:");
      for (Student3 student : students) {
         student.convertToInitials();
         student.display();
         System.out.println();
      }
   }
}
