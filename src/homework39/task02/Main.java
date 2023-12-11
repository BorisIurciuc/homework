package homework39.task02;

/**
 * 11/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

    public static void getStarted(int numberOfStaff, Manager manager, Developer[] developer){
      System.out.println(manager);
      manager.work();
      for (int i = 0; i < numberOfStaff; i++) {
        System.out.print(developer[i]);
        developer[i].work();
      }
    }

  public static void main(String[] args) {
    int numberOfStaff = 9;
    Manager manager = new Manager("Bill", 9000);

    Developer[] developer = new Developer[numberOfStaff];
    developer[0] = new Developer("John", 5001);
    developer[1] = new Developer("Jek", 5002);
    developer[2] = new Developer("Bob", 5003);
    developer[3] = new Developer("Kate", 5004);
    developer[4] = new Developer("Mary", 5005);
    developer[5] = new Developer("Sam", 5006);
    developer[6] = new Developer("Peter", 5007);
    developer[7] = new Developer("Elen", 5008);
    developer[8] = new Developer("Tom", 5009);

    getStarted(numberOfStaff, manager, developer);
  }
}
