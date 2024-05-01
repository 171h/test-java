package com.h171;

import java.time.LocalTime;

public class LocalTimeHelper {

  public static void Test() {
    LocalTime t1 = LocalTime.of(0, 0, 0);
    LocalTime midnight = LocalTime.MIDNIGHT;
    System.out.println(t1.toSecondOfDay());
    System.out.println(midnight.toSecondOfDay());
  }

}
