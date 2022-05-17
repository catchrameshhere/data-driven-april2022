package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	private WebDriver driver;

	public void setupBrowser(String browser, String url) {

		String currDir = System.getProperty("user.dir");
		String fs = System.getProperty("file.separator");
		String path = currDir + fs + "drivers" + fs;

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");		
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");		
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", path + "msedgedriver.exe");		
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Valid browser is not provided, hence quitting the automation run");
			System.exit(0);
		}
		
		if(url != "")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public WebDriver getDriverObject() {
		return driver;
	}
	
	public void closeTab() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}













