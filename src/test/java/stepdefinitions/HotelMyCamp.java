package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCamp {
    HMCPage hmcPage=new HMCPage();
    @Given("kulanici {string} linkine tiklar")
    public void kulaniciLinkineTiklar(String link) {
        Driver.getDriver().get(ConfigReader.getProperty(link));
    }

    @And("login linkine tiklar")
    public void loginLinkineTiklar() {
        hmcPage.mainPageLoginLink.click();
    }

    @Then("scenario outlindan kullanici adi olarak {string} yazar")
    public void scenarioOutlindanKullaniciAdiOlarakYazar(String username) {

        hmcPage.usernameTextBox.sendKeys(username);
    }

    @Then("scenario outlindan sifre  olarak {string} yazar")
    public void scenarioOutlindanSifreOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.ikinciLoginButton.click();
    }
}
