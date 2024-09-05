class Person {

  private String name;
  private String birthDate;

  public Person(String name, String birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public void displayPersonDetails() {
    System.out.println("Name: " + name);
    System.out.println("Birth Date: " + birthDate);
  }
}

class CollegeGraduate extends Person {
  private double GPA;
  private int graduationYear;

  public CollegeGraduate(String name, String birthDate, double GPA, int graduationYear) {
    super(name, birthDate);
    this.GPA = GPA;
    this.graduationYear = graduationYear;
  }

  public double getGPA() {
    return GPA;
  }

  public void setGPA(double GPA) {
    this.GPA = GPA;
  }

  public int getGraduationYear() {
    return graduationYear;
  }

  public void setGraduationYear(int graduationYear) {
    this.graduationYear = graduationYear;
  }

  public void displayGraduateDetails() {
    super.displayPersonDetails();
    System.out.println("GPA: " + GPA);
    System.out.println("Graduation Year: " + graduationYear);
  }
}


public class Q3 {
  public static void main(String[] args) {

    Person person = new Person("John Doe", "1990-05-15");
    System.out.println("Person Details:");
    person.displayPersonDetails();
        
    CollegeGraduate graduate = new CollegeGraduate("Jane Smith", "1998-07-20", 3.8, 2020);
    System.out.println("\nCollege Graduate Details:");
    graduate.displayGraduateDetails();
  }
}
