package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class base1 {

	@Test

	public void webApp() {
		System.out.println("print webapp");
	}

	@Test(groups={"smoke"})
	public void mobileApp() {
		System.out.println("print mobile");
	}

	@Test
	public void UIApp() {
		System.out.println("print ui");
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		System.out.println("i am beforefirst method of class base1");
	}

	@Test
	public void Appium() {
		System.out.println("print Appium");
	}

	@Test
	public void performance() {
		System.out.println("print performance");
	}
@AfterMethod
	
	public void aeforemethod() {
		System.out.println("i am afterfirst method of class base1");
	}

}
