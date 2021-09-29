package edu.cnm.deepdive;

/**
 * Implements a method that computes the FizzBuzz {@link String} value for any non-negative integer
 */
public class FizzBuzz {

  public static final String BUZZ_VALUE = "Buzz";
  public static final String FIZZ_BUZZ_VALUE = "FizzBuzz";
  public static final String FIZZ_VALUE = "Fizz";

  public String getFizzBuzz (int value) {
    String str;
    if (value % 3 == 0) {
      if (value % 5 == 0) {
        str = FIZZ_BUZZ_VALUE;
      } else {
        str = FIZZ_VALUE;
      }
    } else if (value % 5 == 0) {
        str = BUZZ_VALUE;
      } else {
        str = String.valueOf(value);
      }
      return str;
  }
}
