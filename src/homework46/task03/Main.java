package homework46.task03;

import java.util.Random;
import java.util.Scanner;

/**
 * 10/01/2024 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void filling(int length, int[] arr) {
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      arr[i] = random.nextInt(100);
    }
  }

  public static void sort(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[index] < arr[j]) {
          index = j;
        }
      }
      if (index == i) {
        continue;
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
  }


  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Length of array - ");
    int length = scanner.nextInt();
    int[] arr = new int[length];

    filling(length, arr);
    print(arr);
    System.out.println();
    sort(arr);
    print(arr);
  }
}
