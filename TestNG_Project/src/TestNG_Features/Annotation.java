package TestNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	//Execution sequence of annotations
	//Beforesuite ---- setup Systemproperty
	//beforetest ---- enter url
	//before class ---- launchbrowser
	//beforemethod--- login application
	//test---- google title1
	
	//aftermethod ----logoutfrom application
	//before method --- login application
	//test ---googletitle 1
	
	//aftermethod ----logoutfrom application
	//before method -- login application
	//test ---- googleTitle2
	
	//AfterMethod--- logoutfrom application
	//AfterClass ---close browser
	//AfterTest----Deletecookies
	
	//precondition annotations 
	//@Beforesuit --setup System pro
	//in real time project we dont need all annotations we use only 
	//beforeclass,beforemethod,test,aftermethod ,afterclass
	
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuit---setup systemproperty");
	}
	@BeforeTest
	public void URL() {
		System.out.println("@BeforeTest----Enter URL");
	}
	@BeforeClass
	public void Launchbrowser() {
			System.out.println("@Beforeclass---Launchbrowser");
		
	}
	@BeforeMethod()
		public void Login() {
		System.out.println("@Beforemethod--Login application");
		
	}
	@Test()
	public void GoogleTitle1() {
		System.out.println("@test--GoogleTitle1");
	}
	//postcondition annotation 
	//5 .Aftersuit
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod ----logoutfromapplication");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("@AfterClass---close browser");
		
	}
	@AfterTest
	public void deletecookies() {
		
		System.out.println("@AfterTest---Logout");
		
	}
     public void logout1() {
    	 System.out.println("Aftersuite----logout1");
     }
     @Test
     public void googleTitle3() {
    	 System.out.println("@Test ----googleTitle3");
     }
  

}
