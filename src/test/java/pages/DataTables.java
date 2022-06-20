package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTables {
  public   DataTables(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='New']")
    public WebElement newButton;
  @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameText;
  @FindBy(xpath = "//button[@class='btn']")
  public WebElement createButton;
}
