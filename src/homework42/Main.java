package homework42;

//  16/12/2023 myCode * @author Boris Iurciuc (cohort36)

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void game(AttackManager manager, Player player, Monster monster) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Состояние игроков перед боем");
    System.out.print(player);
    System.out.println(" " + monster);

    boolean game = false;
    int step = 1;
    do {
      System.out.println("\n" + "Бой " + step);
      //Игрок атакует монстра
      assert player != null;
      manager.sendAttackManager(monster, player.getAttackPower());
      System.out.println("   Игрок " + player.getName() + " атакует монстра " + monster.getName());
      System.out.print(player);
      System.out.println(" -> " + monster);
      //Монстр атакует игрока
      monster.attack(player, monster.getAttackPower());
      System.out.println("   Монстр " + monster.getName() + " атакует игрока " + player.getName());
      System.out.print(player);
      System.out.println(" <- " + monster);
      //условие продолжения игры
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
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Player player = null;
    AttackManager manager = new AttackManager();
    Monster monster = new Monster("Dragon", random.nextInt(1, 20),
        random.nextInt(1, 20));

    System.out.print("Задать имя игрока: ");
    String playerName = scanner.nextLine();
    System.out.print("Выбрать боевой класс : 1 - маг, 2 - воин, 3 - лучник : ");
    switch (scanner.nextInt()) {
      case 1 -> player = new Mage(playerName, 30, 4, 2);
      case 2 -> player = new Warrior(playerName, 25, 3, 2);
      case 3 -> player = new Archer(playerName, 20, 2);
    }
    game(manager, player, monster);
    scanner.close();
  }
}
