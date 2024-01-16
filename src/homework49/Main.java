package homework49;

import java.util.Scanner;

/**
 * 16/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    String text;

    MyArray<String> greetings = new MyArray<>();
    greetings.add("Hello");
    greetings.add("Hi");
    greetings.add("Good morning");
    greetings.add("Hey");

    // метод получения значения элемента по индексу
    System.out.print("\nTo search value enter index < " + greetings.size() + " - ");
    number = scanner.nextInt();
    try {
      text = greetings.get(number);
      System.out.println("This value is - " + text);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
    for (String s : greetings) {
      System.out.print(" - " + s);
    }

    // метод изменения значения элемента по индексу
    System.out.print("\nTo set new value enter index < " + greetings.size() + "- ");
    number = scanner.nextInt();
    text = "Servus";
    try {
      greetings.set(number, text);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
    for (String s : greetings) {
      System.out.print(" - " + s);
    }

    // метод удаления значения элемента по индексу
    System.out.print("\nTo remove value enter index < " + greetings.size() + "- ");
    number = scanner.nextInt();
    try {
      greetings.remove(number);
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
    for (String s : greetings) {
      System.out.print(" - " + s);
    }
    scanner.close();
  }
}
