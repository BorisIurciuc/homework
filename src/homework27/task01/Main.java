package homework27.task01;

/**
 * 10/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Human human1 = new Human("", -1);
    human1.setName("Настя");
    human1.setAge(36);
    String human1Name = human1.getName();
    int human1Age = human1.getAge();
    // вывод на консоль через присвоение значений переменным в главном методе
    System.out.println("Name - " + human1Name  + ", age : " + human1Age);

    Human human2 = new Human("Вова", -1);
    human2.setName("Вольдемар");
    human2.setAge(19);
    // вывод на консоль через вызов метода
    human2.print();

    Human human3 = new Human("Мария", 1000);
    human3.setAge(28 + 1);
    human3.setName("Мария");
    // вывод на консоль через вызов метода
    human3.print();
  }
}
