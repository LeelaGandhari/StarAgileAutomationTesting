package com.WebDriverAssignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
				driver.get("https://trytestingthis.netlify.app/");
				WebElement dropdown = driver.findElement(By.id("option"));
				Select selectobject = new Select(dropdown);
				selectobject.selectByIndex(1);
				Thread.sleep(5000);
				selectobject.selectByValue("option 2");
				Thread.sleep(5000);
				selectobject.selectByVisibleText("Option 3");
				Thread.sleep(5000);
				//driver.quit();
				System.out.println("Option 1,2 & 3 are Selected one after the other");
			}
	}
