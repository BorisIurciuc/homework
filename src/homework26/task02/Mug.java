package homework26.task02;

/**
 * 09/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Mug {

  String type;            // целевое назначение кружки
  String color;           // цвет
  boolean statusReady;    // готовность к использованию
  int capacity;           // вместимость, в мл
  int volumeFluid;        // текущий объем жидкости, в мл

  public Mug() {
    this("tee", "red", true, 250, 0);
  }

  public Mug(String type, String color, boolean statusReady, int capacity, int volumeFluid) {
    this.type = type;
    this.color = color;
    this.statusReady = statusReady;
    this.capacity = capacity;
    this.volumeFluid = volumeFluid;
  }

  public void printMug() {
    System.out.println("Чащка для- " + type + ", цвет- " + color + ", готовность к использованию- "
        + statusReady + ", вместимость- " + capacity + "ml, текущий объем жидкости- "
        + volumeFluid);
  }
}
