package homework42.part03;

/**
 * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Mage mage = new Mage("Gandalf", 20, 10, 0.8);
    Warrior warrior = new Warrior("Aragon", 5, 2, 6);
    Archer archer = new Archer("Legolas", 5, 2);
    Monster monster = new Monster("Sauron", 50, 5);

    // лучник атакует монстра
    archer.attack(monster, archer.getAttackPower());
    System.out.println("Лучник " + archer.getName() + " атакует монстра");
    System.out.println("Монстр " + monster.getName() + " получил " + monster.getDamage()
        + " урона " + "теперь его здоровье " + monster.getHealth());

    // монстр атакует лучника
    monster.attack(archer, monster.getAttackPower());  // монстр атакует лучника
    if (archer.getDamage() == 0) {
      System.out.println("Лучник " + archer.getName() + " уклонился от атаки");
    } else {
      System.out.println("Лучник " + archer.getName() + " получил " + archer.getDamage()
          + " урона " + "теперь его здоровье " + archer.getHealth());
    }

    // маг атакует монстра
    if (mage.getMana() < 1) {
      System.out.println("Маг " + mage.getName() + " не может атаковать у него закончилась мана "
          + mage.getMana());
    } else {
      mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
      System.out.println("Маг " + mage.getName() + " атакует монстра " + monster.getName()
          + " с силой " + mage.printAttackPower());
    }

    // монстр атакует мага
    monster.attack(mage, monster.getAttackPower());
    System.out.println("Монстр " + monster.getName() + " атакует мага " + mage.getName()
        + " с силой " + monster.printAttackPower());
    System.out.println("Маг " + mage.getName() + " получил " + mage.getDamage()
        + " урона " + "теперь его здоровье " + mage.getHealth() + " и мана "
        + mage.getMana());

    // маг атакует монстра
    if (mage.getMana() < 1) {
      System.out.println("Маг " + mage.getName() + " не может атаковать у него закончилась мана "
          + mage.getMana());
    } else {
      mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
      System.out.println("Маг " + mage.getName() + " атакует монстра " + monster.getName()
          + " с силой " + mage.printAttackPower());
    }
  }
}
