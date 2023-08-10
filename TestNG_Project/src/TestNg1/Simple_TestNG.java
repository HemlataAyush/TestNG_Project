package TestNg1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple_TestNG {
	
	@Test
	public void TC1() {
		
      Reporter.log("running TC1");
		
	}
	@Test
	public void TC2() {
		Reporter.log("running TC2");
	}
	

}
