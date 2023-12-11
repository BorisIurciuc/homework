package homework39.task02;

/**
 * 11/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

    public static void getStarted(int numberOfStaff, Employee[] employee) {
       for (int i = 0; i < numberOfStaff; i++) {
        System.out.print(employee[i]);
        employee[i].work();
      }
    }

  public static void main(String[] args) {
    Employee[] employee = new Employee[10];
    String[] name = {"Bill", "John", "Jek", "Bob", "Kate", "Mary", "Sam", "Peter", "Helen","Tom"};
    for (int i = 0; i < employee.length; i++) {
      if (i < 1) {
        employee[i] = new Manager(name[i], 7500 );
      } else {
        employee[i] = new Developer(name[i], 5000 + i * 10 );
      }
    }
    getStarted(10, employee);
  }
}
