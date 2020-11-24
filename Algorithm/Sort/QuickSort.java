package Algorithm.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
  // Example
  public static void main(String[] args) {
    String[] a = {"Sachin", "Bravo", "Virat", "Pant", "Dhoni", "Rohit"};
    QuickSort.sort(a);
    for (String e : a) {
      System.out.println(e);
    }
  }

  /**
   * Main method that takes input of array and sorts it. The main array is sorted to give
   * performance guarantee.
   *
   * @param array Array that is to be sorted.
   */
  public static void sort(Comparable[] array) {
    List<Comparable> listArray = Arrays.asList(array);
    Collections.shuffle(listArray);
    listArray.toArray(array);
    sort(array, 0, array.length - 1);
  }

  /**
   * Recursive method to sort the array.
   *
   * @param a The array that is to be sorted.
   * @param lo - Lower index from where sorting to started.
   * @param hi - Higher limit upto which array is to be sorted.
   */
  private static void sort(Comparable[] a, int lo, int hi) {
    if (hi <= lo) return;
    int j = partition(a, lo, hi);
    sort(a, lo, j - 1);
    sort(a, j + 1, hi);
  }

  /**
   * Partitions array there by sorting it at the end.
   *
   * @param a - The array that is to be sorted.
   * @param lo - Lower index from where partiting to be started.
   * @param hi - Higher limit upto which array is to be partitioned.
   */
  private static int partition(Comparable[] a, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    while (true) {
      while (less(a[++i], a[lo])) {
        if (i == hi) break;
      }
      while (less(a[lo], a[--j])) {
        if (j == lo) break;
      }

      if (i >= j) break;

      swap(a, i, j);
    }

    swap(a, lo, j);
    return j;
  }

  /**
   * Compares the two value using compareTo method. CompareTo returns in -1, 0 , 1. Is value1 is
   * less than value2 it returns true;
   *
   * @param value1 Base argument that is to be compared.
   * @param value2 Argument with which comparision is made.
   * @return Boolean - If value1 less than value2, true is returned.
   */
  private static boolean less(Comparable value1, Comparable value2) {
    return value1.compareTo((Comparable) value2) < 0;
  }

  /**
   * Swaps element in array.
   *
   * @param array The Array that on which operation is to be performed.
   * @param index1 Index of first element.
   * @param index2 Index of second element.
   */
  private static void swap(Comparable[] array, int index1, int index2) {
    Comparable temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
