package com.neredeKal.pages;

import com.neredeKal.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


    public SearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"centerArea\"]/div[1]/div/div[3]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]")
    public WebElement otelSec;

    @FindBy(xpath = "//div[@class='css-100g8ce'][contains(text(),'Giriş')]")
    public WebElement girisTarihButton;

    @FindBy(xpath = "//div[@class='css-13rgr3v'][normalize-space()='21']")
    public WebElement girisTarihi;
    @FindBy(xpath = "//*[@id=\"centerArea\"]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[7]")
    public WebElement cikisTarihi;

    @FindBy(xpath = "//div[@class='css-100g8ce'][contains(text(),'Kişi')]")
    public WebElement kisilerButton;

    @FindBy(xpath = "//div[@class='css-18q06f1'][normalize-space()='2']")
    public WebElement yetiskinSayisi;

    @FindBy(xpath = "//div[@class='css-19qb79q']//div[1]//div[2]//button[2]//*[name()='svg']")
    public WebElement yetiskinArtir;

    @FindBy(xpath = "//div[@class='css-19qb79q']//div[1]//div[2]//button[1]//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'black')]")
    public WebElement yetiskinAzalt;

    @FindBy(xpath = "//*[@id=\"centerArea\"]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div")
    public WebElement cocukSayisi;
    @FindBy(xpath = "//div[@class='css-1rf6xsk']//div[2]//div[2]//button[2]//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'black')]")
    public WebElement cocukArtir;
    @FindBy(xpath = "//div[@class='css-1rf6xsk']//div[2]//div[2]//button[1]//*[name()='svg']")
    public WebElement cocukAzalt;

    @FindBy(xpath = "//*[@id=\"centerArea\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div/div/div[2]/select")
    public WebElement cocukYasiGir;

    @FindBy(xpath = "/html/body/div/section/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div[3]/div/div/div[2]/select/option[3]")
    public WebElement cocukYasi2;

    @FindBy(xpath = "//button[@class='css-g11lsw']")
    public WebElement kisiGuncelle;

    @FindBy(xpath = "//div[contains(text(),'ARA')]")
    public WebElement aramaButton;

    @FindBy(xpath = "//*[@id=\"centerArea\"]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a")
    public WebElement expectedOtelAdi;

    @FindBy(xpath = "//*[@id=\"centerArea\"]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button/div")
    public WebElement inceleButton;


    @FindBy(xpath = "")
    public WebElement actualOtelAdi;

    @FindBy(xpath = "//b[contains(text(),'Fiyat Değişimi')]")
    public WebElement scroll;










}

