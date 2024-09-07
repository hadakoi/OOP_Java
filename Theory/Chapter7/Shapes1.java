class TwoDShape {
  double width;
  double height;

  // Method to display dimensions of the shape
  void showDim() {
    System.out.println("Width and height are " + width + " and " + height);
  }
}

// A subclass of TwoDShape for triangles
class Triangle extends TwoDShape {
  String style;

  // Method to calculate the area of the triangle
  double area() {
    return width * height / 2; // Formula for the area of a triangle
  }

  // Method to display the style of the triangle
  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

public class Shapes1 {
  public static void main(String args[]) {
    // Creating two Triangle objects
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle();

    // Setting values for t1's width, height, and style
    t1.width = 4.0;  // Inherited from TwoDShape
    t1.height = 4.0; // Inherited from TwoDShape
    t1.style = "filled";  // Unique to Triangle

    // Setting values for t2's width, height, and style
    t2.width = 8.0;  // Inherited from TwoDShape
    t2.height = 12.0; // Inherited from TwoDShape
    t2.style = "outlined";  // Unique to Triangle

    // Display information for t1
    System.out.println("Info for t1: ");
    t1.showStyle();  // Calls Triangle's method to display style
    t1.showDim();    // Calls the inherited method to show width and height
    System.out.println("Area is " + t1.area());  // Calls Triangle's area method

    System.out.println(); // Empty line for better readability

    // Display information for t2
    System.out.println("Info for t2: ");
    t2.showStyle();  // Calls Triangle's method to display style
    t2.showDim();    // Calls the inherited method to show width and height
    System.out.println("Area is " + t2.area());  // Calls Triangle's area method
  }
}
