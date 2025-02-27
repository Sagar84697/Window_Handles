package GetM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice {

	public static void main(String[] args) {
		
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        // Open the website
	        driver.get("https://testautomationpractice.blogspot.com/");

	   
	        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");

	       
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        


	        // Find the first matching link (only one link will be clicked)
	       List<WebElement>wttt=driver.findElements(By.xpath("//a[@target='_blank']"));
	     
		for(WebElement ist:wttt) {
			ist.click();
		}

	     

	  

	  
	       
	    }
	}