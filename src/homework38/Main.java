package homework38;

/**
 * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Customer customer = new Customer("John", 100);
    Product apple = new Product("apple", 10, 1.5);
    Product fish = new Product("fish", 20, 2.3);
    Product pix = new Product("pix", 30, 4);
    Seller seller = new Seller("Kate", 200, 3);

    seller.addProducts(apple);
    seller.addProducts(fish);
    seller.addProducts(pix);
    seller.printListProduct();                            // количество продуктов на складе
    seller.printMoneySeller();                            // количество денег в кассе

    customer.print();                                     // денег у покупателя
    customer.setProductName("pix", 12); // заказ покупателя
    customer.sayProductName();                            // вывод заказа

    seller.order(customer.getProductName(), customer.getQuantity()); //прием заказа от покупателя

    seller.getPrice();                                    // расчет стоимости покупки
    seller.findProducts();                                // линейный поиск продукты
    seller.saySeller();                                   // вывод итоговых значений по заказу

    customer.setPay(seller);                               // прием покупателем суммы к оплате
    customer.printMoneyCustomer(seller);                   // обновление счета покупателя
    seller.receiveMoneySeller(customer);                   // получение денег продавцом
    seller.printMoneySeller();                             // текущий счет в кассе магазина
    seller.currentProductQuantity(customer.getQuantity()); // остаток количества продуктов
  }
}
