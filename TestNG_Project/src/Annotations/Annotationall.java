package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationall {
    @Test
	public void v1 () {
		System.setProperty("Webdriver chrome driver ", "\"C:\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
            driver.get("https://www.khanacademy.org/teacher/dashboard");
            driver.findElement(By.xpath("https://www.khanacademy.org/signup?continue=%2Fteacher%2Fdashboard")).click();
	}
	

}
