package GetM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandles {

	public static void main(String[] args) {
		WebDriver drive=new ChromeDriver();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		drive.get("https://opensource-demo.orangehrmlive.com/");
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowsid=drive.getWindowHandles();
		
		List<String> windowlist=new ArrayList(windowsid);
		
		String parentid=windowlist.get(0);
		String childid=windowlist.get(1);
		
		//switching to child window
		drive.switchTo().window(childid);
		System.out.println(drive.getTitle());
		
		//switching to parent window
		drive.switchTo().window(parentid);
		System.out.println(drive.getTitle());
		
		

	}

}
