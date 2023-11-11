Feature: US1003 kullanici parametre kullanarak arama yapar

  @US1003_TC01 @test1
  Scenario: TC01 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    Then sayfayi kapatir
