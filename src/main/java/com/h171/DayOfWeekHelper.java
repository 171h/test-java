package com.h171;

import java.time.DayOfWeek;

/**
 * Common code for working with DayOfWeek instances.
 */
public final class DayOfWeekHelper {
   /**
    * Retrieve a Day instance representing the supplied value.
    *
    * @param type type value
    * @return Day instance
    */
   public static DayOfWeek getInstance(int type) {
      DayOfWeek result;
      --type;

      if (type < 0 || type >= ORDERED_DAYS.length) {
         result = null;
      } else {
         result = ORDERED_DAYS[type];
      }
      return result;
   }

   /**
    * Retrieve the ordinal value for a DayOfWeek instance.
    *
    * @param day DayOfWeek instance
    * @return ordinal value
    */
   public static int getValue(DayOfWeek day) {
      switch (day) {
         case SUNDAY:
            return 1;
         case MONDAY:
            return 2;
         case TUESDAY:
            return 3;
         case WEDNESDAY:
            return 4;
         case THURSDAY:
            return 5;
         case FRIDAY:
            return 6;
         case SATURDAY:
            return 7;
      }

      return 0;
   }

   /**
    * Array mapping int types to enums.
    */
   public static final DayOfWeek[] ORDERED_DAYS = {
         DayOfWeek.SUNDAY,
         DayOfWeek.MONDAY,
         DayOfWeek.TUESDAY,
         DayOfWeek.WEDNESDAY,
         DayOfWeek.THURSDAY,
         DayOfWeek.FRIDAY,
         DayOfWeek.SATURDAY
   };

   public static void Test() {
      for (int i = 0; i < ORDERED_DAYS.length; i++) {
         System.out.println(ORDERED_DAYS[i]);
      }
   }
}
