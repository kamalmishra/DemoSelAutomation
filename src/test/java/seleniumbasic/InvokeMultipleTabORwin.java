package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeMultipleTabORwin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// invoking multiple win
		// driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> it = winhandles.iterator();
		String parentWin = it.next();
		String chieldWin = it.next();
		driver.switchTo().window(chieldWin);
		driver.get("https://rahulshettyacademy.com/");
		String course = driver
				.findElement(By.xpath("//a[contains(text(),'Core java for Automation Testers + Interview Progr')]"))
				.getText();
		driver.switchTo().window(parentWin);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(course);
		// taking screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));

		// height and wedth

		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		driver.quit();

	}

}
