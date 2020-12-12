package NumberSystem;

public class ZerosInFactorial {

  /* Driver Code */
  public static void main(String args[]) {
    int n = 12;
    System.out.println(zeroCount(n));
  }

  /**
   * Returns the count of zeros in factorial of number
   *
   * @param n the number on which operation is to be performed.
   * @return Zero count.
   */
  static int zeroCount(int n) {
    int count = 0;
    for (int i = 5; n / i >= 1; i *= 5) count += n / i;

    return count;
  }
}
