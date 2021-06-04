package com.PageObjectModel;

import com.CommonLib.BaseLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseLib {


    @FindBy(id="loginName")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement pass;

    @FindBy(id ="signUpButtonNew")
    private WebElement submit;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterInTxtBx(WebElement element, String value)
    {
        element.sendKeys(value);
    }

    public void clickOnWebElement(WebElement element)
    {
        element.click();
    }

    public void webLogin(String username, String password){
        enterInTxtBx(login,username);
        enterInTxtBx(pass,password);
        clickOnWebElement(submit);

    }


}
