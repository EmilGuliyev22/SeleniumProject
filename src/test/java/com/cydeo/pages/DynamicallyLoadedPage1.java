package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class DynamicallyLoadedPage1 {

//    1. Go to https://practice.cydeo.com/dynamic_loading/1
//            2. Click to start
//3. Wait until loading bar disappears
//4. Assert username inputbox is displayed
//5. Enter username: tomsmith
//6. Enter password: incorrectpassword
//7. Click to Submit button
//8. Assert “Your password is invalid!” text is displayed.

    public DynamicallyLoadedPage1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//button[.='Start']")
    public WebElement startBtn;


}
