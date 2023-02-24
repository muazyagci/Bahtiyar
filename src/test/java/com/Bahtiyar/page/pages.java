package com.Bahtiyar.page;

import com.Bahtiyar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {
    public pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "sp-cc-accept")
    public WebElement acptCookiesBtn;
    @FindBy (xpath = "(//a[@data-csa-c-type='link'])[1]")
    public WebElement accountBtn;
}
