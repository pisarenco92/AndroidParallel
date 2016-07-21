package steps;

import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;
import pages.ResetPasswordPage;

public class ResetPasswordSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	ResetPasswordPage resetPasswordPage;
	
	@Step
	public void enterEmail(String email) {
		resetPasswordPage.enterEmail(email);;
	}
	

}
