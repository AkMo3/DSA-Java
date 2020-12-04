package NumberSystem;

import java.util.Arrays;

/**
 * This class is used to get the Mean value of an array. Mean value the sum of all values divided by
 * the number of values.
 *
 * @author Kostas
 */
public class Mean {

  /*
   * Sample usage:
   * Give as many numbers seperated by a space.
   */
  public static void main(String args[]) {
    double[] doubleValues = Arrays.stream(args).mapToDouble(Double::parseDouble).toArray();
    System.out.println("The mean value is: " + Mean.getMean(doubleValues));
  }

  /**
   * This method returns the Mean value of an array.
   *
   * @param array an array with double values
   * @return the mean value
   */
  public static double getMean(double[] array) {
    double sum = 0;
    for (double num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  /**
   * This method returns the Mean value of an array. </br></br> NOTE: the returned value is double
   * althought the input array is int[].
   *
   * @param array an array with int values
   * @return the mean value
   */
  public static double getMean(int[] array) {
    double sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum / array.length;
  }
}
