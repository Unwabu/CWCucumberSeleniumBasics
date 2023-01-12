package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class DinamikUrl_StepDefinitions {
    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(arg0));
    }

    @Then("Sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }

    @When("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
