package homework39.task02;

public class Manager extends Employee {

  public Manager(String name, double salary) {
    super(name, salary);
  }

  public void work() {
    System.out.println(getPost() + " Девочки работать!!!");
  }

  @Override
  public String toString() {
    return this.getName() + " зарплата " + this.getSalary();
  }
}
