package Conversions;

import java.util.ArrayList;

public class DecimalToBinary {

  public static void main(String[] args) {
    // Example to just show.
    decimalToBcd(15);
  }
  /**
   * Converts the decimal to Binary format.
   *
   * @input the integer that to be converted to binary.
   */
  public static void decimalToBcd(int input) {
    ArrayList<Integer> num = new ArrayList<Integer>();
    while (input > 0) {
      int temp = input % 2;
      input = input / 2;
      num.add(0, temp);
    }
    System.out.println(num.toString());
  }
}
