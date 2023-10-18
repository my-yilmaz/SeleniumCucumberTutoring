Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella
  Scenario: TC01 kullanici amazonda nutella arar
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir.

  @java
  Scenario: TC02 Kullanici amazonda Java arar
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir.

  @iphone
  Scenario: TC03 Kullanici amazonda iphone arar
    Given kullanici amazon anasayfasinda
    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir.


