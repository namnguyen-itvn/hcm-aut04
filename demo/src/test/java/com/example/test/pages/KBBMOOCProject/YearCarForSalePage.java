package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;

public class YearCarForSalePage extends KbbPageBase {

    public YearCarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public void waitPage() throws InterruptedException
    {
        keyword.waitForPageToLoad();
    }

    String getUrlPage= driver.getCurrentUrl();
    String expectedUrl="https://staging.kbb.com/cars-for-sale/all/2018/?requestId=2152820002&searchRadius=0&marketExtension=include&isNewSearch=true&showAccelerateBanner=false&sortBy=relevance&numRecords=25";
    public boolean compareUrl() throws InterruptedException{ 
    if(getUrlPage.equals(expectedUrl)){
            return true;
    }
    return false;
    }

    String getTitlePage= driver.getTitle();
    String expectedTitle="2018 Cars for Sale (Test Drive at Home) - Kelley Blue Book";
    public boolean compareTitle() throws InterruptedException{ 
    if(getTitlePage.equals(expectedTitle)){
            return true;
    }
    return false;
    }
    
}
