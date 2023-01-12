package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstStepDefinition  {
    @Given("Ilk feature icin cucumber indirdim")
    public void ılk_feature_icin_cucumber_indirdim() {
        System.out.println("given çalıştı");

    }
    @When("Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {

        System.out.println("when çalıştı");
    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("then çalıştı");

    }

    @Then("Senaryomun calistigini konsolda gormeliyi")
    public void senaryomunCalistiginiKonsoldaGormeliyi() {
    }
}
