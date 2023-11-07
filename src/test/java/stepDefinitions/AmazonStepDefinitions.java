package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        ReusableMethods.waitFor(1);
        amazonPage.cookies.click();

    }
    @When("kullanici Iphone aratir")
    public void kullanici_iphone_aratir() {
        amazonPage.searchbox.sendKeys("Iphone", Keys.ENTER);

    }
    @Then("kullanici sonuclarin Iphone icerdigini test eder")
    public void kullanici_sonuclarin_iphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());

    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @When("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchbox.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("kullanici sonuclarin Selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());

    }

    @When("kullanici Java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.searchbox.sendKeys("Java", Keys.ENTER);
    }

    @Then("kullanici sonuclarin Java icerdigini test eder")
    public void kullaniciSonuclarinJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());
    }

    @When("kullanici {string} aratir")
    public void kullaniciAratir(String arananNesne) {
        amazonPage.searchbox.sendKeys(arananNesne,Keys.ENTER);

    }

    @Then("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String Nesne) {
        Assert.assertTrue(amazonPage.result.getText().contains(Nesne));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.searchbox.sendKeys(arananKelime,Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String DogrulananKelime) {
        Assert.assertTrue(amazonPage.result.getText().contains(DogrulananKelime));
    }
}
