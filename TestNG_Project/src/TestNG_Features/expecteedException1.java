package TestNG_Features;

import org.testng.annotations.Test;

public class expecteedException1 {
	@Test(expectedExceptions = Exception.class)
	public void LoginTest() {
		
		System.out.println("Hello");
		try {
			int number= 10/0;
		}catch(ArithmeticException e) {
			
		}
		int number= 10/0;
		
		
	}

}
