package homework42.part02;

public class Mage extends Player{

private double mana;

  public Mage(String name, int health, int attackPower, double mana) {
    super(name, health, attackPower);
    this.mana = mana;
  }

  public double getMana() {
    return mana;
  }
  public void setMana(double mana) {
    this.mana = mana;
  }

  @Override
  public void setHealth(int health) {
    super.setHealth(health);
  }
  @Override
  public int getHealth() {
    return super.getHealth();
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }

  @Override
  public boolean equals(Object obj, double mana) {
    return mana == getMana() && super.equals(obj);
     }

  @Override
  public boolean equals(Object obj, int armor) {
    return false;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString() + " mana " + getMana();
  }
}
