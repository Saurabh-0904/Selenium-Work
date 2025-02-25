package com.testingacademy.xPathPractice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class AutosuggestionDropdown {

    EdgeDriver driver; //Class variable declared

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }


    @Test
    @Description("Test case #1")
    public void test1() throws InterruptedException {



        driver.get("https://www.amazon.in/");
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Global wait to all the elements which we don't use

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("table");
        Thread.sleep(3000);
        List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[@class='left-pane-results-container']/div"));
        int count = autoSuggestions.size();
        System.out.println(count);
        autoSuggestions.get(4).click();



    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}






