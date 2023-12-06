package homework37.test02;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Televisor {

  private final int frequencyTv = 432;  // рабочая частота связи телевизора и пультом
  private int currentCanalTV;           // текущий канал на телевизоре
  private int maxCanalTv = 10;          // максимальное количество каналов на телевизоре

  public Televisor() {
  }

  public int getFrequencyTv() {    return frequencyTv;  }

  public void setCurrentCanalTV(int currentCanalTV) {
     this.currentCanalTV = currentCanalTV;
  }

  public int getCurrentCanalTV() {
    return currentCanalTV;
  }
   public int getMaxCanalTv() {
    return maxCanalTv;
  }
}
