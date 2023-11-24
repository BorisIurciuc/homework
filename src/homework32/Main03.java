package homework32;
import java.util.Scanner;

/**
 * 23/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main03 {
//Написать программу, которая запрашивает у пользователя число в диапазоне от 1 до 10 (включительо).
//Если пользователь написал неподходящее число, программа спрашивает еще раз.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    do {
      System.out.print("Введите число от 1 до 10 ");
      num = scanner.nextInt();
    } while (num < 1 || num > 10);
    System.out.println("Вы ввели " + num +". Спасибо!");
  }

}
