package homework44;

public class Rectangle extends Shape {

  private int sideA;
  private int sideB;

  public Rectangle() {
  }

  @Override
  public double getPerimeter() {
    return (getSideA() + getSideB()) * 2;
  }

  public int getSideA() {
    return sideA;
  }

  public void setSideA(int sideA) {
    this.sideA = sideA;
  }

  public int getSideB() {
    return sideB;
  }

  public void setSideB(int sideB) {
    this.sideB = sideB;
  }

  @Override
  public String toString() {
    return "Rectangle: " + " perimeter: " + getPerimeter() + ", sideA: " + sideA + ", sideB: " + sideB;
  }
}


