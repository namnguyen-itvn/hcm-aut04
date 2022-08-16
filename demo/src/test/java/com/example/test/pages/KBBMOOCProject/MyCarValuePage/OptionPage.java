package com.example.test.pages.KBBMOOCProject.MyCarValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPage extends KbbBasePage {

    public OptionPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement clickSelectOption = keyword.findWebElementByXpath("//div[text()='Select Your Options']");

    public void actionClickSlectYourOption() throws InterruptedException{
        keyword.click(clickSelectOption);
    }





}
