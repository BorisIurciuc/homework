package homework44;

public class Circle extends Shape {

  private int radius;

  public Circle(double perimeter, int radius) {
    super(perimeter);
    this.radius = radius;
  }

  @Override
  public double getPerimeter() {
    return perimeter = 2 * getRadius() * Math.PI;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle:   " + " perimeter = " + perimeter + ", radius: " + radius;
  }
}