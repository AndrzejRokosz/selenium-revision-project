package pl.lait.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {
	static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "/chromeDriver");
		DesiredCapabilities cap = DesiredCapabilities.chrome();

		if (driver == null) {
			driver = new ChromeDriver();
			driver.get("https://www.seleniumhq.org");
			return driver;
		} else {
			return driver;
		}
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// sleep(2);
	}

	
	
	
	
}
