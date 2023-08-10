package Dataprovider;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;



public class SecondProgram2 {
	  
      WebDriver driver;	
      @BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver chrom driver","\"C:\\chromedriver.exe\"");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
      }
      @Test(dataProvider = "loginData")
      public void LoginTest(String Uname,String Pword, String Expected) {
		 driver.get("https://admin-demo.nopcommerce.com/login");
		 WebElement Username1 = driver.findElement(By.id("Email"));
		 Username1.clear();
		 Username1.sendKeys(Uname);
		 WebElement Password = driver.findElement(By.id("Password"));
		 Password.clear();
		 Password.sendKeys(Pword);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 
		 String Act_Title = driver.getTitle();
		 String Exp_Title = "Dashboard/ nopCmmerce administration";
		 if(Expected.equals("Valid"))
		 if(Exp_Title.equals("Valid")) {
			 driver.findElement(By.linkText("Logout")).click();
			 Assert.assertTrue(true);
		 }
		 else{
			
			 Assert.assertTrue(false);  //failed
		 }
		 else if(Expected.equals("Invalid")) {
			 driver.findElement(By.linkText("Logout")).click();
			 Assert.assertTrue(false);
		 }
		 else {
			 Assert.assertTrue(true);   //pass
		 }
		 driver.quit();
		 
	}
	
	@DataProvider(name = "loginData")
	public String[][] GetData() {
		
		String LoginData[][]= {{" admin@yourstore.com","admin","Valid"},
				               {" admin@yourstore.com","adm","INValid"},
				               {" admin@yoursto.com","admin","INValid"},
				               {" admin@yourstore1.com","admin1","INValid"}
		};
		return LoginData;
	}
	
	@AfterMethod
	public void Teardown() {
		
	}
}


