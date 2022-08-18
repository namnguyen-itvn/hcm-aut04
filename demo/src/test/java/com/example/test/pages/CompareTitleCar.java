package com.example.test.pages;
import org.openqa.selenium.WebDriver;
import com.example.test.pages.KBBMOOCProject.KbbBasePage;
public class CompareTitleCar extends KbbBasePage {
       /**
     * @param driver
     */
    public CompareTitleCar(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    String Title = driver.getTitle();

    String MessageTitle="2023 Chevy Corvette Reviews, Pricing & Specs | Kelley Blue Book";
    public boolean isgetPageTitle(){
        if(Title.equals(MessageTitle)){
            return true;
        }
        return false;
    }
    String TitleUrl = driver.getCurrentUrl();

    String Url="https://staging.kbb.com/chevrolet/corvette/";
    public boolean isgetPageTitleUrl(){
        if(TitleUrl.equals(Url)){
            return true;
        }
        return false;
    } 
}
