package com.e2etests.automation.authentication.stepDefinitions;

import org.junit.Assert;

import com.e2etests.automation.authentication.pages.AuthentificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefiniton {

	private AuthentificationPage authentificationPage;

	public AuthentificationStepDefiniton() {
		this.authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentificationPage.goToUrl();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je saisie password {string}")
	public void jeSaisiePassword(String password) {
		authentificationPage.fillPassword(password);
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authentificationPage.clickOnBtnSubmit();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);

	}

}
