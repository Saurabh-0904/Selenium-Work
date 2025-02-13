package com.testingacademy.handlingPopups_Alerts;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium020 {

    //POPUPS
    // To handle 'Popups' we have an 'Alert' Class
    // Popup type 1 -> Alert pop up (Alert which is having an ok and cancel button with a textbox only)

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
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Click on Element from where we will be getting alert
        WebElement alert_elementConfirm = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        alert_elementConfirm.click();

        // If we are using a AWS machine or Docker machine or if popup (alert) is loading very slowly (limited RAM)
        //then we need to apply explicit wait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        //Move to alert
        Alert alert = driver.switchTo().alert();
        //Passing the String to textbox
        alert.sendKeys("Saurabh");
        //Click on the Ok button of alert
        alert.accept();
        //Click on the Cancel button of alert
        //alert.dismiss();
        //Getting text of a result
        String result = driver.findElement(By.id("result")).getText();
        //Assertion to validate text of a result
        Assert.assertEquals(result,"You entered: Saurabh");
        Assert.assertEquals(result,"You entered: null");

        Thread.sleep(3000);

    }


        @AfterTest
        public void closeBrowser(){
            driver.quit();
        }
}
