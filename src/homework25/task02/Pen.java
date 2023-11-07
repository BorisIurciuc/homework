package homework25.task02;

/**
 * 07/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Pen {

  int inkLevel;       //Начальный уровень чернил, мл
  int inkForChar;     //Затраты чернил на 1 символ, мл
  int checkInkLevel;  //Затраты чернил на данный текст, мл
  String text;        //Заданный текст

  public void checkInk() {        // метод - проверка достаточности чернил для данного текста
    System.out.println("Начальный уровень: " + inkLevel + " мл");
    checkInkLevel = inkForChar * text.length();
  }

  public void write() {           // метод - вывод текста на консоль
    System.out.println("Текст            : " + text);
    System.out.println("Кол-во символов  : " + text.length());
    inkLevel = inkLevel - inkForChar * text.length();
    System.out.println("Текущий уровень  : " + inkLevel + " мл");
  }

  public void refill() {          // метод - восстановление уровня чернил
    System.out.println("Заправим чернил !");
    inkLevel = 1000;
    System.out.println("Уровень после заправки: " + inkLevel + " мл");
  }
}
