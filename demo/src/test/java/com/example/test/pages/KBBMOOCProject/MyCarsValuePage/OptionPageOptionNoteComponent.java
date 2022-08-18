package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPageOptionNoteComponent extends KbbBasePage {

    public OptionPageOptionNoteComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    

  private  WebElement displayOverlay= keyword.findWebElementByXpath("//div[@data-automation='overlay-container']");
  private   WebElement getMessegae= keyword.findWebElementByXpath("//div[@data-automation='overlay-body']");



    /**
     * @return
     * @throws InterruptedException
     */
    public boolean isdisplayOverlay() throws InterruptedException{
        if(displayOverlay.isDisplayed())
        {
            return true;
        }
        return false;
        }

    String expectText="Option NotesThis option was removed based on a previous selection.";
    /**
     * @return
     * @throws InterruptedException
     */
    public boolean isTextIconWarning() throws InterruptedException{
        if(getMessegae.getAttribute("textContent").equals(expectText))
        {
            return true;
        }
        return false;
        }
      
}
