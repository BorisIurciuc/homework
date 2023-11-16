package homework29;

/**
 * 15/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Move {
  private boolean step;

  public Move() {
  }

  public void go(Light light) {
    switch (light) {
      case GREEN:
        step = true;
        break;
      case ROT:
        step = false;
        break;
    }
  }
  public void print(Light light) {
    System.out.println("light " + light + " \nStep  " + step);
  }
}
