package homework44;

public class Circle extends Shape {

  private int radius;

  public Circle() {
  }

  @Override
  public double getPerimeter() {
    return 2 * getRadius() * Math.PI;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public String toString() {
    return "Circle:   " + " perimeter = " + getPerimeter() + ", radius: " + radius;
  }
}