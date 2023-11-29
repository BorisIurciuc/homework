package homework34.task02;

public enum ListPlanet {
  MERCURY("Меркурий", 2439000.7, 3.33022e23),
  VENUS("Венера", 6051000.8, 4.8675e24),
  EARTH("Земля", 6378000.1, 5.9726e24),
  MARS("Марс", 3396000.2, 6.4171e23),
  JUPITER("Юпитер", 71492000, 1.8986e27),
  SATURN("Сатурн", 60268000, 5.6846e26),
  URANUS("Уран", 25559000, 8.6813e25),
  NEPTUNE("Нептун", 24764000, 1.02409e26);


  private final String name;        // название планеты
  private final double radius;      // радиус планеты
  private final double mass;        // масса планеты

  ListPlanet(String name, double radius, double mass) {
    this.name = name;
    this.radius = radius;
    this.mass = mass;
  }

  public String getName() {
    return name;
  }

  public double getRadius() {
    return radius;
  }

  public double getMass() {
    return mass;
  }
}
