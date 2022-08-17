package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ResearchNewAndUsedCarsPage extends KbbBasePage {

    public ResearchNewAndUsedCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
    
    WebElement selectYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
    WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
    WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
    WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
    WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");

    public void actionSelectaCars() throws InterruptedException {

        keyword.scrollAndWaitToClick(selectYear);
        WebElement lbYear = keyword.findWebElementByXpath("//select/option[@value='2018']");
        keyword.scrollAndWaitToClick(lbYear);
        keyword.scrollAndWaitToClick(selectMake);
        WebElement lbMake = keyword.findWebElementByXpath("//select/option[text()='Honda']");
        keyword.scrollAndWaitToClick(lbMake);
        keyword.scrollAndWaitToClick(selectModel);
        WebElement lbModel = keyword.findWebElementByXpath("//select/option[text()='Civic']");
        keyword.scrollAndWaitToClick(lbModel);
        keyword.sendKeys(inputZip, "43446");
        keyword.scrollAndWaitToClick(btnGetReview);
    }

    /**
     * @return
     */
    String expectedTitle = "2018 Honda Civic Values & Cars for Sale | Kelley Blue Book";
    public boolean checkTitle (){
        if(driver.getTitle().equals(expectedTitle)){
                return true;
            }
            return false;
        }

        public boolean checkBuildPriceButtonDisplay(){
            WebElement btnBuildPrice = keyword.findWebElementByXpath("//span[@class='css-nmm0sa e1uau9z01']");
            if(btnBuildPrice.isDisplayed()){
                return true;
            }
            return false;
        }

        public boolean checkSeeCarForSaleButtonDisplay(){
            WebElement btnSeeCarForSale = keyword.findWebElementByXpath("//span[@class='css-rqm6z7 e1uau9z01']");
            if(btnSeeCarForSale.isDisplayed()){
                return true;
            }
            return false;
        }


}

