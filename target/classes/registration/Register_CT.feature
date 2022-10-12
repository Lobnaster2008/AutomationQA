@smoke-test
Feature: Verifier le module register
  En Tant que Utilisateur je souhaite remplir le formulaire Afin de m enregistrer

  @module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When Je clique sur le lien register
    And Je saisie le firstname "<firstName>"
    And Je saisie lastname "<lastName>"
    And Je saisie phone "<phone>"
    And Je saisie email "<email>"
    And Je saisie adresse "<address>"
    And Je saisie city "<city>"
    And Je saisie provance "<provance>"
    And Je saisie postal code "<codePostal>"
    And Je selectionne country "<country>"
    And Je saisie username "<userName>"
    And Je saisie une premiere fois password "<password>"
    And Je confirm password "<confimPassword>"
    And Je clique sur le boutton soumettre
    Then Je me redirige vers la page register_succes "<registerMessage>"

    Examples: 
      | firstName | lastName | phone    | email                  | address    | city      | provance      | codePostal | country | userName  | password | confirmPassword | registerMessage                    |
      | Lobna     | Mhamdi   | 14527812 | mhamdi.lobna@gmail.com | Monji slim | thela     | kasserine     |       1261 | TUNISIA | Lobnaster | layane   | layane          | Note: Your user name is Lobnaster. |
      | Layene    | Marouani |  1457896 | layane@gmail.com       | monji slim | rue Salem | Medina jadida | ben arous  | TUNISIA | LAYOUNA   | lobna    | lobna           | Note: Your user name is LAYOUNA.   |
