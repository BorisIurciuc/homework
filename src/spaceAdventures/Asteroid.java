package spaceAdventures;

public class Asteroid extends Obstacle {
  private static int value;
  public Asteroid(int remainingStrength, int value) {
    super(remainingStrength);
    this.value = value;
  }

  @Override
  public void encounter() {
    System.out.println("Вы нашли астероид с ресурсами!");
  }

  public static int extract(){
    return value;
  }
  @Override
  public String toString() {
    return  "Asteroid.  value " + value;
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
}
