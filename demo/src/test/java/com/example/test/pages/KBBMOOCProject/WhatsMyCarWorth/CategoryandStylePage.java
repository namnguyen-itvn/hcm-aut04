package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryandStylePage extends KbbBasePage{
    public CategoryandStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
        /**
     * return current PageTitle
     * @return
     */
    }
    private WebElement droplistTrans = keyword.findWebElementByXpath("//div//select[@placeholder='Transmission']");
    private WebElement optionTrans = keyword.findWebElementByXpath("//div//option[text()='Automatic']");
    private WebElement optionManual = keyword.findWebElementByXpath("//div//option[text()='Manual, 5-Spd']");
    public void clickOnDropListTransmission() {
        
        keyword.scrollAndWaitToClick(droplistTrans);
    }
    public void selectOnAutomatic() {
        
        keyword.scrollAndWaitToClick(optionTrans);
    }
    public void selectOnManual(){
        keyword.scrollAndWaitToClick(optionManual);
    }
  

}
