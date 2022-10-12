package com.e2etests.automation.authentication.stepDefinitions;

import org.junit.Assert;

import com.e2etests.automation.authentication.pages.AuthentificationOrangePage;
import com.e2etests.automation.authentication.pages.AuthentificationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationOrangeStepDefinition {
	
	private AuthentificationOrangePage authentificationOrangePage;

	public AuthentificationOrangeStepDefinition() {
		this.authentificationOrangePage = new AuthentificationOrangePage();
	}
    /* Saisir les donnees de navigation*/
	@Given("Je me connecte au site Orange")
	public void jeMeConnecteAuSiteOrange() throws InterruptedException {
		authentificationOrangePage.goToUrl();
		Thread.sleep(3000);
	}
	@When("Je saisie mon userName {string}")
	public void jeSaisieMonUserName(String string) throws InterruptedException {
		authentificationOrangePage.fillText(string, authentificationOrangePage.userName);
		Thread.sleep(3000);
	}
	@When("Je saisie mon password {string}")
	public void jeSaisieMonPassword(String string) {
		authentificationOrangePage.fillText(string, authentificationOrangePage.password);
	}
	@When("Je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin()  {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.btnlogin);
		
	} 
	/* */
	@Then("Je me redirige vers mon compte")
	public void jeMeRedirigeVersMonCompte() {
	   Assert.assertTrue(authentificationOrangePage.loginSuccess());
	}
	
	/* Deconnexion du compte*/
	@When("Je clique sur l icone du proprietaire du compte")
	public void jeCliqueSurLIconeDuProprietaireDuCompte() throws InterruptedException {
		Thread.sleep(3000);
		authentificationOrangePage.clickOnButton(authentificationOrangePage.iconUser);
	}
	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.btnlogout);
	}
	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
		System.out.println(Setup.getDriver().getCurrentUrl());
	    Assert.assertTrue(Setup.getDriver().getCurrentUrl().contains("login"));
	}

	/*Ajouter un nouveau utilisateur*/
	@When("Je clique sur le boutton admin")
	public void jeCliqueSurLeBouttonAdmin() {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.btnAdmin);
	}
	@When("Je clique sur le boutton ajouter")
	public void jeCliqueSurLeBouttonAjouter() {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.btnAdd);
	}
	@When("Je saisie le nom utilisateur {string}")
	public void jeSaisieLeNomUtilisateur(String string) {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.newUserName);
	}
	@When("Je selectionne role utilisateur {string}")
	public void jeSelectionneRoleUtilisateur(String string) {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.userRole);
	}
	@When("Je saisie nom employeur {string}")
	public void jeSaisieNomEmployeur(String string) {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.employeeName);
	}
	@When("Je selectionne status {string}")
	public void jeSelectionneStatus(String string) {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.status);
	}
	@When("Je saisie mot de passe {string}")
	public void jeSaisieMotDePasse(String string) {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.password);
	}
	@When("Je saisie la confirmation du mot de passe {string}")
	public void jeSasieLaConfirmationDuMotDePasse(String string) {
		authentificationOrangePage.clickOnButton(authentificationOrangePage.confirmPassword);
	}
	@Then("un nouveau utilisateur est ajouter")
	public void unNouveauUtilisateurEstAjouter() {
		Assert.assertTrue(authentificationOrangePage.addDone());
	}



	



	
	   
	





}
