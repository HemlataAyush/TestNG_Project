package TestNG_Features;

import org.testng.annotations.Test;

public class timeOut1 {
	
	@Test(timeOut=10000)
	public void LoginTest() {
		for(;;) {
			System.out.println("Hello");
		}
		
	}

}
