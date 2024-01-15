package homework46.task01;

class MyArray {
  private double[] array;

  public MyArray(double[] array) {
    this.array = new double[array.length];
    copy(array, this.array);
  }

  private void copy(double[] src, double[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }

  public double get(int index) {
    return array[index];
  }

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
  public void add(double val) {
    add(array.length, val);
  }

  public String toString() {
    String res = "[ ";
    for (int i = 1; i < array.length; i++) {
      res += array[i];
      if (i != array.length - 2) {
        res += ", ";
      }
      if (i == array.length - 2) {
        break;
      }
    }
    res += " ]";
    return res;
  }
}
