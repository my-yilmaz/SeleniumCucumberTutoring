@amazon
Feature: US1002 ortak adimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

    Scenario: TC01 Amazon nutella arama
      Then kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir.

      Scenario: TC02 amazon java arama
        Then kullanici Java icin arama yapar
        And sonuclarin Java icerdigini test eder
        And sayfayi kapatir.