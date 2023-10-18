@brcGenel
Feature: US1006 BRC Negative Login

  Background: Ortak Adim
    Given kullanici "brcURL" anasayfasinda
    Then Log in yazisina tiklar

  @brc1
  Scenario: TC01 kullanici yanlis email ile giris yapamaz
    And gecersiz email girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  @brc2
  Scenario: TC02 kullanici yanlis pasword ile giris yapamaz
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  @brc3
  Scenario: TC03 kullanici yanlis email ve yanlis pasword ile giris yapamaz
    And gecersiz email girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir
