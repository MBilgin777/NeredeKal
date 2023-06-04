package com.akakce.step_definitions;

import com.akakce.pages.Kategoriler_Page;
import com.akakce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Kategoriler_StepDefinitions {
    Kategoriler_Page kategoriler_page=new Kategoriler_Page();

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
        kategoriler_page.cepTelefonu_SubModuleButton.click();
    }

}
