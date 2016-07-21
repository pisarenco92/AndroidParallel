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
public class EbayTest{
	
	@Managed(driver = "appium")
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	SignInSteps signInSteps;
	
	@Steps
	ResetPasswordSteps resetPasswordSteps;
	
	@Test
	public void forgotPasswordShoppingCart() {
		homeSteps.clickShoppingBag();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("iron@gmail.com");
	}
	
	@Test
	public void shoppingCartSignInTest() {
		homeSteps.clickShoppingBag();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("iron@gmail.com");
	}
	
	@Test
	public void shoppingCartSignInTest11111() {
		homeSteps.clickShoppingBag();
		signInSteps.clickForgot();
		resetPasswordSteps.enterEmail("iron@gmail.com");
	}
}
