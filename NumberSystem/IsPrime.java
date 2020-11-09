package NumberSystem;

/**
 * Program to tell whether number is boolean or not.
 *
 * @author Akash Mondal
 * @version 1.0.1
 */
public class IsPrime {
  public static void main(String[] args) {
    System.out.println(isPrime(Integer.parseInt(args[0])));
  }

  /**
   * Outputs whether number prime or not.
   *
   * @param input Number that is to be checked.
   * @return boolean whether the number is prime or not.
   */
  public static boolean isPrime(int input) {
    int i = 3;
    if (input == 2) {
      return true;
    } else if (input % 2 == 0 || input < 2) return false;
    for (; i <= Math.sqrt(input); i = i + 2) {
      if (input % i == 0) return false;
    }
    return true;
  }
}
