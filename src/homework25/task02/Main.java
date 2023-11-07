package homework25.task02;
/**
 * 07/11/2023 homework  * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Pen myPen = new Pen();
    myPen.inkLevel = 1000;
    myPen.inkForChar = 10;
    myPen.text = "Привет, меня зовут Джон, мне 36 !";

    myPen.checkInk();              // метод - проверка достаточности чернил для данного текста

    if (myPen.checkInkLevel <= myPen.inkLevel ) {       // условие достаточности чернил
      myPen.write();              // метод - вывод текста на консоль
      myPen.refill();             // метод - восстановление уровня чернил
    } else {
      System.out.println("текст слишком длинный");

    }
  }
}
