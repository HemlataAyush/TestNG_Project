package TestNG_Features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority_positive {
	@Test(priority=2)
	public void  TC1() {
		Reporter.log("running C1",true);
	}
	@Test(priority=1)
	public void TC2() {
		Reporter.log("running c2",true);
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
