package com.Bahtiyar.step_definitions;

import com.Bahtiyar.page.cydeo;
import com.Bahtiyar.utilities.BrowserUtils;
import com.Bahtiyar.utilities.ConfigurationReader;
import com.Bahtiyar.utilities.Driver;
import io.cucumber.java.en.When;

public class practice {
cydeo cydeo = new cydeo();


    @When("user should see test automation practice")


    public void user_should_see_test_automation_practice() {


        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice"));
        cydeo.RadioBTN.click();
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
