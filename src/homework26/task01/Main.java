package homework26.task01;
/**
 * 09/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void printHuman(Human person2){
    System.out.println("Привет, меня зовут " + person2.name + ", мне " + person2.age + " !");
  }

  public static void main(String[] args) {
    Human person1 = new Human("Настя", 36);
     person1.introduce();

    Human person2 = new Human("Вадим", 19);
     printHuman(person2);

    Human person3 = new Human("Мария", 28);
      person3.introduce();
  }

}
