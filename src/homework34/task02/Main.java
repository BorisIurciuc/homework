package homework34.task02;

import java.util.Scanner;

/**
 * 28/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  private static String typePlanet(int index) {                     // метод - класс планеты
    switch (index + 1) {
      case 1:
      case 2:
      case 4:
        return "Безжизненный камень";
      case 3:
        return "Обитаемая планета";
      case 5:
      case 6:
        return "Газовый гигант";
      case 7:
      case 8:
        return "Ледяная планета";
    }
    return "planet";
  }

  public static double gravitation(double radius, double mass) {    // метод - гравитация
    return (6.6743e-11 * mass) / Math.pow(radius, 2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListPlanet[] planets = ListPlanet.values();   // массив планет
    System.out.println("Планеты солнечной системы : ");
    for (int i = 0; i < planets.length; i++) {    // вызов списка планет
      System.out.println((i + 1) + " " + planets[i]);
    }
    System.out.print("Выберете планету: ");
    int index = scanner.nextInt() - 1;           // выбор планеты во индексу массива

    double radius = ListPlanet.values()[index].getRadius();                 // получение радиуса
    double mass = ListPlanet.values()[index].getMass();                     // получение массы
    System.out.println("Вы выбрали");
    System.out.println("Планета : " + ListPlanet.values()[index].getName());// получение названия
    System.out.println("Класс   : " + typePlanet(index));                   // метод - класс планеты
    System.out.println("r       : " + radius + " м");
    System.out.println("m       : " + mass + " кг");
    System.out.println("g       : " + gravitation(radius, mass) + " м/с²"); // метод - гравитация
  }
}
