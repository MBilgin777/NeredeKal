package com.neredeKal.step_definitions;

import com.neredeKal.pages.LoginPage;
import com.neredeKal.pages.SearchPage;
import com.neredeKal.utilities.BrowserUtils;
import com.neredeKal.utilities.ConfigurationReader;
import com.neredeKal.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelSearchListPage {
    SearchPage searchPage =new SearchPage();
    String expectedName;


    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

    @Given("user is on the home page.")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user writes the name of city to textbox.")
    public void userWritesTheNameOfCityToTextbox() throws InterruptedException {

        searchPage.searchBox.click();
        Thread.sleep(1000);
        searchPage.searchBox.sendKeys("Antalya");
    }

    @And("user clicks Antalya Otelleri.")
    public void userClicksAntalyaOtelleri() {
        searchPage.otelSec.click();
    }

    @And("user chooses check in date.")
    public void userChoosesCheckInDate() throws InterruptedException {
        Thread.sleep(2000);
        searchPage.girisTarihButton.click();
        Thread.sleep(1000);
        searchPage.girisTarihi.click();
    }

    @And("user choses check out date.")
    public void userChosesCheckOutDate() throws InterruptedException {
        Thread.sleep(2000);
        searchPage.cikisTarihi.click();
    }

    @And("user choses two adults and one child five years.")
    public void userChosesPeopleAndChildYears() throws InterruptedException {
        Thread.sleep(2000);
        searchPage.kisilerButton.click();
        Thread.sleep(1500);
        String adult=searchPage.yetiskinSayisi.getText();
        Thread.sleep(1000);
        System.out.println("adult text: "+adult);
        int x;
       while(!adult.equals("3")){
           if((Integer.parseInt(adult))<3){
               searchPage.yetiskinArtir.click();
               x=Integer.parseInt(adult)+1;
               adult = String.valueOf(x);
           }
           else {
               searchPage.yetiskinAzalt.click();
               x=Integer.parseInt(adult)-1;
               adult = String.valueOf(x);
           }
       }
       x=0;
       Thread.sleep(1000);
       String child=searchPage.cocukSayisi.getText();
        System.out.println("child text = " + child);
        while(!child.equals("1")){
            if((Integer.parseInt(child))<1){
                searchPage.cocukArtir.click();
                x=Integer.parseInt(child)+1;
                child = String.valueOf(x);
            }
            else {
                searchPage.cocukAzalt.click();
                x=Integer.parseInt(child)+1;
                child = String.valueOf(x);
            }
        }
        Thread.sleep(1000);
        searchPage.cocukYasi2.click();
        searchPage.kisiGuncelle.click();

    }

    @And("user clicks search Button.")
    public void userClicksSearchButton() {
        searchPage.aramaButton.click();
    }

    @And("user clicks checkover Button of the first Hotel.")
    public void userClicksCheckoverButtonOfTheFirstHotel() throws InterruptedException {
        Thread.sleep(1000);
        expectedName = searchPage.expectedOtelAdi.getText();
        System.out.println("expectedOtel text= " + expectedName);
        searchPage.inceleButton.click();
    }

    @Then("user verify that the page of the hotel is opened in new tab.")
    public void userVerifyThatThePageOfTheHotelIsOpenedInNewTab() {
        
        String actualName = Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[1].toString()).getCurrentUrl().toString();
        System.out.println("actualName = " + actualName);
        String[] x = expectedName.split(" ");
        System.out.println("x[0] = " + x[0]);

            Assert.assertTrue(actualName.contains(x[0].toLowerCase()));



    }
}
