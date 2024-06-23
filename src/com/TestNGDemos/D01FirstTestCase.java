package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTestCase {
  @Test
  public void openAjio() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.ajio.com/");
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
	  
  }
  @Test
  public void openMyntra() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.myntra.com/");
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
	  }
  @Test
  public void openAmazon() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.com/");
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
}
}
  
  
  
  
  
  
  
