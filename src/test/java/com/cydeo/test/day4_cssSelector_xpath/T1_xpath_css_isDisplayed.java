package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {

    public static void main(String[] args) {

//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
        //Locate homeLink using cssSelector, class value
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector, href value
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

        //Locate homeLink using cssSelector, syntax2 for class "."
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));


//        b. “Forgot password” header


//        c. “E-mail” text

//        d. E-mail input box

//        e. “Retrieve password” button
//
//        f. “Powered by Cydeo text

//        4. Verify all web elements are displayed.


    }
}
