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

public class MaxPriorityQueue<K extends Comparable<K>> {
  private K[] pq;
  private int size = 0;

  /**
   * Constructor of MaxPriorityQueue class.
   *
   * @param capacity of Priority Queue.
   */
  public MaxPriorityQueue(int capacity) {
    pq = (K[]) new Comparable[capacity];
  }

  /**
   * Element that is to be given higher Priority.
   *
   * @param k index of element in that array.
   */
  private void swim(int k) {
    while (k > 1 && less(k / 2, k)) {
      exch(k, k / 2);
      k = k / 2;
    }
  }

  /**
   * Element whos priority is to be decreased.
   *
   * @param k index of element in that array.
   */
  private void sink(int k) {
    while (2 * k <= size) {
      int j = 2 * k;
      if (j < size && less(j, j + 1)) {
        j++;
      }
      if (!less(k, j)) {
        break;
      }
      exch(k, j);
      k = j;
    }
  }

  /**
   * Deletes the maximum value item from Priority Queue and return that.
   *
   * @return Maximum element of PQ.
   */
  public K delMax() {
    K max = pq[1];
    exch(1, size--);
    sink(1);
    pq[size + 1] = null;
    return max;
  }

  /**
   * Add element in PQ.
   *
   * @param x Element that is to be added in PQ.
   */
  public void insert(K x) {
    pq[++size] = x;
    swim(size);
  }

  /**
   * Compares the value of element in array at index of i and j.
   *
   * @param i index of first element.
   * @param j index of second element.
   * @return Statement if first less than second.
   */
  private boolean less(int i, int j) {
    return pq[i].compareTo(pq[j]) < 0;
  }

  /**
   * Exchange elements in array at position i and j.
   *
   * @param i index of first element.
   * @param j index of second element.
   */
  private void exch(int i, int j) {
    K t = pq[i];
    pq[i] = pq[j];
    pq[j] = t;
  }
}
