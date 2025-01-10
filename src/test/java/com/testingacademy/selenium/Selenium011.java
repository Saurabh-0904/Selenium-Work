package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium011 {

    // Find all the links available on webpage
    //Solution - we need to find all the anchor tag <a>
    // we need to use List <Webelements> with findElements By.tagName



    @Test (groups = "QA")
    @Description("Find all the links available on Webpage")
    public void vwlLoginTest() throws InterruptedException {

        WebDriver driver = new EdgeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]")).click();
        Thread.sleep(2000); // wait for 2 sec to load the page

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement username_element = driver.findElement(By.xpath("//input[@id=\'txt-username\']"));
        username_element.sendKeys("John Doe");
        WebElement password_element = driver.findElement(By.xpath("//input[@id=\'txt-password\']"));
        password_element.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id='btn-login']")).click();

        driver.quit();







    }

}
