package seleniumbasic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowActivities {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"D:\\API_testing\\workspace_cucumber\\SeleniumFrameworkDesign\\geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver","D:\\API_testing\\workspace_cucumber\\SeleniumFrameworkDesign\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();

	}

}
