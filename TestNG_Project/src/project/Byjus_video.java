package project;

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Byjus_video {
	
		WebDriver driver;
		
		@BeforeMethod
	     public void Get() {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
	    
	     driver= new ChromeDriver();

	    driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		@Test
		public void login() throws InterruptedException {
			
			JavascriptExecutor JS= (JavascriptExecutor) driver;
			WebElement Video=driver.findElement(By.xpath("//h2[contains(text(),\"Watch\")]"));
			JS.executeScript("arguments[0].scrollIntoView();", Video);
			
			driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]")).click();
			
			driver.findElement(By.xpath("//option[@value=\"9\"]")).click();
			driver.findElement(By.xpath("(//a[@class=\"video-thumbnail\"])[11]")).click();
			
			Thread.sleep(3000);
			
		//	driver.findElement(By.xpath("//button[@class=\"ytp-large-play-button ytp-button ytp-large-play-button-red-bg\"]")).click();
			driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
			
			
			String Text=driver.findElement(By.xpath("//h2[contains(text(),\"Parents love us! \")]")).getText();
			System.out.println(Text);
			
		}
		
		@AfterMethod
		public void TearDown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
		
	}


