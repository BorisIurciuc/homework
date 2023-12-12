package homework40;

/**
 * 11/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void print(Dishes[] dishes) {
    for (int i = 0; i < dishes.length; i++) {
      System.out.println((i + 1) + " " + dishes[i].getName() + " " + dishes[i].getColor());
    }
    System.out.println();
  }

  public static void main(String[] args) {

    Dishes[] dishes = new Dishes[12];
    for (int i = 0; i < dishes.length; i++) {
      if (i < 6) {
        dishes[i] = new Mug("чашка", "белая", 0);
      } else {
        dishes[i] = new Plate("тарелка", "бежевая", 25);
      }
    }

    print(dishes);
    System.out.println(dishes[0]);                   // состояние первой чашки
    System.out.println(dishes[1]);                   // состояние второй чашки
    System.out.println(dishes[0].equals(dishes[1])); // сравнение чашек
    dishes[0].service();                             // изменено значение - жидкость в первой чашке
    System.out.println(dishes[0]);                   // новое состояние первой чашки
    System.out.println(dishes[0].equals(dishes[1])); // сравнение чашек
  }
}


