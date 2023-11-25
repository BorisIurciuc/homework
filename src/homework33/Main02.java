package homework33;

/**
 * 25/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main02 {

  //метод, возвращающий массив типа char, в котором записан английский алфавит (маленькими буквами)
  public static void alphabet() {
    char ch;
    for (int i = 97; i < 123; i++) {
      ch = (char) i;
      System.out.print(ch + " ");
    }
  }

  public static void main(String[] args) {
    alphabet();
  }
}
