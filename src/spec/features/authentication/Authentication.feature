@smoke-test
Feature: Je verfie la page d authentification 
  En tant que Utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verifie la page d authentification
    Given Je me connecte sur l application Mercury
    When Je saisie le username "Test"
    And Je saisie password "Test"
    And Je clique sur le boutton submit
    Then Je me redirige vers la page home "Login Successfully"
     
   
