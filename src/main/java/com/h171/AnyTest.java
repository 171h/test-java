package com.h171;

import java.text.DateFormatSymbols;
// import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;


public class AnyTest {
  static void test() {
    DateFormatSymbols dfs = new DateFormatSymbols();
    for(String s : dfs.getWeekdays()){
      System.out.println(s);
    }

    for(String s : dfs.getMonths()){
      System.out.println(s);
    }

    // System.out.println(null.getValue());



    // List<LocalDate> dates = new ArrayList<>();
    // dates.add(LocalDate.now());
    // dates.add(LocalDate.of(2019, 1, 1));
    // LocalDate[] d22 = new LocalDate[0];

    // for(LocalDate d : d22) {
    //   System.out.println(d);
    // }

    // LocalDate[] dates2 = dates.toArray(new LocalDate[0]);

    // for (LocalDate d : dates2) {
    //   System.out.println(d);
    // }
  }
}
