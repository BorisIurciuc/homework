package homework44;

import java.util.Scanner;

/**
 * 22/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите цену за 1 м: ");
    double price = scanner.nextDouble();      // цена 1 метра

    System.out.println("Какой формы участок: 1 - rectangle, 2 - circle  3- polygon: ");
    switch (scanner.nextInt()) {
      case 1:
        Rectangle rectangle = new Rectangle();
        System.out.println("Введите ширину участка в м: ");
        rectangle.setSideA(scanner.nextInt());
        System.out.println("Введите длину участка в м: ");
        rectangle.setSideB(scanner.nextInt());
        price *= rectangle.getPerimeter();
        System.out.println(rectangle + ", price rectangle: " + price + " Euro");
        break;
      case 2:
        Circle circle = new Circle();
        System.out.println("Введите радиус участка в м: ");
        circle.setRadius(scanner.nextInt());
        price *= circle.getPerimeter();
        System.out.println(circle + ", price circle: " + price + " Euro");
        break;
      case 3:
        Polygon polygon = new Polygon();
        System.out.println("Введите длину стороны м: ");
        polygon.setSideLength(scanner.nextInt());
        System.out.println("Введите количество сторон многоугольника : ");
        polygon.setAmountSide(scanner.nextInt());
        price *= polygon.getPerimeter();
        System.out.println(polygon + ", price polygon: " + price + " Euro");
    }
  }
}
