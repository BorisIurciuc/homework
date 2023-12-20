package homework42;

import java.util.Random;
import java.util.Scanner;

/**
 * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    Player player = new Player() {
      @Override
      public boolean equals(Object obj, double mana) {
        return false;
      }

      @Override
      public boolean equals(Object obj, int armor) {
        return false;
      }
    };

    AttackManager manager = new AttackManager();
    Attackable attackable = new Monster("", 0, 0);

    System.out.print("Выбрать боевой класс : 1 - маг, 2 - воин, 3 - лучник : ");
    int tip = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Задать имя игрока: ");
    player.setName(scanner.nextLine());

    switch (tip) {
      case 1:
        attackable = new Mage(player.getName(), 30, 4, 2);
        player.setHealth(30);
        player.setAttackPower(4);
        break;
      case 2:
        attackable = new Warrior(player.getName(), 25, 3, 2);
        player.setHealth(25);
        player.setAttackPower(3);
        break;
      case 3:
        attackable = new Archer(player.getName(), 20, 2);
        player.setHealth(20);
        player.setAttackPower(2);
    }

    Monster monster = new Monster("Dragon", random.nextInt(1, 20),
        random.nextInt(1, 20));

    System.out.println("Состояние игроков перед боем");
    System.out.println(attackable);
    System.out.println(monster + "\n");

    boolean game = false;
    int step = 1;
    do {
      System.out.println("\n" + "Бой " + step);
      //Игрок атакует монстра
      manager.sendAttackManager(monster, player.getAttackPower());
      System.out.println("   Игрок " + player.getName() + " атакует монстра " + monster.getName());
      System.out.println(attackable);
      System.out.println(monster);

      //Монстр атакует игрока
      monster.attack(attackable, monster.getAttackPower());
      System.out.println("   Монстр " + monster.getName() + " атакует игрока " + player.getName());
      System.out.println(attackable);
      System.out.println(monster);

      System.out.println("продолжить ? ");
      step = scanner.nextInt();
      if (step == 0) {
        System.out.println("Игра закончена - ничья");
        game = true;
      }
      if (monster.getHealth() <= 0) {
        System.out.println("Монстр проиграл");
        game = true;
      }
      if (player.getHealth() <= 0) {
        System.out.println("Игрок проиграл");
        game = true;
      }
    } while (!game);

    scanner.close();
  }
}
