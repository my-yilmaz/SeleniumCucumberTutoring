# amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratip
# sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

  @US1007_TC01 @test1
  Scenario Outline: TC01 amazonda listedeki kelimeleri aratalim
    Given kullanici "amazonURL" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | java          | java                 |
      | elma          | elma                 |
      | armut         | armut                |