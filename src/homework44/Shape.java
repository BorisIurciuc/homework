package homework44;

public abstract class Shape implements Resizable {

  protected double perimeter;

  public Shape() {
  }

  public abstract double getPerimeter();

  @Override
  public void resize(double coefficient) {
  }

  @Override
  public String toString() {
    return "Shape: " + "perimeter = " + perimeter;
  }
}
