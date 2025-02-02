package seleniumbasic;

import java.time.Duration;
import java.util.Arrays;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Waits {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//implicitlyWait

		/* driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); */
		
		//FluentWait
       
		/*
		 * Wait<WebDriver> wait=new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
		 * pollingEvery(Duration.ofSeconds(3)). ignoring(NoSuchElementException.class);
		 * 
		 * 
		 * WebElement foo=wait.until(new Function<WebDriver , WebElement>(){ public
		 * WebElement apply (WebDriver driver) {
		 * 
		 * if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
		 * return driver.findElement(By.cssSelector("[id='finish'] h4")); }else return
		 * null;
		 * 
		 * } });
		 * system.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());
		 */
       
       
       //Excplicit wait
		/*
		 * WebDriverWait w = new WebDriverWait(driver, 5);
		 * w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		 * "input.promoCode")));
		 */
		
		WebDriverWait w = new WebDriverWait(driver,null);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

//explicit wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

//Brocolli - 1 Kg

//Brocolli,    1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
