package pages;

import java.util.Set;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class ResetPasswordPage extends PageObject {
	
	@FindBy(id = "userInfo")
	WebElement emailTextField;

	public void enterEmail(String email) {
		Set<String> contextNames = ((AppiumDriver<?>) ((WebDriverFacade) getDriver()).getProxiedDriver()).getContextHandles();
		((AppiumDriver<?>) ((WebDriverFacade) getDriver()).getProxiedDriver()).context((String) contextNames.toArray()[1]);
		System.out.println(contextNames);
		emailTextField.click();
		emailTextField.sendKeys("happy@gmail.com");
		((AppiumDriver<?>) ((WebDriverFacade) getDriver()).getProxiedDriver()).context((String) contextNames.toArray()[0]);
	}
}
