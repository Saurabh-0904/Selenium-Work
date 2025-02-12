package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium007 {

    //Positive Testcase
    //Open app.vwo.com
    //Print the title and get the current URL
    //To verify the current URL is app.vwo.com

    @Test(groups = "QA")
    @Description("Verify the current URL, Title of vwo app")
    public void vwoLogin() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

    }

}
