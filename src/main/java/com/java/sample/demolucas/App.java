package com.java.sample.demolucas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

  /**
   * This function will generate the lucas series based on the input params.
   *
   * @param n Lucas number need to be generated upto.
   * @return Lucas series comma separated value
   */
  public static String lucasNumber(int n) {
    List<String> list = new ArrayList<>();
    int n1 = 2, n2 = 1, n3;
    if (n > 1) {
      list.add(String.valueOf(2));
      list.add(String.valueOf(1));
      for (int i = 2; i < n; ++i) {
        n3 = n2;
        n2 += n1;
        n1 = n3;
        list.add(String.valueOf(n2));
      }
      return list.stream().collect(Collectors.joining(","));
    } else if (n == 1) {
      // For n=1
      return "2";
    } else {
      // For zero
      return "";
    }
  }

  public static void main(String[] args) {
    System.out.println(lucasNumber(1));
  }
}
