package MyPractiseSeleniumProgramsFromSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com");		
		driver.manage().window().maximize();
		
		// tag id syntax tag#id or #id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Jewelry");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Jewelry");
		//driver.close();
		
		
		//tag class syntax tag.classname or .classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Jewelry");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Jewelry");
		
		// tag attribute syntax tag[attribute='value']
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Jewelry");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Apparel");
		
		
		//tag class attribute syntax
		
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Apparel");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Apparel");
		driver.close();
		
		
		
	

	}

}
