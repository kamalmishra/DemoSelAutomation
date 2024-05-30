package testNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class base3 {
	
@BeforeTest

public void befoeTest() {
	System.out.println("i am first test");	
	}	
@Test(groups={"smoke"})
	
	public void trafficCity() {
	System.out.println("print Citytraffic");	
	}

@Parameters({"URL"})


@Test

public void trafficPune(String urlname) {
System.out.println("print Punetraffic");
System.out.println(urlname);
}
 @AfterTest
public void afterTest() {
System.out.println("i am after test ");	
}

@Test

public void trafficmumbai() {
System.out.println("print mumbaitraffic");	
}

@org.testng.annotations.AfterSuite
public void AfterSuite() {
System.out.println("i am last number");	
}

}
