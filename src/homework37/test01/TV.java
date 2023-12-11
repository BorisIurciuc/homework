package homework37.test01;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class TV {

  private int frequency;
  private int canal;

  public TV(int frequencyTv, int canal) {
    this.frequency = frequencyTv;
    this.canal = canal;
  }

  public int getFrequencyTv() {
    return frequency;
  }

  public void setCanal(int canal) {
    if (canal > 0) {
      this.canal = canal;
    }
  }

  public int getCanal() {
    return canal;
  }

  public void upTV() {
    canal++;
  }

  public void downTV() {
    canal--;
  }

  public void showTV() {
    System.out.println("Canal " + getCanal());
  }
}
