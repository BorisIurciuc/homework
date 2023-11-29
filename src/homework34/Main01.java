package homework34;

import java.util.Scanner;

/**
 * 28/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main01 {

  //Пользователь вводит название месяца маленькими буквами. Вывести сезон, в котором будет этот месяц.
//Для этого сделать метод с оператором switch, который принимает и возвращает String
  public static String choseSeason(String month) {

    switch (month) {
      case ("декабрь"):
      case ("январь"):
      case ("февраль"):
        return "зима";
      case ("март"):
      case ("апрель"):
      case ("май"):
        return "весна";
      case ("июнь"):
      case ("июль"):
      case ("август"):
        return "лето";
      case ("сентябрь"):
      case ("октябрь"):
      case ("ноябрь"):
        return "осень";
    }
    return "ошибка ввода";
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите месяц : ");
    String month = scanner.nextLine();

    String season = choseSeason(month);
    System.out.println("Сезон : " + season);
  }
}
