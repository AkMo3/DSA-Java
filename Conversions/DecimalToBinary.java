package Conversions;

import java.util.ArrayList;

public class DecimalToBinary {

  public static void main(String[] args) {
    // Example to just show.
    System.out.println(decimalToBcd(8));
  }

  /**
   * Converts integer to binary in integer format.
   *
   * @param input the integer that is to be converted.
   * @return a integer that is binary format of integer.
   */
  public static int decimalToBcd(int input) {
    int result = 0;
    int index = 0;
    while (input > 0) {
      int temp = input % 2;
      input = input / 2;
      result = result + (int) Math.pow(10, index++) * temp;
    }
    return result;
  }

  /**
   * Converts integer to binary in array format containing integers.
   *
   * @param input the integer that is to be converted.
   * @return a array that is binary format of integer.
   */
  public static Integer[] decimalToBcd_Array(int input) {
    ArrayList<Integer> num = new ArrayList<Integer>();
    while (input > 0) {
      int temp = input % 2;
      input = input / 2;
      num.add(0, temp);
    }
    return (Integer[]) num.toArray();
  }
}
