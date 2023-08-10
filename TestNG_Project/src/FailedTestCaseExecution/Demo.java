package FailedTestCaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
     @Test
	public void Test1() {
		System.out.println("Test 1");
		
		Assert.assertEquals(true, true);//failed
	}
     
     public void Test2() {
    	 System.out.println("Test 1");
    	 Assert.assertEquals(false, true);//failed
     }
     public void Test3() {
    	 System.out.println("Test 1");
    	 Assert.assertEquals(true, true);//pass
     }
}
