package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;

public class CompareTitleCar extends KbbBasePage {

    public CompareTitleCar(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    String Titlee = driver.getTitle();

    String MessageTitleUsed2020HondaCivicLXCoupe2D="Used 2020 Honda Civic LX Coupe 2D Prices | Kelley Blue Book";
    public boolean isgetPageTitle(){
        if(Titlee.equals(MessageTitleUsed2020HondaCivicLXCoupe2D)){
            return true;
        }
        return false;
    }
    String TitleeUrl = driver.getCurrentUrl();

    String UrlUsed2020HondaCivicLXCoupe2D="https://staging.kbb.com/honda/civic/2020/lx-coupe-2d/";
    public boolean isgetPageTitleUrl(){
        if(TitleeUrl.equals(UrlUsed2020HondaCivicLXCoupe2D)){
            return true;
        }
        return false;
    }
}
