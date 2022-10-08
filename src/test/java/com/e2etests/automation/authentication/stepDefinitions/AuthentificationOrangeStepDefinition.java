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
		authentificationOrangePage.fillUserName(string);
		Thread.sleep(3000);
	}
	@When("Je saisie mon password {string}")
	public void jeSaisieMonPassword(String string) {
		authentificationOrangePage.fillPassword(string);
	}
	@When("Je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin()  {
		authentificationOrangePage.clickOnBtnLogin();
		
	} 
	/* */
	@Then("Je me redirige vers mon compte")
	public void jeMeRedirigeVersMonCompte() {
	   Assert.assertTrue(authentificationOrangePage.loginSuccess());
	}
	
	/* Deconnexion du compte*/
	@When("Je clique sur l icone du proprietaire du compte")
	public void jeCliqueSurLIconeDuProprietaireDuCompte() {
	   
	}
	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() {
	   
	}
	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	    
	}

	/*Ajouter un nouveau utilisateur*/
	@When("Je clique sur le boutton admin")
	public void jeCliqueSurLeBouttonAdmin() {
	    
	}
	@When("Je clique sur le boutton ajouter")
	public void jeCliqueSurLeBouttonAjouter() {
	    
	}
	@When("Je saisie le nom utilisateur {string}")
	public void jeSaisieLeNomUtilisateur(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Je selectionne role utilisateur {string}")
	public void jeSelectionneRoleUtilisateur(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Je saisie nom employeur {string}")
	public void jeSaisieNomEmployeur(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Je selectionne status {string}")
	public void jeSelectionneStatus(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Je saisie mot de passe {string}")
	public void jeSaisieMotDePasse(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Je saisie la confirmation du mot de passe {string}")
	public void jeSasieLaConfirmationDuMotDePasse(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("un nouveau utilisateur est ajouter")
	public void unNouveauUtilisateurEstAjouter() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	



	
	   
	





}
