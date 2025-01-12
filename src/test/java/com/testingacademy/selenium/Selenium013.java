package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.List;

public class Selenium013 {

    //Exercise : Open Ebay -> search 'macmini' and print all titles present on webpage

    EdgeDriver driver; //Class variable declared

    //Here under BeforeTest we have created a session for edgedriver (Edge Browser will open)
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



        driver.get("https://www.ebay.com/b/Computers-Tablets-Network-Hardware/58058/bn_1865247");

        WebElement searchBox = driver.findElement(By.cssSelector("input#gh-ac")); // 'CSS Selector' locator is used to find the element
        searchBox.sendKeys("macmini");
        WebElement searchSubmit = driver.findElement(By.cssSelector("input#gh-btn"));
        searchSubmit.click();

        Thread.sleep(3000);

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']/span"));

        System.out.println("Here are the titles of Products available on current WebPage:--");
        for(WebElement title: searchTitles)
        {
            System.out.println(title.getText());
        }







        }
















    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
