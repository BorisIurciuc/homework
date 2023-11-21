package homework27.task01;

/**
 * 10/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Human {

  private String name;
  private int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.isEmpty()) {
      System.out.println("Должно быть указано имя ");
      return;
    }
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0 && age < 150) {
      this.age = age;
    } else {
      System.out.println("Ошибка возраст д.б. > 0 и < 150");
    }
  }

  public void print() {
    System.out.println("Name - " + getName() + ", age : " + getAge());
  }
}
