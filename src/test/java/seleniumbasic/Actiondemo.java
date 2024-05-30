package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		
		Actions ac=new Actions(driver);
		WebElement we=driver.findElement(By.id("nav-link-accountList"));
		
		
		ac.moveToElement(we).build().perform();
		ac.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
		.sendKeys("hellow").build().perform();
		ac.moveToElement(we).contextClick().build().perform();
		ac.moveToElement(we).doubleClick().build().perform();
		
	}

}
