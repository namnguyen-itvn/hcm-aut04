package com.example.test.pages.SauceLabsFinalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLabLoginPage extends BasePage {

    public SauceLabLoginPage(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Declare Web Element
     */

    private WebElement txtUsername = keyword.findElementByCssSelector("input[id='user-name']");
    private WebElement txtPassword = keyword.findElementByCssSelector("input[id='password']");
    private WebElement btnLogin = keyword.findElementByCssSelector("input[id='login-button']");

    /**
     * Page Action and Boolean
     */

    /**
     * Input Username Action
     * @param userName
     * @throws InterruptedException
     */
    public void setUsername(String userName) throws InterruptedException {
        keyword.sendKeys(txtUsername, userName); 
    }

    /**
     * Input Password Action
     * @param txtPassword
     * @throws InterruptedException
     */
    public void setPassword(String passWord) throws InterruptedException {
        keyword.sendKeys(txtPassword, passWord); 
    }

    /**
     * Input Username Action
     * @param btnLogin
     */
    public void actionClickOnLoginButton() {
        keyword.click(btnLogin); 
    }

    /**
     * Action Login
     * @param txtUsername
     * @param txtPassword
     * @param btnLogin
     * @throws InterruptedException
     */
    public void actionLogin() throws InterruptedException {
        setUsername("standard_user");
        setPassword("secret_sauce");
        actionClickOnLoginButton();
    }
}
