package com.upgenix.Pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMainPage {

    public UserMainPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userMenu;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//h4[.='Odoo Session Expired']")
    public WebElement sessionExpired;
}
