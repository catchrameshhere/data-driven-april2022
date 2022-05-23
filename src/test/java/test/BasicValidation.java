package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{

	@Test(attributes = {
			@CustomAttribute(
					name = "TC-ID",
					values = {"ramesh-101"})
	})
	public void urlValidation() {
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();

		Reporter.log("Expected URL = " + expectedUrl);
		Reporter.log("Actual URL = " + actualUrl);

		assertTrue(actualUrl.equals(expectedUrl), "Mismatch in the URL,");
	}

	@Test
	public void titleValidation() {
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();

		Reporter.log("Expected title = " + expectedTitle);
		Reporter.log("Actual title = " + actualTitle);

		assertTrue(actualTitle.equals(expectedTitle), "Mismatch in the page title,");
	}

}
