package com.testingacademy.popupsHandling;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium018 {

    //POPUPS
    // To handle 'Popups' we have an 'Alert' Class
    // Popup type 1 -> Alert pop up (Only OK Button)

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
        // Xpath -
        // using contains - //button[contains(text(),'for JS Alert')]
        // using attribute - //button[@onclick='jsAlert()']

        //Click on Element from where we will be getting alert
        WebElement alert_element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alert_element.click();
        //click on alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //Getting text of a result
        String result = driver.findElement(By.id("result")).getText();
        //Assertion to validate text of a result
        Assert.assertEquals(result,"You successfully clicked an alert");

        Thread.sleep(3000);

    }


        @AfterTest
        public void closeBrowser(){
            driver.quit();
        }
}
