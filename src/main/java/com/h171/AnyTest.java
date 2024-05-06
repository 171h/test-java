package com.h171;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnyTest {
  static void test() {


    List<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.now());
    dates.add(LocalDate.of(2019, 1, 1));
    LocalDate[] d22 = new LocalDate[0];

    for(LocalDate d : d22) {
      System.out.println(d);
    }

    LocalDate[] dates2 = dates.toArray(new LocalDate[0]);

    for (LocalDate d : dates2) {
      System.out.println(d);
    }
  }
}
