package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Iframe_CRM_AppreciationTest extends TestBase {

    @Test
    public void sendingAppreciationMsg(){

//        2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");

//        3- Login Homepage ( Login with valid username:helpdesk1@cybertekschool.com and password:UserUser)
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk1@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();


//        4- Click the MORE tab and select APPRECIATION
          WebElement moreBtn = driver.findElement(By.xpath("//span[contains(@id,'link-text')]"));// cssSelector: span[id*='link-text']
          moreBtn.click();



//        5- Write an Appreciation message

//        6- Click the SEND button

//        7- Verify the Appreciation message is displayed on the feed

    }
}
