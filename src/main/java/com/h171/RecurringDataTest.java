package com.h171;
import net.sf.mpxj.RecurringData;
import net.sf.mpxj.RecurrenceType;
import java.time.LocalDate;;

public class RecurringDataTest {
  static void test() {
    LocalDate start = LocalDate.of(2021, 1, 1);
    LocalDate end = LocalDate.of(2021, 1, 10);
    RecurringData rd = new RecurringData();
  
    rd.setRecurrenceType(RecurrenceType.DAILY);
    rd.setFrequency(1);
    rd.setStartDate(start);
    rd.setFinishDate(end);

    // rd.setDayNumber(1);
    // rd.setOccurrences(1);

    System.out.println(rd.toString());

    LocalDate[] dates = rd.getDates();
    for (LocalDate date : dates) {
      System.out.println(date);
    }
  }
}
