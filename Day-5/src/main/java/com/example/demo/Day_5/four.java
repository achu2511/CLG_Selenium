package com.example.demo.Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class four {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.abhibus.com/bus-ticket-booking");
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[4]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Bengaluru",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
//        driver.close();
        }
}
