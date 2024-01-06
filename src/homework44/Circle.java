package homework44;

public class Circle extends Shape {

  private double radius;

  public Circle() {
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * getRadius() * Math.PI;
  }

  @Override
  public void resize(double coefficient) {
    this.radius = getRadius() * coefficient;
  }

  @Override
  public String toString() {
    return "Circle: radius: " + radius;
  }
}
