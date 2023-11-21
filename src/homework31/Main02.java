package homework31;

import java.util.Random;
import java.util.Scanner;

/**
 * 21/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main02 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Сколько костей бросать, 1 или 2  ?");
    int numberDice = scanner.nextInt();

    int rezult1 = 1 + random.nextInt(6);
    System.out.println("Кость 1 - " + rezult1);

    if (numberDice == 2 ) {
      int rezult2 = 1 + random.nextInt(6);
      System.out.println("Кость 2 - " + rezult2);
    }
  }
}
