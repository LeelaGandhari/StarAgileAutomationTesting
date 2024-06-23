package com.WebDriverAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormValidation {
public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
				Thread.sleep(5000);
				
				//to get first name
				WebElement fname = driver.findElement(By.id("input-firstname"));
				fname.sendKeys("Leela");
				
				//to get last name
				WebElement lname = driver.findElement(By.id("input-lastname"));
				lname.sendKeys("Gandhari");
				Thread.sleep(5000);
				
				//to get email id
				WebElement email = driver.findElement(By.id("input-email"));
				email.sendKeys("leela.gandhari13@gmail.com");
				Thread.sleep(5000);
				
				//to get phone number
				WebElement phono = driver.findElement(By.id("input-telephone"));
				phono.sendKeys("9949213611");
				Thread.sleep(5000);
				
				//To select password
				WebElement pass = driver.findElement(By.id("input-password"));
				pass.sendKeys("Leela@infy7");
				
				//To select Confirm password
				WebElement Confpass = driver.findElement(By.id("input-confirm"));
				Confpass.sendKeys("Leela@infy7");
				
				//To select subscribe
				WebElement subscribe = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/div[2]/label"));
				subscribe.click();
				Thread.sleep(5000);
				
				System.out.println("Selected: " + subscribe.isSelected());
				System.out.println("Visible : " + subscribe.isDisplayed());
				System.out.println("Enable  : " + subscribe.isEnabled());
				
				//To select policy
				WebElement policy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/div/label"));
				policy.click();
				Thread.sleep(5000);
				
				System.out.println("Selected: " + policy.isSelected());
				System.out.println("Visible : " + policy.isDisplayed());
				
				//to click on continue
				WebElement cont = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input"));
				cont.click();
				driver.close();
	   }
}

