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
        Rectangle rectangle = new Rectangle(0, 0, 0);
        rectangle.setSideA(2);
        rectangle.setSideB(3);
        price *= rectangle.getPerimeter();
        System.out.println(rectangle + ", price rectangle: " + price + "Euro");
        break;
      case 2:
        Circle circle = new Circle(0, 0);
        circle.setRadius(2);
        price *= circle.getPerimeter();
        System.out.println(circle + ", price circle: " + price + "Euro");
        break;
      case 3:
        Polygon polygon = new Polygon(0, 0, 0);
        polygon.setSideLength(2);
        polygon.setAmountSide(6);
        price *= polygon.getPerimeter();
        System.out.println(polygon + ", price polygon: " + price + "Euro");
    }
  }
}
