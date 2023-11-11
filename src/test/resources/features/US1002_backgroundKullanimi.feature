@amazon
Feature: US1002 Kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

  @test1
  Scenario: TC01 amazon nutella arama
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @test2
  Scenario: TC02 amazon java arama
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir
