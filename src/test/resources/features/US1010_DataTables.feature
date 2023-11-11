Feature: US1010 Datatables sitesine veri girisi testi

  @US1010_TC01 @datatables @test2
  Scenario Outline: TC01 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "datatablesURL" anasayfasinda
    Then new butonuna basar
    And isim kutusuna "<FirstName>" girer
    And soyisim kutusuna "<LastName>" girer
    And position kutusuna "<Position>" girer
    And office kutusuna "<Office>" girer
    And extension kutusuna "<Extension>" girer
    And start date kutusuna "<StartDate>" girer
    And salary kutusuna "<Salary>" girer
    And Create tusuna basar
    When kullanici "<FirstName>" ile arama yapar
    Then isim bolumunde "<FirstName>" oldugunu dogrular
    And sayfayi kapatir

    Examples:
      | FirstName | LastName | Position | Office  | Extension | StartDate  | Salary |
      | Osman     | Can      | QA       | London  | API       | 2021-11-11 | 20000  |
      | Hasan     | Kacan    | Tester   | Paris   | Appium    | 2022-05-04 | 22000  |
      | Veli      | Kacmaz   | BA       | Munih   | Cypress   | 2020-05-07 | 21000  |
      | Cem       | Yaman    | PO       | Lisbon  | SQL       | 2022-05-11 | 40000  |
      | Korkut    | Korkmaz  | QA       | Belfast | QA        | 2023-12-12 | 90000  |
