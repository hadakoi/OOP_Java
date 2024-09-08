import com.course.structure.House; // Import the House class from com.course.structure package
import com.course.structure.School; // Import the School class from com.course.structure package

public class Main {
  public static void main(String[] args) {
    // Create a House object with specified attributes
    House myHouse = new House(2000, 2, 4, 3);
    System.out.println("House Details:");
    myHouse.displayHouseDetails(); // Display details of the house

    // Create a School object with specified attributes
    School mySchool = new School(5000, 3, 20, "Elementary");
    System.out.println("\nSchool Details:");
    mySchool.displaySchoolDetails(); // Display details of the school
  }
}
