package homework37.test02;

import java.util.Scanner;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TV tv = new TV(116, 5, 10);
    Remote remote = new Remote(116, tv);
    tv.showTV();
    int nr;
    do {
      System.out.print("Кнопки:  1 -> , 2 <- , 3 - каналы, 0 - выход ");
      nr = scanner.nextInt();
      if (nr == 1) {  remote.up();}
      if (nr == 2) {  remote.down();}
      if (nr == 3) {
        System.out.print("кнопка - ");
        remote.nrCanal(scanner.nextInt());
      }
      tv.showTV();
    } while (nr != 0);
  }
}
