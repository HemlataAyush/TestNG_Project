package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class Type1 {
	public void Demo() {
		System.out.println("Hello good morning ");
		
		Assert.assertTrue(true);
		
		System.out.println("Hello");
		
		Assert.assertEquals("Automation", "Automation");
		
		System.out.println("excution completed");
	}
	
	@Test
	public void DemoTest() {
		System.out.println("hii good morning ");
		
		Assert.assertTrue(true);
		
		Assert.assertEquals("java", "Python");
		
		System.out.println("Excution completed");
	}
	
	@Test
	public void DemoTest2() {
		System.out.println("Good morning ");
		
		Assert.assertEquals("Dipali", "Dipali");
		
		System.out.println("Excution is completed");
	}

}
