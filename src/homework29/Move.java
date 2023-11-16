package homework29;

/**
 * 15/11/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Traffic {
  private boolean permis;
  public Traffic() {
  }
//  public Traffic(boolean permis) {
//    this.permis = permis;
//  }

//public boolean getPermis() {
//    return permis;
//  }
  public void move(TrafficLight trafficLight) {

    switch (trafficLight) {
      case GREEN:
        permis = true;
        break;
      case ROT:
        permis = false;
        break;
    }
  }

  public void print() {
    System.out.println("Permission " + permis);
  }
}
