package com.Bahtiyar.step_definitions;

import com.Bahtiyar.page.pages;
import com.Bahtiyar.utilities.ConfigurationReader;
import com.Bahtiyar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Amazon {
    pages pages=new pages();
    @Given("user is on the Dashboard")
    public void user_is_on_the_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amzn.url"));
        pages.acptCookiesBtn.click();
    }
    @Given("user clicks to account button")
    public void user_clicks_to_account_button() {
        pages.accountBtn.click();
    }
    @Given("user clicks to identify button")
    public void user_clicks_to_identify_button() {
        
    }
    @Given("user types the given email account")
    public void user_types_the_given_email_account() {
        pages.mailbox.sendKeys(ConfigurationReader.getProperty("email"));
pages.continueBtn.click();
    }
    @Given("user types the given password")
    public void user_types_the_given_password() {
        pages.PasswordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
pages.iniciarBtn.click();
    }
    @Then("user should see Muaz on dashboard")
    public void user_should_see_muaz_on_dashboard() {
        System.out.println(pages.verification.getText());
        Assert.assertTrue(pages.verification.getText().contains("Muaz"));
    }

}
