package com.upgenix.Pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name = 'login']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name = 'password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement invalidCredentialError;


}
