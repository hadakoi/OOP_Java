// A class for two-dimensional objects.
class TwoDShape {
  private double width;
  private double height;

  // Constructor to initialize width and height
  TwoDShape(double w, double h) {
    width = w;
    height = h;
  }

  // Method to calculate the area of the triangle
  // Uses getWidth() and getHeight() methods from TwoDShape to access the private members.
  // These public getter methods provide controlled access to the private fields.
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  // Method to show dimensions
  void showDim() {
     System.out.println("Width and height are " + width + " and " + height);
  }
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
  String style;

  // Constructor to initialize width, height, and style
  Triangle(double w, double h, String s) {
    super(w, h);
    style = s;
  }

  // Method to calculate area of the triangle
  double area() {
    return getWidth() * getHeight() / 2; // Using getter methods to access private members
  }

  // Method to show style of the triangle
  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

public class PrivateAccess {
  public static void main(String[] args) {
    // Create a Triangle object with width 5.0, height 10.0, and style "filled"
    Triangle t1 = new Triangle(5.0, 10.0, "filled");

    // Display the dimensions of the triangle
    System.out.println("Info for t1:");
    t1.showDim();  // Calls method from TwoDShape to display width and height
    t1.showStyle(); // Displays the style of the triangle

    // Calculate and display the area of the triangle
    double area1 = t1.area(); // Calls area method from Triangle to calculate area
    System.out.println("Area of t1 is " + area1);

    // Create another Triangle object with width 7.0, height 14.0, and style "outlined"
    Triangle t2 = new Triangle(7.0, 14.0, "outlined");

    // Display the dimensions of the second triangle
    System.out.println("\nInfo for t2:");
    t2.showDim();  // Calls method from TwoDShape to display width and height
    t2.showStyle(); // Displays the style of the triangle

    // Calculate and display the area of the second triangle
    double area2 = t2.area(); // Calls area method from Triangle to calculate area
    System.out.println("Area of t2 is " + area2);
    }
}
