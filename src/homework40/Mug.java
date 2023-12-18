package homework40;

import java.util.Objects;

public class Mug {

  private String name;
  private String color;
  private int fluid;           // вместимость, в мл

  public Mug(String name, String color, int fluid) {

    this.name = name;
    this.color = color;
    this.fluid = fluid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getFluid() {
    return fluid;
  }

  public void setFluid(int fluid) {
    this.fluid = fluid;
  } // изменено значение - жидкость

  public void service() {
    setFluid(50);
  }

  @Override
  public String toString() {
    return getName() + " " + getColor() + ", " + " сейчас в ней " + this.fluid + " мл";
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getColor(), fluid);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Mug mug;
    if (obj instanceof Mug) {
      mug = (Mug) obj;
    } else {
      return false;
    }
    return this.getName().equals(mug.getName())
        && this.getColor().equals(mug.getColor())
        && this.fluid == mug.fluid;
  }
}
