package com.example.test.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.test.core.helper.ReadConfigPropertyFile;


public class PhpTravelsAdminLoginPage extends BasePage{

    public PhpTravelsAdminLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    /**
     * Declare object
     */
    WebElement txtEmail = keyword.findWebElementByXpath("//input[@name='email']");
    WebElement txtPassword = keyword.findWebElementByXpath("//input[@name='password']");
    WebElement btnLogin = keyword.findWebElementByXpath("//button[@type='submit']");
    
    @FindBy(xpath = "//input[@name='email']")
    private WebElement txtEmaifElement;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement txtPasswordf;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLoginf;

    /**
     * Implement Function
     */
    public void actionLoginAdminPhpTravels(){
        keyword.sendKeys(txtEmail, ReadConfigPropertyFile.getPropertyValue("email"));
        keyword.sendKeys(txtPassword, ReadConfigPropertyFile.getPropertyValue("password"));
        keyword.scrollAndWaitToClick(btnLogin);
    }

    public void actionLoginAdminPhpTravelsUsingDataProvider(String email, String password){
        keyword.sendKeys(txtEmail, email);
        keyword.sendKeys(txtPassword, password);
        keyword.scrollAndWaitToClick(btnLogin);
    }
}
