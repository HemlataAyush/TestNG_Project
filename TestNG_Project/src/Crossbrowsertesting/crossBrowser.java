package Crossbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	
	public void OrangeHRM(String Browsername) {
      if (Browsername.equalsIgnoreCase("FireFox")) {
			System.setProperty("Webdriver gecko driver","\"C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win32\"");
		driver = new FirefoxDriver();
	 	}
		if(Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     WebElement Username1 = driver.findElement(By.name("username"));
	     Username1.sendKeys("Admin");
	     WebElement Passwords=driver.findElement(By.name("password"));
	     Passwords.sendKeys("admin123");
	     String Exp_Name="Paul Collings";
	     		
	     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	     String Act_name = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	     Assert.assertEquals(Act_name, Exp_Name);
	     
	     System.out.println("Correct user name");
	     
	     System.out.println("Excution completed");
	    driver.quit();
	     
	     
	     
	}

}
