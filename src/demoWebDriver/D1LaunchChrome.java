package demoWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.google.co.in");
     driver.manage().window().maximize();
     driver.close();
     
	}

}

