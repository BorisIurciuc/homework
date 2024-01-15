package homework42;

public class Mage extends Player implements Attackable {

  private double mana;

  public Mage(String name, int health, int attackPower, double mana) {
    super(name, health, attackPower);
    this.mana = mana;
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  public double getMana() {
    return mana;
  }

  @Override
  public void setAttackPower(int attackPower) {
    super.setAttackPower(attackPower);
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

  @Override
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
    mana--;
  }

  int damage; // переменная урон, как результат силы атаки и уровня защиты

  @Override
  public void takeDamage(int attackPower) {
    damage = attackPower;
    health -= attackPower;
    mana += 0.2;
  }

  public int getDamage() {
    return damage;
  }
}
