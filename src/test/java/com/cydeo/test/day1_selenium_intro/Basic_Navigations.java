package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");

        // navigate().to() method is for navigating to web Page
       // driver.navigate().to("https://www.etsy.com");


        // It is using for stopping code execution in application. we are giving time to application to see steps
        Thread.sleep(3000);

        // navigate().back() method is for navigating to back from web page
        driver.navigate().back();

        Thread.sleep(3000);

        // navigate().forward() method is for navigating to forward from web page
        driver.navigate().forward();






    }
}
