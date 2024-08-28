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

public class StudentMain {
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
            students[i] = new STUDENT();

            System.out.print("\nEnter the name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = sc.nextInt();

            int[] studentMarks = new int[numSubjects];
            System.out.println("Enter the marks for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                studentMarks[j] = sc.nextInt();
            }
            sc.nextLine();

            students[i].assign(name, studentMarks);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}
