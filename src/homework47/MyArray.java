package homework47;

public class MyArray<T1, T2> {

  private Pair<T1, T2>[] array; // Use Pair<T1, T2>[] instead of Object[]

  public MyArray() {
    this.array = new Pair[0];
  }

  public MyArray(T1 first, T2 second) {
    this.array = new Pair[]{new Pair<>(first, second)};
  }

  private void copy(Pair<T1, T2>[] src, Pair<T1, T2>[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }
  public void add(int index, T1 first, T2 second) {
    if (index < 0 || index > array.length) {
      return;
    }
    Pair<T1, T2>[] newArray = new Pair[array.length + 1];
    copy(array, newArray);

    for (int i = newArray.length - 1; i > index; i--) {
      newArray[i] = newArray[i - 1];
    }
    newArray[index] = new Pair<>(first, second);
    array = newArray;
  }

  public void indexOf(String product) {
    int index = -1;
    for (int i = 0; i < array.length; i++) {
      if (product.equals(array[i].getFirst())) { // Compare with the first element of Pair
        index = i;
        break;
      }
    }
    if (index != -1) {
      System.out.println("стоимость " + array[index].getFirst()
          + " составляет " + array[index].getSecond() + " Евро");
    } else {
      System.out.println("Товара " + product + " нет в магазине");
    }
  }
}
