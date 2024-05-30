package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  rahulshettyacademy
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 */		
		System.setProperty("webdriver.gecko.driver","D:\\API_testing\\workspace_cucumber\\SeleniumFrameworkDesign\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\API_testing\\workspace_cucumber\\SeleniumFrameworkDesign\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/* WebDriver driver=new ChromeDriver(); */
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("inputUsername")).sendKeys("kamal");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademyq");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.close();
		

	}

}
