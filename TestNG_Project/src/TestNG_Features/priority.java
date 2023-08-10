package TestNG_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class priority {
	
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=1)
	public void C() {
		boolean logo1 =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("C");
	}
	@Test(priority=2)
	public void B() {
		boolean logo1 =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("B");
		
	}
	@Test(priority=0)
	public void D() {
		boolean logo1 =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("D");
	}
	@Test(priority= -1)
	public void S() {
		boolean logo1 =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("S");
	}
	@AfterClass
	public void Tesrdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	
                        
}		
}
