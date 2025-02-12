package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium012 {

    //Use of @BeforeTest, @Test and @AfterTest

    //@BeforeTest- We will Open the Browser
    //@Test- We will write our tests here
    //@AfterTest- We will Close the Browser

    //The Advantage of adding 'BeforeTest' (Open Browser) 'AfterTest' (Close Browser) is,
    // We can write multiple testcases
    //Atomic Testcases (TC who don't have any dependency)
    //They serve a single purpose

    EdgeDriver driver; //Class variable declared

    //Here under BeforeTest we have created a session for edgedriver (Edge Browser will open)
    @BeforeTest
    public void openBrowser(){
        //Create session via the API and Session ID is generated
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }


    @Test (groups = "QA")
    @Description("Test case #1 Negative Description")
    public void negativeTest()  {
        driver.get("https://app.vwo.com");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("admin");

        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        String error_msgText = errorMessage.getText();
        String error_msgAttribute = errorMessage.getAttribute("data-Selenium_IMP_details");
        System.out.println(error_msgAttribute);

        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");
        }


    @Test
    @Description("Test case #2 Positive")
    public void positiveTest(){
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
