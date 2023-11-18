package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	LoginPage loginPage;

	@Given("User is on techfios login page")
	public void user_is_on_techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {

		loginPage.enterPassword(password);
	}

	@When("User clicks on signin button")
	public void userClicksOnSigninButton() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void userShouldLandOnDashboardPage() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("we are on dashboardPage", expectedTitle, actualTitle);

	}

	@Then("User clicks on bankcash button")
	public void user_clicks_on_bankcash_button() {
	    loginPage.clickBankAndCash();
	}

	@Then("User clicks on newaccount button")
	public void userClicksOnNewAccountButton() {
       loginPage.clicknewAccount();
	}

	@Then("User enters accounttitle as {string}")
	public void user_enters_accounttitle_as(String accountTitle) {
	   loginPage.enteraccountTitle(accountTitle);
	}

	@Then("User enters description as {string}")
	public void user_enters_discription_as(String discription) {
        loginPage.enterdiscription(discription);
	}

	@Then("User enters initialbalance as {string}")
	public void user_enters_initialbalance_as(String initialBalance) {
		loginPage.enterInitialBalance(initialBalance);
	    	}

	@Then("User enters accountnumber as {string}")
	public void user_enters_accountnumber_as (String accountNumber) {
        loginPage.enterAccountNumber(accountNumber);
	}

	@Then("User enters contactperson as {string}")
	public void user_enters_contactperson_as (String contactPerson) {
		loginPage.enterContactPerson(contactPerson);
	   	}

	@Then("User enters Phone as {string}")
	public void user_enters_phone_as(String phone) {
		loginPage.enterPhone(phone);
	}

	@Then("User enters internetbankingURL as{string}")
	public void user_enters_internetbankingURL_as(String url) {
		loginPage.enterInternetBankingURL(url);
	    
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		loginPage.clickOnSubmit();
	   
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		
	    
	}



	
	 
	 
}
