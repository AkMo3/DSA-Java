package Algorithm.Sort;

import java.util.Arrays;

/***************************************************
 * Sorts a array through BubbleSort(InsertionSort).
 *
 * @author Akash Mondal
 * @version 1.0.1
 *
 **************************************************/
public class InsertionSort<E extends Comparable<E>> {

  public static void main(String[] args) {
    String[] a = {"Sachin", "Virat", "Bhuvi", "Jadeja", "Rohit", "Ashwin"};
    sort(a);
    System.out.println(Arrays.toString(a));
  }

  public static void sort(Comparable[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - 1 - i; j++) {
        if (greater(a, j)) {
          swap(a, j);
        }
      }
    }
  }

  private static boolean greater(Comparable[] array, int num1) {
    return array[num1].compareTo(array[num1 + 1]) > 0;
  }

  private static void swap(Comparable[] array, int index) {
    Comparable temp = array[index];
    array[index] = array[index + 1];
    array[index + 1] = temp;
  }
}
