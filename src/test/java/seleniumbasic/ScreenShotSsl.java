package seleniumbasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;



public class ScreenShotSsl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 


		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\API_testing\\workspace_cucumber\\SeleniumFrameworkDesign\\driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 */
		WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
			//login page- verify login url
			
			
			driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\LENOVO\\Desktop\\interviewDoc\\screenshot.png"));
		
		
	}

}
