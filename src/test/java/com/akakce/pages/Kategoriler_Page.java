package com.akakce.pages;

import com.akakce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kategoriler_Page {


    public Kategoriler_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='H_c_v8']")
    public WebElement kategoriler_ModuleButton;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[1]")
    public WebElement elektronik_SubModuleButton;

    @FindBy(xpath = "//img[@alt='Telefon']")
    public WebElement telefon_SubModuleButton;

    @FindBy(xpath = "//img[@alt='Cep Telefonu']")
    public WebElement cepTelefonu_SubModuleButton;




}

