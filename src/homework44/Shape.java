package homework44;

public abstract class Shape {

  protected double perimeter;

  public Shape() {

  }

  public Shape(double perimeter) {
    this.perimeter = perimeter;
  }

  public abstract double getPerimeter();

  @Override
  public String toString() {
    return "Shape: " + "perimeter = " + perimeter;
  }


}
