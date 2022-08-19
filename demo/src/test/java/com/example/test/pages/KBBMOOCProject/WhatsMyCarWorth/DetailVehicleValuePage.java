package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailVehicleValuePage extends KbbBasePage {

    public DetailVehicleValuePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    private WebElement iconEdit = keyword.findWebElementByXpath("//a[@data-analytics='mileage_top_lnk']");

    /**
     * Click on edit mileage icon
     * @throws InterruptedException
     */
    public void actionClickOnIconEditMileage() throws InterruptedException{
        keyword.scrollAndWaitToClick(iconEdit);
    }

    /**
     * Clear value mileage
     */
    public void actionDeleteValueMileage(){
        WebElement textboxMileage1 = keyword.findWebElementByXpath("//input[@type='tel']");
        textboxMileage1.clear();

    }

    /**
     * Edit value mileage
     * @param mileagee
     * @throws InterruptedException
     */
    public void actionEditValueMileage(String mileagee) throws InterruptedException{
        WebElement textboxMileage = keyword.findWebElementByXpath("//input[@type='tel']");
        keyword.sendKeys(textboxMileage, mileagee);
    }

    /**
     * Click on Save button
     * @throws InterruptedException
     */
    public void actionClickOnSavebutton() throws InterruptedException{
        WebElement buttonSave = keyword.findWebElementByXpath("//button[@data-analytics='mileage_save_btn']");
        keyword.scrollAndWaitToClick(buttonSave);
    }

    /**
     * Compare value Vin
     * @param vin
     * @return
     */
    public boolean actionCompareValueVinINVehicleValueDetailWithValueVINEnteredVinValue(String vin){
        WebElement  vin2 = keyword.findWebElementByXpath("//div[@data-lean-auto='vin-license']/span/span");
        String strvin2 = vin2.getText();
        if (strvin2.equals(vin) ){
            return true;
        }
        return false;
    }

    /**
     * Compare URL
     */
    String strUrl = driver.getCurrentUrl();
    public boolean actionCompareURLVehicleValueDetailPage (String url){
        if(strUrl.equals(url)){
            return true;
        }return false;
    }

    /**
     * Compare mileage value after edit
     * @param editmileage
     * @return
     */
    public boolean actionCompareResultAfterUserEditValueMileagesuccessful(String editmileage){
        WebElement  mileage2 = keyword.findWebElementByXpath("//a[@data-analytics='mileage_top_lnk']");
        String strmileage2 = mileage2.getText();
        if (strmileage2.equals(editmileage) ){
            return true;
        }
        return false;
    }
 
}
