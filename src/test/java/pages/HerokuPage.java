package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuPage {
    public HerokuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Add Element']")
    public WebElement addElementButton;
    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButton;
    @FindBy(xpath = "//*[text()='Delete']")
    public List<WebElement> deleteButtonListesi;

}
