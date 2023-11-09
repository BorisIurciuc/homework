package homework26.task01;

/**
 * 09/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Human {

  String name;
  int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Привет, меня зовут " + name + ", мне " + age + " !");
  }
}
