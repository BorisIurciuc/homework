package homework42;

import java.util.Random;

public class Archer extends Player implements Attackable {
  Random random = new Random();

  public Archer(String name, int health, int attackPower) {
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

  @Override
  public boolean equals(Object obj, double mana) {
    return false;
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
    return super.toString();
  }

  @Override
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
  }

  int damage; // переменная урон, как результат силы атаки и уровня защиты

  public void takeDamage(int attackPower) {
    damage = (random.nextInt(100) < 25) ? 0 : attackPower;
    health -= damage;
  }
}
