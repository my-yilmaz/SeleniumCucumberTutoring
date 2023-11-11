package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BRCPage;
import utilities.ConfigReader;

public class BRCStepdefinitions {
    BRCPage brcPage = new BRCPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        brcPage.loginButtonHomePage.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        brcPage.usernameBox.sendKeys(ConfigReader.getProperty("brcEmail"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcPassword"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        brcPage.submitButton.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(brcPage.kullaniciAdi.isDisplayed());
    }


    @And("gecersiz email girer")
    public void gecersizEmailGirer() {
        brcPage.usernameBox.sendKeys(ConfigReader.getProperty("fakeEmail"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(brcPage.submitButton.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("fakePassword"));
    }

    @And("gecersiz email olarak {string} girer")
    public void gecersizEmailOlarakGirer(String istenenEmail) {
        brcPage.usernameBox.sendKeys(istenenEmail);
    }

    @And("gecersiz sifre olarak {string} girer")
    public void gecersizSifreOlarakGirer(String istenenPassword) {
        brcPage.passwordBox.sendKeys(istenenPassword);}
}
