package homework37.test02;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class TV {

  private int frequency;
  private int canal;
  private int maxCanal;

  public TV(int frequency, int canal, int maxCanal) {
    this.frequency = frequency;
    this.canal = canal;
    this.maxCanal = maxCanal;
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
    if (canal > 9) {
      canal = 0;
    }
      canal++;
    }

  public void downTV() {
    if (canal < 2) {
      canal = 11;
    }
    canal--;
  }
  public void showTV() {
    System.out.println("Вы смотрите " + getCanal() + " канал ");
  }
}
