package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
  public  AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "twotabsearchtextbox")
    public WebElement amazonSearchBox;
  /*
  Auto w bardzo dobrym stanie technicznym, tankowany tylko diesel  premium.

Wnętrze ładne bez oznak zużycia.

Samochód przejechał jako taksówkę tylko 30000 km.

  Turbina i wtryskiwacze zostały poprawione od podstaw przy 250 000 km.  5-30. Wymiana oleju na 275 000 km (nastepny 285000 km). W samochodzie nie palono papierosów. 6,5 litra w mieście, 3-3,5 na autostradzie.
 Tarcze hamulcowe przednie, klocki hamulcowe, czujnik cisnenie kolektorze są nowe. (280000 km)

 Wymaga zużycia :

- po prawej stronie jest niewielkie uszkodzenie. widać na zdjęciu



samochód w Warszawie. Można oglądać w dowolnym momencie. Wszystkie pytania przy aucie.

Ubezpieczenie OC (miesięcznie)
Przegląd do 05.2022

Do negocjacji.
   */
}
