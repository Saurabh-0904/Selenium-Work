package com.testingacademy.shadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowDom {

    ChromeDriver driver;


    @BeforeMethod
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //below is a path to find in shadowDOM
        //we need to inspect it and got to console and find the path like mentioned below

        //JavaScript code-  document.querySelector("div#userName").shadowRoot.querySelector("div").shadowRoot.querySelector("input#pizza")

        //To use this. We need to use a JavaScript executor


        WebElement scrollTodiv = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("arguments[0].scrollIntoView(true);", scrollTodiv);

        WebElement inputBoxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\")");

        inputBoxPizza.sendKeys("Farmhouse Pizza");



    }
}
