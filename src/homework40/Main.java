package homework40;

/**
 * 11/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

      Dishes mug1 = new Mug("чашка", "белая", 0);
      Dishes mug2 = new Mug("чашка", "белая", 0);

      System.out.println(mug1);                   // состояние первой чашки
      System.out.println(mug2);                   // состояние второй чашки
      System.out.println(mug1.equals(mug2));      // сравнение чашек
      mug1.service();                             // изменено значение - жидкость в первой чашке
      System.out.println(mug1);                   // состояние первой чашки
      System.out.println(mug1.equals(mug2));      // сравнение чашек

    }
}


