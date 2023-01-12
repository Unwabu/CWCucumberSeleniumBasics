
Feature: Dinamik url ile sayfaya erişme



  Scenario Outline: Kullanici Dinamik url ile sayfaya erisebilmelidir

    Given Kullanici "<url>" sayfasina gider
    When Kullanici 12 sn bekler
    Then Sayfa basliginin "<kelime>" icerdigini test eder
    When Sayfayi kapatir

Examples:
| url              | kelime   |
| google_url       | Google   |
| amazon_url       | Amazon   |
| trendyol_url     | Trendyol |