package com.testingacademy.handelingCheckboxes;

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

public class Selenium022 {

    //Handling of Checkboxes

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
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        WebElement ch1 = checkboxes.get(0);
        ch1.click(); // checked the checkbox
        Thread.sleep(3000);
        ch1.click(); // unchecked the checkbox
        Thread.sleep(3000);



            }


        @AfterTest
        public void closeBrowser(){
            driver.quit();
        }
}
