package Misc;

/**
 * Program to return the largest element from the array.
 *
 * @author Akash Mondal
 * @version 1.0.1
 */
public class MaxValue {
  public static void main(String[] args) {
    // Example
    Integer[] a = {1, 5, 3, 87, 32, 89, 43, 674, 42, 7, 24, 67, 7, 57, 6};
    System.out.println(maxValue(a));
  }

  /**
   * Returns the maximum element of the array.
   *
   * @param array array on which opertion is to be done.
   * @return E type i.e. the largest element.
   */
  public static Comparable maxValue(Comparable[] array) {
    Comparable max = array[1];
    for (int i = 0; i < array.length; i++) {
      if (less(max, array[i])) max = array[i];
    }
    return max;
  }

  /** Compares two element and returns whether a less than b. */
  private static boolean less(Comparable a, Comparable b) {
    return a.compareTo(b) < 0;
  }
}
