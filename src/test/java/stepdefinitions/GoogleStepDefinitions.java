package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;

public class GoogleStepDefinitions {
    @Given("kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @When("kullanici samsung kelimesini aratir")
    public void kullaniciSamsungKelimesiniAratir() {
        GoogleSearchPage sp= new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }

    @Then("kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {

    }
}
