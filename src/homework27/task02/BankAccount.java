package homework27.task02;

/**
 * 11/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class BankAccount {

  private final long accountNumber;     // Номер счета
  private int moneyAmount = 10;         // Текущая сумма на счете

  BankAccount(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public long getAccountNumber() {              // получить номер счета
    return accountNumber;
  }

  public int getMoneyAmount() {                 // получить текущую сумму на счете
    return moneyAmount;
  }

  //Операции снять и положить на счет
  public void pushMoneyAmount(int cash) {                         // Перечислить на счет
    this.moneyAmount = getMoneyAmount() + cash;
  }

  public void pullMoneyAmount(int cash) {                         // Снять со счёта
    if (0 < getMoneyAmount() - cash) {
      this.moneyAmount = getMoneyAmount() - cash;
    } else {
      System.out.println("Недостаточно денежных средств");
    }
  }

  // Вывод данных на консоль
  public void print() {
    System.out.println(
        "Account number  : " + getAccountNumber() + "\nAmount of money : " + getMoneyAmount());
  }
}
