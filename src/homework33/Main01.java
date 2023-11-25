package homework33;

/**
 * 25/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main01 {
// метод, изменяющий знаки всех элементов целочисленного массива на противоположные
  public static void change(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= -1;
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 5, 7, -4, 8, -3, -6};
    change(arr);
  }
}
