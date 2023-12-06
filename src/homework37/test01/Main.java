package homework37.test01;

import java.util.Scanner;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */

public class Main {

  public static boolean checkFrequency(int getFrequencyRemote, int getFrequencyTv) {
    return getFrequencyRemote == getFrequencyTv;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Televisor tv = new Televisor();
    RemoteTV remote = new RemoteTV(tv);

    // проверка частот на пульте и телевизоре
    if (!checkFrequency(remote.getFrequencyRemote(), tv.getFrequencyTv())) {
      return;
    }

    //включить телевизор
    remote.setCanalRemote(5);                         // начальный канал
    tv.setCurrentCanalTV(remote.getCanalRemote());    // получение телевизором начального канала
    System.out.println("Включился "  + remote.getCanalRemote() + " канал. Выберете действие:"
        + "\n1 - вверх\n2 - вниз\n3 - номер канала\n0 - выключить");

    //управление пультом
    int moveCanal = scanner.nextInt();
    if (moveCanal == 1) {
      remote.up();                                    // на пульте метод кнопка вверх
      tv.setCurrentCanalTV(remote.getCanalRemote());  // на телевизоре номер канала  на 1 больше
    }
    if (moveCanal == 2) {
      remote.down();                                  // метод кнопка вниз на пульте
      tv.setCurrentCanalTV(remote.getCanalRemote());  // на телевизоре номер канала на 1 меньше
    }
    if (moveCanal == 3) {
      System.out.println("Ведите номер канала ");
      remote.setCanalRemote(scanner.nextInt());       // на пульте выбора номера канала
      tv.setCurrentCanalTV(remote.getCanalRemote());  // на телевизоре номер канала с данным номером
    }
    System.out.println("Текущий " + tv.getCurrentCanalTV() + " канал");
  }
}
