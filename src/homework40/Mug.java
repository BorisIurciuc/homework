package homework40;

import java.util.Objects;

public class Mug extends Dishes {

  private int fluid;           // вместимость, в мл

  public Mug(String name, String color, int fluid) {
    super(name, color);
    this.fluid = fluid;
  }

  public int getFluid() {
    return fluid;
  }

  public void setFluid(int fluid) {
    this.fluid = fluid;
  } // изменено значение - жидкость

  @Override
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
