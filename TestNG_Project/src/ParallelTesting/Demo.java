package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test
	public void Setup() {
		System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void Setup1() {
        System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@Test
	public void Setup2() {
		 System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/");
			
			
		
	}

}
