package BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledXMl {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("Webdriver gecko driver","\"C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win32\"");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");
	}
	@Test
	public void demo() throws InterruptedException {
		 JavascriptExecutor Js = (JavascriptExecutor) driver;
			
			WebElement Name =driver.findElement(By.xpath("//h2[contains(text(),'Watch video lessons ')]"));
			
			//scroll by element 
			
			Js.executeScript("arguments[0].scrollIntoView", Name);
			Thread.sleep(2000);
			WebElement b1 = driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]"));
			Select S1 = new Select(b1);
			S1.selectByVisibleText("Class 7");
			Thread.sleep(5000);
		
		
	}
	
	
	
}
