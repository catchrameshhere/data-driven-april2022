package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.Common;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BaseTest {

	String url = "https://www.facebook.com";
	Common common;
	static WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser) {
		System.out.println("Browser used = " + browser );
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriverObject();
	}

	@AfterTest
	public void afterTest() {
		common.quitBrowser();
	}

}
