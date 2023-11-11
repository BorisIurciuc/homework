package homework27.task02;

/**
 * 11/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class BankAccount {

  private final long accountNumber;     // Номер счета
  private int moneyAmount = 10;         // Текущая сумма на счете
  private int cashFlows;                // Сумма для перечисления

  BankAccount(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public long getAccountNumber() {              // получить номер счета
    return accountNumber;
  }

  public int getMoneyAmount() {                 // получить текущую сумму на счете
    return moneyAmount;
  }

  // Сумма для перечисления
  public int getCashFlows() {                   // получить сумму перечисления
    return cashFlows;
  }

  public void setCashFlows(int cashFlows) {     // установить сумму перечисления
    this.cashFlows = cashFlows;
  }

  //Операции снять и положить на счет
  public void pushMoneyAmount() {                         // Перечислить на счет
    this.moneyAmount = getMoneyAmount() + getCashFlows();
  }

  public void pullMoneyAmount() {                         // Снять со счёта
    if (0 < getMoneyAmount() - getCashFlows()) {
      this.moneyAmount = getMoneyAmount() - getCashFlows();
    } else {
      System.out.println("Недостаточно денежных средств");
      return;
    }
  }

  // Вывод данных на консоль
  public void print() {
    System.out.println("Account number  : " + getAccountNumber() +
        "\nAmount of money : " + getMoneyAmount());
  }
}
