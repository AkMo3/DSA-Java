package Algorithms.Sort;

public class MergeSort<E extends Comparable<E>> {
  /**
   * Code takes a array of items and sort them by mergesort.
   *
   * @author Akash Mondal.
   * @version 1.0.1.
   * @param args takes command line argument.
   */
  public static void main(String[] args) {
    // example array
    String[] a = {"Sachin", "Bravo", "Virat", "Pant", "Dhoni", "Rohit"};
    MergeSort<String> mg = new MergeSort<String>();
    mg.mergeSort(a);
    for (String e : a) {
      System.out.println(e);
    }
  }

  /**
   * Main method of class MergeSorter. Takes an array as input and sends further for Sorting.
   *
   * @param a Array that is to be sorted.
   */
  public void mergeSort(Comparable<E>[] a) {
    // creating of array here only to reduce space.
    Comparable[] aux = new Comparable[a.length];
    sort(a, aux, 0, a.length - 1);
  }

  /**
   * Sorts array using recursion.
   *
   * @param a Array that is to be sorted.
   * @param aux Array that is used to store elements of array a temporarily.
   * @param lo Index of array where sorting is to be started.
   * @param hi Index of array upto which array is to sorted.
   */
  private void sort(Comparable<E>[] a, Comparable<E>[] aux, int lo, int hi) {
    if (hi <= lo) {
      return;
    }
    int mid = lo + (hi - lo) / 2;
    // sorting first half.
    sort(a, aux, lo, mid);
    // sorting second half.
    sort(a, aux, mid + 1, hi);
    /**
     * Stop sorting array if already sorted. As both halves are in sorted, so if last element of
     * first half is less than first element of second half then the whole is already sorted.
     */
    if (!less(a[mid + 1], a[mid])) {
      return;
    }
    // merging both halfes and sorting them.
    merge(a, aux, lo, mid, hi);
  }

  /**
   * Sorts array using recursion.
   *
   * @param a Array that is to be sorted.
   * @param aux Array that is used to store elements of array a temporarily.
   * @param lo Index of array where sorting is to be started.
   * @param mid Mid index of the array to seperate array into two halfes.
   * @param hi Index of array upto which array is to sorted.
   */
  private void merge(Comparable<E>[] a, Comparable<E>[] aux, int lo, int mid, int hi) {
    /**
     * Coping elements of array a to array aux. This step can be avoided by replacing a and aux. But
     * this sometime leads to some insidious bug.
     */
    for (int k = lo; k <= hi; k++) {
      aux[k] = a[k];
    }

    int i = lo;
    int j = mid + 1;
    /** Sortes array by comparing elements of aux, and puting the lesser one in the actual array. */
    for (int k = lo; k <= hi; k++) {
      if (i > mid) {
        a[k] = aux[j++];
      } else if (j > hi) {
        a[k] = aux[i++];
      } else if (less(aux[j], aux[i])) {
        a[k] = aux[j++];
      } else {
        a[k] = aux[i++];
      }
    }
  }

  /**
   * Compares the two value using compareTo method. CompareTo returns in -1, 0 , 1. Is value1 is
   * less than value2 it returns true;
   *
   * @param value1 Base argument that is to be compared.
   * @param value2 Argument with which comparision is made.
   * @return Boolean - If value1 less than value2, true is returned.
   */
  private boolean less(Comparable<E> value1, Comparable<E> value2) {
    return value1.compareTo((E) value2) < 0;
  }
}
