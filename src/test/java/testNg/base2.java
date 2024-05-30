package testNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class base2 {

	@Test

	public void personalloan() {
		System.out.println("print personalloan");
	}

	@Test

	public void homeloan() {
		System.out.println("print homeloan");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("i am first no from begning");
	}
	@Test(groups={"smoke"})

	public void carloan() {
		System.out.println("print carloan");
	}

	@Test

	public void bikeloan() {
		System.out.println("print bikeloan");
	}

}
