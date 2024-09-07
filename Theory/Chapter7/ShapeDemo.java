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
    // Directly using the inherited fields (width and height) from the superclass TwoDShape
    return width * height / 2; // Area formula for a triangle
  }

  // Method to display the style of the triangle
  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

// Main class to test the functionality
public class ShapeDemo {
  public static void main(String[] args) {
    Triangle t = new Triangle();

    // Setting values for the inherited fields width and height
    t.width = 4.0;  // Accessing the inherited width field from TwoDShape
    t.height = 5.0; // Accessing the inherited height field from TwoDShape
    t.style = "isosceles"; // Setting the specific style for the Triangle object

    // Display the triangle's style
    t.showStyle(); // Calls the Triangle's own method showStyle()

    // Use the inherited method from TwoDShape to show dimensions
    t.showDim(); // Calls the superclass TwoDShape's method to show width and height

    // Calculate and display the area using the area() method from Triangle
    System.out.println("Area is " + t.area());
  }
}
