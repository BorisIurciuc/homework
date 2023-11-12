package homework27.task02;

import java.util.Scanner;
/**
 * 11/11/2023 homework  * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

  BankAccount bankAccount1 = new BankAccount(10010001); // Объект счет в банке
  bankAccount1.print();

  Scanner scanner = new Scanner(System.in);
  System.out.println("\nВыберете операцию: положить на счет < 1 >  или снять с счета < 2 >");
  int typeOperation = scanner.nextInt();

  System.out.print("введите сумму для операции : ");
  int cash = scanner.nextInt();       // Сумма для перечисления

  if (typeOperation == 1) {
    bankAccount1.pushMoneyAmount(cash);   // Вызов метода перечислить на счет
  }
  if (typeOperation == 2) {
    bankAccount1.pullMoneyAmount(cash);   // Вызов метода снять со счёта
  }
  bankAccount1.print();
  }
}
