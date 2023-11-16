package homework28.lesson_28;
/**
 * 15/11/2023 homework * * @author Boris Iurciuc (cohort36)
 */
public class Main {

    public static void main(String[] args) {
      double[] arr = {4, 2, 7, 1, -5, 6};

    MyArray myArray = new MyArray(arr);
//
//      System.out.println(myArray.contains(myArray.indexOf(7)));
//
//      System.out.println(myArray.isEmpty());
//
//      myArray.set(myArray.indexOf(1), 10);
//
//      myArray.add(myArray.indexOf(7), 123);
//
//      myArray.remove(myArray.indexOf(7));
//
//      myArray.addLast(222);

      myArray.removeLast();
      System.out.println(myArray);

      myArray.removeVal(7);

      myArray.replace(2, -111);


    }
}
