package homework44;

public class Rectangle extends Shape {

  private double sideA;
  private double sideB;

  public Rectangle() {
  }

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }

  @Override
  public double getPerimeter() {
    return (getSideA() + getSideB()) * 2;
  }

  @Override
  public void resize(double coefficient) {
    sideA *= coefficient;
    sideB *= coefficient;
  }

  @Override
  public String toString() {
    return "Rectangle: " + " sideA: " + sideA + ", sideB: " + sideB;
  }
}
