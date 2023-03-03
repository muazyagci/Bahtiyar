package com.Bahtiyar.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cydeo extends pages {
    @FindBy (linkText = "Radio Buttons")
    public WebElement RadioBtn;
    @FindBy(id = "red")
    public WebElement redoption;
    @FindBy(id = "blue")
    public WebElement blueoption;
    @FindBy ( id = "yellow")
    public WebElement yellowoption;
    @FindBy( id = "black")
    public WebElement blackoption;
}
