package homework54;

/**
 * 27/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void main(String[] args) {

    PlayList playList = new PlayList();
    playList.add(new Song("Meddle", "Pink Floyd", 2700));
    playList.add(new Song("Pioneer", "Аукцыон ", 2856));
    playList.add(new Song("Tago Mago", "Can", 4380));
    playList.add(new Song("Ven a mi", "Ours samplus", 207));

    playList.getListeningQueue();   //очередь из песен плейлиста порядке, в котором они добавлены.
    playList.getReverseListeningQueue();   //очередь песен в обратном порядке
    playList.getShuffledListeningQueue(); //очередь из всех песен в случайном порядке
    playList.listenThePlaylist(); // послушать плейлист

    System.out.println("\nGet by number - " + playList.getSongIndex(0));
    playList.removeByIndex(0);
    playList.removeByTitle("Pioneer");
    playList.listenThePlaylist();// послушать плейлист
    playList.addSongByIndex(0, new Song("Weekly podcast 8", "MiMo", 5106));
    playList.listenThePlaylist();
  }
}
