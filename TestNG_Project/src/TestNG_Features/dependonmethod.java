package TestNG_Features;

import org.testng.annotations.Test;

public class dependonmethod {
	@Test
	public void LoginTest() {
		System.out.println("LoginTest");
		
		
	}
	@Test(dependsOnMethods="LoginTest")
	public void Homepage() {
		System.out.println("Homepage");
	}
	@Test(dependsOnMethods="LoginTest")
	public void Searchpage() {
		System.out.println("Searchpage");
	}
	@Test
	public void Refreshpage() {
		System.out.println("Refreshpage");
	}
	

}


