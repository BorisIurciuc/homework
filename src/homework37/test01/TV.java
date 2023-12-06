package homework37.test01;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class TV {

  private int frequencyTv;
  private int canalTV;

  public TV(int frequencyTv, int canalTV) {
    this.frequencyTv = frequencyTv;
    this.canalTV = canalTV;
  }

  public void setCanalTV(int canalTV) {
    if (canalTV > 0) {
      this.canalTV = canalTV;
    }
  }

  public void upTV() {
    canalTV++;
  }

  public void downTV() {
    canalTV--;
  }

  public int getCanalTV() {
    return canalTV;
  }

  public void printTV() {
    System.out.println("CanalTV " + getCanalTV());
  }
}
