package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {
		WebDriver pomdriver;
		
	public PageObjectModel(WebDriver driver) 
		{
			
			this.pomdriver = driver;
		}
		
		public void setUserName(String un)
		{
		
		pomdriver.findElement(By.xpath("//*[@id=\":r0:\"]")).sendKeys(un);
		
		}
		
		public void setPass(String pass)
		{
		
		pomdriver.findElement(By.xpath("//*[@id=\":r3:\"]")).sendKeys(pass);
		
		}
		
		public void SignIn()
		{
		
		pomdriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/form/button[1]")).click();
		
		}
		
		public void showMessage()
		{
			System.out.println(pomdriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/header/div/div/div")).getText());;
		}
}
