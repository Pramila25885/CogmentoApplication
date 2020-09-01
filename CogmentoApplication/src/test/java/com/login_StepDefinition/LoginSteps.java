package com.login_StepDefinition;

import com.baseClass.Library;
import com.loginPage.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Library {
	LoginPage loginp;
	SeleniumUtilities selUtil;

	@Given("To Launch the browser and Navigate to the URL")
	public void to_Launch_the_browser_and_Navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser Launched and navigated to URL");
	}

	@When("Enter Email and Password")
	public void enter_Email_and_Password() {
		loginp = new LoginPage(driver);
		loginp.login(properties.getProperty("email"), properties.getProperty("password"));
	}

	@Then("Click Login Button")
	public void click_Login_Button() {
		loginp.submit();
	}

	@Then("Get the page Title and ScreenShot")
	public void get_the_page_Title_and_ScreenShot() {
		selUtil = new SeleniumUtilities(driver);
		selUtil.getTitle();
		selUtil.to_take_screenshot("src/test/resources/ScreenShots/CogmentoLogin.png");

	}
}
