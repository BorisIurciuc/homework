package homework39.task02;

public class Developer extends Employee {

  public Developer(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void work() {
    System.out.println(" Начинаю работать!");
  }
}
