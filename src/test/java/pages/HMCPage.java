package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCPage {
    public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLoginLink;

    //public void link(String string){
      //  Driver.getDriver().get(ConfigReader.getProperty(string));
    //}


   @FindBy(id="UserName")
   public WebElement usernameTextBox;
    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement ikinciLoginButton;
    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    public void link(String link) {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
    }
}
