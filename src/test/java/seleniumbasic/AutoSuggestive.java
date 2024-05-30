package seleniumbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//li[class='ui-menu-item'] a
		
		//System.setProperty("webdriver.gecko.driver","D:\\API_testing\\workspace_cucumber\\SeleniumFrameworkDesign\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				
				option.click();
				break;
			}
		}


	}

}
