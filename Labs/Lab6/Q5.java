abstract class Figure {
  int dimension1, dimension2;

  public Figure(int dimension1, int dimension2) {
    this.dimension1 = dimension1;
    this.dimension2 = dimension2;
  }

  abstract double area();
}

class Rectangle extends Figure {
  public Rectangle(int length, int breadth) {
    super(length, breadth);
  }

  @Override
  double area() {
    return dimension1 * dimension2;
  }
}

class Triangle extends Figure {
  public Triangle(int base, int height) {
    super(base, height);
  }

  @Override
  double area() {
    return 0.5 * dimension1 * dimension2;
  }
}

class Square extends Figure {
  public Square(int side) {
    super(side, side);
  }

  @Override
  double area() {
    return dimension1 * dimension1;
  }
}

public class Q5 {
  public static void main(String[] args) {
    Figure fig;

    fig = new Rectangle(10, 5);
    System.out.println("Area of Rectangle: " + fig.area());

    fig = new Triangle(6, 8);
    System.out.println("Area of Triangle: " + fig.area());

    fig = new Square(4);
    System.out.println("Area of Square: " + fig.area());
  }
}
