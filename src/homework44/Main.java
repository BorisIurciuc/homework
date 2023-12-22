package homework44;

import java.util.Scanner;

/**
 * 22/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double price = 2;      // цена 1 метра

    System.out.println("Какой формы участок: 1 - rectangle, 2 - circle  3- polygon: ");
    switch (scanner.nextInt()) {
      case 1:
        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        price *= rectangle.getPerimeter();
        System.out.println(rectangle + ", price rectangle: " + price + "Euro");
        break;
      case 2:
        Circle circle = new Circle();
        circle.setRadius(2);
        price *= circle.getPerimeter();
        System.out.println(circle + ", price circle: " + price + "Euro");
        break;
      case 3:
        Polygon polygon = new Polygon();
        polygon.setSideLength(1);
        polygon.setAmountSide(4);
        price *= polygon.getPerimeter();
        System.out.println(polygon + ", price polygon: " + price + "Euro");
    }
  }
}
