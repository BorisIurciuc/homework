package homework42.part03;

import java.util.Random;

public class Archer extends Player implements Attackable {

  public Archer(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  Random random = new Random();

  @Override
  public String getName() {
    return super.getName();
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
  public int getAttackPower() {
    return attackPower = (random.nextInt(100) < 20) ? attackPower * 2 : attackPower;
  }

  @Override
  public void setAttackPower(int attackPower) {
    super.setAttackPower(attackPower);
  }

  public int printAttackPower() {
    return attackPower;
  } //вывод на консоль силы атаки

  @Override
  public boolean isAlive() {
    return super.isAlive();
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

  public int getDamage() {
    return damage;
  }
}
