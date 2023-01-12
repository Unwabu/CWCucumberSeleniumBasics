package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleCucuStepDef {
    @Given(":  Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://www.google.com.tr");
    }



    @Then(":  Title da cucumber yazildigini dogrular")
    public void titleDaCucumberYazildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));
        Driver.closeDriver();
    }

    @Then(": Kullanici sayfada Cucumber kelimesi gectigini dogrular")
    public void kullaniciSayfadaCucumberKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
        Driver.closeDriver();
    }

    @When(": Kullanici samsung kelimesini aratir")
    public void kullaniciSamsungKelimesiniAratir() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");

    }

    @Then(": Kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
        Driver.closeDriver();
    }

    @When(": Kullanici selenium kelimesini aratir")
    public void kullaniciSeleniumKelimesiniAratir() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("selenium");

    }

    @Then(": Kullanici sayfada selenium kelimesi gectigini dogrular")
    public void kullaniciSayfadaSeleniumKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("seleniumr"));
        Driver.closeDriver();
    }

    @When(": Kullanici Cucumber kelimesini aratir")
    public void kullaniciCucumberKelimesiniAratir() {
    }
}
