package com.upgenix.stepDefinitions;

import com.upgenix.Pages.LoginPage;
import com.upgenix.Pages.UserMainPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class LogoutStepDefinitions {
    LoginPage loginPage = new LoginPage();
    UserMainPage userMainPage = new UserMainPage();

    String url = "";

    @Given("User is on user home page")
    public void user_is_on_user_home_page() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login/");
        loginPage.emailInput.sendKeys("salesmanager87@info.com");
        loginPage.passwordInput.sendKeys("salesmanager" + Keys.ENTER);

    }

    @When("User clicks on account name")
    public void user_clicks_on_account_name() {
        userMainPage.userMenu.click();

    }

    @When("User clicks on Log out")
    public void user_clicks_on_log_out() {
        userMainPage.logoutButton.click();
    }

    @Then("User verify that the title is {string}")
    public void user_verify_that_the_title_is(String string) {
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @When("User navigate to BACK")
    public void user_navigate_to_back() {
        Driver.getDriver().navigate().back();
    }
    @Then("User verify that the {string} message shown")
    public void user_verify_that_the_message_shown(String string) {
        Assert.assertTrue(userMainPage.sessionExpired.isDisplayed());
    }

    @When("User copy the URL")
    public void user_copy_the_url() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        url = Driver.getDriver().getCurrentUrl();
    }
    @When("User close the all opened tab\\(s)")
    public void user_close_the_all_opened_tab_s() {
        Driver.closeDriver();
    }
    @When("User open a new browser and get to the copied URL")
    public void user_open_a_new_browser_and_get_to_the_copied_url() {
        Driver.getDriver().get(url);
    }
    @Then("User shouldn't see the title is {string}")
    public void user_shouldn_t_see_the_title_is(String string) {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
            wait.until(ExpectedConditions.titleIs(string));
        }catch(TimeoutException e){

        }

        Assert.assertNotEquals(string, Driver.getDriver().getTitle());
    }
}
