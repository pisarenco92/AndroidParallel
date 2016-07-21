package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

public class HomeSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	HomePage homePage;
	
	@Step
	public void clickMenuIcon() {
		homePage.clickMenuIcon();
	}
	
	@Step
	public void clickSignIn() {
		homePage.clickSignIn();
	}
	
	@Step
	public void clickShoppingBag() {
		homePage.clickShoppingBag();
	}
	
	@Step
	public void clickWatchingButton() {
		homePage.clickWatchingButton();
	}
}
