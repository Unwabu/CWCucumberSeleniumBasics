Feature: Amazon Search Feature

  Scenario Outline: Kullanici aratacagi kelimeyi sonuclarda gorebilmelidir
    Given Kullanıcı amazon sitesine gider
    When Kullanici amazonda "" aratir
    Then Kullanici arama sonuclarında "" gormelidir
    And Kullanici Ekran goruntusu alir
    And Kullanici Browser kapatir