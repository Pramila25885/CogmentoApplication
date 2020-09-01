$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Test the Cogmento Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the login functionality of Cogmento",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Launch the browser and Navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.loginSteps_StepDefinition.LoginSteps.to_Launch_the_browser_and_Navigate_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.loginSteps_StepDefinition.LoginSteps.enter_Email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.loginSteps_StepDefinition.LoginSteps.click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the page Title and ScreenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.loginSteps_StepDefinition.LoginSteps.get_the_page_Title_and_ScreenShot()"
});
formatter.result({
  "status": "passed"
});
});