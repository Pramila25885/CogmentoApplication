package com.StepDefinition.calender;

import com.Pages.calender.Calender_page;
import com.baseClass.Library;
import com.loginPage.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calender_Steps extends Library {
	LoginPage lpage;
	SeleniumUtilities selUtil;
	Calender_page cal;

	@Given("To launch the Browser and Navigate to the URL")
	public void to_launch_the_Browser_and_Navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser is launched successfully and Navigated to the URL");
	}

	@When("Enter the Emailid and the Password")
	public void enter_the_Emailid_and_the_Password() {
		lpage = new LoginPage(driver);
		lpage.login(properties.getProperty("email"), properties.getProperty("password"));
		logger.info("Entered UserName and Password");
	}

	@Then("click Login button")
	public void click_Login_button() {
		lpage.submit();
		logger.info("Login Successful");
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		selUtil = new SeleniumUtilities(driver); 
		selUtil.pageVerification(properties.getProperty("expectedURLHome"));
	}

	@Given("On the homepage click the Calender button")
	public void on_the_homepage_click_the_Calender_button() {
		cal = new Calender_page(driver);
		cal.clickCalender();
		logger.info("Clicked Calender Successfully");
	}
	
	@And("verify the URL of the page")
	public void verify_the_URL_of_the_page() {
		selUtil = new SeleniumUtilities(driver);
		selUtil.pageVerification(properties.getProperty("expectedURL"));

	}

	@Then("Click the New Button")
	public void click_the_New_Button() throws InterruptedException {
		cal = new Calender_page(driver);
		cal.clickNewButton();
		logger.info("Clicked on New");
	}

	@And("verify the URL of the new calender page")
	public void verify_the_URL_of_the_new_calender_page() {
		selUtil = new SeleniumUtilities(driver);
		selUtil.pageVerification(properties.getProperty("expectedURLNew"));
	}

	@Then("Enter the Titletext")
	public void enter_the_Titletext() throws InterruptedException {
		cal.title(properties.getProperty("title"));
		logger.info("Title updated");
	}

	@And("click calender option")
	public void click_calender_option() {
		cal = new Calender_page(driver);
		cal.clickCalenderTextBox();
		logger.info("Calender Clicked");
	}

	@Then("select any calender option")
	public void select_any_calender_option() throws InterruptedException {
		selUtil.waittime(2000);
		cal.selectCalenderoption(properties.getProperty("optionText"));
		logger.info("Calender option selected");
	}


	@Then("click on category")
	public void click_on_category() throws InterruptedException {
		cal.clickonCategory();
		logger.info("Clicked on category");
	}

	@Then("select an option")
	public void select_an_option() throws InterruptedException {
		cal.selectCategory(properties.getProperty("categoryOptionText"));
		logger.info("Selected category option");
	}

	@Then("click on tag field")
	public void click_on_tag_field() {
	    cal.clicktagbox();
	}

	@Then("enter tag")
	public void enter_tag() {
	    cal.entertags(properties.getProperty("tagtext"));
	}

	@Then("select tagoption")
	public void select_tagoption() {
	    cal.selectTags(properties.getProperty("tagoption"));
	}
	

	@Then("add Description")
	public void add_Description() {
	    cal.enterDescription(properties.getProperty("Description"));
		
	}
	@Then("add location")
	public void add_location() {
	    cal.enterlocation(properties.getProperty("Location"));
	}

	@Then("check allDay button is displayed")
	public void check_allDay_button_is_displayed() {
	    cal.allDayBtnDisplayed();
	}

	@Then("check allDay Button is enabled")
	public void check_allDay_Button_is_enabled() {
	    cal.allDayBtnEnabled();
	    
	}
	@Then("click on AllDayButton")
	public void click_on_AllDayButton() {
	    cal.clickonAlldayBtn();
	}

	@Then("click on task field")
	public void click_on_task_field() {
	    cal.clickOnTask();
	}

	@Then("enter task")
	public void enter_task() {
	    cal.enterontask(properties.getProperty("tasktext"));
	}
	
	@Then("select taskoption")
	public void select_taskoption() {
	    cal.selecttaskoption(properties.getProperty("taskoption"));
	}
	@Then("click on Deals field")
	public void click_on_Deals_field() {
	    cal.clickOndeals();
	}

	@Then("enter Deals")
	public void enter_Deals() {
      cal.enterondeals(properties.getProperty("dealtext"));
	}

	@Then("select Dealsoption")
	public void select_Dealsoption() {
	    cal.selectDealoption(properties.getProperty("dealoption"));
	}

	@Then("click on Case field")
	public void click_on_Case_field() {
	    cal.clickOnCase();
	}

	@Then("enter Case")
	public void enter_Case() {
	    cal.enteronCase(properties.getProperty("casetext"));
	}

	@Then("select Caseoption")
	public void select_Caseoption() {
	    cal.selectCaseoption(properties.getProperty("caseoption"));
	}
	
	@Then("click on AlertBefore")
	public void click_on_AlertBefore() {
	    cal.clickonAlertBefore();
	}

	@Then("select alertBefore option")
	public void select_alertBefore_option() {
	    cal.selectAlertBefore(properties.getProperty("alertbeforeOption"));
	}

	@Then("click on AlertVia field")
	public void click_on_AlertVia_field() {
	    cal.clickOnAlertvia();
	}

	@Then("select alertvia option")
	public void select_alertvia_option() {
	    cal.selectAlert(properties.getProperty("alertText"));
	}

	@Then("enter reminder time")
	public void enter_reminder_time() {
	    cal.enterRemindertime(properties.getProperty("remindertext"));
	}

	@Then("click on assignedTo")
	public void click_on_assignedTo() {
	    cal.enterAssigned();
	}
	@Then("click Enter")
	public void click_Enter() {
	    cal.clickonEnter();
	}

	@Then("click on participants field")
	public void click_on_participants_field() {
	    cal.clickOnparticipants();
	}

	@Then("enter participants")
	public void enter_participants() {
	    cal.enterparticipants(properties.getProperty("participanttext"));
	}

	@Then("select participants option")
	public void select_participants_option() {
	    cal.selectparticipantsoption(properties.getProperty("participantoption"));
	}

	@Then("click on companies field")
	public void click_on_companies_field() {
	    cal.clickOncompanies();
	}

	@Then("enter companies")
	public void enter_companies() {
	   cal.entercompanies(properties.getProperty("companiestext"));
	}

	@Then("select companies option")
	public void select_companies_option() {
	   cal.selectcompaniesoption(properties.getProperty("companiesoption"));
	}

	@Then("enter identifier")
	public void enter_identifier() {
	    cal.enterIdentifier(properties.getProperty("identifierText"));
	}

	@Then("click on save")
	public void click_on_save() {
	    cal.Clicksave();
	}
	
	@Then("Click on Calender again")
	public void click_on_Calender_again() {
	    cal.clickOnCalenderAgain();
	}

	@Then("click on Agenda")
	public void click_on_Agenda() {
	    cal.clickOnAgenda();
	}
	@Then("check if new meeting is listed in Agenda table")
	public void check_if_new_meeting_is_listed_in_Agenda_table() {
	    cal.checkdatainTable();
	}



	
}
