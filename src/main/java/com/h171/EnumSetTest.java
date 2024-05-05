package com.h171;

import java.time.DayOfWeek;
import java.util.EnumSet;

public class EnumSetTest {
  static void test() {
    EnumSet<DayOfWeek> m_days = EnumSet.noneOf(DayOfWeek.class);

    m_days.add(DayOfWeek.TUESDAY);
    m_days.add(DayOfWeek.SUNDAY);
    m_days.add(DayOfWeek.SUNDAY);

    m_days.add(DayOfWeek.MONDAY);

    // print m_days
    System.out.println(m_days);

    if (!m_days.isEmpty()) {
      DayOfWeek result = m_days.iterator().next();
      System.out.println(result);
      DayOfWeek result2 = m_days.iterator().next();
      System.out.println(result2);

    }
  }
}
