package homework46.task02;

import java.util.Scanner;

/**
 * 09/01/2024 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void nameDay(int day) {
    switch(day)
    {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Check the number");
    }
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int day;
    while (true) {
      System.out.print("Enter integer number 1 - 7 : ");
      day = scanner.nextInt();
      if (day > 0 && day < 8) {
        break;
      } else {
        System.out.println("Error, number ");
      }
    }
    nameDay(day);
  }
}
