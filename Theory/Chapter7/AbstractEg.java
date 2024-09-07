// Abstract class Shape serves as a blueprint for different shapes.
// It defines abstract methods for calculating area and perimeter,
// which must be implemented by concrete subclasses. It also provides
// a concrete method to display the shape's information.

// Abstract class Shape
abstract class Shape {
  // Abstract method to calculate the area of the shape
  abstract double calculateArea();
    
  // Abstract method to calculate the perimeter of the shape
  abstract double calculatePerimeter();
    
  // Concrete method to display shape information
  void displayInfo() {
    System.out.println("Area: " + calculateArea());
    System.out.println("Perimeter: " + calculatePerimeter());
  }
}

// Concrete class Circle that extends Shape
class Circle extends Shape {
  private double radius; // Radius of the circle
    
  // Constructor to initialize Circle
  public Circle(double radius) {
    this.radius = radius;
  }
    
  // Implementing the abstract method to calculate the area of the circle
  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }
    
  // Implementing the abstract method to calculate the perimeter of the circle
  @Override
  double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

// Concrete class Rectangle that extends Shape
class Rectangle extends Shape {
  private double width;  // Width of the rectangle
  private double height; // Height of the rectangle
    
  // Constructor to initialize Rectangle
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
    
  // Implementing the abstract method to calculate the area of the rectangle
  @Override
  double calculateArea() {
    return width * height;
  }
    
  // Implementing the abstract method to calculate the perimeter of the rectangle
  @Override
  double calculatePerimeter() {
    return 2 * (width + height);
  }
}

// Main class to demonstrate the usage of abstract classes
public class AbstractEg {
  public static void main(String[] args) {
    // Creating instances of Circle and Rectangle
    Shape circle = new Circle(5.0); // Circle with radius 5.0
    Shape rectangle = new Rectangle(4.0, 6.0); // Rectangle with width 4.0 and height 6.0
        
    // Displaying information for Circle
    System.out.println("Circle Info:");
    circle.displayInfo(); // Calls the displayInfo method which uses calculateArea and calculatePerimeter
        
    System.out.println(); // New line for separation
        
    // Displaying information for Rectangle
    System.out.println("Rectangle Info:");
    rectangle.displayInfo(); // Calls the displayInfo method which uses calculateArea and calculatePerimeter
  }
}
