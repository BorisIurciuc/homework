package homework54;

import java.util.Scanner;

/**
 * 27/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  static PlayList playList = new PlayList();

  public static void listenThePlaylist() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number 1 - 8 : ");
    switch (scanner.nextInt()) {
      case 1: // очередь из всех песен плейлиста в том порядке, в котором они добавлены.
        System.out.print("\ngetListeningQueue  -  " + playList.getListeningQueue());
        break;
      case 2: // очередь песен в обратном порядке
        System.out.print("\ngetReverseListening - " + playList.getReverseListeningQueue());
        break;
      case 3: // очередь из всех песен в случайном порядке
        System.out.print("\ngetShuffledListening -" + playList.getShuffledListeningQueue());
        break;
      case 4: // получить песню по индексу
        System.out.print("\nTo Get by number enter (0 - " + (playList.getSize() - 1) + ")");
        int i = scanner.nextInt();
        playList.getSongIndex(i);
        break;
      case 5: // удалить песню по индексу
        System.out.print("To remove by number enter (0 - " + (playList.getSize() - 1) + ")");
        int j = scanner.nextInt();
        System.out.println("Will be delete - " + playList.getSongIndex(j));
        playList.removeByIndex(j);
        System.out.print("\nNew size of list - " + playList.getSize());
        break;
      case 6: // добавить песню
        playList.addSongByIndex(0, new Song("Weekly cast8", "MiMo", 5106));
        break;
      case 7: // Удалить песню по её названию
        playList.removeByTitle("Pioneer");
      case 8:
      default:
        System.out.print("Quit");
    }
  }

  public static void main(String[] args) {

    playList.add(new Song("Meddle", "Pink Floyd", 2700));
    playList.add(new Song("Pioneer", "Аукцыон ", 2856));
    playList.add(new Song("Tago Mago", "Can", 4380));
    playList.add(new Song("Ven a mi", "Ours samplus", 207));

    listenThePlaylist();
  }
}
