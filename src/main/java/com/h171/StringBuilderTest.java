package com.h171;

public class StringBuilderTest {
  static void test() {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append("a");
    sb.append("b");
    sb.append("c");
    System.out.println(sb.toString());
  }
}
