package homework39.task01;

/**
 * 11/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Mug mug = new Mug();

    Mug mug1 = new Mug("kaffee", "black", 150, 100);
    Mug mug2 = new Mug("kaffee", "white", 120, 100);
    Mug mug3 = new Mug("kaffee", "white", 120, 0);

    System.out.println(mug1);
    System.out.println(mug2);
    System.out.println(mug3);

    mug3.setVolumeFluid(80);
    System.out.println(mug3);

  }
}


