package homework32;

import java.util.Scanner;

/**
 * 23/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main02 {
//таблица умножения числа, которое введет пользователь.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ввод:");
    int num = scanner.nextInt();
    int[] arr = new int[11];
    for (int i = 1; i <= 10; i++) {
      arr[i] = num * i;
    }
    System.out.println("Вывод:");
    for (int i = 1; i <= 10; i++) {
     System.out.println(num + " * " + i + " = " + arr[i]);
    }
  }
}
