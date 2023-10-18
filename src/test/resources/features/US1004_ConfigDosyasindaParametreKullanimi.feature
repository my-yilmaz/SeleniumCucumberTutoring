Feature: US1004 Kullanici parametre ile configuration file'i kullanabilmeli

  Scenario: TC01 configuration file'dan parametre kullanimi
    Given kullanici "googleURL" anasayfasinda
    Then kullanici 3 sn bekler
    And kullanici "amazonURL" anasayfasinda
    And kullanici "facebookURL" anasayfasinda
    And kullanici "brcURL" anasayfasinda
    Then sayfayi kapatir