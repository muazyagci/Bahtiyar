package com.Bahtiyar.step_definitions;

import com.Bahtiyar.utilities.BrowserUtils;
import com.Bahtiyar.utilities.ConfigurationReader;
import com.Bahtiyar.utilities.Driver;
import io.cucumber.java.en.When;
import com.Bahtiyar.page.cydeo;

public class Cydeo_Practice {
    cydeo cydeo=new cydeo();
    @When("user goes to cydeo practice page")
    public void user_goes_to_cydeo_practice_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice"));
        cydeo.RadioBtn.click();
        BrowserUtils.sleep(3);
        cydeo.redoption.click();
        BrowserUtils.sleep(3);
        cydeo.yellowoption.click();
        BrowserUtils.sleep(3);
        cydeo.blackoption.click();
        BrowserUtils.sleep(3);
        cydeo.blueoption.click();
        BrowserUtils.sleep(3);
        Driver.getDriver().quit();

    }
}