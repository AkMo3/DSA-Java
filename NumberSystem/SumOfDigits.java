/***********************************************************************
 *
 * A function that returns the sum of digits in an integer.
 * @author Akash Mondal
 * @version  1.0.1
 *
 ***********************************************************************/
public class SumOfDigits {

  /** Driver Code * */
  public static void main(String[] args) {
    // Example
    System.out.println(digitSumRecursion(999));
  }

  /**
   * Computes the sum of digits of a integer through iteration.
   *
   * @param n Integer whose sum of digits is to be returned.
   * @return Sum of digits of Integer
   */
  public static int digitSumIteration(long n) {
    int sum = 0;
    n = Math.abs(n);
    while (n > 0) {
      long temp = n % 10;
      sum = sum + (int) temp;
      n = n / 10;
    }
    return sum;
  }

  /**
   * Computes the sum of digits of a integer through recursion.
   *
   * @param n Integer whose sum of digits is to be returned.
   * @return Sum of digits of Integer
   */
  public static int digitSumRecursion(long n) {
    n = Math.abs(n);
    return n < 10 ? (int) n : (int) (n % 10 + digitSumRecursion(n / 10));
  }

  /**
   * Computes the sum of digits of a integer through dividing integers into strings and adding them.
   *
   * @param n Integer whose sum of digits is to be returned.
   * @return Sum of digits of Integer
   */
  public static int digitSumMain(long n) {
    n = Math.abs(n);
    String num = (n + "");
    String[] digits = num.split("");
    int sum = 0;
    for (String digit : digits) {
      sum = sum + Integer.parseInt(digit);
    }
    return sum;
  }
}
