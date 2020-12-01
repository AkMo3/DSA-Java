package NumberSystem;

/**
 * The program is used to find the floor values of the required input.
 *
 * @author Akash Mondal
 * @version 1.0.1
 */
public class Floor {
  public static void main(String[] args) {
    System.out.println(floorValue(Double.parseDouble(args[0])));
  }

  /**
   * Return the floor value of the double
   *
   * @param num The double whose floor value is to returned.
   * @return the floor value of num
   */
  public static int floorValue(double num) {
    if (num > 0) {
      return (int) num;
    } else if (num == 0) {
      return 0;
    } else return (int) num - 1;
  }
}
