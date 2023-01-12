Feature: google arama feature

  Background:
    Given kullanici google sayfasindadir

    Scenario: cucumber search
      When Kullanici "cucumber" arattiginda
      Then Kullanici titleda "cucumber" gormelidir