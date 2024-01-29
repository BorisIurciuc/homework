package homework54;

import static java.util.Collections.shuffle;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class PlayList {

  private final Deque<Song> songsQueue;

  public PlayList() {
    songsQueue = new ArrayDeque<>();
  }

  public void enqueue(Song song) {
    songsQueue.offer(song);
  }

  public Song peekSong() {
    return songsQueue.peek();
  }

  public Song poolSong() {
    return songsQueue.poll();
  }

  public void getListeningQueue() {
    Iterator<Song> iteratorS = songsQueue.iterator();
    while (iteratorS.hasNext()) {
      System.out.println(iteratorS.next());
    }
  }

  public void getReverseListeningQueue() {
    Iterator<Song> iteratorS = songsQueue.descendingIterator();
    while (iteratorS.hasNext()) {
      System.out.println(iteratorS.next());
    }
  }

  public void getShuffledListeningQueue() {
    shuffle(new LinkedList<>(songsQueue));
      for (Song song : songsQueue) {
      System.out.println(song);
    }
  }

  public void listenThePlaylist(){
    Iterator<Song> iteratorS = songsQueue.iterator();
    System.out.println("послушать плейлист ");
    while (iteratorS.hasNext()) {
      System.out.println("Играет песня:" + iteratorS.next());
    }
  }
}
