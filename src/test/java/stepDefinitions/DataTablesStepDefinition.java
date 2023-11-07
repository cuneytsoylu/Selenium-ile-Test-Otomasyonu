package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataBasePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinition {
    DataBasePage dataBasePage=new DataBasePage();
    Actions actions=new Actions(Driver.getDriver());
    @When("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici new butonuna basar")
    public void kullaniciNewButonunaBasar() {
        dataBasePage.newButton.click();
    }

    @And("isim bolumune {string}yazar")
    public void isimBolumuneYazar(String firstname) {
        dataBasePage.firstname.sendKeys(firstname);
    }

    @And("soyisim bolumune {string}yazar")
    public void soyisimBolumuneYazar(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("position bolumune {string}yazar")
    public void positionBolumuneYazar(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("officebolumune {string}yazar")
    public void officebolumuneYazar(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("extension bolumune {string}yazar")
    public void extensionBolumuneYazar(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("sratDate bolumune {string}yazar")
    public void sratdateBolumuneYazar(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("salary bolumune {string}yazar")
    public void salaryBolumuneYazar(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataBasePage.searchBox.sendKeys(firstname);
    }

    @And("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String isim) {
        Assert.assertTrue(dataBasePage.result.isDisplayed());
    }
}
