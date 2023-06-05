package com.akakce.pages;

import com.akakce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


    public SearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[normalize-space()='Ara']")
    public WebElement searchBoxButton;

    @FindBy(xpath = "//b[normalize-space()='Ürüne Git (+116)']")
    public WebElement uruneGit;

    @FindBy(xpath = "//span[contains(text(),\"Takip Et\")]")
    ////span[contains(text(),"Takip Et")]
    public WebElement takipEtButton;

    @FindBy(xpath = "//a[@id='H_f_v8']")
    public WebElement takipEtPageButton;

    @FindBy(xpath = "//span[@class='ac_text']")
    public WebElement takipEtPageTumUrunler;

    @FindBy(xpath = "//h3[normalize-space()='iPhone 14 128 GB']")
    public WebElement expextedIphoneName;

    @FindBy(xpath = "//h3[@class='pn_v8']")
    public WebElement actualIphoneName;

    @FindBy(xpath = "//b[contains(text(),'Fiyat Değişimi')]")
    public WebElement scroll;










}

