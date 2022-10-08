@smoke-test
Feature: Je creer un nouveau compte Mercury
  En tant que Utilisateur je souhaite me conneecter au site Mercury

  @register
  Scenario: Je creer un nouveau compte
    Given Je me connecte sur l application Mercury
    When Je clique sur le lien register
    And Je saisie le firstname "lobna"
    And Je saisie lastname "Mhamdi"
    And Je saisie phone "14785232"
    And Je saisie email "mhamdi.lobna@gmail.com"
    And Je saisie adresse "Thela"
    And Je saisie city "kasserine"
    And Je saisie provance "Thela"
    And Je saisie postal code "1261"
    And Je selectionne country "TUNISIA"
    And Je saisie username "Lobnaster"
    And Je saisie une premiere fois password "Layane"
    And Je confirm password "Layane"
    And Je clique sur le boutton soumettre
    Then Je me redirige vers la page register_succes " Note: Your user name is Lobnaster."
    
