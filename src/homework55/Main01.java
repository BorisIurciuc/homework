package homework55;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 31/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main01 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> businessDay = new HashMap<>();
    String plan;
    int time;
    int amountTime = 0;
    while (true) {
      System.out.print("Enter plan - ");
      plan = scanner.nextLine();
      if (plan.equals("end")) {
        break;
      }
      System.out.print("Enter time - ");
      time = scanner.nextInt();
      scanner.nextLine();
      businessDay.put(plan, time);
      amountTime += businessDay.get(plan);
    }

    System.out.println("Amount plans " + businessDay.size() + " amount time " + amountTime);
    for (var entry : businessDay.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue() + " min");
    }
    scanner.close();
  }
}
