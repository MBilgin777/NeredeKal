package com.akakce.step_definitions;

import com.akakce.pages.Kategoriler_Page;
import com.akakce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kategoriler_StepDefinitions {
    Kategoriler_Page kategoriler_page=new Kategoriler_Page();

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
    @Given("user is on the home page.")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://www.akakce.com/");
    }
    @When("user clicks Kategoriler Module Button.")
    public void user_clicks_kategoriler_module_button() throws InterruptedException {
        Thread.sleep(3000);
        kategoriler_page.kategoriler_ModuleButton.click();
    }
    @When("user clicks Elektronik SubModule Button.")
    public void user_clicks_elektronik_sub_module_button() throws InterruptedException {
        Thread.sleep(3000);
        kategoriler_page.elektronik_SubModuleButton.click();
    }
     @When("user clicks Cep Telefonu Submodule Button.")
    public void user_clicks_cep_telefonu_submodule_button() throws InterruptedException {
       Thread.sleep(3000);
        kategoriler_page.telefon_SubModuleButton.click();
        Thread.sleep(3000);
        kategoriler_page.cepTelefonu_SubModuleButton.click();

    }
    @Then("user verify the Url is correct.")
    public void userVerifyTheTitleIs() throws InterruptedException {
        String expectedUrl = "https://www.akakce.com/cep-telefonu.html";
        System.out.println("expectedTitle = " + expectedUrl);
        Thread.sleep(3000);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualTitle = " + actualUrl);
        Thread.sleep(3000);
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }


}
