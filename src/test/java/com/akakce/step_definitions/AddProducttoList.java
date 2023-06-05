package com.akakce.step_definitions;

import com.akakce.pages.LoginPage;
import com.akakce.pages.SearchPage;
import com.akakce.utilities.BrowserUtils;
import com.akakce.utilities.ConfigurationReader;
import com.akakce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProducttoList {
    SearchPage searchPage =new SearchPage();
    LoginPage loginPage =new LoginPage();
    String expectedName;


    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

    @Given("user is on the home page.")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        loginPage.girisYapButton.click();

        loginPage.email.sendKeys(ConfigurationReader.getProperty("email"));

        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

        loginPage.loginButton.click();
    }
    @When("user searches iphone on search textbox.")
    public void userSearchesIphoneOnSearchTextbox() {
        searchPage.searchBox.sendKeys("iphone 14");
    }


    @And("user clicks searchButton.")
    public void userClicksSearchButton() {

        searchPage.searchBoxButton.click();
    }

    @And("user clicks first iphone14.")
    public void userClicksFirstIphone() throws InterruptedException {
        expectedName = searchPage.expextedIphoneName.getText();

        System.out.println("expectedName = " + expectedName);
        Thread.sleep(2000);
        searchPage.uruneGit.click();
    }

    @And("user scrolls down the page.")
    public void userScrollsDownThePage() {
        BrowserUtils.scrollToElement(searchPage.scroll);
    }

    @And("user clicks Takip Et Button.")
    public void userClicksTakipEtButton() throws InterruptedException {
        System.out.println(searchPage.takipEtButton.getText().toString());
        Thread.sleep(1000);
        searchPage.takipEtButton.click();
    }

    @And("user goes to Takip Listem Page.")
    public void userGoesToTakipListemPage() throws InterruptedException {
        Thread.sleep(3000);
    searchPage.takipEtPageButton.click();
    }

    @Then("user verify that the product is added to Takip Listem page.")
    public void userVerifyThatTheProductIsAddedToTakipListemPage() throws InterruptedException {
        Thread.sleep(4000);
        String actualName = searchPage.actualIphoneName.getText();
        System.out.println("actualName = " + actualName);
        String numberOfTumUrunler= searchPage.takipEtPageTumUrunler.getText();
        Assert.assertEquals(actualName,expectedName);
        Assert.assertTrue(numberOfTumUrunler.endsWith("(1)"));

    }



}
