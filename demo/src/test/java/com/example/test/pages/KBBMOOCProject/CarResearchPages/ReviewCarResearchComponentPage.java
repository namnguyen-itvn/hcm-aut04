package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarResearchComponentPage extends KbbBasePage{

    public ReviewCarResearchComponentPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    /**
     * @return
     */
    String expectedTitle = "2018 Honda Civic Values & Cars for Sale | Kelley Blue Book";

    public boolean checkTitle() {
        if (driver.getTitle().equals(expectedTitle)) {
            return true;
        }
        return false;
    }

    WebElement btnBuildPrice = keyword.findWebElementByXpath("//span[@class='css-nmm0sa e1uau9z01']");
    public boolean checkBuildPriceButtonDisplay() {
        
        if (btnBuildPrice.isDisplayed()) {
            return true;
        }
        return false;
    }
  WebElement btnSeeCarForSale = keyword.findWebElementByXpath("//span[@class='css-rqm6z7 e1uau9z01']");
    public boolean checkSeeCarForSaleButtonDisplay() {
      
        if (btnSeeCarForSale.isDisplayed()) {
            return true;
        }
        return false;
    }

}
