package homework42;

public abstract class Player extends Entity implements Attackable {

  public Player(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public int getHealth() {
    return super.getHealth();
  }

  @Override
  public void setHealth(int health) {
    super.setHealth(health);
  }

  @Override
  public void setAttackPower(int attackPower) {
    super.setAttackPower(attackPower);
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  public abstract boolean equals(Object obj, double mana);

  public abstract boolean equals(Object obj, int armor);

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
