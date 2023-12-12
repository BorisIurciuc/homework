package homework40;

import java.util.Objects;

public class Dishes {

  private String name;
  private String color;           // цвет

  public Dishes(String name, String color) {
    this.name = name;
    this.color = color;
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

  public void service() {
    System.out.println("угостить");
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color);
  }
}
