package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuAppStepDefinition {
    HerokuappPage herokuappPage=new HerokuappPage();
    @Given("Kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("add element butonuna basar")
    public void addElementButonunaBasar() {
        herokuappPage.addElementButton.click();

    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sure) {
        ReusableMethods.waitFor(sure);
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {

        ReusableMethods.waitForVisibility(herokuappPage.deleteElementButton,10);
    }

    @And("delete butonunun gorunut oldugunu test eder")
    public void deleteButonununGorunutOldugunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteElementButton.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
        herokuappPage.deleteElementButton.click();
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {

        Assert.assertTrue(herokuappPage.deleteElementButtonList.isEmpty());


    }
}
