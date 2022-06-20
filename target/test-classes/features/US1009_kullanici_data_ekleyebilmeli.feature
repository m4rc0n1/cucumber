@Editor
Feature: US1009 Kullanici Data Ekleye Bilmeli
    Scenario Outline: TC14 kullanici yeni kayit ekleye bilmeli


      When kullanici "{String}" adresine gider
      Then new butonuna basar
      And firstname olarak "<firstname>" yazar
      And lastname olarak "<lastname>" yazar
      And position olarak "<position>" yazar
      And office olarak "<office>" yazar
      And extension olarak "<extension>" yazar
      And startdate olarak "<startdate>" yazar
      And salary olarak "<salary>" yazar
      And Create tusuna basar
      When kullanici ilk isim ile arama yapar
      Then isim bolumunde isminin oldugunu dogrular


    Examples: