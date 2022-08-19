package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoYouHave2orMoreKeysorKeylessRemotesComponent extends KbbBasePage {

    public DoYouHave2orMoreKeysorKeylessRemotesComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement checkboxDoYouHave2orMoreKeysorKeylessRemotes = keyword.findWebElementByXpath("//div/label[@data-testid='withKeys']");
    public void clickOnDoYouHave2orMoreKeysorKeylessRemotescheckbox() {
       
        keyword.scrollAndWaitToClick(checkboxDoYouHave2orMoreKeysorKeylessRemotes);
    }
}
