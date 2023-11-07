package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FaceBookStepDefinition {
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));

    }
    @Then("kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer beklemeSuresi) {
        ReusableMethods.waitFor(beklemeSuresi);

    }
    @When("url in {string} icerdigini test eder")
    public void url_in_icerdigini_test_eder(String istenenKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenKelime));
    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @When("url in {string} oldugunu test eder")
    public void urlInOldugunuTestEder(String istenenURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenURL));
    }
}
