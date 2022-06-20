Feature:  US1008 Scenari Outline kullanarak farkli degerlerle negative login testi

  Scenario Outline: TC13 farkli kullanici adi ve password
  Given kulanici "HMCUrl" linkine tiklar

    And login linkine tiklar
    Then scenario outlindan kullanici adi olarak "<username>" yazar
    Then scenario outlindan sifre  olarak "<password>" yazar
    And login butonuna basar




    Examples:
    |username|password|
    |MANAGER |MANAGER1|
    |manager |manager1|



