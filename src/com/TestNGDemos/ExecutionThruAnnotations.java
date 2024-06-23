package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionThruAnnotations {
		WebDriver driver;
		PageObjectModel p1;
	  @Test
	  public void login() throws InterruptedException 
	  {
		  p1.setUserName("leela.gandhari13@gmail.com");
		  p1.setPass("Leela@infy7");
		  p1.SignIn();
		  Thread.sleep(3000);
		  p1.showMessage();
		  
	  }
	 
	  @BeforeTest
	  public void beforeTest()
	  {
		  WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
			driver.get("https://www.netflix.com/login");
			
			p1 = new PageObjectModel(driver);
			
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.close();
	  }

	}
