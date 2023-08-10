package Parametarization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum2 {
	
	@Parameters({"a","b"})
	@Test
	public void Sub(int a,int b) {
		
		int Sub=a-b;
		System.out.println("Sum of two number--->"+Sub);
	}

}
