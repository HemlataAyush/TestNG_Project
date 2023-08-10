package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount{
	
	@Test(invocationCount=6)
	public void TC1() {
		Reporter.log("running TC1",true);
		
	}

}
