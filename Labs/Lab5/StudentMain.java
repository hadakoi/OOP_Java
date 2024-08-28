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

   String extractInitials() {
      StringBuilder initials = new StringBuilder();
      boolean nextCharIsInitial = true;
      for (int i = 0; i < sname.length(); i++) {
         char ch = sname.charAt(i);
         if (ch != ' ') {
            if (nextCharIsInitial) {
               initials.append(Character.toUpperCase(ch));
               nextCharIsInitial = false;
            }
         } else {
               nextCharIsInitial = true;
            }
        }
        return initials.toString();
    }

   String removeWhitespace() {
      StringBuilder nameWithoutSpaces = new StringBuilder();
      for (int i = 0; i < sname.length(); i++) {
         char ch = sname.charAt(i);
         if (ch != ' ') {
               nameWithoutSpaces.append(ch);
         }
        }
        return nameWithoutSpaces.toString();
   }

   boolean containsSubstring(String substring) {
      return sname.contains(substring);
   }

   void display() {
      System.out.println("Student Name: " + sname);
      System.out.print("Marks: ");
      for (int mark : marks_array) {
         System.out.print(mark + " ");
      }
      System.out.println("\nTotal Marks: " + total);
      System.out.println("Average Marks: " + avg);
      System.out.println("Initials: " + extractInitials());
      System.out.println("Name without whitespace: " + removeWhitespace());
   }
}

public class StudentMain {
   public static void sortByName(STUDENT[] students) {
      int n = students.length;
      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            if (students[j].sname.compareTo(students[j + 1].sname) > 0) {
               STUDENT temp = students[j];
               students[j] = students[j + 1];
               students[j + 1] = temp;
            }
         }
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      STUDENT defaultStudent = new STUDENT();
      System.out.println("Default Constructor:");
      defaultStudent.display();

      System.out.print("\nEnter the number of students: ");
      int n = sc.nextInt();
      sc.nextLine();

      STUDENT[] students = new STUDENT[n];

      for (int i = 0; i < n; i++) {
         System.out.println("\nEnter details for Student " + (i + 1) + ":");
         System.out.print("Enter the name of student: ");
         String name = sc.nextLine();

         System.out.print("Enter the number of subjects: ");
         int numSubjects = sc.nextInt();
         sc.nextLine();

         int[] studentMarks = new int[numSubjects];
         System.out.println("Enter the marks for " + numSubjects + " subjects:");
         for (int j = 0; j < numSubjects; j++) {
            studentMarks[j] = sc.nextInt();
         }
         sc.nextLine();

         students[i] = new STUDENT(name, studentMarks);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].display();
        }

        System.out.print("\nEnter substring to search in student names: ");
        String substring = sc.nextLine();
        System.out.println("\nStudents with names containing \"" + substring + "\":");
        for (int i = 0; i < n; i++) {
            if (students[i].containsSubstring(substring)) {
               System.out.println(students[i].sname);
            }
        }

        // Sort students by name
        sortByName(students);

        System.out.println("\nStudent Details (Sorted Alphabetically):");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}
