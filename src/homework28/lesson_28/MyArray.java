package homework28.lesson_28;

/**
 * 15/11/2023 homework
 *
 * @author Boris Iurciuc (cohort36)
 */
public class MyArray {

  private double[] array;
  public MyArray() {
    array = new double[0];
  }
  public MyArray(double[] array) {
    this.array = new double[array.length];
    copy(array, this.array);
  }

  // Метод копирования элементов из одного массива в другой
  private void copy(double[] src, double[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }
  // метод для получения значения элемента по индексу
  public double get(int index) {
    return array[index];
  }
  // метод для изменения значения элемента по индексу
  public void set(int index, double value) {
    array[index] = value;
  }

  // метод который возвращает размер массива
  public int size() {
    return array.length;
  }

  // метод поиска индекса элемента по значению
  public int indexOf(double val) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        return i;
      }
    }
    return -1;
  }
  //добавляет элемент
  public void add(int index, double val) {
    if (index < 0 || index > array.length) {
      return;
    }
    double[] newArray = new double[array.length + 1];
    copy(array, newArray);
    for (int i = newArray.length - 1; i > index; i--) {
      newArray[i] = newArray[i - 1];

    }
    newArray[index] = val;
    array = newArray;
  }
  //удаляет элемент
  public void remove(int index) {
    if (index < 0 || index >= array.length) {
      return;
    }
    double[] newArray = new double[array.length - 1];
    for (int i = 0; i < newArray.length; i++) {
      if (i < index) {
        newArray[i] = array[i];
      } else {
        newArray[i] = array[i + 1];
      }
    }
    array = newArray;
  }
  // переводит объект в строку чтобы можно было легко вывести в sout
  public String toString() {
    String res = "[ ";
    for (int i = 0; i < array.length; i++) {
      res += array[i];
      if (i != array.length - 1) {
        res += ", ";
      }
    }
    res += " ]";
    return res;
  }

  //возвращает true если значение val есть в этом массиве

  public boolean contains(double val) {
     if (array[indexOf(val)] == val) {
        return true;
      }
    return false;
  }

  //возвращает true если массив пустой
  public boolean isEmpty() {
    if (array.length == 0) {
      return true;
    }
    return false;
  }

  //добавляет элемент со значением val в конец
  public void addLast(double val) {
    double[] newArray = new double[array.length + 1];
    add(array.length, val);
  }

  //удаляет последний элемент
  public void removeLast() {
    double[] newArray = new double[array.length - 1];
    remove(newArray.length);
  }

  //удаляет первое значение из массива, равное переданному
  public void removeVal(double val) {
    double[] newArray = new double[array.length - 1];
    remove(indexOf(val));
  }

  //заменяет значение val в массиве на значение newVal
  public  void replace(double val, double newVal) {
    array[indexOf(val)] = newVal;
  }
}
