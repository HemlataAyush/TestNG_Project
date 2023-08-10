package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	@BeforeClass
	 
	public void openBrowser() {
		Reporter.log("open Browser",true);
	}
	@BeforeMethodxxxx
	public void loginToApp() {
		Reporter.log("Login to application",true);
	}
	@Test
	public void varifyPN() {
		Reporter.log("running TC1",true);
		
	}
	@Test
	public void VarifyPN() {
		Reporter.log("running TC2",true);
	}
	@AfterMethod
	public void logoutfromapp() {
		Reporter.log("logout from application",true);
		
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser",true);
	}
	
		
	
	
	

}
