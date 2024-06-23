package MyPractiseSeleniumProgramsFromSDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class LocatorsExample {

	public static void main(String[] args) {
		
		 WebDriver driver= new EdgeDriver();
		 driver.get("https://demoblaze.com/");
		 driver.manage().window().maximize();
		 
		 List<WebElement> totalNoOfLinks=driver.findElements(By.className("nav-item"));
		 System.out.println("The total no.of links are:"+totalNoOfLinks.size());
  
		List<WebElement> totalNoOfImages=driver.findElements(By.tagName("a"));
		 System.out.println("The total no.of images are:"+totalNoOfImages.size());
		 
		 driver.findElement(By.linkText("Phones"));
		 driver.findElement(By.partialLinkText("nit"));
		 
		// TODO Auto-generated method stub

		 
		 
	}

}
