class Building {
  private int squareFootage;
  private int stories;

  public Building(int squareFootage, int stories) {
    this.squareFootage = squareFootage;
    this.stories = stories;
  }

  public int getSquareFootage() {
    return squareFootage;
  }

  public void setSquareFootage(int squareFootage) {
    this.squareFootage = squareFootage;
  }

  public int getStories() {
    return stories;
  }

  public void setStories(int stories) {
    this.stories = stories;
  }

  public void displayBuildingDetails() {
    System.out.println("Square Footage: " + squareFootage);
    System.out.println("Stories: " + stories);
  }
}

class House extends Building {
  private int bedrooms;
  private int baths;

  public House(int squareFootage, int stories, int bedrooms, int baths) {
    super(squareFootage, stories); 
    this.bedrooms = bedrooms;
    this.baths = baths;
  }

  public int getBedrooms() {
    return bedrooms;
  }

  public void setBedrooms(int bedrooms) {
    this.bedrooms = bedrooms;
  }

  public int getBaths() {
    return baths;
  }

  public void setBaths(int baths) {
    this.baths = baths;
  }

  public void displayHouseDetails() {
    displayBuildingDetails(); 
    System.out.println("Bedrooms: " + bedrooms);
    System.out.println("Baths: " + baths);
  }
}

class School extends Building {
    private int classrooms;
    private String gradeLevel;

    public School(int squareFootage, int stories, int classrooms, String gradeLevel) {
      super(squareFootage, stories);
      this.classrooms = classrooms;
      this.gradeLevel = gradeLevel;
    }

    public int getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void displaySchoolDetails() {
        displayBuildingDetails(); 
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class Q4 {
  public static void main(String[] args) {
    House myHouse = new House(2000, 2, 4, 3);
    System.out.println("House Details:");
    myHouse.displayHouseDetails();

    School mySchool = new School(5000, 3, 20, "Elementary");
    System.out.println("\nSchool Details:");
    mySchool.displaySchoolDetails();
  }
}