package pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class SignInPage extends PageObject {
	String apNameId = "com.ebay.mobile:id/";
	
	@FindBy(id = "sign_in_forgot")
	WebElement forgot;
	
	public void clickForgot() {
		forgot.click();
	}
}

