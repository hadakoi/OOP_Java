// A class for two-dimensional objects with multiple constructors.
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

// A subclass of TwoDShape specifically for triangles.
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

// Main class to demonstrate the usage of Triangle class and its constructors
class Shapes3 {
    public static void main(String[] args) {
        // Create a Triangle object using the default constructor
        Triangle t1 = new Triangle();
        
        // Create a Triangle object with specific style, width, and height
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        
        // Create a Triangle object with equal width and height, and default style "filled"
        Triangle t3 = new Triangle(4.0);
        
        // Demonstrate object reference assignment (t1 now references the same object as t2)
        t1 = t2;

        // Display information for t1 (which now references the same object as t2)
        System.out.println("Info for t1: ");
        t1.showStyle(); // Displays the style of t1
        t1.showDim(); // Displays the dimensions of t1
        System.out.println("Area is " + t1.area()); // Calculates and displays the area of t1
        
        // Display information for t2
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle(); // Displays the style of t2
        t2.showDim(); // Displays the dimensions of t2
        System.out.println("Area is " + t2.area()); // Calculates and displays the area of t2
        
        // Display information for t3
        System.out.println();
        System.out.println("Info for t3: ");
        t3.showStyle(); // Displays the style of t3
        t3.showDim(); // Displays the dimensions of t3
        System.out.println("Area is " + t3.area()); // Calculates and displays the area of t3
    }
}
