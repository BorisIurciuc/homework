package homework39.task02;

public class Manager extends Employee {

  public Manager(String name, double salary) {
    super(name, salary);
  }
  @Override
  public void work() {
    System.out.println(getPost() + " Девочки работать!!!");
  }
}
