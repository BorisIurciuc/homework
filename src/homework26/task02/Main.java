//Разработать любой класс, который описывает любой предмет из реальной жизни.
//Для него сделать нужные поля, конструктор с параметрами и конструктор по умолчанию.
//Также указать методы по желанию.

package homework26.task02;

/**
 * 09/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Mug mug1 = new Mug("kaffee", "black", false, 150, 0);
    Mug mug2 = new Mug("kaffee", "white", true, 120, 0);
    Mug mug3 = new Mug();

    mug1.printMug();
    mug2.printMug();
    mug3.printMug();
  }
}
