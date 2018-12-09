package pl.lait.revision;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TopMenuBarTest {

	@Test
	public void topMenu() {
		String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(testName);
		WebDriver driver = Init.getDriver();
		Init.printScr(driver, "TopMenuTest", testName);
		driver.findElement(By.linkText("About")).click();
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