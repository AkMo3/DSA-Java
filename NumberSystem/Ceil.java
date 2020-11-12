package Misc;

/**
 * The program is used to find the ceil values of the required input.
 *
 * @author Akash Mondal
 * @version 1.0.1
 */
public class Ceil {
  public static void main(String[] args) {
    System.out.println(ceilValue(Double.parseDouble(args[0])));
  }

  /**
   * Return the ceil value of the double
   *
   * @param num The double whose ceil value is to returned.
   * @return the ceil value of num
   */
  public static int ceilValue(double num) {
    if (num > 0) {
      return (int) num + 1;
    } else if (num == 0) {
      return 0;
    } else return (int) num;
  }
}
