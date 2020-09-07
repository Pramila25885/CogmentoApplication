package com.Pages.calender;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class Calender_page extends Library {
	SeleniumUtilities selutil;
	Actions action;

	@FindBy(xpath = "//*[text()='Calendar']")
	WebElement calender;

	@FindBy(xpath = "//*[text()='New']")
	WebElement newbutton;

	@FindBy(xpath = "//*[@name='title']")
	WebElement titleText;

	@FindBy(xpath = "//*[@name='calendar']//following::div[contains(@class,'item') and @role='option'][1]/span")
	List<WebElement> calenderOptions;

	@FindBy(xpath = "//div[@name='calendar']")
	WebElement calenderText;

	@FindBy(xpath = "//div[@name='category']")
	WebElement categorybox;

	@FindBy(xpath = "//div[@name='category']//following::div[contains(@class,'item')]/span")
	List<WebElement> categoryOptions;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")
	WebElement tagsBox;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div//following::div[1]/span")
	List<WebElement> tags;

	// desription
	@FindBy(xpath = "//*[@name='description']")
	WebElement description;

	// location
	@FindBy(xpath = "//*[@name='location']")
	WebElement location;

	// Allday
	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div/div/label")
	WebElement allday;
	// AllDayBtn
	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div/div/label")
	WebElement alldayBtn;
	// taskbox
	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input")
	WebElement taskbox;
	// task option
	@FindBy(xpath = "//div[@name='task']//following::div[1]/span")
	List<WebElement> tasklist1;

	// deals

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div/input")
	WebElement dealsbox;
	@FindBy(xpath = "//div[@name='deal']//following::div[1]/span")
	List<WebElement> deallist1;

	// case
	@FindBy(xpath = "//div[@name='case']/input")
	WebElement casebox;

	@FindBy(xpath = "//div[@name='case']//following::div[1]/span")
	List<WebElement> Caselist1;

	//Alert before
	@FindBy(xpath="//div[@name='minutesBefore']")
	WebElement alertBefore;
	@FindBy(xpath="//div[@name='minutesBefore']//following::div[1]/span")
	List<WebElement> alertbeforelist1;
	
	
	// Alert via

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/div[2]/div/a/i")
	WebElement closeDesktop;
	@FindBy(xpath = "//div[@name='channels']")
	WebElement AlertViabox;

	@FindBy(xpath = "//div[@name='channels']//following::div[1]/span")
	List<WebElement> alertVia;

	// reminder time
	@FindBy(xpath = "//*[@name='reminder_minutes']")
	WebElement reminder;
	//Assigned to
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div")
	WebElement Assignedto;
	
	//participants
	@FindBy(xpath="//div[@name='participants']/input")
	WebElement participantsbox;
	@FindBy(xpath="//div[@name='participants']//following::div[1]/span")
	List<WebElement> participantlist1;
	
	//companies
	@FindBy(xpath="//div[@name='company']/input")
	WebElement companies;
	
	@FindBy(xpath="//div[@name='company']//following::div[1]/span")
	List<WebElement> companieslist1;
	
	//identifier
	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifier;
	
	//save
	@FindBy(xpath="//*[text()='Save']")
	WebElement save;
	
	
	
	//Agenda
	@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/span[3]/button[4]/span")
	WebElement agenda;
	
	
	// Constructor
	public Calender_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCalender() {
		calender.click();
	}

	public void clickNewButton() throws InterruptedException {
		newbutton.click();
	}

	// title
	public void title(String title) {
		titleText.sendKeys(title);
	}

	// calender option
	public void clickCalenderTextBox() {
		calenderText.click();
	}

	public void selectCalenderoption(String optionText) {
		for (WebElement listoptions : calenderOptions) {
			if (listoptions.getText().equalsIgnoreCase(optionText)) {
				listoptions.click();
			}
		}
	}

	// category
	public void clickonCategory() throws InterruptedException {
		categorybox.click();
		selutil = new SeleniumUtilities(driver);
		selutil.waittime(2000);
	}

	public void selectCategory(String categoryOptionText) {
		for (WebElement listoptions1 : categoryOptions) {
			if (listoptions1.getText().equalsIgnoreCase(categoryOptionText)) {
				listoptions1.click();
			}
		}

	}

// tags
	public void clicktagbox() {
		tagsBox.click();

	}

	public void entertags(String tagtext) {
		tagsBox.sendKeys(tagtext);

	}

	public void selectTags(String tagoption) {
		for (WebElement tagslist : tags) {
			if (tagslist.getText().equalsIgnoreCase(tagoption)) {
				tagslist.click();
			}
		}

	}

//Description
	public void enterDescription(String Description) {
		description.sendKeys(Description);
	}

	// location
	public void enterlocation(String Location) {
		location.sendKeys(Location);
	}

//All day Btn
	public void allDayBtnDisplayed() {
		selutil.isDisplayed(allday);
	}

	public void allDayBtnEnabled() {
		selutil.isEnabled(allday);
	}

	public void clickonAlldayBtn() {
		alldayBtn.click();
	}

	// Task
	public void clickOnTask() {
		taskbox.click();
	}

	public void enterontask(String tasktext) {
		taskbox.sendKeys(tasktext);
	}

	public void selecttaskoption(String taskoption) {
		for (WebElement tasklist : tasklist1) {
			if (tasklist.getText().equalsIgnoreCase(taskoption)) {
				tasklist.click();
			}
		}

	}

	// deals
	public void clickOndeals() {
		dealsbox.click();
	}

	public void enterondeals(String dealtext) {
		dealsbox.sendKeys(dealtext);
	}

	public void selectDealoption(String dealoption) {
		for (WebElement deallist : deallist1) {
			if (deallist.getText().equalsIgnoreCase(dealoption)) {
				deallist.click();
			}
		}

	}
	// case

	public void clickOnCase() {
		casebox.click();
	}

	public void enteronCase(String casetext) {
		casebox.sendKeys(casetext);
	}

	public void selectCaseoption(String caseoption) {
		for (WebElement Caselist : Caselist1) {
			if (Caselist.getText().equalsIgnoreCase(caseoption)) {
				Caselist.click();
			}
		}

	}

	//Alert before
	public void clickonAlertBefore() {
		alertBefore.click();
	}
	public void selectAlertBefore(String alertbeforeOption) {
		for (WebElement alertbeforelist : alertbeforelist1) {
			if (alertbeforelist.getText().equalsIgnoreCase(alertbeforeOption)) {
				alertbeforelist.click();
			}
		}
	}
		
	public void clickOnAlertvia() {
		// deletes desktop first
		closeDesktop.click();
		// Then click that box
		AlertViabox.click();
	}

	public void selectAlert(String alertText) {
		for (WebElement alertVia1 : alertVia) {
			if (alertVia1.getText().equalsIgnoreCase(alertText)) {
				alertVia1.click();
			}
		}
	}

//reminder time
	public void enterRemindertime(String remindertext) {
		reminder.sendKeys(remindertext);
	}

	//Assigned To
	public void enterAssigned() {
		Assignedto.click();
		
	}
	public void clickonEnter() {
		selutil = new SeleniumUtilities(driver);
		selutil.sendkeysEnter();
	}
	
	// participants

		public void clickOnparticipants() {
			participantsbox.click();
		}

		public void enterparticipants(String participanttext) {
			participantsbox.sendKeys(participanttext);
		}

		public void selectparticipantsoption(String participantoption) {
			for (WebElement participantlist : participantlist1) {
				if (participantlist.getText().equalsIgnoreCase(participantoption)) {
					participantlist.click();
				}
			}

		}
		// companies

				public void clickOncompanies() {
					companies.click();
				}

				public void entercompanies(String companiestext) {
					companies.sendKeys(companiestext);
				}

				public void selectcompaniesoption(String companiesoption) {
					for (WebElement companieslist : companieslist1) {
						if (companieslist.getText().equalsIgnoreCase(companiesoption)) {
							companieslist.click();
						}
					}

				}
		public void enterIdentifier(String identifierText) {
			identifier.sendKeys(identifierText);
		}
		
		public void Clicksave() {
			save.click();
		}
			
		public void clickOnCalenderAgain() {
			selutil.navigatetoCurrentURL();
			calender.click();
		}
		
		public void clickOnAgenda() {
			agenda.click();
		}
	
}
