Feature: US1009 herokuap Delete testi

  @heroku @test1
  Scenario: TC01 herokuapp'de delete butonu calismali
    Given kullanici "herokuURL" anasayfasinda
    Then Add Element butona tiklar
    And kullanici 3 sn bekler
    And delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna tiklar
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir
