package homework38;

public class Customer extends Person {

  private double money;
  private String productName;
  private int quantity;
  private double pay;

  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }

  public double getPay() {
    return pay;
  }

  public void setPay(Seller seller) {                   // прием покупателем суммы к оплате
    this.pay = seller.getPrice();
  }

  @Override
  public String getName() {
    return super.getName();
  }

  public double getMoney() {
    return money;
  }

  public void print() {
    System.out.println("Покупатель " + getName() + " имеет " + getMoney() + " Евро");
  }

  public void setProductName(String productName, int quantity) {
    this.productName = productName;
    this.quantity = quantity;
  }

  public String getProductName() {
    return productName;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void sayProductName() {
    System.out.println("\nПокупатель: я хочу " + getProductName() + " в количестве "
        + getQuantity() + " штук");
  }

  public void printMoneyCustomer(Seller seller) {       // обновление счета покупателя
    if (seller.getPrice() <= getMoney()) {
      this.money = getMoney() - getPay();
      System.out.println(
          "Покупатель заплатил " + seller.getPrice() + " на на его счету осталось " + money);
    } else {
      System.out.println("Извините нет денег");
    }
  }
}
