package TestNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTestNG {
	@Test
	public void m1() throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","\"C:\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.close();
		  
		
	}

}
