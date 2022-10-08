package com.e2etests.automation.registration.pages;



//import org.openqa.selenium.JavascriptExecutor;

//import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegistrationPage {

	private ConfigFileReader configFileReader;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement linkRegister;
	@FindBy(how = How.XPATH, using = "//*input[@name='firstName']")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address")
	public static WebElement address;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.NAME, using = "province")
	public static WebElement province;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmitRegistration;
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Note: Your user name is')]")
	public static WebElement messageRegistration;
	


	public RegistrationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void clickOnRegistrationLink() throws InterruptedException  {
		linkRegister.click();
		/*((JavascriptExecutor) Setup.driver).executeScript("argument[0].remove()", Setup.driver.switchTo().frame(0));
		Setup.driver.switchTo().parentFrame();*/
		Setup.getDriver().switchTo().defaultContent();
		Thread.sleep(3000);
	}

	public void clickOnsubmitRegistration() {
		
		btnsubmitRegistration.click();
	}

	public void fillFirstName(String name) throws InterruptedException {
		/**Setup.driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(30));
		firstName = wait.until(ExpectedConditions.visibilityOf(firstName));**/
		
		firstName.sendKeys(name);
		Thread.sleep(3000);
	}

	public void fillUserName(String name) throws InterruptedException {
		Thread.sleep(3000);
		userName.sendKeys(name);
	}

	public void fillLastName(String name) throws InterruptedException {
		Thread.sleep(3000);
		lastName.sendKeys(name);
	}

	public void fillAddress(String addressValue) throws InterruptedException {
		Thread.sleep(3000);
		address.sendKeys(addressValue);
	}

	public void fillCity(String cityAddress) throws InterruptedException {
		Thread.sleep(3000);
		city.sendKeys(cityAddress);
	}

	public void selectCountry(String countryText) throws InterruptedException {
		Select select = new Select(country);
		select.selectByValue(countryText);
		Thread.sleep(3000);
	}

	public void fillEmail(String emailValue) {
		email.sendKeys(emailValue);
	}

	public void fillPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void fillConfirmPassword(String passwordValue) {
		confirmPassword.sendKeys(passwordValue);
	}

	public void fillPhone(String phoneValue) {
		phone.sendKeys(phoneValue);
	}

	public void fillPostalCode(String postaleCodeValue) {
		postalCode.sendKeys(postaleCodeValue);
	}

	public void fillProvince(String provinceValue) {
		province.sendKeys(provinceValue);
	}

}
