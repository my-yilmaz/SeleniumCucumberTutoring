Feature: US1008 kullanici farkli yanlis sifre ve email ile giris yapamaz

  @US1008_TC01 @test2
  Scenario Outline: TC01 yanlis email ve yanlis sifre ile giris yapilamaz
    Given kullanici "brcURL" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz email olarak "<email>" girer
    And gecersiz sifre olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
      | email              | password  |
      | Manager5@gmail.com | Manager5! |
      | Manager6@gmail.com | Manager6! |
      | Manager7@gmail.com | Manager7! |
      | Manager8@gmail.com | Manager8! |
      | Manager9@gmail.com | Manager9! |

