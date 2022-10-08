@orangeTest
Feature: Authentification sur le site Orange
  En Tant qu utilisateur je veux m authentifier sur le site Orange afin de me connecter sur mon compte

  Background: 
    Given Je me connecte au site Orange
    When Je saisie mon userName "Admin"
    And Je saisie mon password "admin123"
    And Je clique sur le boutton login

  @login
  Scenario: connection au site Orange
    Then Je me redirige vers mon compte

  @logout
  Scenario: deconnexion du site Orange
    And Je clique sur l icone du proprietaire du compte
    And Je clique sur le boutton logout
    Then Je me redirige vers la page home

  @add-user
  Scenario: ajouter un nouveau utilisateur
    And Je clique sur le boutton admin
    And Je clique sur le boutton ajouter
    And Je saisie le nom utilisateur "Adam"
    And Je selectionne role utilisateur "ESS"
    And Je saisie nom employeur "Odis  Adalwin"
    And Je selectionne status "Enabled"
    And Je saisie mot de passe "Aa1234567."
    And Je saisie la confirmation du mot de passe "Aa1234567."
    Then un nouveau utilisateur est ajouter
