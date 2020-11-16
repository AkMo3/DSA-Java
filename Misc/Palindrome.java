package Misc;

public class Palindrome {

  /**
   * Program to check if a string or number is palindrome or not.
   *
   * @param args command line argument that is supplied as input.
   * @author Akash Mondal
   * @version 1.0.1
   */
  public static void main(String[] args) {
    // Example
    System.out.println(palindrome(Integer.parseInt(args[0])));
    System.out.println("2489842");
  }

  /**
   * Function to check if the string is palindrome.
   *
   * @param input the string that is to be checked
   * @return boolean of function on input
   */
  public static boolean palindrome(String input) {
    for (int i = 0; i < input.length() / 2; i++) {
      if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Function to check if the number is palindrome.
   *
   * @param input the number that is to be checked
   * @return boolean of function on input
   */
  public static boolean palindrome(int input) {
    int rev = 0;
    int test = input;
    while (test > 0) {
      int temp = test % 10;
      rev = (10) * rev + temp;
      test = test / 10;
    }
    return rev == input;
  }
}
