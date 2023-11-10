//Создать класс Human. Для него указать свойства имя и возраст
//В классе, описать метод introduce(), где объект представится, выведя информацию про себя в консоль

package homework25.task01;

/**
 * 07/11/2023 homework * * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Human person1 = new Human();
    person1.name = "Настя";
    person1.age = 36;
    person1.introduce();

    Human person2 = new Human();
    person2.name = "Вадим";
    person2.age = 19;
    person2.introduce();

    Human person3 = new Human();
    person3.name = "Мария";
    person3.age = 28;
    person3.introduce();
  }
}
