package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();
    }

    @Then("isim kutusuna {string} girer")
    public void isim_kutusuna_girer(String isim) {
        dataTablesPage.firstName.sendKeys(isim);
    }

    @Then("soyisim kutusuna {string} girer")
    public void soyisim_kutusuna_girer(String soyisim) {
        dataTablesPage.lastName.sendKeys(soyisim);
    }

    @Then("position kutusuna {string} girer")
    public void position_kutusuna_girer(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @Then("office kutusuna {string} girer")
    public void office_kutusuna_girer(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Then("extension kutusuna {string} girer")
    public void extension_kutusuna_girer(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }

    @Then("start date kutusuna {string} girer")
    public void start_date_kutusuna_girer(String tarih) {
        dataTablesPage.startDate.sendKeys(tarih);
    }

    @Then("salary kutusuna {string} girer")
    public void salary_kutusuna_girer(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}
