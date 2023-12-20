package homework42;

public interface Attackable {

  void attack(Attackable target, int attackPower);

  void takeDamage(int attackPower);
}

