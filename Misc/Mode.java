package Misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This class is used to retrieve all the modes of a given array. Mode is the value that appears the
 * most in a given set. If there are more than one mode then they are returned sorted from min to
 * max.
 *
 * @author Kostas
 * @param <E> The type of the array
 */
public class Mode<E extends Comparable<? super E>> {

  public static void main(String args[]) {
    String[] values = {"Bravo", "Alpha", "Mega", "Alpha", "Bravo", "Mega"};
    Mode<String> md = new Mode<>();
    ArrayList<String> modes = md.getMode(values);
    System.out.println(modes.toString());
  }

  /**
   * This method is used to extract all modes of the given array sorted in an ArrayList.
   *
   * @param array to extract the modes from
   * @return a sorted {@link ArrayList} with all the modes
   */
  public ArrayList<E> getMode(E[] array) {

    // initializing a Map where the key is an element of the array and the value is the element's
    // appearances
    HashMap<E, Integer> freqCounter = new HashMap<>();

    // counting the max appearances
    int maxApps = 0;

    // we iterate every element
    int apps = 0;
    for (E element : array) {

      // if it was already in the hash map
      if (freqCounter.containsKey(element)) {
        // then the appearances is last appearances + 1
        apps = freqCounter.get(element) + 1;
      } else {
        // else its the first appearance
        apps = 1;
      }

      // add the element with its respective appearances
      freqCounter.put(element, apps);

      // keep track of the max appearances
      if (maxApps < apps) {
        maxApps = apps;
      }
    }

    // we create a list to add all our modes
    ArrayList<E> modes = new ArrayList<>();

    // we iterate the hashmap with the iterator
    Iterator<Map.Entry<E, Integer>> it = freqCounter.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<E, Integer> pair = it.next();

      // if the value of any pair is equal to the maxApps
      // it means it's a mode
      if (pair.getValue() == maxApps) {
        // like insertion sort
        addToCorrectPosition(modes, pair.getKey());
      }
    }

    return modes;
  }

  /**
   * This method implements a variation of insertion sort.
   *
   * @param list the array list to insert the element
   * @param element the element to insert
   */
  private void addToCorrectPosition(ArrayList<E> list, E element) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).compareTo(element) > 0) {
        list.add(i, element);
        return;
      }
    }
    list.add(element);
  }
}
