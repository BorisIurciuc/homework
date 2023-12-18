package homework42.part03;

public interface Attackable {

  void attack(Attackable target, int attackPower);

  void takeDamage(int attackPower);
}

