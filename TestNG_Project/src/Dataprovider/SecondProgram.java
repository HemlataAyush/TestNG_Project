package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SecondProgram {
	WebDriver driver;
	@Test(dataProvider="Logindata")
	public void LoginTest (String Uname,String PWD,String Expected){
		System.setProperty("Webdriver chrome driver",  "\"C:\\chromedriver.exe\"");
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		     WebElement Username1 = driver.findElement(By.id("Email"));
		     Username1.sendKeys(Uname);
		     WebElement Passwords=driver.findElement(By.name("Password"));
		     Passwords.sendKeys(PWD);
		     
		    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		    String ACT_Title = driver.getTitle();
		    String Exp_Title = "Dashboard / nopCommerce administration";
		    
		    if(Expected.equals("valid")) {
		    	if(Exp_Title.equals(ACT_Title)) {
		    		driver.findElement(By.linkText("Logout")).click();
		    		Assert.assertTrue(false);
		    	}
		    }
		    
		     driver.quit();
		
	}

}
