package homework37.test01;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */

public class Main {

  public static void main(String[] args) {

    TV tv = new TV(116, 2);
    Remote remote = new Remote(116, tv);

    tv.showTV();
    remote.tv.upTV();
    tv.showTV();
    remote.tv.downTV();
    tv.showTV();
    remote.nrCanal(5);
    tv.showTV();
    remote.nrCanal(-5);
    tv.showTV();
  }
}
