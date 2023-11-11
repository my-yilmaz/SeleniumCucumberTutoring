@brcGenel
Feature: US1005 BRC Positive Login

  @brc @test1
  Scenario: TC01 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcURL" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir
