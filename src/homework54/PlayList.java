package homework54;

import static java.util.Collections.shuffle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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

  public void addSongByIndex(int index, Song song) {
    System.out.print("After add by index ");
    songList.add(index, song);
  }

  public int getSize() {
    return songList.size();
  }

  public Song getSongIndex(int index) {
    return songList.get(index);
  }

  public void removeByIndex(int index) {
    songList.remove(index);
  }

  public void removeByTitle(String title) {
    System.out.print("After remove ByTitle ");
    for (int i = 0; i < songList.size(); i++) {
      songList.removeIf(song -> song.getTitle().equals(title));
    }
  }

  public Deque<Song> getListeningQueue() {
    return new ArrayDeque<>(songList);
  }

  public Deque<Song> getShuffledListeningQueue() {
    List<Song> shuffledList = new LinkedList<>(songList);
    shuffle(shuffledList);
    return new ArrayDeque<>(shuffledList);
  }

  public Deque<Song> getReverseListeningQueue() {
    List<Song> reversedList = new ArrayList<>(songList.size());
    ListIterator<Song> iteratorS = songList.listIterator(songList.size());
    while (iteratorS.hasPrevious()) {
      reversedList.add(iteratorS.previous());
    }
    return new ArrayDeque<>(reversedList);
  }
}
