package GetM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethods {

	public static void main(String[] args) {
		WebDriver drive=new ChromeDriver();
		
		drive.navigate().to("https://opensource-demo.orangehrmlive.com/");
		drive.navigate().to("https://demo.opencart.com/");
		
		drive.navigate().back();
		System.out.println(drive.getCurrentUrl());
		
		drive.navigate().forward();
		System.out.println(drive.getCurrentUrl());
		
		drive.navigate().refresh();

	}

}
