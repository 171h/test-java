package com.h171;

import java.util.List;

import net.sf.mpxj.common.TaskFieldLists;
import net.sf.mpxj.TaskField;

public class TaskFieldListsTest {

  static void test() {
    List<TaskField> list = TaskFieldLists.CUSTOM_FIELDS;
    System.out.println(list.size());
    for (TaskField field : list) {
      System.out.println(field.getName());
    }
  }
}
