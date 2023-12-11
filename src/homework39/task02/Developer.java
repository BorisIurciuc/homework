package homework39.task02;

public class Developer extends Employee {

  public Developer(String name, double salary) {
    super(name, salary);
  }

  public void work() {
    System.out.println(" Начинаю работать!");
  }

  @Override
  public String toString() {
    return this.getName() + " зарплата " + this.getSalary();
  }
}
