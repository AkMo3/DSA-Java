package NumberSystem;

public class Fibonacci {
  public static void main(String[] args) {
    fibonacci(10);
  }

  /**
   * Prints fibonacci series of elements.
   *
   * @param no_elements number of elements to be in output
   */
  public static void fibonacci(int no_elements) {
    int num1 = 0;
    int num2 = 1;
    int temp = 0;
    if (no_elements <= 0) System.out.println("Incorrect parameter");
    if (no_elements == 1) System.out.println(num1);
    if (no_elements == 2) {
      System.out.println(num1);
      System.out.println(num2);
    }
    if (no_elements >= 2) {
      System.out.println(num1);
      System.out.println(num2);
      for (int i = 0; i < no_elements; i++) {
        System.out.println(num1 + num2);
        temp = num1;
        num1 = num2;
        num2 = num2 + temp;
      }
    }
  }
}
