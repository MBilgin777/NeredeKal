package com.akakce.pages;

import com.akakce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//div[@id='H_rl_v8']//a[@rel='nofollow'][contains(text(),'Giriş Yap')]")
    public WebElement girisYapButton;

    @FindBy(xpath = "//input[@id='life']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='lifp']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='lfb']")
    public WebElement loginButton;

}

