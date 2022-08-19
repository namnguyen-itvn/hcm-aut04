package com.example.test.pages.KBBMOOCProject.CarResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarResearchComponentPage extends KbbBasePage{

    public ReviewCarResearchComponentPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement btnBuildPrice = keyword.findWebElementByXpath("//span[@class='css-nmm0sa e1uau9z01']");
    private WebElement btnSeeCarForSale = keyword.findWebElementByXpath("//span[@class='css-rqm6z7 e1uau9z01']");
    private String actualTitle = driver.getTitle();

    public boolean checkTitle(String expectedTitle) {
        if (actualTitle.equals(expectedTitle)) {
            return true;
        }
        return false;
    }

     public boolean checkBuildPriceButtonDisplay() {
        
        if (btnBuildPrice.isDisplayed()) {
            return true;
        }
        return false;
    }
   public boolean checkSeeCarForSaleButtonDisplay() {
      
        if (btnSeeCarForSale.isDisplayed()) {
            return true;
        }
        return false;
    }

}
