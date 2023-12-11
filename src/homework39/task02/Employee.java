package homework39.task02;

public class Employee {

  private String name;
  private double salary;
  private final String post;


  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    post = "Manager";
  }

  public Employee(String name, double salary, String post) {
    this.name = name;
    this.salary = salary;
    this.post = post;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPost() {
    return post;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

}
