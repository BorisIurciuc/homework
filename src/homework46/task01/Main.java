package homework46.task01;

import java.util.Scanner;
/**
 * 09/01/2024 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] value = {0};
    MyArray myArray = new MyArray(value);

    double sum = 0;
    double average = 0;
    int count = 1;
    do {
      System.out.print("Enter value - ");
      myArray.add(scanner.nextDouble());
      if (myArray.get(count) == 0) break;
      sum += myArray.get(count);
      average = sum / count;
      count++;
    } while (true);

    System.out.printf("\n%.2f ", average);
    System.out.println("\n" + myArray);
    scanner.close();
  }
}