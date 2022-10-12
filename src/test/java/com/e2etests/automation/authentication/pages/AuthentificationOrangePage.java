package com.e2etests.automation.authentication.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationOrangePage {
	
	private ConfigFileReader configFileReader;
	/* @FindBy Related To Page Home*/
	@FindBy(how = How.NAME, using = "username") 
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password") 
	public static WebElement password;
	@FindBy(how = How.XPATH, using = "//form[@action ='/web/index.php/auth/validate']/div/button")
	public static WebElement btnlogin;
	
	/* @FindBy Related To Page Home*/
	@FindBy(how = How.XPATH, using = "//img[@alt='profile picture']") 
	public static WebElement iconUser;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]") 
	public static WebElement btnlogout;
	
	/* @FindBy Related To Add User*/
	
	@FindBy(how = How.XPATH, using = "//button[contain(text(),'ADD')]") 
	public static WebElement btnAdd;
	@FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]") 
	public static WebElement newUserName;
	@FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]") 
	public static WebElement newPassword;
	@FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]") 
	public static WebElement confirmPassword;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'ESS')]") 
	public static WebElement userRole;
	@FindBy(how = How.XPATH, using = "//button[contain(text(),'Enabled')]") 
	public static WebElement status;
	@FindBy(how = How.XPATH, using = "//*[placeholder=\"Type for hints...\"]") 
	public static WebElement employeeName;
	@FindBy(how = How.XPATH, using = "//button[contain(text(),'Admin')]") 
	public static WebElement btnAdmin;
	@FindBy(how = How.XPATH, using = "//button[contain(text(),'Save')]") 
	public static WebElement btnsave;
	/**/
	public AuthentificationOrangePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.orange"));
	}
	public void fillText(String name , WebElement e) {
		e.sendKeys(name);
	}
	
	
	public void clickOnButton(WebElement e) {
		e.click();
	}
	public Boolean loginSuccess() {
		return (Setup.getDriver().getPageSource().contains(configFileReader.getProperties("user")));
	}
	
	public Boolean addDone() {
		return (Setup.getDriver().getPageSource().contains("Adam"));
	}
	public String homeUrl() {
		return configFileReader.getProperties("home.orange");
	}
	
}
