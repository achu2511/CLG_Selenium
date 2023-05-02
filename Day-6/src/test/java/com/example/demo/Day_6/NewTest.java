package com.example.demo.Day_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest {
	 WebDriver driver;
	@Test(groups="smoke test")
	  public void TC_001() {
	      System.out.println("Smoke tests :01");
	  }
	  @Test(groups="Regression test")
	  public void TC_002() {
	      System.out.println("Regression tests:Test case -02");
	  }
	  @Test(groups="Regression test")
	  public void TC_003() {
	      System.out.println("Regression tests"+"Test case:03");
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  String str=driver.getTitle();
		  String f=driver.getCurrentUrl();
		  Assert.assertEquals("Domain Names, Websites, Hosting &amp; Online Marketing Tools - GoDaddy IN", str);
		  Assert.assertEquals("https://www.godaddy.com/en-in",f);
		  Thread.sleep(4000);
	  }

	  @AfterTest
	  public void afterTest() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

}
