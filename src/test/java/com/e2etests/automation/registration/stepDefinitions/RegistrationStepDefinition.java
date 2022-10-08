package com.e2etests.automation.registration.stepDefinitions;

import org.junit.Assert;

import com.e2etests.automation.registration.pages.RegistrationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinition {
	
	private RegistrationPage registrationPage;
	public RegistrationStepDefinition() {
		registrationPage = new RegistrationPage();
	}
	
	@When("Je clique sur le lien register")
	public void jeClickSurLeLienRegister() throws InterruptedException {
		registrationPage.clickOnRegistrationLink();
	    
	}
	@When("Je saisie le firstname {string}")
	public void jeSaisieLeFirstname(String string) throws InterruptedException {
		registrationPage.fillFirstName(string);
	}
	@When("Je saisie lastname {string}")
	public void jeSaisieLastname(String string) throws InterruptedException {
		registrationPage.fillLastName(string);
	}
	@When("Je saisie phone {string}")
	public void jeSaisiePhone(String string) {
		registrationPage.fillPhone(string);
	}
	@When("Je saisie email {string}")
	public void jeSaisieEmail(String string) {
		registrationPage.fillEmail(string);
	}
	@When("Je saisie adresse {string}")
	public void jeSaisieAdresse(String string) throws InterruptedException {
		registrationPage.fillAddress(string);
	}
	@When("Je saisie city {string}")
	public void jeSaisieCity(String string) throws InterruptedException {
		registrationPage.fillCity(string);
	}
	@When("Je saisie provance {string}")
	public void jeSaisieProvance(String string) {
		registrationPage.fillProvince(string);
	}
	@When("Je saisie postal code {string}")
	public void jeSaisiePostalCode(String string) {
		registrationPage.fillPostalCode(string);
	}
	@When("Je selectionne country {string}")
	public void jeSelectionneCountry(String string) throws InterruptedException {
		registrationPage.selectCountry(string);
	}
	@When("Je saisie username {string}")
	public void jeSaisieUsername(String string) throws InterruptedException {
		registrationPage.fillUserName(string);
	}
	@When("Je saisie une premiere fois password {string}")
	public void jeSaisieUnePremiereFoisPassword(String string) {
		registrationPage.fillPassword(string);
	}
	@When("Je confirm password {string}")
	public void jeConfirmPassword(String string) {
		registrationPage.fillConfirmPassword(string);
	}
	@When("Je clique sur le boutton soumettre")
	public void jeCliqueSurLeBouttonSoumettre() {
		registrationPage.clickOnsubmitRegistration();
	}
	@Then("Je me redirige vers la page register_succes {string}")
	public void jeMeRedirigeVersLaPageRegisterSucces(String text) {
		String message = RegistrationPage.messageRegistration.getText();
		Assert.assertEquals(text, message);
	}



}
