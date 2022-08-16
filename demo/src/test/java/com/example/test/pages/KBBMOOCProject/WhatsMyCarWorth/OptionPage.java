package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class OptionPage extends KbbBasePage {
    public OptionPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement iconEdit = keyword.findWebElementByXpath("//a[@data-analytics='mileage_top_lnk']");
    WebElement checkboxSelectYourOptions = keyword.findWebElementByXpath("//div/label[@data-testid='selectOptBtn']");
    WebElement btnNext = keyword.findWebElementByXpath("//div/button[@data-lean-auto='optionsNextButton']");
    public void clickOnIconEditMileage() throws InterruptedException{
        keyword.scrollAndWaitToClick(iconEdit);
    }
    public void sendInforchangeMileage(String mileagee) throws InterruptedException{
        WebElement txtMileage = keyword.findWebElementByXpath("//input[@type='tel']");
        keyword.sendKeys(txtMileage, mileagee);
    }
    public void clickOnSavebutton() throws InterruptedException{
        WebElement btnSave = keyword.findWebElementByXpath("//button[@data-analytics='mileage_save_btn']");
        keyword.scrollAndWaitToClick(btnSave);
    }
    
    public void clickOnSelectYourOptionscheckbox() throws InterruptedException{
      
        keyword.scrollAndWaitToClick(checkboxSelectYourOptions);
    }
    public void clickOnBlackbutton() throws InterruptedException{
        WebElement btnBlack = keyword.findWebElementByXpath("//div/img[@src='https://file.kelleybluebookimages.com/kbb/base/houseswatch/black.jpg']");
        keyword.scrollAndWaitToClick(btnBlack);
    }
    public void clickOnDoYouHave2orMoreKeysorKeylessRemotescheckbox() throws InterruptedException{
        WebElement checkboxDoYouHave2orMoreKeysorKeylessRemotes = keyword.findWebElementByXpath("//div/label[@data-testid='withKeys']");
        keyword.scrollAndWaitToClick(checkboxDoYouHave2orMoreKeysorKeylessRemotes);
    }
    public void clickOnHasYourVehicleHadAnyModifications() throws InterruptedException{
        WebElement checkboxHasYourVehicleHadAnyModifications = keyword.findWebElementByXpath("//div/label[@data-testid='withModifications']");
        keyword.scrollAndWaitToClick(checkboxHasYourVehicleHadAnyModifications);
    }	
    public void clickNextbutton() throws InterruptedException{
       
        keyword.scrollAndWaitToClick(btnNext);
    }
    public boolean compareResultAfterUserChangeMileagesuccessful(){
        WebElement iconMileage = keyword.findWebElementByXpath("//a[text()='10,000']");
        if (iconMileage.isDisplayed()) {
            return true;
        }
        return false;
    }
}
