package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class SoftAssertion {
	
	public void SoftAssertion() {
		SoftAssert Soft = new SoftAssert();
		
		System.out.println("Excution is started");
		
		Soft.assertEquals("Welcome", "Welcome");
		
		Soft.assertEquals(true, true);
		
		System.out.println("Excution completed");
		
		System.out.println("Hello");
		
		Soft.assertAll();
	}
	


		
	
		
		
		
}


