package steps;

import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;
import pages.SignInPage;

public class SignInSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	SignInPage signInPage;
	
	@Step
	public void clickForgot() {
		signInPage.clickForgot();
	}
}
