package com.example.test.pages.KBBMOOCProject.MyCarValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryStylePage extends KbbBasePage {

    public CategoryStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


    WebElement selectCategory = keyword.findWebElementByXpath("//select[@class='css-1712iv5 e1c5k7mc0']");

    public void actionSelectCategory() throws InterruptedException{
        keyword.selectElement(selectCategory, "Automatic");
    }

    public void actionSelectCategory(String Category) throws InterruptedException{
        keyword.selectElement(selectCategory,Category);
    }

    
}
