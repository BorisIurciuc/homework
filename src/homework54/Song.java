package homework54;

public class Song {
  String title;
  String name;
  int duration;
  Song next;

  public Song(String title, String name, int duration) {
    this.title = title;
    this.name = name;
    this.duration = duration;
    this.next = null;
  }

  public String changeSecToMin(){
    return duration / 60 + " min, " + (duration - (duration / 60) * 60) + " sec";
  }

  @Override
  public String toString() {
    return "name <" + name + ">  title <" + title + ">, (" + changeSecToMin() +
         ')';
  }
}
