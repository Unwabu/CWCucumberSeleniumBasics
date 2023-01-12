Feature: Parametreli step kullanimi


  Scenario: Cucumber step definition (Cucumber Edition)
    Given Ilk sayi 5
    And Ikinci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then sonuc 8 olmalidir


  Scenario Outline: Cucumber step definition (Cucumber Edition) outline
    Given Ilk sayi <sayi1>
    And Ikinci sayi <sayi2>
    When Bu sayilari <operator> operatorune sokarsam
    Then sonuc <sonuc> olmalidir

    Examples:
      | sayi1 | sayi2 | operator | sonuc |
      | 10    | 15    | +        | 25    |
      | 5     | 2     | -        | 3     |
      | 4     | 7     | *        | 26    |
      | 9     | 2     | /        | 4     |


  Scenario: Cucumber Step Definition (RegEx Edition)
    Given Ismim "Karl"