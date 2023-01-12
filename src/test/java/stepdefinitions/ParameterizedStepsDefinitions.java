package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepsDefinitions {
    @When("Kullanici {string} arattiginda")
    public void kullaniciArattiginda(String key) {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key+ Keys.ENTER);

    }

    @Then("Kullanici titleda {string} gormelidir")
    public void kullaniciTitledaGormelidir(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
    }
}
