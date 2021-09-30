package edu.cnm.deepdive;

import java.util.EnumSet;

/**
 * Implements a method that computes the FizzBuzz {@link String} value for any non-negative integer
 */
public class FizzBuzz {


  public EnumSet<FizzBuzzValue> getFizzBuzz (int value) {
    EnumSet<FizzBuzzValue> valueSet = EnumSet.noneOf(FizzBuzzValue.class);
    // TODO Put appropriate values in valueSet, based om whether value is divisible by 3 or 5.
    if (value % 3 == 0) {
      valueSet.add(FizzBuzzValue.FIZZ);
    }
    if (value % 5 == 0) {
      valueSet.add(FizzBuzzValue.BUZZ);
    }
    return valueSet;
  }

}
