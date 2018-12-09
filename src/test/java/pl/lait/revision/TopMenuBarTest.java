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
		Init.printScr(driver, "TopMenuTest", testName);
		linkClick("About");
		Init.printScr(driver, "TopMenuTest", testName);
		// Init.printScr(driver);
		driver.quit();
	}

	@Test
	public void topMenu2() {
		WebDriver driver = Init.getDriver();
		String title1=driver.getTitle();
		System.out.println(title1);
		
		
	driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertTrue("Page title is wrong", title.equals("Getting Help"));
	
		driver.quit();
	}

}