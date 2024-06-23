
package MyPractiseSeleniumProgramsFromSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1.Xpath with single attribute
		//2.Xpath with Multiple attribute
		//3.Xpath with AND , OR operators
		//4.Xpath with innet text
		//5.Xpath with contains()
		//6.Xpath with start-with()
		//7.Xpath with Chained
		
		
		// Xpath with single attribute
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Apparel");
		
		// Xpath with Multiple attribute
		
		//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Mobile");
		
		// // Xpath with AND , OR operators
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("Mobile");
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Searc']")).sendKeys("Mobile");
		
		
		
		 // Xpath with innet text
		
		//driver.findElement(By.xpath("//a[text()='Computers ']")).click();
		
		
		//boolean displayStatus = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		//System.out.println(displayStatus);
		
		//String text= driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		//System.out.println(text);
		
		//Handling dynamic attributes we use : contains () and starts-with()
		
		
		
		//Xpath with contains()
		
		//driver.findElement(By.xpath("//input[contains(@id,'mal')]")).sendKeys("Women");
		
		// 	//Xpath with start-with()
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'smal')]")).sendKeys("Women");
		
		
		//Xpath with Chained 
		
		boolean logostatus = driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(logostatus);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
