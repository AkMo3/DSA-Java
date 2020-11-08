package Conversions;

public class BinaryToDecimal {

  public static void main(String[] args) {
    System.out.println(binaryToDecimal(1001));
  }

  /**
   * Converts binary to decimal.
   *
   * @param input binary that is to converted into integer.
   * @return integer converted into decimal from binary.
   */
  public static int binaryToDecimal(int input) {
    int result = 0;
    int c = 0;
    while (input > 0) {
      int temp = input % 10;
      input = input / 10;
      result = result + (int) Math.pow(2, c++) * temp;
    }
    return (result);
  }
}
