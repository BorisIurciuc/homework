package homework49;

import java.util.Iterator;

public class MyArray<E> implements Iterable<E> {

  private Object[] array;

  public MyArray() {
    array = new Object[0];
  }

  public MyArray(E[] array) {
    this.array = new Object[array.length];
    copy(array, this.array);
  }

  private void copy(Object[] src,
      Object[] dst) {  //Метод копирования элементов из одного массива в другой
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }

  public E get(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("\nThis number is out of array");
    }
    return (E) array[index];
  }

  // метод для получения значения элемента по индексу
  public void set(int index, E value) { // метод для изменения значения элемента по индексу
    if (index < 0) {
      throw new IndexOutOfBoundsException("\nThis number is out of array");
    }
    array[index] = value;
  }

  public int size() {// метод который возвращает размер массива
    return array.length;
  }

  public int indexOf(E val) {// метод поиска индекса элемента по значению
    // Алгоритм линейного поиска (в классическом виде)
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(val)) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, E val) {
    if (index < 0 || index > array.length) {
      throw new RuntimeException("\nThis number is out of array");
    }
    Object[] newArray = new Object[array.length
        + 1]; // создаем новый массив на 1 больше чем был до этого
    copy(array, newArray);                  // копируем все элементы в новый массив

    for (int i = newArray.length - 1; i > index; i--) { // идем с конца до индекса
      newArray[i] = newArray[i - 1];        // записываем значение предыдущего элемента в текущий
    }
    newArray[index] = val;            // записываем сам элемент, который добавляли, в нужное место
    array = newArray;                 // наконец, заменяем старый массив на новый
  }

  public void add(E val) {
    add(array.length, val);
  }

  public void remove(int index) {

    if (index < 0 || index >= array.length) {
      throw new RuntimeException("\nThis number is out of array");
    }

    Object[] newArray = new Object[array.length - 1];
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
  @Override
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

  @Override
  public Iterator<E> iterator() {
    return new MyIterator<>(array);
  }

  private static class MyIterator<E> implements Iterator<E> {

    private Object[] array;
    private int currentIndex;

    public MyIterator(Object[] array) {
      currentIndex = 0;
      this.array = array;
    }

    @Override
    public boolean hasNext() {
      return currentIndex < array.length;
    }

    @Override
    public E next() {
      currentIndex++;
      return (E) array[currentIndex - 1];
    }
  }
}