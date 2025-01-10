package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium010 {

    // Find all the links available on webpage
    //Solution - we need to find all the anchor tag <a>
    // we need to use List <Webelements> with findElements By.tagName



    @Test (groups = "QA")
    @Description("Find all the links available on Webpage")
    public void vwlLoginTest(){

        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        List<WebElement> all_Tags = driver.findElements(By.tagName("a"));

        for (WebElement element: all_Tags)
        {
            System.out.println(element.getText());
        }

        driver.close();

    }

}
