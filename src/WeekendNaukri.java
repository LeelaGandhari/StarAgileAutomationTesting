import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeekendNaukri {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naukri.com");
		
		List<WebElement> NoOfLinksAvailable=driver.findElements(By.tagName("a"));
		System.out.println("The Total No. of Links avaialble are::"+NoOfLinksAvailable.size());
		for(WebElement j : NoOfLinksAvailable)
		{
			System.out.println(j.getAttribute("href"));
			System.out.println(j.getText());
		}
		
		driver.close();

	}
	
	
}
