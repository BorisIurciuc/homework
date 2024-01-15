package homework44;

public class Polygon extends Shape {

  private double sideLength;
  private int amountSide;

  public Polygon() {
  }

  @Override
  public double getPerimeter() {
    return getSideLength() * getAmountSide();
  }

  public double getSideLength() {
    return sideLength;
  }

  public void setSideLength(double sideLength) {
    this.sideLength = sideLength;
  }

  public int getAmountSide() {
    return amountSide;
  }

  public void setAmountSide(int amountSide) {
    this.amountSide = amountSide;
  }

  @Override
  public String toString() {
    return "Polygon:  " + "perimeter: " + getPerimeter() + ", sideLength: " + sideLength +
        ", amountSide: " + amountSide;
  }

  @Override
  public void resize(double coefficient) {
    sideLength *= coefficient;
  }
}
