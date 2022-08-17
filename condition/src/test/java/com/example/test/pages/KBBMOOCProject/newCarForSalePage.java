package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;

public class newCarForSalePage  extends KbbPageBase{

    public newCarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    /**
     * Check title Page after user click on New Condition
     */
    String getUrlPage= driver.getCurrentUrl();
    String expectedUrl="https://staging.kbb.com/cars-for-sale/new/?searchRadius=0&isNewSearch=true&marketExtension=include&showAccelerateBanner=false&sortBy=relevance&numRecords=25&requestId=NEW";
    public boolean compareUrl() throws InterruptedException{ 
    if(getUrlPage.equals(expectedUrl)){
            return true;
    }
    return false;
    }

    String getTitlePage= driver.getTitle();
    String expectedTitle="New Cars for Sale (Test Drive at Home) - Kelley Blue Book";
    public boolean compareTitle() throws InterruptedException{ 
    if(getTitlePage.equals(expectedTitle)){
            return true;
    }
    return false;
    }
    
}
