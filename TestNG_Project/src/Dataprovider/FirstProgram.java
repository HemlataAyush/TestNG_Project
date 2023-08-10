package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FirstProgram{
	
	WebDriver driver;
	@Test(dataProvider ="Logindata")
	public void LoginTest(String Uname,String PWD){
		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\"");
		
		
		
		
		
		
		
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     WebElement Username1 = driver.findElement(By.name("username"));
	     Username1.sendKeys(Uname);
	     WebElement Passwords=driver.findElement(By.name("password"));
	     Passwords.sendKeys(PWD);
	     String Exp_Name="JohnNguyen HaralambieAn";
	     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	     boolean Test = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed();
	     Assert.assertTrue(Test);
	     driver.quit();
	}
	@DataProvider (name ="Logindata")
	public Object [][] LoginData(){
		Object data [] [] =new Object[5][2];
		
		data[0][0]="Admin";
		data[1][0]="admin1234";
		
		data[1][0]="Admin1";
		data[1][1]="admin123";
		
		data[2][0]="Admin2";
		data[2][1]="admin123";
		
		data[3][0]="Admin";
		data[3][1]="admin1253";
		
		data[4][0]="Admin4";
		data[0][1]="admin123";
		
		
		
		
		
		
		
		return data;
		
	}

	
	

}
