package com.h171;

import net.sf.mpxj.ProjectCalendar;
import net.sf.mpxj.ProjectFile;

public class ProjectCalendarTest {
  static void test() {
    ProjectFile projectFile = new ProjectFile();
    ProjectCalendar calendar = new ProjectCalendar(projectFile);
    calendar.addDefaultCalendarDays();
    calendar.addDefaultCalendarHours();
    System.out.println(calendar);
  }
}
