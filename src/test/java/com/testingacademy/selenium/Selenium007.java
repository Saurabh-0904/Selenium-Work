package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium007 {

    //Open app.vwo.com
    //Print the title and get the current URL
    //Verify the current URL is app.vwo.com

    @Test(groups = "QA")
    @Description("Verify the current URL, Title of vwo app")
    public void vwoLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        //Assert.assertEquals(driver.getTitle(), "Login - ");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/lin");

    }

}
