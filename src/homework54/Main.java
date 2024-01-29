package homework54;

/**
 * 27/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void main(String[] args) {

    PlayList playList = new PlayList();
    playList.enqueue(new Song("Meddle", "Pink Floyd", 2700));
    playList.enqueue(new Song("Pioneer", "Аукцыон ", 2856));
    playList.enqueue(new Song("Tago Mago", "Can", 4380));
    playList.enqueue(new Song("Ven a mi", "Ours samplus", 207));

    playList.listenThePlaylist(); // послушать плейлист
    System.out.println();
    playList.getListeningQueue();   //очередь из песен плейлиста порядке, в котором они добавлены.
    System.out.println();
    playList.getReverseListeningQueue();   //очередь песен в обратном порядке
    System.out.println();
    playList.getShuffledListeningQueue(); //очередь из всех песен в случайном порядке

    System.out.println("\nPool " + playList.poolSong());
    System.out.println("\nPeek " + playList.peekSong());
  }
}
