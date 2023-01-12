package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given("Smoke test icin hazirliklar yapildi")
    public void smokeTestIcinHazirliklarYapildi() {
    }

    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("smoke çalıştı");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given("Regression test icin hazirliklar yapildi")
    public void regressionTestIcinHazirliklarYapildi() {
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("regression çalıştı");
    }

    @Then("Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }
}
