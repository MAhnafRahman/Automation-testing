package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_01_Homepage {

	WebDriver driver=null;
	public PO_01_Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By signin = By.xpath("//a[contains(text(),'Sign in')]");
	By putEmail = By.xpath("//input[@id='email_create']");
	By crtAccBtn = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	
	public void clickSingnIn() {
		
		driver.findElement(signin).click();
		
	}
	
public void sendEmail() {
		
		driver.findElement(putEmail).sendKeys("hi@tester.com");
		
	}

public void clickCrtAccBtn() {
	
	driver.findElement(crtAccBtn).click();
	
}

}
