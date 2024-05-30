package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class base5 {
	
	/*
	 * @Parameters({"URL","UserName","Pass"})
	 * 
	 * @Test
	 * 
	 * public void webApp(String urlname,String UserName,String Pass) {
	 * System.out.println("print webapp"); System.out.println(urlname);
	 * System.out.println(UserName); System.out.println(Pass); }
	 */
@AfterMethod
	
	public void aftermethod1() {
		System.out.println("i am afterfirst method of class base5");
	}

@BeforeMethod

public void beforemethod1() {
	System.out.println("i am beforefirst method of class base5");
}

@org.testng.annotations.BeforeClass

public void BeforeClass() {
	System.out.println("executingbefore class base5");	
	}

@org.testng.annotations.AfterClass

public void AfterClass() {
	System.out.println("executing after class base5");	
	}
	@Test
	public void mobileApp() {
		System.out.println("print mobile base-5");
	}
	
	@BeforeTest

	public void befoeTest() {
		System.out.println("i am before test  base-5");	
		}	
	
	@org.testng.annotations.AfterTest

	public void AfterTest() {
		System.out.println("i am after test  base-5");
		}	

	@Test(groups={"smoke"})
	public void UIApp() {
		System.out.println("print ui");
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("i am after suite base5");}

	@Test(dependsOnMethods= {"performance","mobileApp"})
	public void Appium() {
		System.out.println("print Appium-base-5");
	}

	@Test
	public void performance() {
		System.out.println("print performance-base-5");
		Assert.assertTrue(false);
		
	
	}
		
		
	@Test(dataProvider="getData")
	public void facebooklogin(String user,String password) {
	System.out.println("facebooklogin-base-5");
	System.out.println(user);
	System.out.println(password);
	}	
	
	@BeforeSuite
	public void beforesuite1() {
		System.out.println("i am before suite base5");
	
	}
	@DataProvider
	
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		//first set data
		data[0][0]="firstuserName";
		data[0][1]="firstpass";
		
		data[1][0]="seconduserName";
		data[1][1]="secondpass";
		
		data[2][0]="ThirduserName";
		data[2][1]="Thirdpass";
		
		return data;
		
	}

}
