package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;

public class YearCarForSalePage extends KbbPageBase {

    public YearCarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    String getUrlPage= driver.getCurrentUrl();
    String expectedUrl="https://staging.kbb.com/cars-for-sale/all/2018/cleveland-oh-44129/?dma=&searchRadius=50&isNewSearch=true&marketExtension=include&showAccelerateBanner=false&sortBy=relevance&numRecords=25&requestId=2152820002";
    public boolean compareUrl() throws InterruptedException{ 
    if(getUrlPage.equals(expectedUrl)){
            return true;
    }
    return false;
    }

    String getTitlePage= driver.getTitle();
    String expectedTitle="2018 Cars for Sale in Cleveland, OH (Test Drive at Home) - Kelley Blue Book";
    public boolean compareTitle() throws InterruptedException{ 
    if(getTitlePage.equals(expectedTitle)){
            return true;
    }
    return false;
    }
    
}
