package homework37.test02;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class RemoteTV {

  private int frequencyRemote = 432;  // рабочая частота связи пульта и телевизора
  private int nrCanalRemote;          // номер канала на пульте
  Televisor televisor;                // вызов класса Телевизор

  public RemoteTV(Televisor televisor) {
    this.televisor = televisor;
  }

  public int getFrequencyRemote() {
    return frequencyRemote;
  }

  public void setCanalRemote(int nrCanalRemote) {
    this.nrCanalRemote = nrCanalRemote;
  }

  public int getCanalRemote() {
    return nrCanalRemote;
  }

  public void up() {        // кнопка вверх
    nrCanalRemote++;
  }

  public void down() {      // кнопка вниз
    nrCanalRemote--;
  }

  public void setCanalRemote2(int nrCanalRemote) {
    this.nrCanalRemote = nrCanalRemote;
  }
}
