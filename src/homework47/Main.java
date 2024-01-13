package homework47;

/**
 * 11/01/2024 homework * @author Boris Iurciuc (cohort36)
 */

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("введите наименование продукта - ");
    String nameProduct = scanner.nextLine();

    MyArray<String, Double> product = new MyArray<>();
    product.add(0, "Яблоко", 0.5);
    product.add(1, "Лук", 1.1);
    product.add(2, "Помидор", 2.1);

    product.indexOf(nameProduct);
  }
}
