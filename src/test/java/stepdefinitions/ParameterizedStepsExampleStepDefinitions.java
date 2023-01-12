package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ParameterizedStepsExampleStepDefinitions {

    //Cucumber Edition
    private int int1,int2,sonuc;

    @Given("Ilk sayi {int}")
    public void ilkSayi(int sayi){
        int1 = sayi;
        System.out.println("int1 = " + int1);
    }

    @Given("Ikinci sayi {int}")
    public void ikinciSayi(int sayi){
        int2 = sayi;
        System.out.println("int2 = " + int2);
    }

    @When("Bu sayilari {word} operatorune sokarsam")
    public void buSayilariOperatoruneSokarsam(String operator){
        switch (operator){
            case "+":
                sonuc = int1 + int2;
                break;

            case "-":
                sonuc = int1 - int2;
                break;

            case "*":
                sonuc = int1 * int2;
                break;

            case "/":
                sonuc = int1 / int2;
                break;
        }
        System.out.println("sonuc = " + sonuc);
    }


    @Then("sonuc {int} olmalidir")
    public void sonucOlmalidir(int sayi){
        Assert.assertEquals(sayi, sonuc);
    }


        // RegEx Edition

    @Given("^Ismim \"(\\w+)\"$")
    public void ismim(String isim){
        System.out.println(isim);
    }

}