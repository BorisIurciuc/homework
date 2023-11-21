package homework31;

import java.util.Scanner;

/**
 * 21/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main01 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите а - ");
    int a = scanner.nextInt();

    System.out.print("Введите b - ");
    int b = scanner.nextInt();

    System.out.print("Введите c - ");
    int c = scanner.nextInt();

    double d;
    while (true) {
      System.out.print("Введите d - ");
      d = scanner.nextDouble();
      if (d != 0) {
        break;
      } else {
        System.out.println("Ошибка, переменная d = 0");
      }
    }

    double rez = a * (b - d) + c * a / d;

    System.out.println("Результат : " + rez);

    scanner.close();
  }
}

