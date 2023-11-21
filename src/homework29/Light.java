package homework29;

public enum Light {
  //для пешеходов всего два возможных варианта состояния светофора
  GREEN("green"),
  YELLOW("yellow"),
  RED("rot");

  private final String light;

  Light(String light) {
    this.light = light;
  }

}
