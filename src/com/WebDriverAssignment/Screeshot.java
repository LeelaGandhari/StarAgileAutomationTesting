package com.WebDriverAssignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot {
		public static void main(String[] args) throws IOException 
	    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
		
		driver.get("https://www.naukri.com");
		
		File screenchot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenchot, new File("C:\\Users\\ADMIN\\Pictures\\Screenshots.image.jpg"));
		System.out.println("Screenshot Captured Successfully");
		}

	}

