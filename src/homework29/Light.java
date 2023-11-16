package homework29;
public enum TrafficLight {
  //для пешеходов всего два возможных варианта состояния светофора
  GREEN("green"),
  ROT("rot");

  private final String light;

  TrafficLight(String light){
    this.light = light;
  }

  //public String getLight() {
//    return light;
//  }
}
