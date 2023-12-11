package homework37.test01;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Remote {

  private int frequency;
  TV tv;

  public Remote(int frequency, TV tv) {
    this.frequency = frequency;
    this.tv = tv;
  }

  public int getFrequencyRemote() {
    return frequency;
  }

  public boolean check() {
    return getFrequencyRemote() == tv.getFrequencyTv();
  }

  public void canal(int canal) {
    if (!check()) {
      return;
    } else {
      tv.setCanal(canal);
    }
  }
  public void up(){
    tv.upTV();
  }
  public void down(){
    tv.downTV();
  }
}
