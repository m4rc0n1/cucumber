package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class orkhanHMC {
    public orkhanHMC
            () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement hmcLoginButton;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//Li[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement sonucYazisi;


}

