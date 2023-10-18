package stepDefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String actualResult = amazonPage.sonucYazisi.getText();
        String expectedResult = "Nutella";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String actualResult = amazonPage.sonucYazisi.getText();
        String arananKelime = "Java";
        Assert.assertTrue(actualResult.contains(arananKelime));
    }
  
    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualResult = amazonPage.sonucYazisi.getText();
        String arananKelime = "iphone";
        Assert.assertTrue(actualResult.contains(arananKelime));
    }
    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String arananKelime) {
        String actualResult = amazonPage.sonucYazisi.getText();
        Assert.assertTrue(actualResult.contains(arananKelime));
    }
    @Given("kullanici {string} anasayfasinda") //amazonURL
    public void kullniciAnasayfasinda(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }
    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
