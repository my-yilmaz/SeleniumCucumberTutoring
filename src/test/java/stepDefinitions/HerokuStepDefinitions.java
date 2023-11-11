package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.ReusableMethods;


public class HerokuStepDefinitions {
    HerokuPage herokuPage = new HerokuPage();

    @Then("Add Element butona tiklar")
    public void add_element_butona_tiklar() {
        herokuPage.addElementButton.click();
    }

    @Then("delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        // WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.visibilityOf(herokuPage.deleteButton));
        ReusableMethods.waitForVisibility(herokuPage.deleteButton, 10);

    }

    @Then("delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButton.isDisplayed());
    }

    @Then("delete butonuna tiklar")
    public void delete_butonuna_tiklar() {
         herokuPage.deleteButton.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(herokuPage.deleteButtonListesi.isEmpty());
    }
}
