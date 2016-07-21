package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;
import steps.ResetPasswordSteps;
import steps.SignInSteps;

@RunWith(SerenityRunner.class)
public class BEbayTest {
	
	@Managed(driver = "appium")
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	SignInSteps signInSteps;
	
	@Steps
	ResetPasswordSteps resetPasswordSteps;
	
	@Test
	public void testClickMenu() {
		homeSteps.clickMenuIcon();
	}
	
	@Test
	public void testWatching() {
		homeSteps.clickMenuIcon();
		homeSteps.clickWatchingButton();
	}
}
