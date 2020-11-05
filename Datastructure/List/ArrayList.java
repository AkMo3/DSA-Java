package Datastructures.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/** ArrayList class that contains class ArrayLister which actually makes ArrayList. */
public class ArrayList<E extends Comparable<E>> implements Iterable<E> {
  /**
   * Main class of ArrayList class. This method shows some but not all methods available with
   * ArrayLister class.
   */
  public static void main(String[] args) throws Exception {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    al.add(6);
    al.add(7);
    al.add(2, 8);
    al.removeByElement(4);
    al.removeByIndex(2);
    al.trimToSize();
    System.out.println("Size of string is " + al.size());
    Integer[] arr = new Integer[al.size()];
    al.toArray(arr);
    System.out.println(Arrays.toString(arr));
  }

  /**
   * Actual class that create ArrayLists.
   *
   * @author Akash Mondal.
   * @version 1.0.1 Author github id - AkMo3 ArrayLister class that makes generic ArrayList.
   * @param <E> Generic type defined during calling of class.
   */
  private int ITEM_COUNT = 0;

  private int SIZE = 2;

  Comparable[] array = new Comparable[SIZE];

  /**
   * Add item to array list. Item is added in the end of list.
   *
   * @param item Item to be added in arraylist.
   */
  public void add(E item) {
    resize();
    array[ITEM_COUNT] = item;
    ITEM_COUNT++;
  }

  /**
   * Add item to array list in specific index. Item at that index is shifted one place ahead.
   *
   * @param index Index in array where item is to added.
   * @param item Item to added at that index.
   */
  public void add(int index, E item) {
    resize();
    if (ITEM_COUNT + 1 == array.length) {
      forcedExpand();
    }
    for (int i = ITEM_COUNT; i >= index; i--) {
      array[i + 1] = array[i];
    }
    array[index] = item;
    ITEM_COUNT++;
  }

  /**
   * Resize array to make space for new elements. Array is extended when is fully filled. Array is
   * shrinked to half when it is quarterly filled. It is to avoid continuous array extension and
   * shrinking.
   */
  private void resize() {
    if (SIZE == ITEM_COUNT) {
      Comparable[] temp = new Comparable[SIZE];
      System.arraycopy(array, 0, temp, 0, array.length);
      array = new Comparable[SIZE * 2];
      System.arraycopy(temp, 0, array, 0, temp.length);
      SIZE = SIZE * 2;
    }

    if (ITEM_COUNT / 4 == SIZE) {
      Comparable[] temp = new Comparable[SIZE];
      System.arraycopy(array, 0, temp, 0, array.length);
      array = new Comparable[SIZE / 2];
      System.arraycopy(temp, 0, array, 0, temp.length);
      SIZE = SIZE / 2;
    }
  }

  /** Forcibly expand array to make space for new items. */
  private void forcedExpand() {
    Comparable[] temp = new Comparable[SIZE];
    System.arraycopy(array, 0, temp, 0, array.length);
    array = new Comparable[SIZE * 2];
    System.arraycopy(temp, 0, array, 0, temp.length);
    SIZE = SIZE * 2;
  }

  /** Print the items in array. */
  public void print() {
    for (int i = 0; i < ITEM_COUNT; i++) {
      System.out.println(array[i]);
    }
  }

  /**
   * Remove element in array by specifying which element to remove. Throws Exception if no such
   * element exists.
   *
   * @param item Element that is to be removed from array.
   * @throws Exception Exception thrown when that element doesn't exist.
   */
  public void removeByElement(E item) throws NullPointerException {
    resize();
    int index = 0;
    if (array[0] != item) {
      while (array[index] != item && index < ITEM_COUNT) {
        index++;
      }
    }
    try {
      if (array[index] != item) {
        throw new NullPointerException("Item does not exist in array");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    ITEM_COUNT--;
  }

  /**
   * Remove element by specifying the index of element in array.
   *
   * @param index Index of element in array.
   * @throws Exception When element at that index is null;
   */
  public void removeByIndex(int index) throws NullPointerException {
    resize();
    try {
      if (array[index] == null) {
        throw new NullPointerException("Element doesn't exist at given index");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    ITEM_COUNT--;
  }

  /**
   * Method to get size of array. Note that it returns the number of elements, not the actual size
   * of array.
   *
   * @return Int - Size of array i.e number of elements.
   */
  public int size() {
    return ITEM_COUNT;
  }

  /**
   * Method returning whether array is empty or not.
   *
   * @return Boolean.
   */
  public boolean isEmpty() {
    return ITEM_COUNT == 0;
  }

  /**
   * Method that returns the element at given index.
   *
   * @param index Index of element to get.
   * @return E - Element at that index.
   */
  public Comparable<E> get(int index) {
    return array[index];
  }

  /**
   * Clear the array. Note - Actual elements in array will not get deleted. Array will consume space
   * in memory.
   */
  public void clear() {
    ITEM_COUNT = 0;
  }

  /**
   * Clears the actual elements in array. Note- This may be slow. Performane- Will consume less
   * space.
   */
  public void hardClear() {
    array = new Comparable[2];
    array[0] = null;
    array[1] = null;
    ITEM_COUNT = 0;
  }

  /**
   * Tells whether elements exist in array or not.
   *
   * @param item Item to be searched if exist.
   * @return Boolean - Result whether item found in array or not.
   */
  public boolean contains(E item) {
    int index = 0;
    if (array[0] != item) {
      while (array[index] != item && index < ITEM_COUNT) {
        index++;
      }
    }

    return array[index] == item;
  }

  /** Trim size of array to number of elements currently in array. */
  public void trimToSize() {
    Comparable[] temp = new Comparable[SIZE];
    System.arraycopy(array, 0, temp, 0, ITEM_COUNT);
    array = new Comparable[ITEM_COUNT];
    System.arraycopy(temp, 0, array, 0, ITEM_COUNT);
    SIZE = ITEM_COUNT;
  }

  /**
   * Converts list to a given a array.
   *
   * @param newArray Array that is to contain elements of the list.
   */
  public void toArray(Comparable[] newArray) {
    System.arraycopy(array, 0, newArray, 0, ITEM_COUNT);
  }

  /**
   * Returns an iterator over elements of type {@code E}.
   *
   * @return an Iterator.
   */
  @Override
  public Iterator<E> iterator() {
    return new ListIterator();
  }

  /** Iterable class for Iterator to work. Returns elements to iterator. */
  private class ListIterator implements Iterator<E> {
    private int index = 0;
    private Comparable current = array[index];

    /**
     * Returns {@code true} if the iteration has more elements. (In other words, returns {@code
     * true} if {@link #next} would return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
      return array[index] != null;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public E next() {
      Comparable<E> element = array[index];
      index++;
      return (E) element;
    }
  }
}
