package com.testingacademy.AppVWO;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium009 {

    // Link text - When we know exact match
    // Partial Text - When you want to match (Dynamic matching) content - for example if every time page load value changes

    @Test (groups = "QA")
    @Description("Verify the current URL, title of VWO app")
    public void vwlLoginTest(){

        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        //WebElement anchor_tag = driver.findElement(By.linkText("Start a free trial"));
        WebElement anchor_tag = driver.findElement(By.partialLinkText("Start a free"));
        System.out.println(anchor_tag.getAttribute("href"));
        anchor_tag.click();

        driver.close();

    }

}
