package homework42;

import java.util.Objects;

public abstract class Entity {

  protected String name;
  protected int health;
  protected int attackPower;

  public Entity(String name, int health, int attackPower) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getAttackPower() {
    return attackPower;
  }

  public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
  }

  public boolean isAlive() {
    return getHealth() > 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Entity entity;
    if (obj instanceof Entity) {
      entity = (Entity) obj;
    } else {
      return false;
    }
    return health == entity.getHealth() && attackPower == entity.getAttackPower() && Objects.equals(
        name, entity.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, health, attackPower);
  }

  @Override
  public String toString() {
    return name + ", health=" + health + ", attackPower=" + attackPower;
  }
}
