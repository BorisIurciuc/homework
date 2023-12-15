package homework39.task02;

public class Employee {

  private String name;
  private double salary;

  public Employee() {
  }

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPost() {
    return "Manager";
  }

  public double getSalary() {
    return salary;
  }

  public void work() {
    System.out.println("План на день");
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return this.getName() + " зарплата " + this.getSalary();
  }
}
