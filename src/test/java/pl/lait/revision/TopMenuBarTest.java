package pl.lait.revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuBarTest {
	
	
	
	
	
	
	@Test
	public void topMenu() {
		WebDriver driver=Init.getDriver();
		driver.findElement(By.linkText("About")).click();
		
	}

}
