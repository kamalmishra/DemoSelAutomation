package rahulshettyacademy.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtReport {
	
	ExtentReports extent;
	
	@BeforeMethod
	public void config() {
		
		String path = System.getProperty("user.dir")+"\\reports\\demo.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("web result");
		reporter.config().setDocumentTitle("testResult");
		 
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "kamal");
		
	}
	
	
	
	@Test
	
	public void initialDemo() {
		
		extent.createTest("initialDemo");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
