package Algorithm.Sort;

import java.util.Arrays;

public class SelectionSort<E extends Comparable<E>> {

  public static void main(String[] args) {
    // Example
    String[] a = {"Sachin", "Virat", "Bhuvi", "Jadeja", "Rohit", "Ashwin"};
    SelectionSort.sort(a);
    System.out.println(Arrays.toString(a));
  }

  static int min = 0;

  public static void sort(Comparable[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i != 0) {
        Comparable<?> temp = array[i - 1];
        array[i - 1] = array[min];
        array[min] = temp;
        min = i;
      }
      for (int j = i; j < array.length; j++) {
        if (less(array[j], array[min])) min = j;
      }
    }
  }

  private static boolean less(Comparable a, Comparable b) {
    return a.compareTo(b) < 0;
  }
}
