package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseDriver.driverSetup;
import pageObjects.PO_01_Homepage;

public class TC_01_CreateAccount extends driverSetup {

	public static String baseurl="http://automationpractice.com/index.php";
	
	
	@Test
	public static void createAcc() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(1000);
		
		PO_01_Homepage home = new PO_01_Homepage(driver);
		home.clickSingnIn();
		Thread.sleep(1000);
		home.sendEmail();
		Thread.sleep(1000);
		home.clickCrtAccBtn();
		Thread.sleep(1000);
	}
	
	
}
