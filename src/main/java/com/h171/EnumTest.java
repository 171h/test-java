package com.h171;

import java.time.DayOfWeek;

public class EnumTest {
  static void test() {
    DayOfWeek[] values = DayOfWeek.values();
    for (DayOfWeek day : values) {
      System.out.println(day);
    }

    int[] nums = { 100, 200, 300 };
    for (int num : nums) {
      System.out.println(num);
    }
  }
}
