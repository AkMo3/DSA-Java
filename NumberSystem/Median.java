package NumberSystem;

import java.util.Arrays;

/**
 * This class returns the median value of an array. Median is the middle element of the array after
 * it is sorted. If there are even elements in the array median value is the value returned after
 * adding the two values and then dividing by 2. <br>
 * e.g [1,2,3] has median 3 e.g [1,2,3,4] has median 2.5 (2+3) /2
 *
 * @author Kostas
 *     <p>version 1.0
 */
public class Median {

  /*
   * Usage: Give as many numbers seperated by a space.
   */
  public static void main(String args[]) {
    double[] doubleValues = Arrays.stream(args).mapToDouble(Double::parseDouble).toArray();
    System.out.println(Arrays.toString(doubleValues));
    System.out.println(Median.getMedian(doubleValues));
  }

  /**
   * This method returns the median value of an array. Note that the returned value is always
   * double.
   *
   * @param array an array of double values
   * @return the median value
   */
  public static double getMedian(double[] array) {
    Arrays.sort(array);
    // if there are even elements
    if (array.length % 2 == 0) {
      // add the two in the middle and divide by 2
      return (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
    }
    // else return the middle one
    return array[(array.length - 1) / 2];
  }

  /**
   * This method returns the median value of an array. Note that the returned value is always double
   * despite the int[] input.
   *
   * @param array an array of int values
   * @return the median value
   */
  public static double getMedian(int[] array) {
    Arrays.sort(array);
    // if there are even numbers
    if (array.length % 2 == 0) {
      // find the first of the two in the middle and convert it to double
      double firstValue = array[array.length / 2 - 1];
      // find the second
      double secondValue = array[array.length / 2];

      // return the addition divided by two
      return (firstValue + secondValue) / 2;
    }
    return array[(array.length - 1) / 2];
  }
}
