package pl.lait.revision;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

}
