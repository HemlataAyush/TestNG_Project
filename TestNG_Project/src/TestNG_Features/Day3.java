package TestNG_Features;

import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void Test1() {
		System.out.println("Hello");
		
	}
	@Test(groups= {"smoke"})
	
	public void Test4() {
		System.out.println("Day3--Test4");
	}

}
