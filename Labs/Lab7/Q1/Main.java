import com.course.structure.House;
import com.course.structure.School;

public class Main {
  public static void main(String[] args) {
    House myHouse = new House(2000, 2, 4, 3);
    System.out.println("House Details:");
    myHouse.displayHouseDetails();

    School mySchool = new School(5000, 3, 20, "Elementary");
    System.out.println("\nSchool Details:");
    mySchool.displaySchoolDetails();
  }
}

