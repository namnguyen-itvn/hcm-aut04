package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class carForSaleDoorComponent extends KbbBasePage{

    public carForSaleDoorComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    String titlePage ="Cars for Sale (Test Drive at Home) - Kelley Blue Book";
    public String getTitle=driver.getTitle();
    //*Verify Title Page */
    public boolean checkTitlePage()
    {
        System.out.println(getTitle);
        if(getTitle.equals(titlePage))
        {
            return true;

        }return false;
    }

    //*Cliclk Door  */
    public void clickDoor() throws InterruptedException
    {
        WebElement txtDoor = keyword.findWebElementByXpath("//span[@data-cmp='filterTitle']//span[text()='Doors']");
        keyword.scrollAndWaitToClick(txtDoor);
    }
    //*Click Four Door */
    public void clickFourDoor() throws InterruptedException
    {
        WebElement cbFourDoor = keyword.findWebElementByXpath("//div[@class='accordion-panel-content-wrapper padding-horizontal-4 collapse in']//div[text()='Four Door']");
        keyword.click(cbFourDoor);
    }
     //*Get Text Four Door Result*/
     public String getTextFourDoorResult(){
        WebElement txtFourDoor = keyword.findWebElementByXpath("//div[@class='chip btn input-chip display-inline-flex align-items-center margin-right-2 margin-bottom-2 text-bold']");
        keyword.scrollToElemtnIntoView(txtFourDoor);
        String resultFourDoor = txtFourDoor.getText();
        System.out.println(resultFourDoor);
        return resultFourDoor;
    }
    //*Check Four Door */
    public boolean checkFourDoor(String fourdoor){
        if( getTextFourDoorResult().equals(fourdoor)){
            return true;
        }return false;

    }
  
}
