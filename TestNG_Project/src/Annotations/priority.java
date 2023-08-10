package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
  
	@Test
	public void TC1() {
		Reporter.log("running TC1",true);
		
	}
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);
	}
}
