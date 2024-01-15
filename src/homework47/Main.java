package homework47;

import java.util.Scanner;

public class Main {

  public static void storeCCheckout(Pair<String, Double>[] pairs, int length) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Введите наименование товара - ");
  String userChoice = scanner.nextLine();

  int index = -1;
  for (int i = 0; i < length; i++) {
    if (userChoice.equals(pairs[i].getFirst())) {
      index = i;
      break;
    }
  }
  if (index != -1) {
    System.out.println("стоимость " + pairs[index].getFirst()
        + " составляет " + pairs[index].getSecond() + " Евро");
  } else {
    System.out.println("Товара " + userChoice + " нет в магазине");
  }
}

  public static void main(String[] args) {
    Pair<String, Double>[] pairs = new Pair[3];
    pairs[0] = new Pair<>("Яблоко", 2.1);
    pairs[1] = new Pair<>("Огурец", 1.5);
    pairs[2] = new Pair<>("Лук", 0.9);

    storeCCheckout(pairs, pairs.length);
  }
}
