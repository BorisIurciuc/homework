package homework33;

import java.util.Scanner;

/**
 * 25/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main03 {
  // Метод, который сгенерирует первые n чисел последовательности Фибоначчи.
  // n передать как параметр в метод.
  public static void fibonacci(int n, int[] f) {
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i < n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
  }
  public static void print(int[] f) {
    for (int i = 0; i < f.length; i++) {
      System.out.print(f[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = scanner.nextInt();
    int[] f = new int[n];
    fibonacci(n,f);
    print(f);
  }
}
