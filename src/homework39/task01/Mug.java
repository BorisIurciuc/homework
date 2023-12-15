package homework39.task01;

public class Mug {
  private String type;            // целевое назначение кружки
  private String color;           // цвет
  private int capacity;           // вместимость, в мл
  private int volumeFluid;        // текущий объем жидкости, в мл

  public Mug() {
  }
  public Mug(String type, String color, int capacity, int volumeFluid) {
    this.type = type;
    this.color = color;
    this.capacity = capacity;
    this.volumeFluid = volumeFluid;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getVolumeFluid() {
    return volumeFluid;
  }

  public void setVolumeFluid(int volumeFluid) {
    this.volumeFluid = volumeFluid;
  }

  @Override
  public String toString() {
    return "Чашка для- " + this.type + ", цвет- " + this.color
        + ", вместимость- " + this.capacity + "ml, текущий объем жидкости- "+ this.volumeFluid;
  }

}
