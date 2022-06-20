package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DataTables;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTableStepDefinition {
    Faker faker=new Faker();
    DataTables dataTables=new DataTables();
    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String link) {
        Driver.getDriver().get(ConfigReader.getProperty(link));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTables.newButton.click();

    }

    @And("tum bilgileri girer")
    public void tumBilgileriGirer() {
        dataTables.firstNameText.sendKeys(faker.name().firstName()+ Keys.TAB+
                faker.name().lastName()+Keys.TAB+ faker.job().position()+Keys.TAB+
                faker.company().industry()+Keys.TAB+faker.company().industry()+Keys.TAB+
                faker.date().birthday()+Keys.TAB+ faker.number().numberBetween(3000,5000));
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTables.createButton.click();
    }

    @And("firstname olarak {string} yazar")
    public void firstnameOlarakYazar(String firstname) {
        dataTables.firstNameText.sendKeys(firstname);
    }

    @And("lastname olarak {string} yazar")
    public void lastnameOlarakYazar(String arg0) {
        
    }

    @And("position olarak {string} yazar")
    public void positionOlarakYazar(String arg0) {
        
    }

    @And("office olarak {string} yazar")
    public void officeOlarakYazar(String arg0) {
        
    }

    @And("extension olarak {string} yazar")
    public void extensionOlarakYazar(String arg0) {
        
    }

    @And("startdate olarak {string} yazar")
    public void startdateOlarakYazar(String arg0) {
        
    }

    @And("salary olarak {string} yazar")
    public void salaryOlarakYazar(String arg0) {
        
    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullaniciIlkIsimIleAramaYapar() {
        
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular() {
    }
}
