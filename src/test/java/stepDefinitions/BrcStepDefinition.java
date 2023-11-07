package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinition {
    BrcPage brcPage=new BrcPage();
Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));

    }
    @Then("login yazisina tiklar")
    public void login_yazisina_tiklar() {
brcPage.loginIlk.click();
    }
    @Then("gecersiz username girer")
    public void gecersiz_username_girer() {
        brcPage.userName.sendKeys(ConfigReader.getProperty("wrongUserName"));

    }
    @Then("gecersiz password girer")
    public void gecersiz_password_girer() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPassword")).perform();

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfaya_giris_yapilamadigini_test_eder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());

    }
}
