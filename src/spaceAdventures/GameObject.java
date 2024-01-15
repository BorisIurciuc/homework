package spaceAdventures;
import java.util.Objects;

/**
 * 30/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public abstract class GameObject {
  protected int remainingStrength;
  public GameObject(int remainingStrength) {
    this.remainingStrength = remainingStrength;
  }
  public int getRemainingStrength() {
    return remainingStrength;
  }
  public void setRemainingStrength(int remainingStrength) {
    this.remainingStrength = remainingStrength;
  }
  void destroy(){}
  void hurt(int amount) {}
  public boolean isAlive() {
    return remainingStrength > 0;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof GameObject that)) {
      return false;
    }
    return getRemainingStrength() == that.getRemainingStrength();
  }
  @Override
  public int hashCode() {
    return Objects.hash(getRemainingStrength());
  }
  @Override
  public String toString() {
    return "remainingStrength= " + remainingStrength + " ";
  }
}
