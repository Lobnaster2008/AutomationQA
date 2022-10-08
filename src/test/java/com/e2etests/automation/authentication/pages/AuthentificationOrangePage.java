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
	@FindBy(how = How.XPATH, using = "//*[alt=\"profile picture\"]") 
	public static WebElement iconUser;
	@FindBy(how = How.LINK_TEXT, using = "Logout") 
	public static WebElement btnlogout;
	
	/* @FindBy Related To Add User*/
	@FindBy(how = How.LINK_TEXT, using = "web/index.php/admin/viewAdminModule") 
	public static WebElement btnAdmin;
	@FindBy(how = How.LINK_TEXT, using = " Add ") 
	public static WebElement btnAdd;
	@FindBy(how = How.LINK_TEXT, using = "web/index.php/admin/viewAdminModule") 
	public static WebElement newUserName;
	@FindBy(how = How.LINK_TEXT, using = " Add ") 
	public static WebElement newPassword;
	@FindBy(how = How.LINK_TEXT, using = "web/index.php/admin/viewAdminModule") 
	public static WebElement confirmPassword;
	@FindBy(how = How.LINK_TEXT, using = "ESS") 
	public static WebElement userRole;
	@FindBy(how = How.LINK_TEXT, using = "Enabled") 
	public static WebElement status;
	@FindBy(how = How.XPATH, using = "//*[placeholder=\"Type for hints...\"]") 
	public static WebElement employeeName;
	
	/**/
	public AuthentificationOrangePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.orange"));
	}
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void clickOnBtnLogin() {
		btnlogin.click();
	}
	public Boolean loginSuccess() {
		return (Setup.getDriver().getPageSource().contains("user"));
	}
	
	public void selectStatus(String statusValue) {
		
	}
	public void selectEmployeeName(String empName) {
		
	}
}
