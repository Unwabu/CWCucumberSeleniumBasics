Feature: Google search test

  Scenario: Google'da bir kelime arandiginda ilgili kelimeyi barindiran sonuclar goruntulenmelidir.
    Given kullanici google sayfasindadir
    When kullanici samsung kelimesini aratir
    Then kullanici sayfada samsung kelimesi gectigini dogrular

