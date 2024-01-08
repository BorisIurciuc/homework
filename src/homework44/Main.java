package homework44;

import java.util.Scanner;

/**
 * 22/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите цену за 1 м: ");
    double price1m = scanner.nextDouble();      // цена 1 метра
    double priceFence = 0;
    System.out.print("Какой формы участок: 1 - rectangle, 2 - circle  3- polygon: ");
    switch (scanner.nextInt()) {
      case 1:
        Rectangle rectangle = new Rectangle();
        System.out.print("Введите ширину участка в м: ");
        rectangle.setSideA(scanner.nextDouble());
        System.out.print("Введите длину участка в м: ");
        rectangle.setSideB(scanner.nextDouble());
        priceFence = price1m * rectangle.getPerimeter();
        System.out.printf(rectangle + " perimeter: %.2f m, priceFence : %.2f Euro%n",
            rectangle.getPerimeter(), priceFence);
        rectangle.resize(2);
        priceFence = price1m * rectangle.getPerimeter();
        System.out.printf(rectangle + " perimeter: %.2f m, priceFence : %.2f Euro%n",
            rectangle.getPerimeter(), priceFence);
        break;
      case 2:
        Circle circle = new Circle();
        System.out.print("Введите радиус участка в м: ");
        circle.setRadius(scanner.nextInt());
        priceFence = price1m * circle.getPerimeter();
        System.out.printf(circle + ", perimeter: %.2f m, priceFence : %.2f Euro%n",
            circle.getPerimeter(), priceFence);
        circle.resize(2);
        priceFence = price1m * circle.getPerimeter();
        System.out.printf(circle + ", perimeter: %.2f m, priceFence : %.2f Euro%n",
            circle.getPerimeter(), priceFence);
        break;
      case 3:
        Polygon polygon = new Polygon();
        System.out.print("Введите длину стороны м: ");
        polygon.setSideLength(scanner.nextInt());
        System.out.print("Введите количество сторон многоугольника : ");
        polygon.setAmountSide(scanner.nextInt());
        priceFence = price1m * polygon.getPerimeter();
        System.out.println(polygon + ", priceFence: " + priceFence + " Euro");
        polygon.resize(2);
        priceFence = price1m * polygon.getPerimeter();
        System.out.println(polygon + ", priceFence: " + priceFence + " Euro");
    }
    scanner.close();
  }
}
