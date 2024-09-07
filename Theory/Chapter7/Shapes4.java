// A class for two-dimensional shapes with multiple constructors.
class TwoDShape {
  private double width; // Private member to store the width
  private double height; // Private member to store the height

  // Default constructor initializes width and height to 0.0
  TwoDShape() {
    width = height = 0.0;
  }

  // Parameterized constructor initializes width and height to given values
  TwoDShape(double w, double h) {
    width = w;
    height = h;
  }

  // Constructor to initialize width and height to the same value
  TwoDShape(double x) {
    width = height = x;
  }

  // Accessor method to get the width
  double getWidth() { 
     return width; 
  }
    
  // Accessor method to get the height
  double getHeight() { 
    return height; 
  }
    
  // Mutator method to set the width
  void setWidth(double w) { 
    width = w; 
  }
    
  // Mutator method to set the height
  void setHeight(double h) { 
    height = h; 
  }
    
  // Method to display the dimensions of the shape
  void showDim() {
    System.out.println("Width and height are " + width + " and " + height);
  }
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
  private String style; // Private member to store the style of the triangle

  // Default constructor initializes style to "none" and uses superclass default constructor
  Triangle() {
    super(); // Calls the default constructor of TwoDShape
    style = "none";
  }
    
  // Constructor to initialize width, height, and style
  Triangle(String s, double w, double h) {
    super(w, h); // Calls parameterized constructor of TwoDShape
    style = s;
  }
    
  // Constructor to initialize width and height to the same value and sets style to "filled"
  Triangle(double x) {
    super(x); // Calls constructor of TwoDShape with a single argument
    style = "filled";
  }
    
  // Method to calculate the area of the triangle
  double area() {
    return getWidth() * getHeight() / 2; // Uses getter methods from TwoDShape
  }
    
    // Method to display the style of the triangle
  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

// A subclass of Triangle, adding color functionality.
class ColorTriangle extends Triangle {
  private String color; // Private member to store the color of the triangle

  // Constructor to initialize color, style, width, and height
  ColorTriangle(String c, String s, double w, double h) {
    super(s, w, h); // Calls the constructor of Triangle to initialize style, width, and height
    color = c; // Initialize color
  }
    
  // Accessor method to get the color
  String getColor() { 
    return color; 
  }
    
  // Method to display the color of the triangle
  void showColor() {
    System.out.println("Color is " + color);
  }
}

// Main class to demonstrate the functionality of the multilevel inheritance hierarchy.
class Shapes4 {
  public static void main(String args[]) {
    // Create ColorTriangle objects with specific color, style, width, and height
    ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
    ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);

    // Display information for t1
    System.out.println("Info for t1: ");
    t1.showStyle(); // Displays the style of t1
    t1.showDim(); // Displays the dimensions of t1
    t1.showColor(); // Displays the color of t1
    System.out.println("Area is " + t1.area()); // Calculates and displays the area of t1
        
    // Display information for t2
    System.out.println();
    System.out.println("Info for t2: ");
    t2.showStyle(); // Displays the style of t2
    t2.showDim(); // Displays the dimensions of t2
    t2.showColor(); // Displays the color of t2
    System.out.println("Area is " + t2.area()); // Calculates and displays the area of t2
  }
}
