class TwoDShape {
  private double width; // Private member to store the width
  private double height; // Private member to store the height

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
    
  // Constructor to initialize width, height, and style
  Triangle(String s, double w, double h) {
    setWidth(w); // Set width using the superclass method
    setHeight(h); // Set height using the superclass method
    style = s; // Initialize style
  }
    
  // Method to calculate the area of the triangle
  double area() {
    return getWidth() * getHeight() / 2; // Uses superclass methods to get width and height
  }
    
  // Method to display the style of the triangle
  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

// Main class to demonstrate the functionality
class Shapes2 {
  public static void main(String args[]) {
    // Create a Triangle object with style "filled", width 4.0, and height 4.0
    Triangle t1 = new Triangle("filled", 4.0, 4.0);
    System.out.println("Info for t1: ");
    t1.showStyle(); // Display the style of t1
    t1.showDim(); // Display the dimensions of t1
    System.out.println("Area is " + t1.area()); // Calculate and display the area of t1
        
    // Create another Triangle object with style "outlined", width 8.0, and height 12.0
    Triangle t2 = new Triangle("outlined", 8.0, 12.0);
    System.out.println();
    System.out.println("Info for t2: ");
    t2.showStyle(); // Display the style of t2
    t2.showDim(); // Display the dimensions of t2
    System.out.println("Area is " + t2.area()); // Calculate and display the area of t2
  }
}
