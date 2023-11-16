package homework29;

/**
 * 15/11/2023 homework  * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Move move = new Move();
    Light light = Light.GREEN;

    move.go(light);
    move.print(light);
  }
}
