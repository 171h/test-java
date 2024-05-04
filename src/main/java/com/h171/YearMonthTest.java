package com.h171;

import java.time.YearMonth;

public class YearMonthTest {
  static void test() {
    YearMonth ym = YearMonth.of(2017, 1);
    System.out.println(ym.getMonthValue());
    System.out.println(ym);
  }
}
