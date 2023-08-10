package Parametarization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
   WebDriver driver;
   @Parameters({"URL"})
   @BeforeMethod

	public void Setup(String URL) {
		System.setProperty("Webdriver chrome driver","\"C:\\chromedriver.exe\"");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(URL);
   }
   @Parameters({"Username","Password"})
   @Test
   public void LoginTest(String Uname,String pass) {
	   WebElement Useremail=driver.findElement(By.id("email"));
	   Useremail.sendKeys(Uname);
	   WebElement Password = driver .findElement(By.id("pass"));
	   Password.sendKeys(pass);
	   
	   driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	   
	   String Actual_Title = driver.getTitle();
	   String Title ="Admin";
	   
	   if(Actual_Title.equals(Title)) {
		   System.out.println("Correct Title");
	   }
	   else {
		   System.out.println("Incorrect Title ");
	   }
	   
   }
   public void Teardown() {
	   driver.quit();
   }
	    
	

}
