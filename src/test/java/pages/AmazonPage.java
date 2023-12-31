package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement sonucYazisi;

}
