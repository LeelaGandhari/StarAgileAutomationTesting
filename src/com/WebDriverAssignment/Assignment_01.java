package com.WebDriverAssignment;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Web driver script to navigate to a website and click on a specific link */

public class Assignment_01 {
  public static void main(String[] args) {
	         WebDriver driver = new EdgeDriver();
		     driver.get("https://staragile.com/");
		     driver.manage().window().maximize();
		     driver.findElement(By.linkText("Refer & Earn")).click();
		     driver.close();
		     }
}
