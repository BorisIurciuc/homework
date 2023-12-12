package homework40;

import java.util.Objects;

public class Plate extends Dishes {

  private int diameter;       // диаметр тарелки

  public Plate(String name, String color, int diameter) {
    super(name, color);
    this.diameter = diameter;
  }

  @Override
  public void service() {
    System.out.print("Положить кусочек торта ");
  }

  @Override
  public String toString() {
    return getName() + " " + getColor() + " диаметром " + this.diameter + " см";
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getColor(), diameter);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Plate plate;
    if (obj instanceof Plate) {
      plate = (Plate) obj;
    } else {
      return false;
    }
    return this.getName().equals(plate.getName())
        && this.getColor().equals(plate.getColor())
        && this.diameter == plate.diameter;
  }
}
