package com.example.demo.Day_4Tc_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class one_two {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Achyuth");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("achu");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("achyuth2511@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Achyuth@25");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	}
}
