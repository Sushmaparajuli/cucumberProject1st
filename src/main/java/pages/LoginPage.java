package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	public WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	public WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	public WebElement SignInButton;
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/a")
	public WebElement BankAndCash;
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	public WebElement newAccount;
	@FindBy(how = How.XPATH,using = "//*[@id=\"account\"]")
	public WebElement AccountTitle;
	@FindBy(how = How.XPATH,using = "//*[@id=\"description\"]")
	public WebElement Discription;
	@FindBy(how = How.XPATH,using = "//*[@id=\"balance\"]")
	public WebElement InitialBalance;
	@FindBy(how = How.XPATH,using = "//*[@id=\"account_number\"]")
	public WebElement AccountNumber;
	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_person\"]")
	public WebElement ContactPerson;
	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_phone\"]")
	public WebElement Phone;
	@FindBy(how = How.XPATH,using = "//*[@id=\"ib_url\"]")
	public WebElement Url;
	@FindBy(how = How.XPATH,using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	public WebElement Submit;
	
	
	
	// Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickBankAndCash() {
		BankAndCash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clicknewAccount() {
		newAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enteraccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterdiscription(String discription) {
		Discription.sendKeys(discription);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterPhone(String phone) {
		Phone.sendKeys(phone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}public void enterInternetBankingURL(String url) {
		Url.sendKeys(url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickOnSubmit() {
		Submit.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
