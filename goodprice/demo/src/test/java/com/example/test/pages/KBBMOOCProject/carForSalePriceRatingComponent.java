package com.example.test.pages.KBBMOOCProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class carForSalePriceRatingComponent extends KbbBasePage {

    public carForSalePriceRatingComponent(WebDriver driver) {
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
    //*Click Price Rating  */
    public void clickPriceRating () throws InterruptedException{
        WebElement txtPriceRating = keyword.findWebElementByXpath("//span[@data-cmp='filterTitle']/span[text()='Price Rating']");
        keyword.scrollAndWaitToClick(txtPriceRating);
    }
    //*check Price Rating Filter Should Be Extended After Click */
    public boolean chekPriceRatingFilterAfterClick() {
        WebElement priceRatingFilterAfterExtending = keyword.findWebElementByXpath("//span[@data-cmp='filterTitle']/span[text()='Price Rating']/parent::span/parent::div/following-sibling::div");
            if(priceRatingFilterAfterExtending.isDisplayed()) {
                return true;
            }
            return false; 
        }
    //*Click Good Price  */
    public void clickGoodPrice () throws InterruptedException{
        WebElement cbGoodPrice = keyword.findWebElementByXpath("//div[@class='accordion-panel-content-wrapper padding-horizontal-4 collapse in']//div[text()='Good Price']");
        keyword.click(cbGoodPrice);
}
    // //*Check Check Box Good Price Is Selected */
    // public boolean checkCheckBoxGoodPriceIsSelected(){
    //     WebElement checkCbGoodPrice = keyword.findWebElementByXpath("//input[@value='goodprice']");
    //     if(checkCbGoodPrice.isSelected()){
    //         return true;
    //     }
    //     return false;
  
        
    // }
    //*Get Text Good Price */
    public String getTextGoodPrice(){
        WebElement txtGoodPrice = keyword.findWebElementByXpath("//span[text()='Good Price']");
        keyword.scrollToElemtnIntoView(txtGoodPrice);
        String dataGoodPrice = txtGoodPrice.getText();
        System.out.println(dataGoodPrice);
        return dataGoodPrice;
    }
    //*Check Good Price */
    public boolean checkGoodPrice(String goodprice){
        if( getTextGoodPrice().equals(goodprice)){
            return true;
        }return false;

    }
 
    
}
