package com.h171;

import net.sf.mpxj.DayType;
// import net.sf.mpxj.common.EnumHelper;
import java.time.DayOfWeek;

public class DayTypeTest {
  static void test() {
    DayType[] m_days = new DayType[10];

    System.out.println(m_days);

    // print m_days
    for (int i = 0; i < m_days.length; i++) {
      m_days[i] = DayType.getInstance(i);
      System.out.println(m_days[i]);
    }

    System.out.println("--------------");

    // DayType[] TYPE_VALUES = EnumHelper.createTypeArray(DayType.class);
    // // print TYPE_VALUES
    // for (int i = 0; i < TYPE_VALUES.length; i++) {
    // System.out.println(TYPE_VALUES[i]);
    // }

    for (DayOfWeek day : DayOfWeek.values()) {
      System.out.println(day);
    }

  }
}
