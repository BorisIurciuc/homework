package homework46.task01;

import java.util.Scanner;
/**
 * 09/01/2024 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] value = new double[7];
    double sum = 0;
    double average = 0;
    int count = 1;

    do {
      System.out.print("Enter value - ");
      value[count] = scanner.nextDouble();
      if (value[count] == 0) break;
      sum += value[count];
      average = sum / count;
      count++;
    } while (true);

    for (count = 1; count < value.length - 1; count++) {
      System.out.print(value[count] + " ");
    }
    System.out.printf("\n%.2f ", average);
    scanner.close();
  }
}
