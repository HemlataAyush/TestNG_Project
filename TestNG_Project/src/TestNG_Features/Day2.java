package TestNG_Features;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups="regression")
	public void Test1() {
		System.out.println("Hello");
	}
	@Test(groups= {"smoke"})
	public void Test2() {
		System.out.println("Day2---Test2");
	}
	@Test(groups= {"smoke"})
	public void Test3() {
		System.out.println("Day2----Test3");
	}

}
