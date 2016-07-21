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
public class AEbayTest {
	@Managed(driver = "appium")
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	SignInSteps signInSteps;
	
	@Steps
	ResetPasswordSteps resetPasswordSteps;
	
	@Test
	public void forgotPassword() {
		homeSteps.clickMenuIcon();
		homeSteps.clickSignIn();
		signInSteps.clickForgot();
	}
	
	@Test
	public void enterEmailForgotPassword() {
		homeSteps.clickMenuIcon();
		homeSteps.clickSignIn();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("happy@gmail.com");
	}
	
	@Test
	public void test11111() {
		homeSteps.clickMenuIcon();
		homeSteps.clickSignIn();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("happy@gmail.com");
	}
	
	@Test
	public void test22222() {
		homeSteps.clickMenuIcon();
		homeSteps.clickSignIn();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("happy@gmail.com");	}
	
	@Test
	public void test333333() {
		homeSteps.clickMenuIcon();
		homeSteps.clickSignIn();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("happy@gmail.com");	}
}
