package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.orkhanHMC;
import utilities.ConfigReader;
import utilities.Driver;

public class OrkhanDefinition {
    orkhanHMC orkhanHMC=new orkhanHMC();
    @Given("{string} sayfasina gidicek")
    public void sayfasina_gidicek(String link) {
        Driver.getDriver().get(ConfigReader.getProperty(link));

    }
    @Then("{string} tusuna tiklar")
    public void tusuna_tiklar(String logintusu) {
        orkhanHMC.hmcLoginButton.click();

    }
    @Then("{string} ve {string} kullanarak giris yapamadigini test eder")
    public void ve_kullanarak_giris_yapamadigini_test_eder(String username, String password) {
        orkhanHMC.usernameTextBox.sendKeys(username);
        orkhanHMC.passwordTextBox.sendKeys(password + Keys.ENTER);
        String expectedText="Username or password is incorrect, please correct them and try again";
        String actualText=orkhanHMC.sonucYazisi.getText();
        Assert.assertEquals(expectedText,actualText,"Dogru kelimeye bak");

    }
}
