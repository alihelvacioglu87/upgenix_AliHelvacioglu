package com.upgenix.stepDefinitions;

import com.upgenix.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void scenarioSetup(){

        Driver.getDriver().get("https://qa.upgenix.net/web/login");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Login | Best solution for startups", actualTitle);

    }

    @After (value = "@UPGN-725 or @UPGN-789 or @UPGN-793 or @Logout")
    public void teardownScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        System.out.println("Test Completed");


        Driver.closeDriver();
    }
}
