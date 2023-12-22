package homework44;

public class Polygon extends Shape {

  private int sideLength;
  private int amountSide;

  public Polygon() {
  }
  @Override
  public double getPerimeter() {
    return perimeter = getSideLength() + getAmountSide();
  }

  public int getSideLength() {
    return sideLength;
  }

  public void setSideLength(int sideLength) {
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
    return "Polygon:  " + " perimeter: " + perimeter + ", sideLength: " + sideLength +
        ", amountSide: " + amountSide;
  }
}
