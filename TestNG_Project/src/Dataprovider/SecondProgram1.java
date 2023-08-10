package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondProgram1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() {
		System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	     	
	     

	}
	
	@Test(dataProvider="loginData")
	public void LoginTest(String Username,String password,String Expected ) throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement User = driver.findElement(By.id("Email"));
		User.clear();
		Thread.sleep(2000);
		User.sendKeys(Username);
		
		WebElement pass = driver.findElement(By.id("Password"));
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		String Actual_Title = driver.getTitle();
		String Expected_Title="Dashboard / nopCommerce administration";
		
		if(Expected.equals("valid")) {//true
			 
			if(Expected_Title.equals(Actual_Title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);//pass
			}else {
				Assert.assertTrue(false);//failed
			}
		
		}else if(Expected.equals("invalid")) {
				if(Expected_Title.equals(Actual_Title)) {
					driver.findElement(By.linkText("Logout")).click();
			     	Assert.assertTrue(false);
				}else {
					Assert.assertTrue(true);
				}
	}
	}
 

     @DataProvider(name = "Logindata")
     public  String [] [] LoginData(){
    	 String Logindata[][] = { {"admin@yourstore.com","admin","Valid"},
    			                     {"admin@yourstore.com","admin1","inValid"},
    	                             {"admin@yourstore.com","admin2","inValid"},
    	                             {"admin@yourstore.com","admin3","Valid"},};
    	 return Logindata;
    	 }
     @AfterMethod
     public void TearDown() {
    	 driver.quit();
    	 
     }
	
}

		
	
			


