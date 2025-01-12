package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium016 {

    //Positive Testcase With using Explicit wait

    EdgeDriver driver; //Class variable declared
    
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }


    @Test (groups = "QA")
    @Description("Test case #1")
    public void test1() throws InterruptedException {



        driver.get("https://app.vwo.com");
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Global wait to all the elements which we don't use

        driver.findElement(By.id("login-username")).sendKeys("srb2@freetrial.com");
        driver.findElement(By.id("login-password")).sendKeys("Abcd1234@#@#");
        driver.findElement(By.id("js-login-btn")).click();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-qa='lufexuloga']")));
        WebElement loggedin_Username = driver.findElement(By.cssSelector("[data-qa='lufexuloga']"));

        System.out.println("Logged in User detail :-> " + loggedin_Username.getText());




        }

        

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
