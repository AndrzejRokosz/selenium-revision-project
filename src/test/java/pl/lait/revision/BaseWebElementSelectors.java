package pl.lait.revision;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseWebElementSelectors {
	static WebDriver driver;

	public static void goToMainPage() {
		driver = Init.getDriver();

	}

	public static void linkClick(String linkText) {

		try {
			driver.findElement(By.linkText(linkText)).click();
		} catch (Exception e) {

			Init.printScr(driver);
			assertTrue("Nie ma takiego linku" + linkText, false);
		}
	}

	public static void checkPageTitleAndStopTestIfWrong(String title) {
		boolean checkStatus = driver.getTitle().equals(title);
		assertTrue("Tytul strony jest nieprawidlowy", checkStatus);
	}
	
	public static WebElement findInputByName(String name) {
		return driver.findElement(By.name(name));
	}
	
}
