package pages;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {
	final String appNameId = "com.ebay.mobile:id/";
	
	@FindBy(id = "action_view_icon")
	WebElement menu;
	
	@FindBy(id = "username")
	WebElement signIn;
	
	@FindBy(id = appNameId + "action_view_icon")
	WebElement shoppingBag;
	
	@FindBy(id = appNameId +"nav_watching")
	WebElement watchingButton;
	
	public void clickMenuIcon() {
		menu.click();
	}
	
	public void clickSignIn() {
		signIn.click();
	}
	
	public void clickShoppingBag() {
		shoppingBag.click();
	}
	
	public void clickWatchingButton() {
		watchingButton.click();
	}
}
