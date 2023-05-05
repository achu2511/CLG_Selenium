package com.example.demo.Day_6;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class Testng1 {
  @Test
  public void f() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver=new EdgeDriver();
      driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form");
      String title=driver.getTitle();
      System.out.println(title);
      Assert.assertEquals("","");
      
  }
}
