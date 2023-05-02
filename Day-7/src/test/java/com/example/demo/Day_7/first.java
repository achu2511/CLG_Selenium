package com.example.demo.Day_7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class first {
  @Test(dataProvider = "dp")
  public void add(int num1,int num2,int expected) {
//    System.err.println(num1+num2);
//    System.out.println(result);
    int actual=num1+num2; 
    Assert.assertEquals(expected, actual);
}

@Test(dataProvider="add")
public void sub(int num1,int num2,int expected) {
    int actual=num1-num2;
    Assert.assertEquals(expected, actual);
}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1,2,3 },
      new Object[] { 2, 2,5},
    };
  }
}
