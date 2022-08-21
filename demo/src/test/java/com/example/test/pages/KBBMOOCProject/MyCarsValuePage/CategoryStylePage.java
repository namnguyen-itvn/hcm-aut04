package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryStylePage extends KbbBasePage {

    public CategoryStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


   private WebElement selectCategory = keyword.findWebElementByXpath("//select[@class='css-1712iv5 e1c5k7mc0']");

    /**
     * @throws InterruptedException
     */
    public void actionSelectCategory() throws InterruptedException{
        keyword.selectElement(selectCategory, "Automatic");
    }
    
    /**
     * @param Category
     * @param selectCategory
     * @throws InterruptedException
     */
    public void actionSelectCategory(String Category) throws InterruptedException{
        keyword.selectElement(selectCategory,Category);
    }


    
}

