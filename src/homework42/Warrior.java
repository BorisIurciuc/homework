package homework42;

public class Warrior extends Player implements Attackable {

  private int armor;

  public Warrior(String name, int health, int attackPower, int armor) {
    super(name, health, attackPower);
    this.armor = armor;
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  public int getArmor() {
    return armor;
  }

  public void setArmor(int armor) {
    this.armor = armor;
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
  public boolean equals(Object obj, double mana) {
    return false;
  }

  @Override
  public boolean equals(Object obj, int armor) {
    return armor == getArmor() && super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString() + " armor " + armor;
  }

  @Override
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
  }

  int damage; // переменная урон, как результат силы атаки и уровня защиты

  @Override
  public void takeDamage(int attackPower) {
    damage = attackPower - armor / 2;
    health -= damage;
  }

  public int getDamage() {
    return damage;
  }
}
