package com.java.sample.demolucas;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class AppTest {

  @Test
  public void testLucasNumberForOneInput() {
    Assert.assertEquals("2 should be returned by the function", "2", App.lucasNumber(1));
  }

  @Test
  public void testLucasNumberForThreeInput() {
    Assert.assertEquals("2,1,3 should be returned by the function", "2,1,3", App.lucasNumber(3));
  }

  @Test
  public void testLucasNumberForZeroInput() {
    Assert.assertEquals("(Blank) should be returned by the function", "", App.lucasNumber(0));
  }
}
