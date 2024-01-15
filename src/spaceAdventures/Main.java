package spaceAdventures;

import java.util.Random;
import java.util.Scanner;

/**
 * 30/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  static int key;

  public static void setObstacle(int key, Obstacle[] obstacle) {
    for (int i = 0; i < key; i++) {
      if (i < key / 3) {
        obstacle[i] = new Asteroid(100, 100);
      } else {
        obstacle[i] = new Enemy(50, 5);
      }
    }
  }

  public static int guessHurt() {
    int hurt;
    int randomHurt = new Random().nextInt(1, 5);
    System.out.print("\nShot!  Enter number for guess shot booster - ");
    int scannerHurt = new Scanner(System.in).nextInt();
    if (randomHurt == scannerHurt) {
      hurt = 2;
    } else if ((scannerHurt == (randomHurt + 1)) || (scannerHurt == (randomHurt - 1))) {
      hurt = 1;
    } else {
      hurt = 0;
    }
    System.out.println("randomHurt " + randomHurt + " then shot booster = " + hurt);
    return hurt;
  }

  public static void playGame(int key, Obstacle[] obstacles, SpaceShip ship) {

    for (int i = 1; i < key; i++) {
      if (obstacles[i] instanceof Asteroid) {
        System.out.print("Asteroid; if press '0' then skip asteroid - ");
        if (new Scanner(System.in).nextInt() == 0) {
          i++;
          continue;
        } else {
          System.out.println("Asteroid " + i);
          ship.destroy();
        }
      }

      if (obstacles[i] instanceof Enemy) {
        System.out.println("\nFight !!!");
        int shots = 1;
        while (true) {

          obstacles[i].hurt(guessHurt());
          ship.attack(obstacles[i]);

          ((Enemy) obstacles[i]).attack(ship);
          System.out.println("Enemy " + i + " shots " + shots++);
          if (!obstacles[i].isAlive()) {
            System.out.println(" - Enemy is dead !!!");
            ship.setScore(200);
            break;
          }
          if (!ship.isAlive()) {
            System.out.println("Shep is dead, game over");
            return;
          }
        }
        System.out.println("Enemy " + i + " shots " + shots + "\n " + ship + "\n " + obstacles[i]);
      }
    }
  }

  public static void main(String[] args) {
    Random random = new Random();
    key = 1 + random.nextInt(10);
    System.out.print("key " + key + " ");
    SpaceShip ship = new SpaceShip(100, "Ship", 10);
    Obstacle[] obstacles = new Obstacle[key];

    System.out.println(ship);
    setObstacle(key, obstacles);
    playGame(key, obstacles, ship);

    System.out.println("RESULT \nScore " + ship.getScore() + " remaining strength "
        + ship.getRemainingStrength() * 5);
    System.out.println(ship);
  }
}
