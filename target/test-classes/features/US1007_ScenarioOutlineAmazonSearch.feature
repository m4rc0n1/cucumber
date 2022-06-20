@paralel1
Feature: US1007 Scenario Outline Amazon Search
  Scenario Outline: TC12 search all elements from list on Amazon
  Given kullanici amazon sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder

    And  amazon sayfayi kapatir

    Examples:
    |aranacakEleman|
    |Apple|
    |Java|
    |Samsung|
    |Armut|
    |Nutella|
