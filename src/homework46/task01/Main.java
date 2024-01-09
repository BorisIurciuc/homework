package homework46.task01;

import java.util.Scanner;
/**
 * 09/01/2024 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double value;
    double sum = 0;
    double average = 0;
    int count = 0;

    do {
      System.out.print("Enter value - ");
      value = scanner.nextDouble();
      sum += value;
      average = sum / count;
      count++;
    } while (value !=0);
    System.out.printf("%.2f ", average);
  }
}
