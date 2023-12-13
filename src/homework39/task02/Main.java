package homework39.task02;

/**
 * 11/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void promotion(Employee[] employee){
    String[] name = {"Bill", "John", "Jek", "Bob", "Kate", "Mary", "Sam", "Peter", "Helen","Tom"};
    int index = 5;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i] instanceof Manager)  {
        employee[i].setSalary(7500 + 1000);
      }
      if (employee[index] instanceof Developer) {
        employee[index] = new Manager(name[index], 7500 );
      }
      break;
    }
  }
  public static void getStarted(Employee[] employee) {
    for (int i = 0; i < employee.length; i++) {
      System.out.print(employee[i]);
      employee[i].work();
    }
  }
  public static void setEmployee(Employee[] employee){
    String[] name = {"Bill", "John", "Jek", "Bob", "Kate", "Mary", "Sam", "Peter", "Helen","Tom"};
    for (int i = 0; i < employee.length; i++) {
      if (i < 1) {
        employee[i] = new Manager(name[i], 7500);
      } else {
        employee[i] = new Developer(name[i], 5000 + i * 10 );
      }
    }
  }

  public static void main(String[] args) {

    Employee[] employee = new Employee[10];

    setEmployee(employee);
    getStarted(employee);
    System.out.println("\nPromotion ");
    promotion(employee);
    getStarted(employee);
  }
}

