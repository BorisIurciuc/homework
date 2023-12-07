package homework37.test02;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Remote {

  private int frequencyRemote;
  int canal;
  TV tv;

  public Remote(int frequencyRemote, TV tv) {
    this.frequencyRemote = frequencyRemote;
    this.tv = tv;
  }

  public int getFrequencyRemote() {
    return frequencyRemote;
  }

  public boolean check() {
    return getFrequencyRemote() == tv.getFrequencyTv();
  }

  public void nrCanal(int canal) {
    if (!check()) {
      return;
    } else {
      tv.setCanalTV(canal);
    }
  }
}
