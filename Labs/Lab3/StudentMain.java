import java.util.Scanner;

class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    void assign(String name, int[] marks) {
        sname = name;
        marks_array = marks;
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
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

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        STUDENT[] students = new STUDENT[n];

        for (int i = 0; i < n; i++) {
            students[i] = new STUDENT();

            System.out.print("\nEnter the name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = sc.nextInt();

            int[] marks = new int[numSubjects];
            System.out.println("Enter the marks for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            students[i].assign(name, marks);
            students[i].compute();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}
