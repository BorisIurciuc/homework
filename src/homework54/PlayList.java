package homework54;

import static java.util.Collections.shuffle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PlayList {

  private final List<Song> songList;

  public PlayList() {
    songList = new ArrayList<>();
  }

  public void add(Song song) {
    songList.add(song);
  }

  public void addSongByIndex(int index, Song song){
    System.out.print("After add by index ");
    songList.add(index,song);
  }

  public Song getSongIndex(int index) {

    return songList.get(index);
  }

  public void removeByIndex(int index) {
    System.out.print("After removeByIndex ");
    songList.remove(index);
  }

  public void removeByTitle(String title) {
    System.out.print("After remove ByTitle ");
    for (int i = 0; i < songList.size(); i++ ) {
      songList.removeIf(song -> song.getTitle().equals(title));;
    }
  }

  public void getListeningQueue() {
    System.out.println("\ngetListeningQueue");
    Iterator<Song> iteratorS = songList.iterator();
    while (iteratorS.hasNext()) {
      System.out.println(iteratorS.next());
    }
  }

  public void getShuffledListeningQueue() {
    System.out.println("\ngetShuffledListeningQueue");
    List<Song> shuffledList = new LinkedList<>(songList);
    shuffle(shuffledList);
    for (Song song : shuffledList) {
      System.out.println(song);
    }
  }

  public void getReverseListeningQueue() {
    System.out.println("\ngetReverseListeningQueue");
    ListIterator<Song> iteratorS = songList.listIterator(songList.size());
    while (iteratorS.hasPrevious()) {
      System.out.println(iteratorS.previous());
    }
  }

  public void listenThePlaylist(){
    Iterator<Song> iteratorS = songList.iterator();
    System.out.println("послушать плейлист ");
    while (iteratorS.hasNext()) {
      System.out.println("Играет песня:" + iteratorS.next());
    }
  }
}
