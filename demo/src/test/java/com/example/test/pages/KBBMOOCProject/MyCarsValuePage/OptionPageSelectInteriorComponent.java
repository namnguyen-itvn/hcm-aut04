package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPageSelectInteriorComponent extends KbbBasePage {

    public OptionPageSelectInteriorComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
   private  WebElement SelectInterior = keyword.findWebElementByXpath("//div//button[@data-lean-auto='optionSection_Interior']");
    
    /**
     * @throws InterruptedException
     */
    public void actionSelectInterior() throws InterruptedException{
        keyword.click(SelectInterior);
    }
   
    
    private   WebElement selectCPMP3SingDis= keyword.findWebElementByXpath("//div/label[@data-lean-auto='optionCheckBoxButton_cd/mp3-(single-disc)']");
    private   WebElement selectCPMP3MultiDis= keyword.findWebElementByXpath("//div/label[@data-lean-auto='optionCheckBoxButton_cd/mp3-(multi-disc)']");
 
       /**
     * @throws InterruptedException
     */
    public void actionSelectCPMP3() throws InterruptedException{
   
            keyword.click(selectCPMP3SingDis);
            keyword.click(selectCPMP3MultiDis);

    }
 
   /**
 * @return
 * @throws InterruptedException
 */
    public boolean isselectCPMP3SingDisSelected() throws InterruptedException{
       if(!selectCPMP3SingDis.isSelected())
       {
           return true;
       }
       return false;
   }


}

