package homework37.test02;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class TV {

  private int frequencyTv;
  private int canalTV;
  private int maxCanal;

  public TV(int frequencyTv, int canalTV, int maxCanal) {
    this.frequencyTv = frequencyTv;
    this.canalTV = canalTV;
    this.maxCanal = maxCanal;
  }

  public int getFrequencyTv() {
    return frequencyTv;
  }

  public void setCanalTV(int canalTV) {
    if (canalTV > 0) {
      this.canalTV = canalTV;
    }
  }

  public int getCanalTV() {
    return canalTV;
  }

  public void upTV() {
    if (canalTV > 9) {
      canalTV = 0;
    }
      canalTV++;
    }

  public void downTV() {
    if (canalTV < 2) {
      canalTV = 11;
    }
    canalTV--;
  }
  public void showTV() {
    System.out.println("Вы смотрите " + getCanalTV() + " канал ");
  }
}
