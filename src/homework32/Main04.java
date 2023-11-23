package homework32;

import java.util.Scanner;

/**
 * 23/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main04 {

  //Запросить у пользователя размер массива, потом сам массив целых чисел.
//Проверить, является ли массив отсортированным по возрастанию.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Длина массива: ");
    int length = scanner.nextInt();
    int[] arr = new int[length];

    System.out.println("Значения массива: ");
    for (int i = 0; i < length; i++) {
      System.out.print("[" + i + "]: ");
      arr[i] = scanner.nextInt();
    }

    String checkArr = "";
    for (int i = 0; i < length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        checkArr = "Массив не отсортирован";
        break;
      } else {
        checkArr = "Массив отсортирован";
      }
    }
    System.out.println(checkArr);
  }
}
