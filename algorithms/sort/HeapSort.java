package Algorithms.Sort;

/*********************************************************************
 * This code makes a Priority Queue and returns tha max value from that
 * so the nam MaxPriorityQueue.
 *
 * @author Akash Mondal.
 * @version 1.0.1 .
 *
 * While declaring this class, remember that this is not an autosizing Priority Queue,
 * so the size is to be declared while making instance this class.
 ************************************************************************/

public class HeapSort<K extends Comparable<K>> {
  /**
   * Sorts array using HeapSort in LogN time.
   *
   * @param pq array that is to be sorted.
   */
  public static void sort(Comparable[] pq) {
    int size = pq.length;
    for (int k = size / 2; k >= 1; k--) {
      sink(pq, k, size);
    }

    while (size > 1) {
      exch(pq, 1, size);
      sink(pq, 1, --size);
    }
  }

  /**
   * Element whos priority is to be decreased.
   *
   * @param k index of element in that array.
   */
  private static void sink(Comparable[] pq, int k, int size) {
    while (2 * k <= size) {
      int j = 2 * k;
      if (j < size && less(pq, j, j + 1)) {
        j++;
      }
      if (!less(pq, k, j)) {
        break;
      }
      exch(pq, k, j);
      k = j;
    }
  }

  /**
   * Compares the value of element in array at index of i and j.
   *
   * @param i index of first element.
   * @param j index of second element.
   * @return Statement if first less than second.
   */
  private static boolean less(Comparable[] pq, int i, int j) {
    return pq[i].compareTo(pq[j]) < 0;
  }

  /**
   * Exchange elements in array at position i and j.
   *
   * @param i index of first element.
   * @param j index of second element.
   */
  private static void exch(Comparable[] pq, int i, int j) {
    Comparable t = pq[i];
    pq[i] = pq[j];
    pq[j] = t;
  }
}
