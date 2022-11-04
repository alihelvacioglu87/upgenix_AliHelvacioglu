package com.upgenix.stepDefinitions;

import com.upgenix.Pages.LoginPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.security.KeyFactorySpi;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("User enter {string} to the emailInput")
    public void user_enter_to_the_email_ınput(String email) {
        loginPage.emailInput.sendKeys(email);
    }

    @When("User enter {string} to the passwordInput")
    public void user_enter_to_the_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);

    }

    @When("User clicks LoginButton")
    public void user_clicks_login_button() throws InterruptedException {
        loginPage.loginButton.click();

    }

    @Then("User verify the title is {string}")
    public void user_verify_the_title_is(String string) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),8);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));

            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertEquals(string, actualTitle);

    }

    @Then("User verifies that entered password shown as bullet sign")
    public void user_verifies_that_entered_password_shown_as_bullet_sign() {

        Assert.assertEquals("password", loginPage.passwordInput.getAttribute("type"));
    }

    @When("User press ENTER key")
    public void user_press_enter_key() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ENTER).perform();
    }

    @When("User enters {string} to userNameInput")
    public void user_enters_to_user_name_input(String string) {
        loginPage.emailInput.sendKeys(string);
    }

    @When("User enters {string} to passwordInput")
    public void user_enters_to_password_input(String string) {
        loginPage.passwordInput.sendKeys(string);

    }

    @Then("User should see -Wrong login-password- message")
    public void user_should_see_wrong_login_password_message() {
        Assert.assertTrue(loginPage.invalidCredentialError.isDisplayed());

    }

    @Then("User verify that -Please fill out this field.- message appeared")
    public void user_verify_that_please_fill_out_this_field_message_appeared() {
        String tagName = loginPage.passwordInput.getTagName();

        if(tagName.equals("input")){
            if(loginPage.passwordInput.getAttribute("required").equals("required")){
                String message = loginPage.passwordInput.getAttribute("validationMessage");
                Assert.assertEquals("Please fill out this field.",message);
            }
        }
    }


    @Then("User verify that -Please fill out this field.- message appeared at email input box")
    public void user_verify_that_please_fill_out_this_field_message_appeared_at_username_input_box() {


        String tagName = loginPage.emailInput.getTagName();

        if(tagName.equals("input")){
            if(loginPage.emailInput.getAttribute("required").equals("required")){
                String message = loginPage.emailInput.getAttribute("validationMessage");
                Assert.assertEquals("Please fill out this field.",message);
            }
        }
    }
}


