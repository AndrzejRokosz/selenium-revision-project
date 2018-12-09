package pl.lait.revision;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuBarTest extends BaseWebElementSelectors {

	@Test
	public void topMenu() {
		String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
		goToMainPage();
		checkPageTitleAndStopTestIfWrong("Selenium - Web Browser Automation");
		Init.printScr(driver, "TopMenuTest", testName);
		linkClick("About");
		linkClick("Support");
		linkClick("Projects");
		findInputByName("q").sendKeys("text");
		Init.printScr(driver, "TopMenuTest", testName);
		String h2Xpath = " //*[@id=\"mainContent\"]/h2";
		String h2Text = driver.findElement(By.xpath(h2Xpath)).getText();
		if (h2Text.equals("Selenium Projects")) {
			System.out.println("znaleziono szukany text na stronie");

		} else {
			System.out.println("nie ma szukanego tekstu na stronie");
		}
		// Init.printScr(driver);
//		driver.quit();
	}

	@Test
	public void topMenu2() {
		WebDriver driver = Init.getDriver();
		String title1 = driver.getTitle();
		System.out.println(title1);

		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue("Page title is wrong", title.equals("Getting Help"));

		driver.quit();
	}

}