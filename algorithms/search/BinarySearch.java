package algorithms.search;

import java.util.Arrays;

class BinarySearch {
  /**
   * Binary search implementation with generics. This Algorithm have have capacity to search int,
   * String, char and other data types. Add array in main method as illustrated. Change the generic
   * in BinarySearch<> according to need. If value is not found -1 is output.
   *
   * @author Akash Mondal.
   * @version 1.0.1
   * @param args takes command line arguments, not used in this project.
   * @see Integer - The position index of the searched item in the sorted form of array.
   */
  public static void main(String[] args) {
    // add Array
    String[] a = {"Jadeja", "Sachin", "Kohli", "Ashwin", "Bhuvi"};
    // change the generic according to need. Generic refers to parameters in <>.
    BinarySearcher<String> obj = new BinarySearcher<String>(a);
    // search method returns the index of element that it will have in sorted form of that array.
    System.out.println(obj.search("Kohli"));
  }

  // class BinarySearcher used to call search method.
  public static class BinarySearcher<E extends Comparable<E>> {
    private E[] array;

    public BinarySearcher(E[] elements) {
      array = elements;
    }

    /**
     * This is the main search method It finds the index of searched item.
     *
     * @param key E - It is the searched item called in main that is searched using BinarySearch.
     * @return Integer - Index position of searched item in sorted array.
     */
    public int search(E key) {
      Arrays.sort(array);
      int low = 0;
      int high = array.length - 1;
      // running loop till the searched array is found.
      while (low <= high) {
        int mid = low + (high - low) / 2;
        E midValue = array[mid];

        if (less(key, midValue)) {
          high = mid - 1;
        }

        if (!less(key, midValue)) {
          low = mid + 1;
        }
        // return value only if the value is found.
        if (midValue == key) {
          return mid;
        }
      }
      // if value not found -1 is output.
      return -1;
    }

    private boolean less(E a, E b) {
      return a.compareTo(b) < 0;
    }
  }
}
