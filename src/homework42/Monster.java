package homework42;

public class Monster extends Entity implements Attackable {

  public Monster(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

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
  public void setHealth(int health) {
    super.setHealth(health);
  }

  @Override
  public int getAttackPower() {
    return super.getAttackPower();
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
  @Override
  public void takeDamage(int attackPower) {
    damage = attackPower;
    health -= damage;
  }

  public int getDamage() {
    return damage;
  }
}
